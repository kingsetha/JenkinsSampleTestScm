package Ani.JunitDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import aniJunitDemo.Calculator;

class CalculatorTest {

	private Calculator calculator;
	 
	 @BeforeEach
	    public void setUp() {
	        calculator = new Calculator(); // This method will run before each test method
	    }
	 @AfterEach
	    public void tearDown() {
	        calculator = null; // This method will run after each test method
	        System.out.println("Test finished");
	    }

	@Test
	void testAdd() {
		int result = calculator.add(2, 3);
       assertEquals(5, result);
		
	}

	@Test
	void testSubtract() {
		 int result = calculator.subtract(5, 3);
	     assertEquals(2, result);
		         
	}
	@Disabled("Disabled until bug #123 is fixed")
	 @Test
	    public void testSubtractNegativeResult() {
	        int result = calculator.subtract(3, 5);
	        assertEquals(-2, result);
	    }

}
