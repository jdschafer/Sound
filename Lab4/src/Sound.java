/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      SoundGenerator.java, UnsortedList.java, IndexedList.java
 *@included     N/A
 */

public class Sound {
    private static SoundGenerator gen;
    private UnsortedList unsortedList;
    private SortedList sortedList;
    private static Sound sound;
    
    public Sound() {
        gen = new SoundGenerator();
        unsortedList = new UnsortedList(20);
        sortedList = new SortedList(20);
    }
    
    public static void main(String[] args) {
        sound = new Sound();
        sound.run();
        
    }
    
    private void run() {
        for(int i = 0; i < 200; i++) {
            handleNum();
            
        }
    }
    
    private static void handleNum() {
    	int incoming = gen.getRandom();
    	int lowInc = (incoming/10) * 10;
    	
    }
}