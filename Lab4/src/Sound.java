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
    
    //Directs the program to run the unsorted list and then the sorted list
    public static void main(String[] args) {
        sound = new Sound();
        sound.runUnsorted();
        sound.runSorted();
        
    }
    
    //Handles the unsorted list version and then prints the results
    private void runUnsorted() {
        for(int i = 0; i < 200; i++) {
            handleNumUn();
        }
        System.out.println("Unsorted List");
        System.out.println(unsortedList.toString());
        System.out.println("Number of compares: " + unsortedList.compares);
        System.out.println("Size of list: " + unsortedList.list.length);
        System.out.println("\n");
    }
    
    //Generates the random number and then adds it to the unsorted list
    private void handleNumUn() {
    	int incoming = gen.getRandom();
    	Range range = new Range(incoming);
    	range.addCount(1);
    	
    	if(unsortedList.contains(range))
    	    ((Range) unsortedList.list[unsortedList.location]).addCount(range.getCount());
    	else
    	    unsortedList.add(range);
    }
    
    //Handles the sorted list version and then prints the results
    private void runSorted() {
        for(int i = 0; i < 200; i++) {
            handleNumSr();
        }
        System.out.println("Sorted List");
        System.out.println(sortedList.toString());
        System.out.println("Number of compares: " + sortedList.compares);
        System.out.println("Size of list: " + sortedList.list.length);
        System.out.println("\n");
    }
    
    //Generates the random number and then adds it to the sorted list
    private void handleNumSr() {
        int incoming = gen.getRandom();
        int lowInc = (incoming/10) * 10;
        Range range = new Range(incoming);
        range.addCount(1);
        
        if(sortedList.contains(range))
            ((Range) sortedList.list[sortedList.location]).addCount(range.getCount());
        else
            sortedList.add(range);
    }
}