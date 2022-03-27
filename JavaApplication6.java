package javaapplication6;

import java.util.ArrayList; 
import java.util.Iterator;

public class JavaApplication6 {

    public static void main(String[] args) {
        
        ArrayList<String> barks = new ArrayList();
        barks.add("woof!");
        barks.add("woof!woof!");
        barks.add("woof!group2!woof!");

        Iterator<String> it = barks.iterator();
        
        Visit[] visits;
        visits = new Visit[4];
        visits[0] = new Bark();
        visits[1] =  new BarkRecognizer();        
        visits[2]= new Remote();
        visits[3] = new DogDoor(); 

        while (it.hasNext()){
            String b = it.next();  
                visits[0] = new Bark(b);
                for(int i=0; i<visits.length;i++){
                //when the user hears something and checks if it's my dog barking: use //heardSomething()method from interface  
                visits[i].heardSomething();
                }
        }

        //to lock or unlock windows, it requires a passcode to match 1234 
        DogDoor.lockWindows();// PSST! your passocde is 1234     
        
        }
                    
    }    

