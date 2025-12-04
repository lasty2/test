package gitLesson;

public class Main {
    public static void main(String[] args) {
        /* Set - реализация коллекции, в которой не важен индекс, но не допускаются повторы
        HashSet - реализация Seta, самая быстрая, хранит внутри себя мапу
        LinkedHashSet - сохраняет порядок добавления в отличие от HashSet, но медленнее
        TreeSet - содержит внутри себя дерево, позволяет легко сортировать элементы, например строки по алфавиту
        Map - содержит внутри себя ключ и значение, можно представить как некий словарь
        HashMap - самый быстрый
        LinkedHashMap - сохраняет порядок добавления
        TreeMap - позволяет сортировать элементы

        аннотации - "стикеры" для компилятора, которые позволяют сократить время и упростить жизнь себе и другим разработчикам,
        они не влияют напрямую на логику выполнения программы, но могут быть использованы компилятором, фреймворками или собственными скриптами для генерации кода, валидации, автоматизации конфигурации.
        для создания аннотации используется специальный класс синтаксис:
        @Target(ElementType.(значение - будет показывать то, к чему применяется аннотация))
        @Retention(RetentionPolicy.Runtime) - используется в 99% случаев, показывает когда аннотация активна
        public @interface (name){

        }
        Generics - позволяют параметризировать какие-то классы(например List) и с помощью этого задать рамки, обходя даункастинг

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(1);
        listOfAnimals.add(new Animal(2);

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog();
        listOfDogs.add(new Dog();

        test(listOfAnimals);
        test(listOfDogs);
        private static void test(List<? extends Animal> list) { - Wildcard - позволяет дать понять джаве, что мы можем подать на вход в лист не только объекты класса Animal, но и его наследников. super Animal - позволяет дать понять джаве, что мы подаем на вход объект класса выше по иерархии наследования
        for(Animal animal : list)
            System.out.println(animal);
        }

        MVC pattern - Model View Controller - Model отвечает за данные приложения, взаимодействует с базой данных и бизнес-логикой, View отображает эти данные в виде таблицы, Controller управляет запросами от клиента

        @Controller
        public class MainController - показываем джаве что создаем контроллер

            @GetMapping("/mvc/demo-application")
            public String indexPage() {
                return "index"; - html file
            }

            @GetMapping("/mvc/say-hello")
            public String greetingsPage(@RequestParam String name,
                    Model model) {
                model.addAttribute("name", name);
                return "greetings"; - html file
            }


            JSON - JavaScriptObjectNotation - это простой текстовый формат для обмена данными на всех языках программирования.

            DTO - Data Transfer Object - упрощает работу с данными и делает ее быстрее и безопаснее.
            Позволяет избежать утечки данных и ускорить производительность, соблюдает принцип соблюдения слоев

            Валидация — это процесс проверки данных на соответствие определенным правилам
            javax.validation - это спецификация (API) для валидации объектов. Фактическая реализация — Hibernate Validator (самая популярная).
            @Valid — запуск валидации. Аннотация, которая запускает процесс валидации. Ставится перед объектом, который нужно проверить. (Без @Valid аннотации валидации (вроде @NotNull) не будут работать!)
            Основные аннотации: @NotNull — проверка на null, @NotEmpty — не null и не пусто, @NotBlank — строка без пробелов(если есть, обрежет), @Size — ограничение размера, @Email — проверка email
            @Min / @Max — числовые диапазоны, @Pattern — регулярные выражения

            JDBC - java database connectivity - драйвер для подключения к базам данных, использует одинаковые методы для всех баз данных
            ORM - object relational mapping - то, на чем завязан hibernate - дает возможность прямо в коде с помощью аннотации или доп конфиг файла создать соотношения поля джавы с таблицей в базе данных
            JPA - java persistence architecture - стандарт orm

            REST - REpresentational State Transfer - позволяет наилучшим образом использовать протокол http(hyper text transfer protocol)
            API - Application public interface - интерфейс, позволяющий пользователю получить доступ к функционалу программы
            API должен выполнять 4 вида функции: создание, чтение, обновление, удаление данных. (Create, read, update, delete - CRUD) - необходим при создании веб приложение
            структурирует модели, которые создаются для API, традиционно распространено применение оперирования к BD.
            CRUD соответствует этим HTTP методам - POST(Create), GET(Read), PUT(Update), DELETE(Delete)


            http://localhost:8080/users/15 - 15 - это path variable. Path Variable - это данные, которые являются частью самого URL-адреса. Они не отделяются знаками ? или &, а встроены в структуру пути.
            @GetMapping("/users/{userId}") - определяем переменную
            public String getUserById(@PathVariable Long userId) { - извлекаем переменную
                return "User ID: " + userId;
            }
            Используется, если элемент является уникальным идентификатором или URL сам по себе определяет ресурс

            http://localhost:8080/search?query=java&page=2&size=10 - query=java, page=2 и size=10 - это Query Parameters. Query parameter - это пары "ключ-значение", которые добавляются в конец URL после знака вопроса ?. Они используются для фильтрации, сортировки, пагинации и других необязательных параметров.
            @GetMapping("/search")
            public String search(@RequestParam String query,
                         @RequestParam int page) { - задаем параметры
                 return "Searching for: '" + query + "', on page: " + page; - возвращаем их на страницу.
            }
            Используется для необязательных параметров или для параметров, не являющихся частью идентификатора ресурса

            {"pizza": "Margherita", "size": "large"} - запрос - RequestBody. RequestBody - это данные, которые клиент отправляет в теле HTTP-запроса (обычно в формате JSON или XML). Используется для создания или обновления сложных объектов (например, целого пользователя с именем, email, паролем и т.д.).
            @PostMapping("/users") - Метод POST, так как мы создаем новый ресурс
            public String createUser(@RequestBody User newUser) { - Spring берет тело запроса (JSON) и превращает его в объект User
                return "User created: " + newUser.getName() + ", " + newUser.getEmail();
            }

            ResponseBody - Это то, что ваш контроллер возвращает клиенту (обычно в формате JSON). Указывает, что возвращаемое значение метода должно быть записано непосредственно в тело HTTP-ответа (а не интерпретироваться как имя View для рендеринга HTML).
            В современных Spring Boot приложениях с @RestController вам почти никогда не нужно писать @ResponseBody явно. Аннотация @RestController сама по себе является комбинацией @Controller и @ResponseBody.
            @RestController = @Controller + @ResponseBody для ВСЕХ методов

            Аннотация @SpringBootApplication - это композитная аннотация, которая объединяет три основные аннотации:
            @SpringBootApplication = @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
            @SpringBootConfiguration - Указывает, что класс содержит конфигурацию Spring, является специализированной версией @Configuration, помечает класс как источник определений бинов
            @EnableAutoConfiguration - Самый важный компонент Spring Boot: включает автоматическую настройку приложения, анализирует classpath и добавляет необходимые бины
            Примеры автоматической настройки: если в classpath есть H2, настраивает embedded БД, если есть Spring MVC, настраивает DispatcherServlet если есть JPA, настраивает EntityManager
            @ComponentScan - сканирует пакеты на наличие компонентов Spring. По умолчанию сканирует текущий пакет и все подпакеты. Обнаруживает: @Component, @Service, @Repository, @Controller, @Configuration классы
         */
    }
}
