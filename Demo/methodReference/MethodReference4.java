package methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

class Arithmetic{  
public static int add(int a, int b){  
return a+b;  
}  
public static float add(int a, float b){  
return a+b;  
}  
public static float add(float a, float b){  
return a+b;  
}  
}  
public class MethodReference4 {  
public static void main(String[] args) {  
BiFunction<Integer, Integer, Integer>adder1 = Arithmetic::add;  
BiFunction<Integer, Float, Float>adder2 = Arithmetic::add;  
BiFunction<Float, Float, Float>adder3 = Arithmetic::add;  
int result1 = adder1.apply(10, 20);  
int result2 =(adder2.apply(10, 20.0f)).intValue();  
int result3 =(adder3.apply(10.0f, 20.0f)).intValue();  
System.out.println(result1);  
System.out.println(result2);  
System.out.println(result3);  

List<String> memberNames = new ArrayList<>();
memberNames.add("Amitabh");
memberNames.add("Shekhar");
memberNames.add("Aman");
memberNames.add("Rahul");
memberNames.add("Shahrukh");
memberNames.add("Salman");
memberNames.add("Yana");
memberNames.add("Lokesh");

memberNames.stream().filter((s)->s.startsWith("S")).forEach(System.out::println);
}  
}  