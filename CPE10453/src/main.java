import java.util.Scanner;

public class main {
	public static void main(String agrs[]) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		for (int i = 0; i < input; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (num1 % 2 == 0) {
				num1++;
			}
			if (num1 % 2 == 0) {
				num2++;
			}
			int count = (num2 - num1) / 2 + 1;
			int sum = (num1 + num2) * count / 2;

			System.out.println("Case " + (i + 1) + ":" + sum);
		}
	}
}
// int a=0,b=0;
// for(int i=a;i<b;i++){
// if()
// }if(num1>num2&&num1%2==1){

// }