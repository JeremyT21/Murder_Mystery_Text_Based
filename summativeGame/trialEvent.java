/*
  David Cacorovski, Jeremy Thummel, Sohail Meghani
  January 20th, 2022
  trialEvent Class File
  This is the file that will store the code for our trialEvent for the end of our game
*/

//imports and packages
package trial;

import java.util.*;

public class trialEvent
{
  //************
  //THE PLAYER MUST TYPE 0 AND PRESS ENTER WHEN A FALSE STATEMENT APPEARS  
  //initialize protected variable for times
  //the trial has an infinite amount of time, just don't accuse someone's statement who is telling the truth! }
   
  public String trialText1;
  public String trialText2;
  public String trialText3;
  public String trialText4;
  Scanner scan = new Scanner(System.in);

  public int trial()
  {    
    System.out.println("\u001b[32m"+"\nA trial argument for the murder case is about to start.\nType and enter a 0 when a false statement appears,\nor enter anything if you're unsure and want to see the next option.");
    scan.nextLine();

    while(true)//the code will return which text the user disagrees with and will only move on to the next statement if the user does not input 0
    {
      
      System.out.println("\u001b[0m"+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+trialText1+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      if(scan.nextLine().equals("0"))
        return 1;

      System.out.println("\u001b[0m"+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+trialText2+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      if(scan.nextLine().equals("0"))
        return 2;

      System.out.println("\u001b[0m"+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+trialText3+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

      if(scan.nextLine().equals("0"))
        return 3;

      System.out.println("\u001b[0m"+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"+trialText4+"\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
      
      if(scan.nextLine().equals("0"))
        return 4;

    }
  }
}