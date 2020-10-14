import java.util.Scanner;

public class main {

    public static int least(int number1, int number2) {
        int least;
        if (number1 < number2) {
            least = number1;
        } else if (number2 < number1) {
            least = number2;
        } else {
            least = number1;
        }
        return least;
    }
    public static void main(String[] args) {

        int answer = least(21, 22);
        System.out.println("Least: " + answer);
    }
}