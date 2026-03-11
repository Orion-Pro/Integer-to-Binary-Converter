import java.util.Scanner;
import java.util.ArrayList;

public class Converter {

    public String int_to_Binary(int input) {
        String BinaryInteger = "";

        ArrayList<Integer> Binary = new ArrayList<>();
        int quotient = input;
        int remainder;

        if (input == 0) {
            BinaryInteger = "0000";
            return BinaryInteger;
        }

        while (quotient != 0) {
            int temp = quotient;
            quotient = quotient / 2;
            remainder = temp % 2;
            Binary.add(remainder);
        }
        for (int i = Binary.size() - 1; i >= 0; i--) { //Needs greater or equal because ArrayList index includes 0.
            BinaryInteger += Binary.get(i).toString();
        }
        return BinaryInteger;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Converter converter = new Converter();

        try {
            System.out.print("Input an integer to be converted to binary: ");
            int input = scanner.nextInt();

            System.out.println(converter.int_to_Binary(input));
        }
        catch(IllegalArgumentException e) {
            System.out.println("Input must be an integer!");
        }
        catch(Exception e) {
            System.out.println("An unexpected error occured.");
        }
    }

}

//Program works, try and do some formatting.
//To improve, perform  conversions from other radii.