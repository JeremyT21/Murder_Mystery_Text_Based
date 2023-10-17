/*
  David Cacorovski, Jeremy Thummel, Sohail Meghani
  January 20th, 2022
  characterManager Abstract Class
  This is the abstract class in which we initialize all of our characters 
*/
//make a package to import classes from characterManager.java to individual character .java files
package characterM;

public abstract class characterManager
{
  //initialize variables used in child classes
  public String speech;//must be public to change what character says in Main.java
  protected boolean alive;
  public char indexLetter;//for printing out text letter by letter
  public int index;//keeps track of index in the string
  protected String[] characterNames={"Boulder Brian: ","Hotel Manager: ","Lemon Blemon: ","Matilda: ","Red Drink: "};

  //initialize methods
  public abstract void speak();
}