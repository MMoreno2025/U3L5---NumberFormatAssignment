//Malia Moreno | 1 October 2024//
package com.mycompany.u3l5numberformatassignment;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.text.DecimalFormat;

public class U3L5NumberFormatAssignment {
    public static void main(String[] args) {
        //get input for total # of students, then ask for num of girls at school
        //Us Number formatter output % of girls and % of boys at the school
        Scanner scan = new Scanner(System.in);
        NumberFormat fmt1 = NumberFormat.getPercentInstance();  //define value as % with format//
        double totalStudents, girlStudents;     //double is used to make sure value can be dividied and not equal 0//
        System.out.print("How many students go to your school?\t");
        totalStudents = scan.nextInt();
        System.out.print("How many girls go to your school?\t");
        girlStudents = scan.nextInt();
        //uses formater fmt1 to turn decimals into %//
        System.out.println(fmt1.format(girlStudents/totalStudents)+" of students are girls and "+fmt1.format((totalStudents-girlStudents)/totalStudents)+" are boys");
        
        
        //Ask for total amount of money in dollars and cents
        //convert money value to british pounds (exchange rate on 10/03 is 0.83 pence to the $
        //output number of pounds in British number format, mention exchange rate
        System.out.print("\nInput total amount of money in dollars:\t");
        double totalMoney = scan.nextDouble();
        double convertedMoney = totalMoney*0.83;
        NumberFormat fmt2 = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("You have:\t"+fmt2.format(convertedMoney));
        
        
        //ask for input between 0 and 15, then format the number Pi to that number 
        //of decimal places, then print out number
        int pieDec = 20;
        while(pieDec>15 || pieDec<0){
            System.out.print("\nPlease Input a Value between 0 and 15\t");
            pieDec = scan.nextInt();
        }
        double pieRound = roundAvoid(Math.PI, pieDec);
        System.out.println("Pie rounded "+pieDec+" decimal places is:\t"+pieRound);
        
        
        //Generate a random number between  100,000,000 to 999e18 as a decial number//
        Random ran = new Random(); 
        DecimalFormat df1 = new DecimalFormat("###");  
        double bigNumDec = 100000000*Math.pow(10,-14);
        double ranBigNum = ran.nextDouble(bigNumDec, 9990000);
        System.out.println("Ran num: "+ranBigNum);
        System.out.println("\nA random big num is:\t"+df1.format(ranBigNum*Math.pow(10,9)));
    }
    
    public static double roundAvoid(double value, int places){
        double scale = Math.pow(10, places);
        return Math.round(value * scale)/scale;
    }
}
