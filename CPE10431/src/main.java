import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {//���U�@�檺�ܶ}�lŪ�J(Ū��S������)
			int x = Integer.parseInt(scanner.nextLine());//��Ū��U�@�檺�r��(�D�ت��@��}�lŪ,�]�N�O7)�૬�����7�s��ƫ��A

			String a = scanner.nextLine();//�Φr��Ū�J1 -1
			String[] aSplit = a.split(" ");//�ন�}�C�覡�]���n�H�ťհ�����
			int[] aArray = new int[aSplit.length];//����Φn��String�}�C�নint�}�C�Ҧ�(���F�n��b��������m�W),���X�ȹ復�̭p��
			for (int i = 0; i < aSplit.length; i++) {   //EX:    1       -1
				aArray[i] = Integer.parseInt(aSplit[i]);//aArray[0]aArray[1]
			}

			int sum = 0;
			for (int i = 0; i < aArray.length - 1; i++) {//�L���q�̰���}�l�L
				sum += aArray[i] * (aArray.length - 1 - i) * (Math.pow(x, aArray.length - 2 - i));//aArray.length - 2 - i�MaArray.length - 1 - i�Ʀr�δ�X�Ӫ�
			}
			System.out.println(sum);
		}
	}
}
// for (int i = 0; i < run2Split.length; i++) {
// System.out.print(run2Split[i]);
// }
/*while(true){(Ū��0����)
 * if(input.equel("0")){
 * 	break; 
 * }
 *}
 * */
 