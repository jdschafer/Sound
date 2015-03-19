/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      SoundGenerator.java, UnsortedList.java, IndexedList.java
 *@included     N/A
 */

public class Sound {
    private SoundGenerator gen;
    private UnsortedList unsortedList;
    private SortedList sortedList;
    
    public Sound() {
        gen = new SoundGenerator();
        unsortedList = new UnsortedList(20);
        sortedList = new SortedList(20);
    }
    
    public static void main(String[] args) {
        
        
    }
}