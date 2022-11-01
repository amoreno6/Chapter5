/**
 * Student: Adrian Moreno
 /** Class: Stats.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 11/1/2022
*
* This class – Reads the 10 numbers in the example file Book1.csv provided above. This program then sums all the numbers, finds the lowest number, finds the highest number, and computes the average.
*/

import java.io.*;
import java.util.Scanner;


public class Stats
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("src/Book1.csv");
        try 
        {
            Scanner sc = new Scanner(file);
            String x[];
            int min = 9999, max = 0, sum = 0;
            while (sc.hasNextLine()) 
            {
                x = sc.nextLine().split(",");
                try 
                {
                    for(String str : x) 
                    {
                        sum = sum + Integer.parseInt(str);
                        if (Integer.parseInt(str) < min) 
                        {
                            min = Integer.parseInt(str);
                        }
                        if (Integer.parseInt(str) > max) 
                        {
                            max = Integer.parseInt(str);
                        }
                    }
                }
              catch(NumberFormatException e)
              {
                    System.out.println(e);
                }
            }

            int avg = (sum + min + max) / 3;

            FileWriter updatedFile = new FileWriter("src/stats.txt");
            updatedFile.write("The sum of the numbers is: " + sum);
            updatedFile.write("The lowest number is: " + min);
            updatedFile.write("The highest number is: " + max);
            updatedFile.write("The average of the numbers is: " + avg);
            updatedFile.close();
        }
        catch(FileNotFoundException e)
      {
            System.out.println("Error! File not found. Please try again. ");
            e.printStackTrace();
        }
    }
