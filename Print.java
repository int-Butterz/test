import java.util.Scanner;

public class Util {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int pityTracker = 0;
		boolean continueLoop = true;
		
		while (continueLoop) {
			pityTracker++;
			if (pityTracker <= 9) {
				for (int i = 0; i < 3; i++) {
					numbers[i] = random(5);
					System.out.print(numbers[i] + " ");
				}
			} else {
				numbers[0] = random(5);
				numbers[1] = numbers[0];
				numbers[2] = numbers[0];
				for (int i = 0; i < 3; i++) {
					System.out.print(numbers[i] + " ");
				}
			}
			
			if (numbers[0] == numbers[1] && numbers[1] == numbers[2] && pityTracker <= 9) {
				System.out.println("\nJackpot!");
				break;
			} else if (numbers[0] == numbers[1] && numbers[1] == numbers[2] && pityTracker > 9) {
				System.out.println("\nPity: Jackpot!");
				break;
			} else {
				System.out.println("\nFailed :(");
				continueLoop = question();
			}
		}
		sc.close();
	}
	
	public static int random(int max) {
		return (int) (Math.random() * max) + 1;
	}
	
	public static boolean question() {
		System.out.println("Try again?");
		String input = sc.nextLine().trim(); System.out.println();
		
		if (input.equals("y")) {
			return true;
		} else {
			return false;
		}
	}
}