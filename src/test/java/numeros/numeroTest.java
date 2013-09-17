package numeros;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class numeroTest {

	numero fb;
	
	@Before
	public void Setup(){
		fb = new numero();
	}
	
	numero nums = new numero();
	@Test
	public void imprimirNumdel1_100fizzBuzz() {
		
		nums.imprimir();
	}
	
	@Test
	public void comprobarMultiplo3(){
		assertEquals(true,nums.esMultiplo3(9));
	}
	
	@Test
	public void comprobarMultiplo5(){
		assertEquals(true,nums.esMultiplo5(10));
	}
	
	@Test
	public void comprobarMultiplo3_5(){
		assertEquals(true,nums.esMultiplo3(15) && nums.esMultiplo5(15));
	}
	

}