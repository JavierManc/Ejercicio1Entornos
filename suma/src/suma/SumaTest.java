package suma;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SumaTest {
	Suma s;
	@Before
    public void setUp() throws Exception {
		s=new Suma();

        
    }
	@Test
	public void testHacerSuma() {
		int[] numeros= new int[] {1,2,3,4};
		
		assertEquals(10,s.hacerSuma(numeros));
		
	}
	
	

}
