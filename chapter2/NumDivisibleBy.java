package chapter2;

public class NumDivisibleBy {
	
	public static void main(String args[]){
		numIsDivisibleBy(3);      	        
	}
	
	static void numIsDivisibleBy(int n)
	{
	for( int x = 1 ; x <= 100 ; x = x + 1 )
		if( x%n == 0 )
			System.out.println("Number: " + x + " is divisible by " + n);
	}
}
