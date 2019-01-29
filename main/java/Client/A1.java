package Client;

import Controller.Fib;
import Model.Model;
import View.View;

public class A1 {

	public static void main(String[] args) {
		
		Model model = new Model();
		View view = new View();
		Fib fib = new Fib(model, view);
		fib.obl();
		System.out.println(fib.lambda(5));
	}

}
