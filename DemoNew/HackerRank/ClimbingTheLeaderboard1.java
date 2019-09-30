package com.demo.cg.DemoNew.HackerRank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ClimbingTheLeaderboard1 {
	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] result = new int[alice.length];
		Integer[] array = Arrays.stream(scores).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));
        List<Integer> sortedList = new ArrayList<Integer>(set);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < alice.length; i++) {
        	Collections.sort(sortedList,Collections.reverseOrder());
        	int ind = Collections.binarySearch(sortedList, alice[i],Collections.reverseOrder());
            if(ind < 0){
                ind = Math.abs(ind);
                //sortedList.add(alice[i]);
                list.add(ind);
            }else{
            	list.add(ind+1);
            }
        }
        result =list.stream().mapToInt(Integer::intValue).toArray();
		return result;
	}
//	public static int[] climbingTheLeaderboard(int[] scores, int scoresCount, int[] alice) {
//		int result[] = new int[alice.length];
//		List<Integer> list = new LinkedList<Integer>();
//	    int[] array = range(0,scoresCount).map(i->scores[scoresCount-i-1]).distinct().toArray();
//	    int index = 0;
//	    for(int score: alice) {
//	        index = binarySearch(array, index<0?0:index, array.length, score);
//	        if(index<0) index=-index-2;
//	        list.add(array.length-index);
//	    }
//	    result =list.stream().mapToInt(Integer::intValue).toArray();
//	    return result;
//	} 
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of. players on the leaderboard");
		int scoresCount = scanner.nextInt();
		System.out.println("Leaderboard Scores in decreasing order");
		int[] scores = new int[scoresCount];
		for (int i = 0; i < scoresCount; i++) {
			int scoresItem = scanner.nextInt();
			scores[i] = scoresItem;
		}
		System.out.println("No. of games alice plays");
		int aliceCount = scanner.nextInt();
		System.out.println("Game scores of alice");
		int[] alice = new int[aliceCount];
		for (int i = 0; i < aliceCount; i++) {
			int aliceItem = scanner.nextInt();
			alice[i] = aliceItem;
		}
		int[] result = climbingLeaderboard(scores, alice);
		//int[] result = climbingTheLeaderboard(scores,scoresCount,alice);
		System.out.println(result);
	}
}
