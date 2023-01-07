package ie.atu.week4;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        delete();
    }

    public static void delete() {
        System.out.println("Please enter a number");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Subtract by ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }
}
