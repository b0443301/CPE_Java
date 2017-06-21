import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			Boolean isJolly = true;// 放到區域變數等於清空,重新把值初始化(=0),寫在while外面就要每次初始化,寫在while裡面每一次都是新的
			ArrayList<Integer> input = new ArrayList<Integer>();
			ArrayList<Integer> abs = new ArrayList<Integer>();
			// 讀檔
			int run = scanner.nextInt();
			for (int i = 0; i < run; i++) {
				input.add(scanner.nextInt());
			}
			// 計算
			for (int i = 0; i < input.size() - 1; i++) {
				abs.add(Math.abs(input.get(i) - input.get(i + 1)));// 前後數值相減的絕對值
			}
			// 檢查輸出跟記錄
			Collections.sort(abs);// 做前後數值相減的絕對值排序
			for (int i = 0; i < abs.size(); i++) {// 判斷排序第i元素是否在對應位置
				if (abs.get(i) != i + 1) {// 只要有一個元素沒有在對應的位置上EX: 1 2 3
											// a[i]=a[0][1][2]
					isJolly = false;// 記錄不是Jolly
					break;// 就不用算了
				}
			}

			if (isJolly) {//判斷記錄
				System.out.println("Jolly");// 是輸出Jolly
			} else {
				System.out.println("Not Jolly");// 不是輸出Not Jolly
			}
		}
	}
}
