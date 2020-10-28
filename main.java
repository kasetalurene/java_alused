import java.util.Scanner;

public class main { public static void main(String[] args) throws Exception {
    NumberStatistics allNumbers = new NumberStatistics();
    NumberStatistics evenNumbers = new NumberStatistics();
    NumberStatistics oddNumbers = new NumberStatistics();

    Scanner reader = new Scanner(System.in);
    System.out.println("Type numbers:");
    int number = Integer.parseInt(reader.nextLine());
    while(number != -1){
        allNumbers.addNumber(number);
        if(number % 2 == 0){
            evenNumbers.addNumber(number);
        } else {
            oddNumbers.addNumber(number);
        }
        number = Integer.parseInt(reader.nextLine());
    }
    System.out.println("sum: " + allNumbers.sum());
    System.out.println("sum of even: " + evenNumbers.sum());
    System.out.println("sum of odd: " + oddNumbers.sum());
}
}