import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int secondtNumber = Integer.parseInt(reader.nextLine());
        double result = (double)firstNumber / secondtNumber;
        System.out.println("Division: " + firstNumber + " / " + secondtNumber + " = " + result);
    }
}