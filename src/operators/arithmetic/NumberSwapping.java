public class NumberSwapping {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 50;
	
		System.out.println("Before swapping");
		System.out.println(a+"\t"+b);	
	
		byte temp = a;
			a = b ;
			b = temp;

	
		System.out.println("After swapping");
		System.out.println(a+"\t"+b);	
 	
	
	}

}