
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement here finding the indices of a number
        
        System.out.println("Search for?");
        int searchedNumber = Integer.valueOf(scanner.nextLine());
        
        // i is index
        for (int i = 0; i < list.size(); i++) {
            
            // value at index i
            int value = list.get(i);
            
            if (value == searchedNumber) {
                System.out.println(searchedNumber + " is at index " + i);
            }
        }  
    }
}
