import java.util.Arrays;
import java.util.Scanner;

/*

valid (either):
x = y = z
x > y = z
y > x = z

 */

// change class name to Main when you submit it to Codechef
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = fs.nextInt();
			}
			Arrays.sort(a);
			boolean valid = false;
			if (a[0] == a[1] && a[1] == a[2]) {
				valid = true;
			}
			if (a[0] == a[1] && a[1] < a[2]) {
				valid = true;
			}
			System.out.println(valid ? "YES" : "NO");
		}
		fs.close();
	}
}
