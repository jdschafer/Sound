/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java
 *@included     N/A
 */

public class UnsortedList extends List {
    
    public UnsortedList() {
        super();
    }
    
    public UnsortedList(int initSize) {
        super(initSize);
    }
    
    public void add(Object element) {
        if(numElements == list.length)
            enlarge();
        list[numElements] = element;
        numElements++;
    }
    
    public boolean remove(Object element) {
        find(element);
        if(found) {
            list[location] = list[numElements - 1];
            list[numElements - 1] = null;
            numElements--;
        }
        return found;
    }
    
}