import java.util.Scanner;

public class main {
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int v = scanner.nextInt();
			int time = scanner.nextInt();
			int ans = 2 * v * time;
			System.out.println(ans);
		}
	}
}
