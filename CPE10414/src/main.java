import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		int count = 1;
		int base[] = { 10000000, 100000, 1000, 100, 1 };
		String arr[] = { "kuti", "lakh", "hajar", "shata", "" };

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLong()) {// 連續讀入下一個型態long
			long input = scanner.nextLong();
			System.out.print(count + ". ");
			if (input / (base[0] * base[3]) > 0) {// 如果超過kuti*shata多做一次,把數字拆成兩部分,前面做一次
				long temp = input / base[0];// 10045378
				for (int i = 0; i < base.length - 1; i++) {// base.length-1,-1是因為把要把78這兩個100以下的數拿掉,不然下面就會重複計算
					long ans = temp / base[i];
					if (ans != 0)
						System.out.print(ans + " " + arr[i] + " ");
					temp = temp % base[i];
				}
				input = input % (base[0] * base[3]);// 把前面做過的除數拿掉取餘數ex:789000045
			}
			for (int i = 0; i < base.length; i++) {// 不論有沒有超過都要做最後一次ex:計算789000045
				long ans = input / base[i];
				if (ans != 0)// 如果不等於零
					System.out.print(ans + " " + arr[i] + " ");
				else if (i == base.length - 1)// 最後一次才印出0,其他次就不印了
					System.out.print(ans);
				input = input % base[i];// 取餘數
			}
			count++;
		}
	}
}
