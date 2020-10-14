import java.util.Scanner;

public class main {

        private static void printStars(int amount) {
            int i = 1;
            while (i <= amount){
                System.out.print("*");
                i++;
            }
            System.out.println();
        }
        public static void main(String[] args) {
            printStars(5);
            printStars(3);
            printStars(9);
        }
    }
    