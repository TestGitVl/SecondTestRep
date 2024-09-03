import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите операцию: ");
        String operation = in.next();

        System.out.println("Введите 2 чиcла: ");
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        switch (operation) {

            case "+":
                System.out.println(number1 + number2);
                break;

            case "-":
                System.out.println(number1 - number2);
                break;

        }


    }
}
