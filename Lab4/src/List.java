
public class List {
    protected final int DEFCAP = 100;
    protected int origCap;
    protected Object[] list;
    protected int numElements = 0;
    protected int currentPos;
    
    protected boolean found;
    protected int location;
    
    public List() {
        list = new Object[DEFCAP];
        origCap = DEFCAP;
    }
    
    public List(int origCap) {
        list = new Object[origCap];
        this.origCap = origCap;
    }
    
    protected void enlarge() {
        Object[] larger = new Object[list.length + origCap];
        
        for(int i = 0; i < numElements; i++) {
            larger[i] = list[i];
        }
        
        list = larger;
    }
    
    protected void find(Object target) {
        boolean moreToSearch;
        location = 0;
        found = false;
        moreToSearch = (location < numElements);
        while (moreToSearch && !found) {
            if(list[location].equals(target))
                found = true;
            else {
                location++;
                moreToSearch = (location < numElements);
            }
        }
    }
    
    public int size() {
        return numElements;
    }
    
    public boolean contains(Object element) {
        find(element);
        return found;
    }
    
    public boolean remove(Object element) {
        find(element);
        if(found) {
            for(int i = location; i <= numElements - 2; i++)
                list[i] = list[i + 1];
            list[numElements - 1] = null;
            numElements--;
        }
        return found;
    }
    
    public String toString() {
        String listString = "List:\n";
        for(int i = 0; i < numElements; i++)
            listString = listString + " " + list[i] + "\n";
        return listString;
    }
    
    public void reset() {
        currentPos = 0;
    }
    
    public Object getNext() {
        Object next = list[currentPos];
        if(currentPos == (numElements - 1))
            currentPos = 0;
        else
            currentPos++;
        return next;
    }
    
}