import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        counter.printValue();
        counter.decrease();
        counter.printValue();
        counter.decrease();
        counter.printValue();
   }
}