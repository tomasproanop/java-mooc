
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int counter = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0) {
                break;
            }

            if (number < 0) {
                counter += 1;
                continue;
            }
            
            if (number > 0) {
                continue;
            }       
        }
        
        System.out.println("Number of negative numbers: " + counter);
    }
}
