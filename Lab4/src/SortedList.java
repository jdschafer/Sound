/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java
 *@included     N/A
 */

public class SortedList {
    protected int[] array;
    protected final int DEFCAP = 100;
    
    public SortedList() {
        array = new int[DEFCAP];
    }
    
    public SortedList(int initSize) {
        array = new int[initSize];
    }
}