# Dog-Door

You are asked to create a dog door for a client. You are programming the remote that will do things such as open and close, etc. You must create both the program and write a white paper explaining your design. 

● It should open (saying “The dog door is open.”) and close (saying “The dog door is closed.”). 

● It should take into account a dog going outside and coming back in; it should open when the dog barks, recognize the sound of the owner’s dog and not other dogs, not let other dogs are animals in by closing when necessary (use any way you like), 

● Some people may want their dog door to lock/unlock all the windows in the house if a certain combination on a keypad is put in. Some people may want the door to detect the dog scratching the door. 

● You should at least have Remote, BarkRecognizer, DogDoor, and Bark classes. 

● You should use an Iterator (by implementing the interface of Iterator, i.e. not just a regular loop) to recognize barks. 

● Make sure to use classes, objects, inheritance, polymorphism, interface, etc. 

● Use main to show how it works.



/*---------------------------------DESIGN EXPLANATION-------------------------------------------------*/

This program consists of four classes and one interface. The interface “Visit” is implemented to “Remote”, “BarkRecognizer”, “DogDoor”, and “Bark” classes. Also, “DogDoor”extends from “Remote” and “Remote” extends from “BarkRecognizer”

 

Visit: 

This interface requires subclasses to override a method called “heardSomething”. Each class overrides the method that validates and resets certain conditions and values. This method also invokes methods in other classes. The fields inside the interface are “SCRATCH”, “ISHOME”, and “PASSCODE”. They are final and static. 

 

Bark: 

This class has a sound (“barked”) made from a dog and will store it for the user.

 

BarkRecognizer: 

This class will inform us whether the barking is from my dog or not. The sound of my dog it will be compared to “woof!group2!woof!” to validate if it’s my dog’s sound. If my dog is not home and the bark matches my dog’s sound, it will reset the “myBark” in BarkRecognizer to be true. When it validates that this is my dog’s sound, it resets the value on the sensor of Remote class to true, and turns on the remote.

 

Remote: 

The Remote class has two fields for the remote control and keypad. It takes in a passcode for the keypad from the user. After validations, will send a signal to the door to open/close the door or to lock/unlock the windows. The default value of the keypad is set to “1234” and the value must match in order to lock/unlock the windows. 

 

DogDoor: 

This class will take in a barking sound or passcode, then will inform us to whether to close/open the door or lock/unlock windows. Two methods, “openDoor()” and “lockWindows”, will check if the required conditions are met and will open/close the door or lock/unlock the windows. Our last interface method “heardSomething” prints the updated status of the door, whether it is opened or closed.

 