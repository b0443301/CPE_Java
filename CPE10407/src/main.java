import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		// init
		int numb1 = 0, numb2 = 0, ans = 0;

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {//判斷還有沒有下一筆整數資料
			numb1 = scanner.nextInt();
			numb2 = scanner.nextInt();
			ans = Math.abs(numb2 - numb1);
			System.out.println(ans);
		}
	}

	
}
