/*
  David Cacorovski, Jeremy Thummel, Sohail Meghani
  January 20th, 2022
  hotelManagerCharacter Child Class
  This is the child class in which we make the character speak, and die (depending on which character)
*/
//make a package to import classes from characterManager.java to Main.java
package characterClassHM;
//import abstract class from characterManager.java
import characterM.characterManager;

public class hotelManagerCharacter extends characterManager
{
  //initialize parameters and variables
  boolean alive=true;
  int index=0;
  final String hotelName = "\n" + "\u001b[0m" + characterNames[1];
  //initialize methods
  public void speak()
  {
    System.out.print(hotelName);
    System.out.print(speech);
    System.out.println("\n");
  }

  public void speak(boolean alive)//this mainly helped us program the game, since we would never get confused with the plot of our game, because if we type System.out.println(character'sName.alive) it would print true or false, helping us remember if we already killed the character or not
  {
    this.alive=alive;//makes the character's alive value equal to true or false depending on parameters given to the .speak method
  }
}