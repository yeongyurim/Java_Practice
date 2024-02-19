/*
 * Hello.java
 */
public class Hello {

	public static int sum(int n, int m) {
		return n + m;
	}
	
	// start from main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 20;
		int s;
		char a;
		
		s = sum(i, 10); // call method
		a = '?';
		System.out.println(a); // print char '?'
		System.out.println(s); // print integer s
	}

}
