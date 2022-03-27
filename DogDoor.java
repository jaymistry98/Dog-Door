package javaapplication6;

import java.util.Scanner;

public class DogDoor extends Remote implements Visit{
    
        private static boolean isOpen;
        private static boolean windowLocked;

    //no arg constructor
    public DogDoor(){super();isOpen = false; windowLocked = false;}

    //regular constructor
    public DogDoor(boolean sensor, int keypad, boolean open, boolean window){super(sensor, keypad); isOpen= open; windowLocked= window;}

    //gets and sets
    public static boolean getIsOpen(){return isOpen;}
    public static boolean getWindowLocked(){return windowLocked;}
    public static void setIsOpen (boolean open){isOpen = open;}
    public static void setWindowLocked (boolean locked){windowLocked = locked;}
    
    //toString method
        @Override
    public String toString()
    {  
        String str = "";
        if(isOpen){
            str = "The dog door is open";
            return str;}
        else {
            str= "The door is closed now";
            return str;
        }
    }
    
    //method to open door
    public static boolean openDoor()//if my dog barked or remote sensor is on open the door
    {   if (BarkRecognizer.getMyBark() || getSensor() ){ 
            System.out.println("I'm opening the door");
            return isOpen = true;}
    //if either of them is true, it sets isOpen to be true
        else { System.out.println("The door is closed now");return isOpen = false;} 
    }
    
    //method to lock windows
    public static void lockWindows()//if passcode is entered, let the user lock or unlock the windows
   {      System.out.println("Do you want to lock your windows? \nPlease enter your passcode for the keypad: \n");
          Scanner keyboard= new Scanner(System.in);
          String ans;

        if (keyboard.nextInt() == 1234 ) {//checks if the passcode entered is matching to our default number
            System.out.println("The passcode is correct. Do you want to lock or unlock your window?\n");
            ans =keyboard.next();
                if(ans.equalsIgnoreCase("lock")) {windowLocked = true; System.out.println("Your windows are now locked\n" );}
                else if (ans.equalsIgnoreCase("unlock")) {windowLocked = false; System.out.println("Your windows are now unlocked\n");}
                else System.out.println("You can only say lock or unlock");
        }
        else {
            System.out.println("Wrong number: you need a correct passcode!");
            return; }
    }
    
    //method from interface: this informs the user if the door is opened or closed
    public void heardSomething(){
        if(isOpen)
        System.out.println("DogDoor is opened now\n");
        else System.out.println("DogDoor is closed now\n");
    }
       
}
