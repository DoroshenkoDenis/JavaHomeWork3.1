import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Билет будет стоить:");
        int payment = scanner1.nextInt();

        int miles = payment/20;


        System.out.println("Спасибо за покупку, Вам начислены мили в размере: " + miles);

    }
}