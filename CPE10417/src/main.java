import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			long firstdaystay = scanner.nextInt();
			long selectdate = scanner.nextInt();

			while (true) {
				selectdate = selectdate - firstdaystay;//���Ƭ۴�n�O�����ۤv
				if (selectdate <= 0) {//�Ȩ��X���Ƥp�󵥩�0
					System.out.print(firstdaystay);
					break;
				}
				firstdaystay++;//�P�_������A�[�@
			}
		}
	}
}
/*
 �Ĥ@�մ���
6-1=5-->1
5-2=3-->2
3-3=0-->3
 �ĤG�մ���
10-3=7-->3
7-4=3-->4
3-5=-2-->5
 �ĤT�մ���
 14-3=11-->3
 11-4=7-->4
 7-5=2-->5
 2-6=-4-->6






*/


