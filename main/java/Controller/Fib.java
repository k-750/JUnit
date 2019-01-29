package Controller;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Model.Model;
import View.View;

public class Fib {
	
	private Model model;
	private View view;
	
	public Fib(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void obl() {
		Scanner scanner = new Scanner(System.in);
		try {
		model.setN(scanner.nextInt());
		} catch (Exception e ) {
			//System.out.println(e);
			System.out.println("Niewłaściwe dane");
			model.setN(0);
		}
		scanner.close();
		if (model.getN() < 1) System.out.println("n musi być większe od 0");
		else {
			if (model.getN() == 1) model.setZ(1);
			else {
				model.setZ(calc(model.getN()));
			}		
			view.result(model.getZ());
		}	
	}
	
	public int calc(int n) {
			int x = 1, y = 1, z=0;
			for (int i = 1; i < n; i++) {
				z=(y+x);
				x = y;
				y = z;	
			}
			return z;
	}
	
	public String lambda(int n) {
		List<String> lambda = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			lambda.add("pisz i= "+i);
		}
		lambda.forEach(i -> System.out.println(i));
		return "OK, n="+String.valueOf(n);
	}
	
}
