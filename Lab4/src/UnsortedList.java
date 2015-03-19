/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java
 *@included     N/A
 */

public class UnsortedList {
    protected int[] array;
    protected final int DEFCAP = 100;
    
    public UnsortedList() {
        array = new int[DEFCAP];
    }
    
    public UnsortedList(int initSize) {
        array = new int[initSize];
    }
    
}