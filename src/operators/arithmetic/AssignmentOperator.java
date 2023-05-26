package operators.arithmetic;

public class AssignmentOperator {
	
	public static void main(String[] args){
		
			int d = 100;
			int a = 10 * 10;
			int b = a;
			int c = add(10,20);
		
		System.out.println(a);//100
		System.out.println(b);//100
		System.out.println(c);//30
		System.out.println(d);//100
		System.out.println(d=500);//500
		//System.out.println(10=10);//CTE
		
	
	}

	public static int add(int number1, int number2){
		return number1+ number2;
	}

}