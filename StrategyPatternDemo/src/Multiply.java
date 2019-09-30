
public class Multiply implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		System.out.println("Multiply Strategy");
		return num1 * num2;
	}

}
