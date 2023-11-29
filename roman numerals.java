import java.util.Scanner;

public class RomanNumeralConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 3999) {
            String romanNumeral = convertToRoman(number);
            System.out.println("Roman numeral: " + romanNumeral);
        } else {
            System.out.println("Please enter a number between 1 and 3999.");
        }

        scanner.close();
    }

    public static String convertToRoman(int number) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder romanNumeral = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                romanNumeral.append(symbols[i]);
                number -= values[i];
            }
        }

        return romanNumeral.toString();
    }
}
