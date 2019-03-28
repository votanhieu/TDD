import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class primeTest {
    @Test
    public void func(){
        assertEquals(List(),Cal(1));
        assertEquals(List(2),Cal(2));
        assertEquals(List(3),Cal(3));
        assertEquals(List(2,2),Cal(4));
        assertEquals(List(5),Cal(5));
        assertEquals(List(2,3),Cal(6));
        assertEquals(List(2,2,2),Cal(8));
        assertEquals(List(3,5),Cal(15));
        assertEquals(List(7,7),Cal(49));
    }

    private List<Object> List(Integer... ints) {
        return Arrays.asList(ints);
    }

    private List<Integer> Cal(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;
        while(n > 1){
            while(n % divisor == 0){
                factors.add(divisor);
                n/= divisor;
            }
            divisor++;
        }
        if(n > 1)
             factors.add(n);
        return factors;
    }

}