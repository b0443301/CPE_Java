import java.util.Arrays;
import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		// init
		int run = 0, count = 0, temp = 0;
		int[] x;
		
		Scanner scanner = new Scanner(System.in);

		// read
		run = scanner.nextInt();

		for (int i = 0; i < run; i++) {
			count = scanner.nextInt();
			x = new int[count];
			for (int j = 0; j < count; j++) {
				x[j] = scanner.nextInt();
			}
			for (int k = 0; k < count; k++) {//選擇排序由大排到小
				for (int l = k + 1; l < count; l++) {
					if (x[l] > x[k]) {//目前讀到的數字>之前讀到的數字,則交換
						temp = x[l];
						x[l] = x[k];
						x[k] = temp;
					}
				}

			}

			
			System.out.println(x[count / 2]);//輸出中間的位數,因為不會四捨五入
			
		}
	}
}
