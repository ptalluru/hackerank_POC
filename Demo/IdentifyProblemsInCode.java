public class IdentifyProblemsInCode {

	public void howToDoInJava_method1() {
		System.out.println("how to do");
		return;
		// System.out.println("in java");
	}

	public void howToDoInJava_method2() {
		System.out.println("how to do");
		if (true) {
			System.out.println("in if");
			return;
		} else {
			return;
		}

		//System.out.println("in java");
	}

	public void howToDoInJava_method3() {
		System.out.println("how to do");
		while (true) {
			return;
		}
		// System.out.println("in java");
	}

	public static void main(String[] args) {
		IdentifyProblemsInCode ipc = new IdentifyProblemsInCode();
		// ipc.howToDoInJava_method1();
		ipc.howToDoInJava_method2();
		// ipc.howToDoInJava_method3();
	}
}