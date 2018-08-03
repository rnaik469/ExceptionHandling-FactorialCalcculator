package in.co.cg.factorial;

import in.co.cg.factorialexcep.FactoiralException;
import in.co.cg.factorialexcep.InvalidInputException;

public class Factorial {
	//return factorial if factorial less than equal to size of int
	public int getFactorial(int number) throws InvalidInputException, FactoiralException {
	long fact = 1;
	for(int i=1;i<=number;i++)
		fact*=i;		//stores fact  value
	if(number<2) //checks for input less than 2
		throw new InvalidInputException("Number must be greater than 1");
	if(fact>Integer.MAX_VALUE) // checks for fact less than equal to size of int
		throw new FactoiralException("Exceeds the limit of int");
	return (int) fact;
}
}
