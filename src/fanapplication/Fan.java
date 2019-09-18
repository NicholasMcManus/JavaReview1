/*
 * file name: fan.java
 * programmer name: Nick McManus
 * date created: 09-12-2019
 * date of last revision: 9-18-2019
 * details of last revision: Changed variables and setters to be closer to instructions
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
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    //Constructors
    //Default Constructor
    public Fan()
    {
        speed = this.SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    //Explicit Constructor
    public Fan(double radius, String color, int fanSpeed, boolean isOn)
    {
        //Check for valid FanSpeed
        this.speed = fanSpeed;
        fanSpeedCheck();
        this.on = isOn;
        this.radius = radius;
        this.color = color;
    }

    //Make sure the fan speed is valid and logical (non-negative and in range)
    private void fanSpeedCheck()
    {
        //If the fan speed is slower than slow make it slow
        if(this.speed < SLOW)
            this.speed = SLOW;
        
        //Otherwise if the fan speed is too high set the speed to high
        else if(this.speed > FAST)
            this.speed = FAST;
    }
    
    //Getters and setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //Check for Valid FanSpeed
        this.speed = speed;
        fanSpeedCheck();
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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
        if(on)
            output = "Fan Speed: " + speed + ", " +  output;
        else
            output = "Fan " + output + ", Fan is Off";
        
        return output;
    }
    
}
