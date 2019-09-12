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

public class fan {
    final public static int SLOW = 1,
            MEDIUM = 2,
            FAST = 3;
    
    private int fanSpeed;
    private boolean isOn;
    private double radius;
    private String color;
    
    public fan()
    {
        fanSpeed = this.SLOW;
        isOn = false;
        radius = 5;
        color = "Blue";
    }
    
    public fan(double radius, String color, int fanSpeed, boolean isOn)
    {
        this.fanSpeed = fanSpeed;
        this.isOn = isOn;
        this.radius = radius;
        this.color = color;
    }
    
}
