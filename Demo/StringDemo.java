public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        float floatVar =25.25f;
        int intVar = 25;
        String stringVar="25";
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];
        
        // put original string in an 
        // array of chars
		/*
		 * for (int i = 0; i < len; i++) { tempCharArray[i] = palindrome.charAt(i); }
		 */
       palindrome.getChars(0, len, tempCharArray, 0);
        // reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] =
                tempCharArray[len - 1 - j];
        }
        
        String reversePalindrome =
            new String(charArray);
        System.out.println(reversePalindrome);
        System.out.printf("i dont know %s%n",reversePalindrome);
        System.out.format("not reversed %s%n",palindrome);
        String fs;
        fs = String.format("The value of the float variable is %f%n, while the value of the integer variable is %d%n, and the string is %s%n",
                           floatVar, intVar, stringVar);
        System.out.println(fs);
       int i= Integer.valueOf(stringVar).intValue();
       System.out.println(i);
       
       
       double d = 858.48;
       String s = Double.toString(d);
       
      int dot = s.indexOf('.');
       
       System.out.println(dot + " digits " +
           "before decimal point.");
       System.out.println( (s.length() - dot - 1) +
           " digits after decimal point.");
       
    }    
}