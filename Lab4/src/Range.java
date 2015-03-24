/*@author       Justin Schafer
 *@id           jdschafer
 *@course       CSIS 252
 *@assignment   Sound Lab 4
 *@related      Sound.java, UnsortedList.java, SortedList.java
 *@included     N/A
 */

public class Range {
    private final int SIZE = 10;
    private int count;
    private int low;
    private int high;
    
    public Range(int small, int big) {
        low = small;
        high = big;
        count = 0;
    }
    
    public Range(int num) {
        low = (num/SIZE) * SIZE;
        high = low + (SIZE - 1);
    }
    
    private int getCount() {
        return count;
    }
    
    private void addCount(int more) {
        count += more;
    }
    
    private int getHigh() {
        return high;
    }
    
    private int getLow() {
        return low;
    }
    
    public int compareTo(Range inc) {
        if(this.equals(inc))
            return 0;
        else if(this.getLow() > inc.getHigh())
            return 1;
        else
            return -1;
    }
    
    public boolean equals(Range inc) {
        return(this.getLow() == inc.getLow() && 
               this.getHigh() == inc.getHigh());
    }
}
