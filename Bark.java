
package javaapplication6;

import java.util.Scanner;

public class Bark implements Visit{
   
    private static String barked;
    
    //no arg constructor
    public Bark(){barked="";}

    //regular constructor
    public Bark(String b){this.barked = b; 
    //System.out.println(SCRATCH+"!\n"+ barked + "!\n");
    }

    //copy constructor
    public Bark(Bark obj2){this.barked = obj2.barked; }
    
   //gets and sets
    public static String getBarked(){return barked;}
    public static void setBarked (String b){barked = b;}

    //copy method
    public Bark copy(){Bark copyobj = new Bark(barked); return copyobj;}

    //equals method
    public boolean equals (Bark obj2){return (barked.equals(obj2.barked));}
    
     //toString method
    public String toString()
    {   String str = barked;
        return str;
    }

    //method from interface: this informs the user that there's someone at the door
    public void heardSomething(){
        System.out.println(SCRATCH+"\n"+ barked + "!\nI hear something!");
    }


}