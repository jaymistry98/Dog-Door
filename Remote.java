
package javaapplication6;

import java.util.Scanner;

public class Remote implements Visit{

    private static boolean sensor;
    private static int keypad;
    
    Scanner sc = new Scanner(System.in);

    //no-arg constructor
    public Remote(){ this.sensor = false; this.keypad = 0;}
 
    //regular constructor
    public Remote(boolean sensor, int keypad){this.sensor = sensor; this.keypad = keypad;}     

    //copy constructor
    public Remote(Remote obj2){this.sensor = obj2.sensor; this.keypad = obj2.keypad;}
   
    //gets and sets
    public static boolean getSensor(){return sensor;}
    public static int getKeypad(){return keypad;}
    public static void setSensor (boolean sensor){Remote.sensor = sensor;}
    public static void setKeypad (int keynum){keypad = keynum;System.out.println("Your passcode is set to "+ keypad);}   

    //copy method
    public Remote copy()
   {	Remote copyObj = new Remote (sensor, keypad);
        return copyObj;
    }
  
     //toString method
    @Override
    public String toString()
    {  
        String str = "Remote power button is pressed to be turned ";
        if(sensor&&BarkRecognizer.getMyBark()) str+= " on.";
        else str += " off";
        return str;

    }

    //method from interface: this opens the door
    public void heardSomething(){
        if(sensor&&BarkRecognizer.getMyBark()) { 
            DogDoor.openDoor();
            System.out.println("Remote is to open the door");
        }
    }
 }   