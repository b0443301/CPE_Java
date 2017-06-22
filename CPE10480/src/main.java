import java.util.Scanner;

public class main {
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (num1 == 0 && num2 == 0) {
				break;
			}
			if (num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			int count = 0;
			for (int i = num1; i <= num2; i++) {// int count = 0;double ans=1;
				if (Math.sqrt(i) % 2 == 0 || Math.sqrt(i) % 2 == 1)
					count++;
			}
			System.out.println(count);
		}
	}
}
// for (int i = num1; i <= num2; i++) {//int count = 0;double ans=1;
// ans=Math.sqrt(i);
// if(ans==0)
// count++;
//
// }
// System.out.println(count);