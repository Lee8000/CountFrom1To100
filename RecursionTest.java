public class RecursionTest {
	public static void main(String[] args) {
		System.out.println(recursion(100));
	}
	
	public static int recursion(int i) {
		if(i>1) {
			return recursion(i-1)+i;
		}else {
			return 1;
		}
	}
}
