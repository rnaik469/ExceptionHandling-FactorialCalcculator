package in.co.cg.facttest;

import in.co.cg.factorial.*;
import in.co.cg.factorialexcep.FactoiralException;
import in.co.cg.factorialexcep.InvalidInputException;

//calculate factorial for input greater than 1 and max size of factorial must no exceed size of int
public class Test {
	public static void main(String[] args) {
		Factorial factorial = new Factorial();//Instantiating class Factorial
		try {
			System.out.println(factorial.getFactorial(15));//Invoking getFactorial 
		} catch (InvalidInputException | FactoiralException e) {//check for exception
			e.printStackTrace();
		}
	}
}
