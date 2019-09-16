/*
 * file name: fan.java
 * programmer name: Nick McManus
 * date created: 09-12-2019
 * date of last revision: 9-12-2019
 * details of last revision: TBD
 * short description: Create a fan object which emulates
 *                      the function of a fan.
 */

package fanapplication;

public class Fan {
    //Create default speed profiles
    final public static int SLOW = 1,
            MEDIUM = 2,
            FAST = 3;
    
    //Declare internal variables
    private int fanSpeed;
    private boolean isOn;
    private double radius;
    private String color;
    
    //Constructors
    //Default Constructor
    public Fan()
    {
        fanSpeed = this.SLOW;
        isOn = false;
        radius = 5;
        color = "Blue";
    }
    
    //Explicit Constructor
    public Fan(double radius, String color, int fanSpeed, boolean isOn)
    {
        //Check for valid FanSpeed
        this.fanSpeed = fanSpeed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    //Getters and setters
    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        //Check for Valid FanSpeed
        this.fanSpeed = fanSpeed;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Override ToString method
    @Override
    public String toString() {
        String output = "Color:" + color + " Radius: " + radius;
        
        if(isOn)
            output = "Fan Speed: " + fanSpeed +  output;
        else
            output = "Fan " + output + " Fan is Off";
        
        return output;
    }
    
}
