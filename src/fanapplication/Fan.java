/*
 * file name: fan.java
 * programmer name: Nick McManus
 * date created: 09-12-2019
 * date of last revision: 9-16-2019
 * details of last revision: Add fan speed checking and comments
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
        fanSpeedCheck();
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }

    //Make sure the fan speed is valid and logical (non-negative and in range)
    private void fanSpeedCheck()
    {
        //If the fan speed is slower than slow make it slow
        if(this.fanSpeed < SLOW)
            this.fanSpeed = SLOW;
        
        //Otherwise if the fan speed is too high set the speed to high
        else if(this.fanSpeed > FAST)
            this.fanSpeed = FAST;
    }
    
    //Getters and setters
    public int getFanSpeed() {
        return fanSpeed;
    }

    public void setFanSpeed(int fanSpeed) {
        //Check for Valid FanSpeed
        this.fanSpeed = fanSpeed;
        fanSpeedCheck();
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
        //Base Text
        String output = "Color: " + color + ", Radius: " + radius;
        
        //If the fan is on display the speed before color
        //Otherwise append the object type and inform that the fan is off
        if(isOn)
            output = "Fan Speed: " + fanSpeed + ", " +  output;
        else
            output = "Fan " + output + ", Fan is Off";
        
        return output;
    }
    
}
