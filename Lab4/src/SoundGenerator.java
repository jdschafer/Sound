/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java
 *@included     N/A
 */

//Called by other classes who need random numbers between 0 and 200
public class SoundGenerator {
    protected int random;
    
    //Generates a random number between 0 and 200 then returns it
    protected int getRandom() {
        random = (int)(Math.random()) * 200;
        return random;
    }
}