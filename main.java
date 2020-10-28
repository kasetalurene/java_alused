import java.util.Scanner;

public class main {
     public static void main(String[] args) {
        Menu cafee = new Menu();
        cafee.addMeal("Hamburger");
        cafee.addMeal("Fish'n'Chips");
        cafee.addMeal("Sauerkraut");
    cafee.printMeals();
    cafee.clearMenu();
    cafee.printMeals();
     }
}
