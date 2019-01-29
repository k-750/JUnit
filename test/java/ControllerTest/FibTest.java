package ControllerTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import Controller.Fib;
import Model.Model;
import View.View;

class FibTest {

	@Test
	void testCalc5() {
		Model model = new Model();
		View view = new View();
		Fib fib = new Fib(model,view);
		assertEquals(5, fib.calc(4));;
	}

	@Test
	void testCalc() {
		Model model = new Model();
		View view = new View();
		Fib fib = new Fib(model,view);
		assertEquals(2,fib.calc(2));
	}
	
	@Test
	void testLambda1() {
		Model model = new Model();
		View view = new View();
		Fib fib = new Fib(model,view);
		assertEquals("OK, n=1",fib.lambda(1));
	}
	
}
