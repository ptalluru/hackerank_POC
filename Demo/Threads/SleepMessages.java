package Threads;

public class SleepMessages {
	public static void main(String args[]) throws InterruptedException {
		String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too",
				"Finished" };
		for (int i = 0; i < importantInfo.length; i++) {
			char[] chars = importantInfo[i].toCharArray();
			for (int j = 0; j < importantInfo[i].length(); j++) {
				Thread.sleep(500);

				System.out.print(chars[j]);
			}
			System.out.println();
			// Pause for 4 seconds
			Thread.sleep(1000);
			// Print a message
			System.out.println(Boolean.valueOf("1"));
			System.out.println(importantInfo[i].length());
		}
	}
}