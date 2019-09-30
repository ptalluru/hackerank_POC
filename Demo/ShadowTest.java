public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
            System.out.println("------------------------");
            ShadowTest st1 = new ShadowTest();
            ShadowTest.FirstLevel f2 = st1.new FirstLevel();
            ShadowTest.FirstLevel.SecondLevel f22 = f2.new SecondLevel();
            f22.methodInsecondLevel(5);
        }
        class SecondLevel{
        	public int x=2;
        	void methodInsecondLevel(int x) {
        		System.out.println("x = " + x);
                System.out.println("this.x = " + this.x);
                System.out.println("FirstLevel.this.x = "+FirstLevel.this.x);
                System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        	}
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}