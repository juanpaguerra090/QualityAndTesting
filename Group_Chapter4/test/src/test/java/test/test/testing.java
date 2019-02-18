package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void testSum() {
		Calculator x =  new Calculator();
		float sum = x.sum(10,  20);
		
		assertEquals(30, sum);
	}
	
	@Test
	void testSub() {
		Calculator x =  new Calculator();
		float subtraction = x.subtraction(10,  20);
		
		assertEquals(-10, subtraction);
	}
	
	@Test
	void testProduct() {
		Calculator x =  new Calculator();
		float product = x.product(10,  20);
		
		assertEquals(200, product);
	}
	
	@Test
	void testDiv() {
		Calculator x =  new Calculator();
		float division = x.division(10,  20);
		
		assertEquals(0.5, division);
	}

}
