/**
 * Student: Adrian Moreno
 /** Class: PoemMain.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 11/1/2022
*
* This class – Read from a text file named poem2.txt provided below. The program then reads the name and poet of each poem, creates an object of type Poem for each name/poet pair and prints all the read poem info to the console.
*/

package Poem;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PoemMain
{
    public static void main(String[] args) 
    {
        try
        {
            PrintWriter file2 = new PrintWriter("poems.txt");
            Poem p1 = new Poem();
            p1.setName("We Real Cool");
            p1.setPoet("Gwendolyn Brooks");

            Poem p2 = new Poem();
            p2.setName("I Know Why the Caged Bird Sings");
            p2.setPoet("Maya Angelou");

            Poem p3 = new Poem();
            p3.setName("The Road Not Taken");
            p3.setPoet("Robert Frost");

            file2.print(p1.getName());
            file2.print(p1.getPoet());

            file2.print(p2.getName());
            file2.print(p2.getPoet());

            file2.print(p3.getName());
            file2.print(p3.getPoet());

            file2.close();
        }
      catch(IOException e)
      {
            System.out.println("Error! Please try again.");
            e.printStackTrace();
        }
    }
}
