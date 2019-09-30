
public class Division implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		System.out.println("Division Strategy");
		return num1 / num2;
	}

}
