
public class TPC8 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int v = add(a,b);
		System.out.println(v);
	}
	
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
}
