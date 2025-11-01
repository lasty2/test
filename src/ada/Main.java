// Checked Exceptions (Compile time exceptions) - возникают во время компиляции, исключительные случаи в работе программы, Unchecked Exceptions(Runtime Exception) - возникают во время выполнения программы, ошибка во время работы программы

package ada;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws scannerException { // throws FileNotFoundException { //предупреждаем джаву о возможной ошибке, выбрасываем вверх по иерархии
        /*File file = new File("adad");

        try { //пытаемся выполнить код, если не получается, в ход вступает блок catch // после выброшенной ошибки код в блоке try не выполняется!!
            Scanner scanner = new Scanner(file); // пример checked exception
        } catch (FileNotFoundException | IOException e) { // выбрасывается объект класса FileNotFoundException ИЛИ IOException(multi-catch)
            System.out.println("Файл не найден"); // работа с объектом
        }*/

        /*Scanner scanner = new Scanner(System.in);
        while(true){
            int x = Integer.parseInt(scanner.nextLine());

            if(x!=0)
                throw new scannerException("Пользователь ввел что-то кроме 0");
        }*/

        //int a = 1/0; // пример unchecked exception
    }
}
