//API - Application public interface - интерфейс, позволяющий пользователю получить доступ к функционалу программы

package obuchenie;

public class    Main1 {


    public static void main(String[] args) {
        // System.out.println("hello"); - метод, позволяющий выводить символы в терминал. Обращение к системе, аут(который я не знаю) и принт, обычный как обычный, принтлн ставит таб в конце. есть /t - tab, /n - ентер, // и /" - вывести знак в печать
        // sout - конструкция для быстрого использования system.out.println()
        // System.out.println("Возраст:" + "26" + '.'); // вывод нескольких данных
        /*
        многострочный коммент.
         */
        // int age; // создание переменной
        // age = 56; // присваивание переменной значения
        // byte - тип данных, хранящий целочисленные значения от -128 до 127, занимает 1 байт
        // short - от -32768 до 32767, занимает 2 байта
        // int - от -2147483648 до 2147483647, занимает 4 байта
        // long - от -9223372036854775808 ло 9223372036854775807, занимает 8 байт
        // float - число с плавающей точкой, в конце обязательно дописать f
        // double - число с плавающей точкой, можно в два раза больше записать чисел после точки
        // char позволяет хранить 1 символ
        // string позволяет хранить набор символов
        // boolean - хранит значение true или false
        // Scanner out = new Scanner(System.in);
        // out.nextLine(); // nextline позволяет получить от пользователя строковый тип данных nextint - получаем от пользователя данные int
        // short num1 = 50, num2 = 10; //можно создать много переменных одного типа
        // int res = num1 + num2; // res++ - увеличение переменной на 1
        // System.out.println("результат: " + res);
        // || - конструкция "или", && - конструкция "и"\

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        if(role.equals("Admin")) { // equals - равенство для проверки строк
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет, как тебя зовут?");
            String name = scanner.nextLine();
        } конструкция if-else */

        /* Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("num is 1");
                break;
            case 2:
                System.out.println("num is 2");
                break;
            case 5:
                System.out.println("num is 5");
                break;
            default:
                System.out.println("default");
        } конструкция switch-case, используется для проверки каких-то точных значений. break позволяет выйти из case для выполнения следующего кода. default - else в методе switch-case. */

        /* Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("Действие: ");
        String action = scanner.nextLine();
        action = scanner.nextLine();

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Результат: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Результат: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Результат: " + res);
                break;
            case "/":
                if(num2 == 0)
                    System.out.println("На ноль делить нельзя!");
                else {
                    res = num1 / num2;
                    System.out.println("Результат: " + res);
                }
                break;
            default:
                System.out.println("Это не действие!");

        } - великий программа */

        //for(int i = 0; i <= 10; i++) {
        //    System.out.println("Element: " + i);
        //}цикол фор - создаем переменную, проверяем условие, изменяем переменную, если условие сошлось, выполняем код

        //int i = 0;
        //while (i < 10){
        //    System.out.println("papapa");
        //    i++;
        //} цикол вайл - пока условие выполняется, выполняется и код

        //int i = 100;
        //do {
        //    i *= 100;
        //} while(i < 10); цикол do-while - даже если не выполняется условие, минимум один раз выполнится код

        //for(int i = 5; i < 25; i += 2){
        //    if(i >= 17)
        //        break;
        //    System.out.println("Element: " + i);
        //} break позволяет выйти из цикла при выполнении какого то условия

        //for(int i = 5; i < 25; i += 2){
        //    if(i % 3 == 0)
        //        continue;
        //    System.out.println("Element: " + i);
        //} continue позволяет пропустить один круг цикла при выполнении условия

        //int[] nums = new int[5]; //создание массива
        //nums[0] = 45;
        //nums[1] = 32;
        //nums[2] = 1;
        //nums[3] = 9;
        //nums[4] = 3;
        //int res = nums[2] + nums[3];
        //System.out.println(res); работа с элементами массива

        //float[] nums2 = new float[] {5.0f, 6.45f, 89.984f};
        //System.out.println(nums2[1]);

        //for(int i = 0; i < nums2.length; i++)
        //    System.out.println("Element: " + nums2[i]);
        // перебор элементов массива с помощью цикла for\
        /*int[] arr = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: ");
            int value = scanner.nextInt();
            arr[i] = value;
        }

        int min = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.println("Minimal: " + min); практическое применение массивов с выводом минимального числа */

        /* char[][] syms = new char[2][2]; //Создание двумерного массива
        syms[0][0] = 't';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
                {5, 7},
                {7, 3},
                {2, 0}
        };
        nums[1][1] = 67;
        System.out.println(nums[1][1]); работа с двумерным массивом*/

        /* ArrayList<Integer> numbers = new ArrayList<>(); //создание коллекции или динамического массива данных, требует больше памяти для использования
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);

        // System.out.println(numbers.size()); вывод длины коллекции
        // System.out.println(numbers.get(1)); получение данных об элементе коллекции
        // numbers.remove(1); удаление элемента из коллекции numbers.clear(); - полностью очищает коллекцию

        for(Integer el : numbers) { //спец цикл для перебора коллекций
            System.out.println(el);
        } */

        // LinkedList<Float> numbers = new LinkedList<>(); // такая коллекция привязывает элементы друг к другу

        // infoData("Hello"); //вызов функции
        // int result = summa(5,7);
        // infoData(String.valueOf(result)); // .valueOf преобразует тип данных в String

        /*byte[] nums1 = new byte[] {5, 6, 8};
        int sum1 = summaArray(nums1);
        System.out.println("Сумма 1: " + sum1);

        byte[] nums2 = new byte[] {5, 7, 3, 7, 6, 8};
        int sum2 = summaArray(nums2);
        System.out.println("Сумма 2: " + sum2); применение функций для оптимизации кода - нахождения суммы массива*/

        /* Transport bmw = new Transport();
        bmw.speed = 250.5f;
        bmw.weight = 2500;
        bmw.color = "White";
        bmw.coordinate = new byte[] {0, 0, 0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinate = new byte[] {100, 0, 100};

        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed); простое межклассовое использование методов*/

        //Car bmw = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0});
        //bmw.engine.setValues(false, 2000);
        //bmw.engine.info();
        //bmw.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
        //String res1 = bmw.getValues();
        //System.out.println(res1);

        //Truck truck = new Truck( 5600, new byte[] {100, 0, 100}, false);
        //truck.engine.setValues(true,500);
        //truck.engine.info();

        //truck.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
        //System.out.println(truck.getValues());
        //truck.setValues(140.5f, 5600, "Red", new byte[] {100, 0, 100});
        //String res2 = truck.getValues();
        //System.out.println(res2);

        //truck.setLoaded(true);
        //truck.getLoaded();

        /*Car flyCar = new Car(250.5f, 2500, "White", new byte[] {0, 0, 0}) {
            @Override
            public void moveObject(float speed) {
                super.moveObject(speed);

                this.engine.isReady(true);
                System.out.println("Машина летит");
            }
        };

        flyCar.moveObject(450); */

        //final int count = 10;// изменить значение нельзя, константа

        /*Car bmw = new Car();

        bmw.setLight(true);
        bmw.blinkLight(); */






    }

    /*public static void info(){
        System.out.println("Hello");
    }

    public static void info(String word){
        System.out.println(word + "!");
    } перегрузка методов*/

    /* public static int summaArray(byte[] arr) {
        int summa = 0;
        for(byte i = 0; i < arr.length; i++)
            summa += arr[i];
        return summa;
    } */

    /* public static int summa(int a, int b) { // вместо void ставим тип данных, который хотим вернуть, и с помощью ключевого слова return возвращаем
        int res = a + b;
        String result = "Результат: " + res;
        infoData(result);
        return res;
    }

    public static void infoData(String word) { // создание нового метода, который ничего не возвращает
        System.out.print(word);
        System.out.println("!");

    } */
}