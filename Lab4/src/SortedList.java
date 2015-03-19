/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java
 *@included     N/A
 */

public class SortedList extends List {
    
    public SortedList() {
        super();
    }
    
    public SortedList(int initSize) {
        super(initSize);
    }
    
    public void add(Comparable element) {
        Comparable listElement;
        int location = 0;
        boolean moreToSearch;
        
        if(numElements == list.length)
            enlarge();
        
        moreToSearch = (numElements > 0);
        
        while(moreToSearch) {
            listElement = (Comparable)list[location];
            if(listElement.compareTo(element) < 0) {
                location++;
                moreToSearch = (location < numElements);
            }
            else
                moreToSearch = false;
        }
        
        for(int index = numElements; index > location; index--)
            list[index] = list[index - 1];
        
        list[location] = element;
        numElements++;
    }
}