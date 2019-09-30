package com.demo.cg.DemoNew.HackerRank.JavaTutorial;

import java.util.LinkedHashMap;
import java.util.Map;
//Complete this code or write your own from scratch
import java.util.Scanner;

class Eight{
  public static void main(String []argh){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      Map<String, Integer> phoneBook = new LinkedHashMap<>();
      for(int i = 0; i < n; i++){
          String name = in.next();
          int phone = in.nextInt();
          phoneBook.put(name, phone);
      }
      while(in.hasNext()){
          String s = in.next();
          if(phoneBook.containsKey(s)) {
        	  System.out.println(s+"="+phoneBook.get(s));
          }else {
        	  System.out.println("Not found");
          }
      }
      in.close();
  }
}

