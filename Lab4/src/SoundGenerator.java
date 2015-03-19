import java.util.*;

public class SoundGenerator {
    protected int random;
    
    protected int getRandom() {
        random = (int)(Math.random()) * 200;
        return random;
    }
    
}