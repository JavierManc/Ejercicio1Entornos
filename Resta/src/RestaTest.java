import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RestaTest {

	Resta r;
	
	@Before
	public void setUp() throws Exception {
		r=new Resta();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public final void testHaceResta() {
		
		int resta[]= {1,1};
		assertEquals(0, r.haceResta(resta));
		
	}

}
