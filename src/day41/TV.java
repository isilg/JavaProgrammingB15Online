package day41;

public class TV {

    /**
     * TV:
     * attributes:  brand- String,  isOn- boolean, currentChannel- int(range from 0-50)
     * behaviors:   getCurrentChannel- return the chanel number of current channel for the TV,
     *              setCurrentChannel (newChannelNumber)- we can not set a channel if the TV is off! And valid channel is from 0-50,
     *              turnOn, turnOff, moveForward, moveBackward, toString()
     */

    // First create the attributes
    String brand;
    boolean isOn;
    int currentChanel;

    // Then write the methods by using behaviors
    public int getCurrentChanel(){
        return currentChanel;
    }

    public void setCurrentChanel(int newChanel){
        //If my chanel is out of range I want to exit from the method
        if(newChanel< 0 || newChanel>50){
            System.out.println("Invalid Chanel");
            return;  // RETURN CAN USE FOR 2 THINS=>1-RETURN STH 2-GET OUT OF THE METHOD EARLY
        }

        if(isOn ==true){
            currentChanel = newChanel;
        }else{
            System.out.println("Turn on the tv first");
        }
    }

    public void turnOn(){
        if (isOn == false){      // checking for equality
            System.out.println("Turning on tv");
            isOn = true;         // assigning the value of isOn to true
        }
    }

    public void turnOff(){
        if(isOn == true){
            System.out.println("Turning off tv");
            isOn = false;      // turnOff deyip kapattin ama tekrar turnOff dedin
                               // bidaha turnOff demesin hicbisey yazpmasin ekranda
                               // ayni spaceShip ornegindeki gibi
        }
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChanel=" + currentChanel +
                '}';
    }


}
