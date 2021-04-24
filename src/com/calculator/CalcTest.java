package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test 
	public void testAdd()
	  {
	      assertTrue ("Calc sum incorrect", 5 == Calc.adder(2, 3));
	 }
	@Test 
	 public void testMultiple()
	 {
		 assertTrue ("Calc multiple  incorrect", 6 == Calc.multiple(2, 3));
		 
	 }
	@Test 
	 public void testSubtract()
	 {
		 assertTrue ("Calc Subtract  incorrect", -1 == Calc.subtract(2, 3));
		 
	 }
	@Test 
	 public void testDivide()
	 {
		 assertTrue ("Calc divide  incorrect", 0.6 == Calc.dvide(2, 3));
		 
	 }
}
