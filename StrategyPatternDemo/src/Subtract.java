
public class Subtract implements Strategy {

	@Override
	public double doOperation(double num1, double num2) {
		System.out.println("Subtract Strategy");
		return num1 - num2;
	}

}
