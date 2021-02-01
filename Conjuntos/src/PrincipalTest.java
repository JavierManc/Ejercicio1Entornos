import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrincipalTest {
	
	int [] x= {8,2};
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testHacerSuma() {
		assertEquals(10,Principal.hacerSuma(x));
	}

}
