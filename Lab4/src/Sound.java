/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      SoundGenerator.java, UnsortedList.java, IndexedList.java
 *@included     N/A
 */

public class Sound {
    private static SoundGenerator gen;
    private static UnsortedList unsortedList;
    private SortedList sortedList;
    private static Sound sound;
    //Int variables for each upper range to use as indexes
    private static Integer range10, range20, range30, range40, range50, range60, range70,
    			range80, range90, range100, range110, range120, range130,
    			range140, range150, range160, range170, range180, range190,
    			range200;
    
    public Sound() {
        gen = new SoundGenerator();
        unsortedList = new UnsortedList(20);
        sortedList = new SortedList(20);
    }
    
    public static void main(String[] args) {
        sound = new Sound();
        handleNum();
        
    }
    
    private static void handleNum() {
    	int incoming = gen.getRandom();
    	unsortedList.add();
    }
}