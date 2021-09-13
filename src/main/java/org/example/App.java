/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Andrew Hicks
 */

package org.example;
import java.text.DecimalFormat;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DecimalFormat df = new DecimalFormat("##.00000");
        Scanner n = new Scanner(System.in);
        double bac = 0;
        System.out.print( "Enter a 1 if you are a male or a 2 if you are a female: " );
        int gender = n.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        int a = n.nextInt();
        System.out.print("What is your weight, in pounds? ");
        int w = n.nextInt();
        System.out.print("How many hours has it been since your last drink? " );
        int h = n.nextInt();

        if(gender == 1){
            bac = (a * 5.14 / w * .73) - .015 * h;
        }
        if(gender == 2){
            bac = (a * 5.14 / w * .66) - .015 * h;
        }
        System.out.println("Your BAC is " + df.format(bac));
        if(bac < .08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive.");
        }
    }
}
