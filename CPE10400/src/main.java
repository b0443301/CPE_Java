import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		// read
		while (scanner.hasNextInt()) {// 連續輸入
			// int[] arr;
			int countmax = 0;// 清空,初始化寫到區域變數
			int num1 = scanner.nextInt();// 習慣寫區域變數
			int num2 = scanner.nextInt();
			// arr = new int[num2 - num1 + 1];// arr[]開空間給它,知道有多少個值
			if (num2 < num1) {//讀到第一個數比第二數大時,則交換,確保第一個數比大二數大
				int temp = num1;//交換時機:與現狀不符的時候
				num1 = num2;
				num2 = temp;
			}
			// calc
			for (int i = num1; i <= num2; i++) {
				int ans = i;//把範圍num1存給ans做以下的計算
				int count = 1;//計算做了幾次
				while (ans != 1) {//當計算結果不為1進入迴圈重複做以迴圈內的事
					if (ans % 2 == 1) {//計算結果為奇數時
						ans = (ans * 3) + 1;//計算結果*3+1
						count++;//次數+1
						} else {//不然就是偶數把計算結果就除2
						ans = ans / 2;
						count++;//次數+1
					}
				}
				if (countmax < count)// 記錄最大值,假如讀進來的比我之前記錄的最大值還要大,則存目前讀到的最大值
					countmax = count;

				// arr[i - num1] = count;// 從arr[0]開始讀,把讀到的值存下來,後來在對他查詢最大值,程式相對概念很重
			}

			System.out.print(num1 + " ");
			System.out.print(num2 + " ");
			System.out.print(countmax);

			// int max = 0;
			// for (int j = 0; j < num2 - num1 + 1; j++) {
			// if (max < arr[j]) {// 記錄最大值,假如讀進來的比我之前記錄的最大值還要大,則存目前讀到的最大值
			// max = arr[j];
			// }
			// }
			// System.out.print(num1);
			// System.out.print(num2);
			// System.out.print(max);
		}
	}
}
