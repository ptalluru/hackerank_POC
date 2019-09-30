
public class StrategyDemoMain {

	public static void main(String[] args) {
		Context addContext = new Context(new Add());
		Context subContext = new Context(new Subtract());
		Context mulContext = new Context(new Multiply());
		Context divContext = new Context(new Division());

		System.out.println(addContext.execute(10, 20));
		System.out.println(subContext.execute(10, 20));
		System.out.println(mulContext.execute(10, 20));
		System.out.println(divContext.execute(10, 20));
		

	}

}
