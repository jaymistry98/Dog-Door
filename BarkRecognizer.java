
package javaapplication6;

public class BarkRecognizer implements Visit{
    
    private static boolean myBark;
    
    //no arg constructor
    public BarkRecognizer(){if(Bark.getBarked().equals(MYDOG))this.myBark = true;}

    //regular constructor
    public BarkRecognizer(boolean barked){if(Bark.getBarked().equals(MYDOG)) {this.myBark = true;}}

    //copy constructor
    public BarkRecognizer(BarkRecognizer obj2){this.myBark = obj2.myBark;}  
  
   //gets and sets
    public static boolean getMyBark(){return myBark;}
    public static void setMyBark (boolean mybark){if(Bark.getBarked().equals(MYDOG)) myBark = mybark;}

    //copy method
    public BarkRecognizer copy(){BarkRecognizer copyObj = new BarkRecognizer (myBark); return copyObj;}
    
    //equals method
    public boolean equals (BarkRecognizer obj2){return myBark == obj2.myBark;}
    
    //toString method
    @Override
    public String toString()
    {   String str = "test"; 
            if(myBark) {
            str = "This is my dog barking!";
            return str;
        }
        else {
            str = "This isn't my dog";
            return str;
        }

    }
 
    //method from interface: this checks if it's my dog barking then send a signal to the remote control to open the door
    public void heardSomething(){ 
        if(!ISHOME && Bark.getBarked() == MYDOG){ 
            setMyBark(true);
            Remote.setSensor(true);
            System.out.println("I heard something, the bark recognizer says it's my dog, setting my Remote on");
        } else System.out.println("I heard something but it's not my dog\n");
    }
    
}