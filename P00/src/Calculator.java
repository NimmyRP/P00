public class Calculator {
	
		public int divide(int a, int b) {
			
			if (b == 0) 
			  {
				   throw new IllegalArgumentException("Division by zero is not supported");
			}
		return a/b;
		
		
		
	}
}
