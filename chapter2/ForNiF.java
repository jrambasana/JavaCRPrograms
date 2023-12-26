package chapter2;

public class ForNiF {
    public static void main(String args[]){
    	
        for( int x = 1 ; x <= 100 ; x = x + 1 )
        	if( x%2 != 0 )
        		System.out.println("Odd Number: " + x);
        for( int x = 1 ; x <= 100 ; x = x + 1 )
        	if( x%2 == 0 )
            	System.out.println("Even Number: " + x);
        	        
    }
}
