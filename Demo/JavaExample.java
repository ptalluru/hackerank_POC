public class JavaExample
{
    public static void main(String[] args)
    {
    	
        loop: for(int i=0; i < 6; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("In if block :: " + i);
                continue loop;
            }
            else
            {
                System.out.println("In else block :: " + i);
            }
        }
    }
}