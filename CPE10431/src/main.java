import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {//有下一行的話開始讀入(讀到沒有為止)
			int x = Integer.parseInt(scanner.nextLine());//把讀到下一行的字串(題目的一行開始讀,也就是7)轉型成整數7存整數型態

			String a = scanner.nextLine();//用字串讀入1 -1
			String[] aSplit = a.split(" ");//轉成陣列方式因為要以空白做分割
			int[] aArray = new int[aSplit.length];//把分割好的String陣列轉成int陣列模式(為了要放在對應的位置上),取出值對它最計算
			for (int i = 0; i < aSplit.length; i++) {   //EX:    1       -1
				aArray[i] = Integer.parseInt(aSplit[i]);//aArray[0]aArray[1]
			}

			int sum = 0;
			for (int i = 0; i < aArray.length - 1; i++) {//微分從最高位開始微
				sum += aArray[i] * (aArray.length - 1 - i) * (Math.pow(x, aArray.length - 2 - i));//aArray.length - 2 - i和aArray.length - 1 - i數字用湊出來的
			}
			System.out.println(sum);
		}
	}
}
// for (int i = 0; i < run2Split.length; i++) {
// System.out.print(run2Split[i]);
// }
/*while(true){(讀到0結束)
 * if(input.equel("0")){
 * 	break; 
 * }
 *}
 * */
 