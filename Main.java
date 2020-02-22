
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x, y;
        char c;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите первое число");
            x = scanner.nextDouble();
            System.out.println("Введите второе число");
            y = scanner.nextDouble();
            System.out.println("Введите арифметическую операцию");
            c = scanner.next().charAt(0);
            if (c == '+' || c == '-') {
                System.out.println("Выполняются операции сложения или вычитания");
                if (c == '+' & x < 10) {
                    System.out.println(x + y);
                } else {
                    System.out.println("Первое число больше 10, мы с ним работать не будем:)))");
                }
                if  (c == '-') {
                    System.out.println(x - y);
                }
            } else {
                System.out.println("Иначе выполняется другая операция");
            }
        }
    }
}
