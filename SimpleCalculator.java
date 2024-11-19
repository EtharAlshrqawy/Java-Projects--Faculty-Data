/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;
import java.util.Scanner;


/**
 *
 * 
 */
public class SimpleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();


        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1/num2);
        System.out.println(num1%num2);

    }
}

