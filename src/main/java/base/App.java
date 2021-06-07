/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tsehai Boucaud
 */
package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String[] args){
        App myApp = new App();
        String choice = myApp.choose();
        String f = "Fahrenheit";
        String c = "Celsius";
        int temperature = 0;
        if(choice.equalsIgnoreCase("C")){
            int fare = myApp.getTemp(f);
            temperature = myApp.calcCels(fare);
        }
        else
        {
            int cels = myApp.getTemp(c);
            temperature = myApp.calcFare(cels);
            c = f;
        }
        System.out.println("The temperature in " + c + " is " + temperature + "." );
    }
    private int calcFare(int cels){
        return (cels - 32) * 5 / 9;
    }
    private int calcCels(int fare){
        return (fare - 32) * 5 / 9;
    }
    private int getTemp(String word){
        System.out.print("Please enter your temperature in " + word + ": ");
        return inp.nextInt();
    }
    private String choose(){
        System.out.print("Press C to convert from Fahrenheit to Celsius.\n" +
                "Press F to convert from Celsius to Fahrenheit.\n" +
                "Your choice: ");
        return inp.nextLine();
    }
}
