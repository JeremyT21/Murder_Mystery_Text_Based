/*
  David Cacorovski, Jeremy Thummel, Sohail Meghani
  January 20th, 2022
  analyzeClues Class File
  This is the file that will store the code for analyzeClues section.
*/
//this package allows clue to be accessible to Main.java
package clue;

import java.util.*;

public class analyzeClues
{
  
  Scanner scan = new Scanner(System.in);
  //initialize variables
  public String clue1;
  public String clue2;
  public String clue3;
  public String selectClue;
  public String clueDescription1;
  public String clueDescription2;
  public String clueDescription3;
  public String clueCount;
  //Used to make a statement and move on to clueInspection
  public void clueAnalyzing()
  {
    System.out.println("");
    System.out.println("\u001b[32m"+"You look around and decide to inspect some items.");
  }

  public void clueInspection()
  {
    while(true)
    {
      System.out.println("");
      System.out.println("\u001b[32m"+"You go to the scene of interest.");
      //Shows each clue.
      System.out.println("1. "+clue1);
      System.out.println("2. "+clue2);
      System.out.println("3. "+clue3);
      System.out.println("What will you inspect? (1, 2, or 3 to inspect, or 4 to progress the story):");

      clueCount = scan.nextLine();//gets input
      while(true)//checks input
      {
        //Pretty self explanitory if you look at line 42.
        if(clueCount.equals("1"))
          break;

        else if(clueCount.equals("2"))
          break;

        else if(clueCount.equals("3"))
          break;

        else if(clueCount.equals("4"))
          break;

        else
        {
          System.out.println("\u001b[32m"+"Please pick 1, 2, or 3 to inspect, or 4 to progress the story:");
          clueCount = scan.nextLine();
        }
      }

      //below code executes based on input
      if(clueCount.equals("1"))
      {
        System.out.println("\u001B[34m"+clueDescription1);
        scan.nextLine();
      }
    
      else if(clueCount.equals("2"))
      {
        System.out.println("\u001B[34m"+clueDescription2);
        scan.nextLine();
      }

      else if(clueCount.equals("3"))
      {
        System.out.println("\u001B[34m"+clueDescription3);
        scan.nextLine();
      }

      else if(clueCount.equals("4"))
        break;

    }
  }
}