package leakybucket;

import java.util.Scanner;

public class Leaky {
	public static void main(String ar[]) throws Exception {

		Queue q = new Queue();
		Scanner src = new Scanner(System.in);
		System.out.println("\nEnter the packets to be sent:");
		int size = src.nextInt();
		q.insert(size);
		q.delete();
	}
}
