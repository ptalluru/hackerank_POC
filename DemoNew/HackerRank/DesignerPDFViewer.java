package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesignerPDFViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
    	int result = 0;
    	char[] c = word.toCharArray();
    	List<Integer> list = new ArrayList<Integer>();
    	for (char ch : c) {
    		int iteration = 0;
    		for (int i = 97; i < 123; i++) {
    			if(i==ch) {
    				list.add(h[iteration]);
    				break;
    			}else {
    				iteration++;
    			}
    		}
		}
    	int max = Collections.max(list);
    	result = max * c.length;
		return result;
    }

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("heights of alphabets");
        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            int hItem = scanner.nextInt();
            h[i] = hItem;
        }
        scanner.nextLine();
        String word = scanner.nextLine();
        int result = designerPdfViewer(h, word);
        System.out.println("Result :- "+result);
        scanner.close();
    }
}
