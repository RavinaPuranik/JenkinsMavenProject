package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleCalcTest {

	@Test
	public void addTest() {
	simpleCalc myCalc=new simpleCalc();
	assertEquals(10,myCalc.addNumbers(5,5));
	}
	
	@Test
	public void subtractTest() {
	simpleCalc myCalc=new simpleCalc();
	assertEquals(5,myCalc.subtractNumbers(10,5));
	}

}
