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
    
    //Returns the number of elements in this range
    protected int getCount() {
        return count;
    }
    
    //Adds the int passed to the method into the number of contents
    protected void addCount(int more) {
        count += more;
    }
    
    //Returns the higher boundary
    protected int getHigh() {
        return high;
    }
    
    //Returns the lower boundary
    protected int getLow() {
        return low;
    }
    
    //Returns 0 if the ranges are equal
    //Returns 1 if this range is higher than the parameter
    //Returns -1 if this range is lower than the parameter
    public int compareTo(Range inc) {
        if(this.equals(inc))
            return 0;
        else if(this.getLow() > inc.getHigh())
            return 1;
        else
            return -1;
    }
    
    //Returns true if the ranges are equal, returns false otherwise
    public boolean equals(Range inc) {
        return(this.getLow() == inc.getLow() && 
               this.getHigh() == inc.getHigh());
    }
    
    //Returns a string containing the upper bound, lower bound,
    //and number of contents
    public String toString() {
        return ("lower bound: " + low + "\nupper bound: " + high + 
                "\nnumber of contents: " + count);
    }
}
