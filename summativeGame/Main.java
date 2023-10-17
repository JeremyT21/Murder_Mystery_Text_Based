/*
  David Cacorovski, Jeremy Thummel, Sohail Meghani
  January 20th, 2022
  ICS4U Final Summative
  This is the main game file for the final project of the dream team.
*/

//imports

import java.util.*;
import java.io.*;
//we dont need to import characterManager since that's an abstract class used to make the character classes (e.g. character classes are only classes that need access to characterManager)
import characterClassBB.boulderBrianCharacter;
import characterClassRD.redDrinkCharacter;
import characterClassM.matildaCharacter;
import characterClassLB.lemonBlemonCharacter;
import characterClassHM.hotelManagerCharacter;
import characterClassP.playerCharacter;
import clue.analyzeClues;
import trial.trialEvent;

public class Main
{
  //Creating objects for each character. This is used to make them speak, set their speech, etc...
  public static lemonBlemonCharacter lemonBlemon = new lemonBlemonCharacter();
  public static boulderBrianCharacter boulderBrian = new boulderBrianCharacter();
  public static hotelManagerCharacter hotelManager = new hotelManagerCharacter();
  public static matildaCharacter matilda = new matildaCharacter();
  public static redDrinkCharacter redDrink = new redDrinkCharacter();
  public static playerCharacter player = new playerCharacter();
  public static void main(String[] args)
  {//****ONLY HAVE THE STRING[] ARGS LINE OF CODE ON MAIN.JAVA NO OTHER .JAVA FILE****

    //initialize Scanner object and variables
    String name;
    Scanner scan = new Scanner(System.in);
    int trialAnswer;

    //Start of the game, \u001b[32m is to change the color in the java console. This instance turns the color green.
    System.out.println("\u001b[32m"+"=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\u001b[32m"+" Welcome to Palm Island!");
    System.out.println("\u001b[32m"+"=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("\n" + "\u001b[32m"+"You and four others are on an island, with a volcano about to explode.");
    System.out.println("\n" + "\u001b[32m"+"Unfortunately, there are only four seats left on a private jet,\nand no one knows who should leave and who should stay behind!");
    System.out.println("\n" + "You are one of the unlucky souls still left on the island!\nWhat is your name?");
    System.out.print("\n\n>>>> ");
    //ask user for name and store it in a variable
    name = scan.nextLine();
    player.yourName = name;

    while(name.length()>10)
    {
      System.out.println("Please enter a name 10 characters or less.");
      name = scan.nextLine();
      player.yourName = name;
    }
    
    //From here on out its just mostly dialogue (player.speech), comments past here will comment stuff that isn't dialogue.
    player.speech = "Ah what a perfect time for a vacation.\nI can't wait to land and get to my hotel!";
    player.speak();
    scan.nextLine();//Just to have a pause so players can read text.
    //Add a extra space just so we dont get each scan.nextLine mixed up.
    System.out.println("\u001b[32m"+"After you landed you decided to sit back and relax,\nenjoy your vacation.");//outputs info to the user
    scan.nextLine();
    
    System.out.println("A week passes... There's a government PSA\ntelling everyone to evacuate the island because\nof an erupting volcano!");//outputs info to the user
    scan.nextLine();

    System.out.println("Unfortunately, for you and five other people\nwho didn't hear the PSA and didn't notice everyone\nleaving the hotel, (due to the PSA being announced at night).");//outputs info to the user
    scan.nextLine();

    System.out.println("Now, the morning after the PSA...");//outputs info to the user
    scan.nextLine();

    player.speech = "*yawn* What an awesome vacation this was,\nwell I better start packing.";//tells the character what to say
    player.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    System.out.println("\u001b[32m"+"After packing you go down to the hotel lobby.");
    scan.nextLine();//waits for user to press enter

    player.speech = "...Well, this is weird. Where is everyone?";//tells the character what to say
    player.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    hotelManager.speech = "Gone. Everyone is gone.";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    player.speech = "...What? What do you mean everyone is gone?";//tells the character what to say
    player.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter
    
    hotelManager.speech = "It's exactly what I mean.\nEVERYONE is gone.\nIf you're about to ask me why, I have no idea.";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter
    
    hotelManager.speech = "I'd imagine that there's more than \njust us who didn't hear the PSA.";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    matilda.speech = "WHERE IS EVERYONE? HEY DO YOU WORK HERE?\nWHERE'S THE GUY THAT RUNS THE ICE CREAM BAR?";//tells the character what to say
    matilda.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    hotelManager.speech = "He's... not here.";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    matilda.speech = "NOOOOOOOOOOO!";//tells the character what to say
    matilda.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    System.out.println("\u001b[32m"+"Matilda ran away crying.");//outputs info to the user
    scan.nextLine();//waits for user to press enter

    redDrink.speech = "Who was that cry baby?";//tells the character what to say
    redDrink.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    hotelManager.speech = "Some spoiled brat.";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    player.speech = "What are you? You look like a glass I'd drink out of.";//tells the character what to say
    player.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    redDrink.speech = "Hey man, that's offensive to me and my people.";//tells the character what to say
    redDrink.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    hotelManager.speech = "And who is your people?";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    redDrink.speech = "Red Drink.";//tells the character what to say
    redDrink.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    player.speech = "So, you're just a glass of Fruitopia?";//tells the character what to say
    player.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter
    
    redDrink.speech = "Look man, you're asking too much questions.\nYou might find an answer you don't like.";//tells the character what to say
    redDrink.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    lemonBlemon.speech = "Hey what happened to this place? Where did everyone go?\nDid they do a disappearing act? HA!";//tells the character what to say
    lemonBlemon.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    hotelManager.speech = "Everyone is gone, we don't know why, yadayadayada...";//tells the character what to say
    hotelManager.speak();//outputs info to the user
    scan.nextLine();//waits for user to press enter

    matilda.speech = "HEY YOU LIAR! I FOUND THE ICE CREAM GUY RIGHT HERE.";
    matilda.speak();
    scan.nextLine();

    boulderBrian.speech = "Get off me you crazy woman!";
    boulderBrian.speak();
    scan.nextLine();

    matilda.speech = "NOT UNTIL YOU MAKE ME SOME ICE CREEEEEEEEEAAAAAAAAAA-";
    matilda.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Matilda was inturupted by all of the surrounding televisions.");
    scan.nextLine();

    System.out.println("\u001b[34m"+"\nTV: YOUR ATTENTION PLEASE! Hello, unfortunately for you everyone has already evacuated.\nFor the remaining six people left on the island, there's only\none private jet and unfortunately again there's only\nfour seats available on the jet.");
    scan.nextLine();

    boulderBrian.speech = "Wait so you're telling me I can't go to the airport? I needed to-";
    boulderBrian.speak();
    scan.nextLine();

    matilda.speech = "SHUSH ICE CREAM MAN, I'M WATCHING.";
    matilda.speak();
    scan.nextLine();

    System.out.println("\u001b[34m"+"TV: The keys along with the private jet is at the hangar in the airport.\nAfter you've picked two people to leave behind you can board on the jet.\nGood luck.");
    scan.nextLine();

    player.speech = "We have to pick two people to leave behind?";
    player.speak();
    scan.nextLine();

    player.speech = "If that's the case, then I think we should do this sooner-";
    player.speak();
    scan.nextLine();

    boulderBrian.speech = "Are you kidding me? I was just about to leave for\nthe airport tomorrow! Now, we can't leave until we pick two pepole to leave?\nI'm not dealing with this right now.";
    boulderBrian.speak();
    scan.nextLine();

    lemonBlemon.speech = "If I had to pick right now, one of them would be you.";
    lemonBlemon.speak();
    scan.nextLine();

    boulderBrian.speech = "Do you know who I am? I am the Chief of Entertainment Operations.\nYOU DON'T GET TO SPEAK TO ME LIKE THAT! Puh.";
    boulderBrian.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Boulder Brian stormed off upstairs.");
    scan.nextLine();

    hotelManager.speech = "Yeah, I think we have to clear our heads for a bit.\nThe fact we have to leave two people behind terrifies me.";
    hotelManager.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Everyone left on their own except Red Drink.");
    scan.nextLine();

    redDrink.speech = "If it was up to me, I'd pick you bucko. Heheh.";
    redDrink.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Red Drink rolled away.");
    scan.nextLine();

    player.speech = "That was really odd. I guess I'll just go back to my room for a bit.";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"After a few hours, you decided to order food. Maybe Hotel Manager\nwould still serve us even though no one else is here.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"An hour goes by, and still, no answer. Maybe Hotel Manager isn't working.");
    scan.nextLine();

    player.speech = "I guess that would make sense. Maybe I should go find him.";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"You head down to the kitchen, thinking Hotel Manager might be making some food.");
    scan.nextLine();

    hotelManager.speak(false);//since hotel manager can no longer speak since he's dead, .speak is an overloaded function that allows us to define if a characer is dead or alive

    //*****************WHEN PLAYER DISCOVERS BODY***************************
    player.speech = "Hey listen, I've been trying to get in touch with you\nfor the last hour over the phone, Mr. Hotel Mana-";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"And what you saw made you puke for three minutes straight...");
    scan.nextLine();

    System.out.println("\u001b[32m"+"Hotel Manager's cold, lifeless body... inside the meat locker. Being eaten by a wildcat.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"Boulder Brian and Lemon Blemon were there too.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"You have gathered the remaining two people left on the island.");
    scan.nextLine();
    System.out.println("The angry girl Matilda.");
    scan.nextLine();
    System.out.println("And the mischevious Red Drink (he looks like a large red drink).");
    scan.nextLine();

    matilda.speech = "SO ARE WE GONNA IGNORE HOW YOU FOUND THE BODY \nIN THE MEAT LOCKER?";
    matilda.speak();
    scan.nextLine();

    lemonBlemon.speech = "Would you rather have him find it in your room, missy? HA!";
    lemonBlemon.speak();
    scan.nextLine();

    boulderBrian.speech = "If both of you don't shut up, you're next...";
    boulderBrian.speak();
    scan.nextLine();

    redDrink.speech = "This is better than reality TV.";
    redDrink.speak();
    scan.nextLine();

    player.speech = "Look guys, I stumbled across the body in the meat locker because of two things.";
    player.speak();
    scan.nextLine();
    
    player.speech = "Reason one, I was hungry and could not contact Hotel Manager for room service.\nSo, I was going to the meat locker to grab some food.";
    player.speak();
    scan.nextLine();
    
    player.speech = "Reason two, the door to the meat locker was open.\nSince we all know Hotel Manager hates\nletting the cold air out, I decided to check it out.";
    player.speak();
    scan.nextLine();

    player.speech = "I called you all here to share my idea.\nWe should hold a trial to uncover the murderer... before the next person dies.";
    player.speak();
    scan.nextLine();
    
    matilda.speech = "TRIAL SHMIAL. WHY WOULD I WANT TO GO TO SOME DUMB TRIAL WHEN I CAN JUST \nCALL 911 AND LET THEM DEAL WITH IT?";
    matilda.speak();
    scan.nextLine();

    lemonBlemon.speech = "Your IQ is 0.";
    lemonBlemon.speak();
    scan.nextLine();

    player.speech = "There are no police, remember?\nWe're the last ones left on the island.\nSince there are still five of us, the killer just needs to eliminate one more person \nto secure their seat on the private jet.";
    player.speak();
    scan.nextLine();

    redDrink.speech = "Hey guys... There's something on all of the TVs. It looks RATHER IMPORTANT.";
    redDrink.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"\nRed Drink winks at the non-existant cameras.");
    scan.nextLine();

    System.out.println("\u001b[34m"+"\nTV: This is a message to the remaining people left on the island from the government.\nAlthough we are NOT physically on the island,\nwe are still able to enforce our laws on the island!\nSo because we aren't there, we're going to have a trial for the murder of Hotel Manager,\nas per one of your fellow islanders request,\nand we will be monitoring it via all of the TVs.");
    scan.nextLine();
    
    lemonBlemon.speech = "Okay, so... How should we start?";
    lemonBlemon.speak();
    scan.nextLine();

    boulderBrian.speech = "Alright, I'm gonna lay it down for ya.\nI was with Lemon when he released a wildcat.\nWe both went up and saw the wildcat eating Hotel Manager.";
    boulderBrian.speak();
    scan.nextLine();

    boulderBrian.speech = "Seems obvious, but yeah.\nAs chief of entertainment operations,\nmy guess is Lemon stuffed em' in the fridge to not cause suspision.";
    boulderBrian.speak();
    scan.nextLine();

    player.speech = "I'm not so sure that this case is that simple.\nWhy did you not let anyone know?\nAlso what does your position have to do with any of this?";
    player.speak();
    scan.nextLine();

    boulderBrian.speech = "He said he would kill me.\nBut since we're all here, if I die, you'll know it was him.";
    boulderBrian.speak();
    scan.nextLine();

    lemonBlemon.speech = "I'm suing you after I get off this island.";
    lemonBlemon.speak();
    scan.nextLine();

    player.speech = "Alright alright, I'm going to investigate,\nand I'll meet you all back here in the hotel lobby at seven o'clock tonight.";
    player.speak();
    scan.nextLine();

    matilda.speech = "THIS IS BORING IM GOING BACK TO MY ROOM.";
    matilda.speak();
    scan.nextLine();

    lemonBlemon.speech = "I'm gonna go investigate on my own. I don't want to be falsely accused.";
    lemonBlemon.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"You went into the meat locker.");
    scan.nextLine();
    
    //*************** CLUE AREA 1 *********************
    
    //Creates clueArea1 object and goes into analyzeClues.
    analyzeClues clueArea1 = new analyzeClues();
    //Titles of each clue.
    clueArea1.clue1="Hotel Manager's body.";
    clueArea1.clue2="Red liquid on the floor.";
    clueArea1.clue3="Scratch marks on the wide variety of meats.";

    //Below are the descriptions of the items when you inspect them, executed by clueInspection
    clueArea1.clueDescription1="\nThe body seems to have scratches from the wildcat \nall over it. When you further inspect the body there \nseems to be stabs wounds on the left side of his body.\nThere is also a lot of meat on the floor,\nthat does not look like meat hanging in the locker.";
    clueArea1.clueDescription2="\nIt's red liquid, and you can't tell if it's blood, or Red Drink's red drink made in-house.";
    clueArea1.clueDescription3="\nThere's scratches on all the meats.\nKind of self explanatory.";
    //after you've set up the above clue area 1, now you can just call the methods!
    //clueAnalyzing is just an intro of text, applicable to all clueAreas
    clueArea1.clueAnalyzing();

    //clueInspection is what loops the clue inspection part of our game, and will automatically stop if you enter 4 to progress the story
    //writing any code after clueInspection will execute after the player is done with inspecting the clues in clueArea1
    clueArea1.clueInspection();
    
    player.speech = "Hey Boulder Brian, did you see these stab wounds on Hotel Manager's body?";
    player.speak();
    scan.nextLine();

    boulderBrian.speech = "No, I didn't. Could've just been claws.";
    boulderBrian.speak();
    scan.nextLine();

    player.speech = "Maybe... I'm gonna do some investegating upstairs.";
    player.speak();
    scan.nextLine();
    
    boulderBrian.speech = "Why? The murder was on this floor? What are you going to find upstairs?";
    boulderBrian.speak();
    scan.nextLine();

    player.speech = "I'm not sure, its just a hunch.";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"You took your time as not to fall, and walked up the stairs like an established gentleperson.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"Boulder Brian not wanting you to go upstairs\nmakes you naturally interested in going into his room.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"You enter room #283.");
    scan.nextLine();

    //*************** CLUE AREA 2 *********************

    analyzeClues clueArea2 = new analyzeClues();
    clueArea2.clue1="The closet door is open.";
    clueArea2.clue2="There's a tray for holding a\n   wide variety of meats on the floor.";
    clueArea2.clue3="Blood on the nightstand.";
    
    clueArea2.clueDescription1="\nThe closet door has meat piled up.\nIt's as if Brian is going to use them for something dubious.";
    clueArea2.clueDescription2="\nThe fork and knife are missing, huh.";
    clueArea2.clueDescription3="\nLemon Blemon couldn't have drawn\nsomeone else's blood, could he have?";
    clueArea2.clueAnalyzing();

    clueArea2.clueInspection();

    player.speech = "Well, that settles it. I need a drink after all this work.";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"You go outside the hotel and wonder off to\nLemon Blemon's Lemonade Stand for Lemon Lovers.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"Lemon Blemon's not there, so you go into the juice bar to make some juice.");
    scan.nextLine();

    //*************** CLUE AREA 3 *********************

    analyzeClues clueArea3 = new analyzeClues();
    clueArea3.clue1="A letter on the bar countertop.";
    clueArea3.clue2="An open cage.";
    clueArea3.clue3="A diary entry (just one entry,\n   it'd be rude to look at all of them).";

    clueArea3.clueDescription1="\nIt's a letter of demotion wrote out to Lemon Blemon,\nexplaining how he's suitied more to a position as a juice maker more\nthan chief of entertainment operations.";
    clueArea3.clueDescription2="\nIt's a cage with a faint smell of wildcat.";
    clueArea3.clueDescription3="\nYou read it. It reads:\n\nFirst Brian takes my job, and then he threatens to tell people I tried to kill him\nwith the wildcat. Darn it, if not for that trail of meats, the wildcat I didn't feed\nfor two days would've gone for Brian, not ended up\nin the locker with Hotel Manager!\nMan do I feel guilty.\nI even lured Brian to the stand with the\noffer of a free lemonade! What a waste of lemonade! HA!";
    clueArea3.clueAnalyzing();

    clueArea3.clueInspection();

    System.out.println("\u001b[32m"+"\nUsing all of the evidence you've collected, you feel ready to take on the trial.");
    scan.nextLine();

    System.out.println("\u001b[32m"+"You look at the sun retreating into dusk, and hear a loud voice from a speaker above you.");
    scan.nextLine();

    System.out.println("\u001b[34m"+"\nSpeaker: Attention all possible murderers and or islanders left on the island, it is now time\nfor the seven o'clock trial. Please gather in the trial hall.");
    scan.nextLine();
    

    // ******************************************TRIAL 1 CODE****************************
    System.out.println("\u001b[32m"+"\nThe trial for the murder of Hotel Manager will now begin!\nAs you are progressing through text boxes, make sure to press enter to progress,\nyou can always scroll up the console in case you miss anything.\nEnter anything when you are ready for the trial:");
    scan.nextLine();//Scan just to make a pause here, basically useless.
    
    matilda.speech = "WOW I CAN'T BELIEVE WE'RE ACTUALLY GOING THROUGH A STUPID TRIAL!\nI COULD BE IN MY ROOM RIGHT NOW.";
    matilda.speak();
    scan.nextLine();
    
    player.speech = "It's going to be quick Matilda, trust me. With all of the evidence I found,\nit should be pretty straight forward.";
    player.speak();
    scan.nextLine();

    redDrink.speech = "You know who the killer is?";
    redDrink.speak();
    scan.nextLine();

    boulderBrian.speech = "I hope your evidence coincides with mine.\nThe murderer is Lemon Blemon!";
    boulderBrian.speak();
    scan.nextLine();
    
    trialEvent trial1 = new trialEvent(); //Making object and goes through trialEvent
    //Below is trial text for the trialEvent.
    trial1.trialText1 = "Boulder Brian: Remember how all the meats in the meat locker were scratched up? Probably\nLemon Blemon rewarding his wildcat for good behaviour\nwith some new chew toys.";
    trial1.trialText2 = "Matilda: MY ROOM IS RIGHT NEXT TO BOULDER BRIAN'S, AND HIS ROOM SMELLS LIKE MEAT!\nCAN WE TALK ABOUT THIS?";
    trial1.trialText3 = "Boulder Brian: Why would I kill a fellow employee? Go check Blemon's\nlemonade stand, I guarentee he has a wildcat cage!";
    trial1.trialText4 = "Lemon Blemon: Well I was there all day, and I didn't see a cage! HA!";
    trialAnswer=trial1.trial();//trial returns the right trialAnswer

    if(trialAnswer==1)//the if statements show you if you're right or wrong
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true! The meats were scratched up. Please try again, but this time inspect and remember all of the items and their descriptions.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);//this exits the program without an error message, forcing the player to restart.
    }

    else if(trialAnswer==2)
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true! Boulder Brian had a stash of meat inside of his closet. Please try again, but this time inspect and remember all of the items and their descriptions.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);
    }

    else if(trialAnswer==3)
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true! Though Boulder Brian may or may not know if what he said is a fact, you know that there really is a wildcat cage in the lemonade stand. Please try again, but this time inspect and remember all of the items and their descriptions.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);
    }

    else if(trialAnswer==4)
    {
      System.out.println("\u001b[34m"+"\nYou are correct! You remembered Lemon Blemon was absent from his lemonade stand.");
    }

    player.speech = "No, that's wrong! You were not at your lemonade stand!";
    player.speak();
    scan.nextLine();

    player.speech = "Your job was also taken by Boulder Brian,\nexplaining your hatred for one another.";
    player.speak();
    scan.nextLine();

    lemonBlemon.speech = "Ok I admit it, I tried to kill Brian.\nBut we were not together during the murder.";
    lemonBlemon.speak();
    scan.nextLine();

    lemonBlemon.speech = "After I released the wildcat, it started rushing to the meat locker\ninstead of Boulder Brian's room.\nSeemed to me like there was a trail of meats leading to Hotel Manager's already dead body!";
    lemonBlemon.speak();
    scan.nextLine();

    redDrink.speech = "Hotel Manager was already dead before the wildcat got to him?";
    redDrink.speak();
    scan.nextLine();

    lemonBlemon.speech = "Yes, and though I admit to attempted murder,\nI won't admit to trying to kill Hotel Manager!";
    lemonBlemon.speak();
    scan.nextLine();

    lemonBlemon.speech = "I believe that putrid act belongs to Boulder Brian!\nHe must have known about the wildcat,\nand through the use of a trail of meat,\nframed me and my wildcat companion!\nAlso if you find my pretty kitty\ncall +1 (960) 0214-007. Thank you.";
    lemonBlemon.speak();
    scan.nextLine();

    boulderBrian.speech = "Lemon, you came running after the wildcat.";
    boulderBrian.speak();
    scan.nextLine();

    boulderBrian.speech = "You saw me in front of the cold, dead body.";
    boulderBrian.speak();
    scan.nextLine();

    boulderBrian.speech = "You really think people are gonna believe that?\nBy the way, the reason I was with\nLemon Blemon when the body was found, should be obvious.";
    boulderBrian.speak();
    scan.nextLine();

    boulderBrian.speech = "Lemon Blemon was going to use the wildcat to kill me\nif I didn't get in the meat locker.";
    boulderBrian.speak();
    scan.nextLine();

    redDrink.speech = "Why wouldn't he just kill you on sight then?";
    redDrink.speak();
    scan.nextLine();

    boulderBrian.speech = "Do you ever shut up?";
    boulderBrian.speak();
    scan.nextLine();

    redDrink.speech = "That's harsh...";
    redDrink.speak();
    scan.nextLine();

    redDrink.speech = "Especially coming from the ice cream man.";
    redDrink.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Red Drink winks at the non-existant cameras.");
    scan.nextLine();

    //********************************* TRIAL 2

    trialEvent trial2 = new trialEvent();
    trial2.trialText1 = "Red Drink: Well, I'm sold on Boulder Brian. I keep meat in my closet\nbut never while I'm on vacation.";
    trial2.trialText2 = "Boulder Brian: What? I had meat in my closet because I was hungry.\nIt's not easy eating all of that meat with just a fork and knife.";
    trial2.trialText3 = "Matilda: REMEMBER WHAT BOULDER BRIAN SAID, IT COULD BE LEMON BLEMON TRYING TO FRAME HIM.\nTHOUGH I'M STILL SIDING WITH LEMON BLEMON, HE EVEN ADMITTED TO ATTEMPTED MURDER!\nWAIT, ARE WE STILL GOING TO TAKE LEMON BLEMON ON THE PLANE WITH US IF HE'S INNOCENT?";
    trial2.trialText4 = "Lemon Blemon: I gave my lemons to you, I am not framing anybody.\nI was just abiding by Boulder Brian's request not to rat him out,\nso that he would not turn the evidence on to me.\nIt's up to you to take what I told you, and make lemonade. HA! I'm so smart...";
    trialAnswer=trial2.trial();//trial returns the right trialAnswer

    if(trialAnswer==1)//the if statements show you if you're right or wrong
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true!\nRed Drink does not keep meat in his closet on his trips!\nPlease try again, but this time remember all of Red Drink's quirky personality traits.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);//this exits the program without an error message
    }

    else if(trialAnswer==2)
    {
      System.out.println("\u001b[34m"+"\nYou are correct! You remembered there was no fork or knife left on Boulder Brian's food tray.");
    }

    else if(trialAnswer==3)
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true! Lemon Blemon admitted to attempted murder,\nand both of them are just as suspicious.\nPlease try again, but this time inspect and\nremember all of the items and their descriptions.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);
    }

    else if(trialAnswer==4)
    {
      System.out.println("\u001b[34m"+"\nYou are wrong, that statement is true!\nWhat Lemon Blemon says does add up with the evidence,\nhowever Boulder Brian's statements have not been.\nPlease try again, but this time inspect and remember \nall of the items and their descriptions.");

      System.out.println("\n< GAME OVER >");
      System.exit(0);
    }

    player.speech = "No, that's wrong! There was no fork or knife to be found in your room!\nI believe you used the utensils to stab Hotel Manager,\nand then framed the wildcat for the murder\nusing your various spread of unique meats!";
    player.speak();
    scan.nextLine();

    matilda.speech = "CASE CLOSED, HAVE FUN BOULDER BRIAN, FUN IN JAIL! HA-";
    matilda.speak();
    scan.nextLine();

    lemonBlemon.speech = "That's my line.";
    lemonBlemon.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"\nLemon Blemon looks to the sky in disapproval.");
    scan.nextLine();
    
    player.speech = "But why? Why did you do it Boulder Brian?";
    player.speak();
    scan.nextLine();

    //Makes Boulder Brain say Talk 3 times.
    for(int x=0;x<3;x++)
    {
      boulderBrian.speech = "Talk.";
      boulderBrian.speak();
      scan.nextLine();
    }
    
    boulderBrian.speech = "Hotel Manager, it's in his name.\nAfter taking Lemon Blemon's job,\nhow am I suppose to climb the ranks of this company\nwhen the hotel manager is named Hotel Manager?";
    boulderBrian.speak();
    scan.nextLine();

    boulderBrian.speech = "My only option was to kill him.\nThough my reasoning for such a passion I can not share to you all,\nI needed a spot to open up for a position as hotel manager...";
    boulderBrian.speak();
    scan.nextLine();

    player.speech = "Well Brian, hope you like warm baths.";
    player.speak();
    scan.nextLine();

    boulderBrian.speech = "Wha-";
    boulderBrian.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Ten long minutes pass.");
    scan.nextLine();

    System.out.println("\u001b[34m"+"TV: Excellent job islanders! Thanks to you,\nwe can eliminate the threat to society right here, right now!");
    scan.nextLine();

    System.out.println("\u001b[32m"+"You stand at the top of the volcano with\nBoulder Brian tied around a large boulder.");
    scan.nextLine();

    player.speech = "Well Brian, I'll say it once more, hope you like warm baths.";
    player.speak();
    scan.nextLine();

    System.out.println("\u001b[32m"+"Good job! You beat Palm Treechery Part I,\nthanks to your good detective skills, and intuition! See you in Part II!");
    
    /*
    //*********************************************************************************
    //BELOW IS EXAMPLE CODE TO SEE HOW CODE WORKS, DELETE IN FINAL VERSION OF SUMMATIVE
    boulderBrian.speech = "Hello "+player.name+", I am Boulder Brian. Uh oh, why is there a knife on the floor?";
    boulderBrian.speak();

    //ALWAYS MUST BE 3 CLUES EXACTLY
    //Below you see what items you can inspect, as well as constructing the first clue area
    analyzeClues clueArea1 = new analyzeClues();
    clueArea1.clue1="Knife on the floor.";
    clueArea1.clue2="Blood on Boulder Brian's shirt.";
    clueArea1.clue3="Ripped piece of paper next to the knife.";

    //Below are the descriptions of the items when you inspect them, executed by clueInspection
    clueArea1.clueDescription1="\nThe knife has a signature engraved on it.";
    clueArea1.clueDescription2="\nThe blood looks fresh.";
    clueArea1.clueDescription3="\nThe paper roughly spells out The Killer is Boul-, and then the paper tears.";

    //after you've set up the above clue area 1, now you can just call the methods!
    //clueAnalyzing is just an intro of text, applicable to all clueAreas
    clueArea1.clueAnalyzing();

    //clueInspection is what loops the clue inspection part of our game, and will automatically stop if you enter 4 to progress the story
    //writing any code after clueInspection will execute after the player is done with inspecting the clues in clueArea1
    clueArea1.clueInspection();

    //now we can execute a mini trial to test out the trial functionality and kill Boulder Brian
    //below trial function sets a time limit and will give you that much time to gather your evidence
    trialEvent trial1 = new trialEvent();
    //you must also change the trial text in Main depending on how many people are alive during the trial (in this case it would just say Boulder Brian)
    trial1.trialText1 = "Boulder Brian: The paper was torn, maybe the person just slipped?";
    trial1.trialText2 = "Boulder Brian: There was no blood on my shirt, so it was not me!";
    trial1.trialText3 = "Boulder Brian: That knife had someone's name on it.";
    trial1.trialText4 = "Boulder Brian: Yea yea mfs";
    trialAnswer=trial1.trial();//trial returns the right trialAnswer
    if(trialAnswer==1)//the if statements show you if you're right or wrong
    {
      System.out.println("You are wrong, that statement is not false!!");
      System.exit(0);//this exits the program without an error message
    }

    else if(trialAnswer==2)
    {
      System.out.println("DING DING, CORRECT! YOU ARE RIGHT! THAT IS FALSE! HE IS THE MURDERER!");
      System.out.println("The government sent him off to the volcano to perish. ggez");
      System.exit(0);
    }

    else if(trialAnswer==3)
    {
      System.out.println("You are wrong, that statement is not false!!");
      System.exit(0);
    }
    */
  }
}