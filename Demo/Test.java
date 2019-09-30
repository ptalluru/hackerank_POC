
public class Test {

	public static void main(String[] args) {
		String x = "abc";
		System.out.println("x hash code"+x.hashCode());
		String y = "abc";
		System.out.println("y hash code"+y.hashCode());
		x.concat(y);
		System.out.println(x);
		
		
	}
}
