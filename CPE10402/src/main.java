
//��map���g�k,��linklist�g�k
import java.util.Scanner;

public class main {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		int run = Integer.parseInt(scanner.nextLine());// Ū��2/n�]��@��(���Ū�i��,�קK���U��Ū�J�|�X��)
		String arrrun = "";
		int[] count = new int[26];// �x�sŪ��r������
		char[] alphet = new char[26];// �x�s�r��A~Z
		// read
		for (int i = 0; i < run; i++) {// �s��Ū�J����arrrun�������EX:To be or not to be.I think, therefore I am.
			
			arrrun += scanner.nextLine();
		}

		// count
		arrrun = arrrun.toUpperCase();//�������Ū�i�Ӫ���Ƥp�g��j�g
		for (int i = 0; i < arrrun.length(); i++) {//��y�l�̪��r���@�Ӥ@��Ū
			if (arrrun.charAt(i) >= 'A' && arrrun.charAt(i) <= 'Z') {//�p�G�O�b0~25���d��,�]����'A'�������Ĥ@�Ӧ�m���޼Ʀr0,'Z'��������25�Ӧ�m���޼Ʀr25
				count[arrrun.charAt(i) - 'A']++;//�p�G�Ʀr�b0~25���d�򤺦s��count�}�C�M��[1;
			}
		}
		for (int i = 0; i < 26; i++) {
			alphet[i] = (char) (i + 'A');//��Ʀr0�ର�r���x�s�b�r���ĴX�Ӧ�m�W,�j�૬���r��
		}

		// sort
		for (int i = 0; i < 26; i++) {
			for (int j = i + 1; j < 26; j++) {
				if (count[i] < count[j]) {//�ثe�p�⪺�Ʀr�񤧫e�x�s���Ʀr�٭n�j��,�h�洫
					int temp = count[i];//�ثe�p�⪺�Ʀr�򤧫e�x�s���Ʀr���洫,�T�O�j���Ʀb�e��
					count[i] = count[j];
					count[j] = temp;

					temp = alphet[i];//�r���]����ۭp�ƾ�(�p�⦸��)�ҥH�]�n��ۥ洫
					alphet[i] = alphet[j];
					alphet[j] = (char) (temp);
				} else if (count[i] == count[j] && alphet[i] > alphet[j]) {//�p�G�X�{�ۦP����,�ӥB���e���r���ƧǤ񪺥ثeŪ�쪺�r���Ƨ��٭n�j��,�h�洫,�T�O��X�ƦC���e�r��
					int temp = count[i];//�ثe�p�⪺�Ʀr�򤧫e�x�s���Ʀr���洫,�T�O�j���Ʀb�e��
					count[i] = count[j];
					count[j] = temp;

					temp = alphet[i];//�r���]����ۭp�ƾ�(�p�⦸��)�ҥH�]�n��ۥ洫
					alphet[i] = alphet[j];
					alphet[j] = (char) (temp);
				}
			}
		}

		// output
		for (int i = 0; i < 26; i++) {// ��X
			if (count[i] != 0)// �p�G�p��r���Ʀr����0��
				System.out.println(Character.toString(alphet[i]) + " " + count[i]);// ��X�r��(���`�૬)�M�p��r������
		}
	}
}