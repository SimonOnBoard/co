import java.util.Scanner;

public class CaseExample {
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
            switch (c){
                case '-':
                    System.out.println(x - y);
                    break;
                case '+':
                    System.out.println(x + y);
                    break;
                default:
                    System.out.println("Не подошло ничего");
            }
            //Я только что отредактировал этот файл на github
        }
    }
}
