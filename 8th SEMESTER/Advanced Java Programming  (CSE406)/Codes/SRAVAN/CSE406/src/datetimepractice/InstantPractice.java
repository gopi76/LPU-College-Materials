package datetimepractice;

import java.time.Instant;

public class InstantPractice {
    public static void main(String[] args){
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        
        Instant now = Instant.now();
        System.out.println(now);
        
        
    }
}
