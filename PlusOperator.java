public class PlusOperator {
	
	public static void main(String[] args){
		
		System.out.println(10+20); //30
		System.out.println(10+'A');//75
		System.out.println('A'+'A');//130
		System.out.println("A"+'A');//AA
		System.out.println("A"+ "A");//AA
		System.out.println('A'+"A"+ 'A');//AAA
		System.out.println(10+20+"A"+20+30);//30A2030
		System.out.println('A'+"A"+('A'+20+30) + "A");//AA105A
		System.out.println('A'*2+"A"+2);//130A2
		
	}

}