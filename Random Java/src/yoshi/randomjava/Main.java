package yoshi.randomjava;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("This is a basic calculator!");

        System.out.println("Please enter an operation: ");
        selectorMethod();
    }

    public static void selectorMethod() {
        String sum = "Sum";
        String subtract = "Subtract";
        String multiply = "Multiply";
        String divide = "Divide";

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Sum, Subtract, Multiply or Divide");
        String operation = sc1.nextLine();

        if (operation.equalsIgnoreCase(sum)) {
            System.out.println("You chose Sum!");
            additionMethod();

        } else if (operation.equalsIgnoreCase(subtract)) {
            System.out.println("You chose Subtract!");
            subtractionMethod();

        } else if (operation.equalsIgnoreCase(multiply)) {
            System.out.println("You chose Multiply!");
            multiplyMethod();

        } else if (operation.equalsIgnoreCase(divide)) {
            System.out.println("You chose Divide!");
            divideMethod();

        } else {
            System.out.println("Please choose a valid operation from above.");
        }
    }

    public static void additionMethod() {
        double num1, num2, sum;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter A Natural Number");
        num1 = sc2.nextDouble();

        System.out.println("Enter Another Natural Number");
        num2 = sc2.nextDouble();

        sc2.close();

        sum = num1 + num2;

        System.out.println("The sum of these numbers is: " + sum);
        System.out.println("Thanks!");
    }

    public static void subtractionMethod() {
        double num1, num2, sum;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter A Natural Number");
        num1 = sc2.nextDouble();

        System.out.println("Enter Another Natural Number");
        num2 = sc2.nextDouble();

        sc2.close();

        sum = num1 - num2;

        System.out.println("The subtraction of these numbers is: " + sum);
        System.out.println("Thanks!");
    }

    public static void multiplyMethod() {
        double num1, num2, sum;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter A Natural Number");
        num1 = sc2.nextDouble();

        System.out.println("Enter Another Natural Number");
        num2 = sc2.nextDouble();

        sc2.close();

        sum = num1 * num2;

        System.out.println("The multiplication of these numbers is: " + sum);
        System.out.println("Thanks!");

    }

    public static void divideMethod() {
        double num1, num2, sum;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter A Natural Number");
        num1 = sc2.nextDouble();

        System.out.println("Enter Another Natural Number");
        num2 = sc2.nextDouble();

        sc2.close();

        sum = num1 / num2;

        System.out.println("The division of these numbers is: " + sum);
        System.out.println("Thanks!");

    }

}

