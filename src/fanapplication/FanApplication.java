/*
 * file name: FanApplication.java
 * programmer name: Nick McManus
 * date created: 09-11-2019
 * date of last revision: 9-**-2019
 * details of last revision: Waiting for object to finish
 * short description: Exist to be a test function for the fan class
 */

package fanapplication;

public class FanApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare variables
        Fan fan1 = new Fan(10, "Yellow", Fan.FAST, true);
        Fan fan2 = new Fan();
        
        //Modify objects
        fan2.setFanSpeed(Fan.MEDIUM);
        
        //Display Information
        System.out.println(fan1);
        System.out.println(fan2);
    }

}
