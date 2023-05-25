public class AritmeticOperator1 {
	
	public static void main(String[] args){
		
		System.out.println(10 / 2);//5 
		System.out.println(10 % 2); //0
	
		System.out.println(1 / 10);//0
		System.out.println(1 % 10); //1

		System.out.println(0 / 10);//0
		System.out.println(0 % 10); //0

		System.out.println(1 / 0);// ArithemeticException divide by zero
		System.out.println(1 % 0); // ArithemeticException divide by zero
	
		
	}

}