import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			long firstdaystay = scanner.nextInt();
			long selectdate = scanner.nextInt();

			while (true) {
				selectdate = selectdate - firstdaystay;//重複相減要記錄給自己
				if (selectdate <= 0) {//值到算出的數小於等於0
					System.out.print(firstdaystay);
					break;
				}
				firstdaystay++;//判斷完之後再加一
			}
		}
	}
}
/*
 第一組測資
6-1=5-->1
5-2=3-->2
3-3=0-->3
 第二組測資
10-3=7-->3
7-4=3-->4
3-5=-2-->5
 第三組測資
 14-3=11-->3
 11-4=7-->4
 7-5=2-->5
 2-6=-4-->6






*/



