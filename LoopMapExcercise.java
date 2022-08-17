
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coleb
 */
public class LoopMapExcercise {
    
    public static void main (String args[]) {
        
        
        /*
        Write a program that does the following:
            Asks the user for 5 numbers
            Stores them in an array list
            Finds the sum, product, largest, and smallest of those numbers
        */
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        
        System.out.println("Enter 5 numbers seperated by a space. Ex: 5 4 8 2 1");
        
        
        for (int i = 0; i<5;i++) {
            myList.add(input.nextInt());
        }
        
        System.out.println("this is the list: " + myList);
        
        int sum = 0;
        int product = 1;
        int largest = myList.get(0);
        int smallest = myList.get(0);
        
        for (int item: myList) {
            sum = sum + item;
            product = product * item;
            if (largest < item) largest = item;
            if (smallest > item) smallest = item;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Max: " + largest);
        System.out.println("Smallest: " + smallest);
        
        
        //----------------------------------------------------------
        
        /*
        You are a car dealer. Create a hash map of vehicles.
            The model is the Key, the make is the Value.
            Ask the customer what car (model) they are looking for. Use the Hash Map to determine if you have that vehicle, and what make it is.
            (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")
        */
        
        Map<String, String> cars = new HashMap<>();
        cars.put("Sonata", "Hyundai");
        cars.put("Elantra", "Hyundai");
        cars.put("Cruze", "Chevy");
        cars.put("Focus", "Ford");
        cars.put("F150", "Ford");
        
        System.out.println("What model car are you looking for today?");
        Scanner input2 = new Scanner(System.in);
        String x=input2.next();
        if (cars.containsKey(x)) {
            System.out.println("Yes we have " + x + ", it is over here with the " + cars.get(x) + "'s.");
        }
        else {
            System.out.println("Sorry, we dont have an " + x + ", sorry for the inconvienience");
        }
        
    }
    
}
