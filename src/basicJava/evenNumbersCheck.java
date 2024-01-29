package basicJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class evenNumbersCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.print("Enter the list of numbers (separated by spaces): ");
        String[] values = input.nextLine().split(" ");

        for (String value : values) {
            numbers.add(Integer.parseInt(value));
        }

        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        //Collections.sort(evenNumbers);

        System.out.print("Even numbers in ascending order: ");
        for (int evenNumber : evenNumbers) {
            System.out.print(evenNumber + " ");
        }
    }
}