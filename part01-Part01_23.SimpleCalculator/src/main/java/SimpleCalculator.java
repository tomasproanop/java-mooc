
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        int sum = first + second;
        System.out.println((first) + " + " + (second) + " = " + (sum));
        
        int substraction = first - second;
        System.out.println((first) + " - " + (second) + " = " + (substraction));
        
        int multiplication = first * second;
        System.out.println((first) + " * " + (second) + " = " + (multiplication));
        
        double division = (double) first / (double) second;
        System.out.println((first) + " / " + (second) + " = " + (division));
        
    }
}
