import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextInt()) {
			Boolean isJolly = true;// ���ϰ��ܼƵ���M��,���s��Ȫ�l��(=0),�g�bwhile�~���N�n�C����l��,�g�bwhile�̭��C�@�����O�s��
			ArrayList<Integer> input = new ArrayList<Integer>();
			ArrayList<Integer> abs = new ArrayList<Integer>();
			// Ū��
			int run = scanner.nextInt();
			for (int i = 0; i < run; i++) {
				input.add(scanner.nextInt());
			}
			// �p��
			for (int i = 0; i < input.size() - 1; i++) {
				abs.add(Math.abs(input.get(i) - input.get(i + 1)));// �e��ƭȬ۴�����
			}
			// �ˬd��X��O��
			Collections.sort(abs);// ���e��ƭȬ۴����ȱƧ�
			for (int i = 0; i < abs.size(); i++) {// �P�_�Ƨǲ�i�����O�_�b������m
				if (abs.get(i) != i + 1) {// �u�n���@�Ӥ����S���b��������m�WEX: 1 2 3
											// a[i]=a[0][1][2]
					isJolly = false;// �O�����OJolly
					break;// �N���κ�F
				}
			}

			if (isJolly) {//�P�_�O��
				System.out.println("Jolly");// �O��XJolly
			} else {
				System.out.println("Not Jolly");// ���O��XNot Jolly
			}
		}
	}
}