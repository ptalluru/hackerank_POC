
public class Add implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		System.out.println("Add Strategy");
		return num1 + num2;
	}
}
