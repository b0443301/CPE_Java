import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		int count = 1;
		int base[] = { 10000000, 100000, 1000, 100, 1 };
		String arr[] = { "kuti", "lakh", "hajar", "shata", "" };

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLong()) {// �s��Ū�J�U�@�ӫ��Along
			long input = scanner.nextLong();
			System.out.print(count + ". ");
			if (input / (base[0] * base[3]) > 0) {// �p�G�W�Lkuti*shata�h���@��,��Ʀr��ⳡ��,�e�����@��
				long temp = input / base[0];// 10045378
				for (int i = 0; i < base.length - 1; i++) {// base.length-1,-1�O�]����n��78�o���100�H�U���Ʈ���,���M�U���N�|���ƭp��
					long ans = temp / base[i];
					if (ans != 0)
						System.out.print(ans + " " + arr[i] + " ");
					temp = temp % base[i];
				}
				input = input % (base[0] * base[3]);// ��e�����L�����Ʈ������l��ex:789000045
			}
			for (int i = 0; i < base.length; i++) {// ���צ��S���W�L���n���̫�@��ex:�p��789000045
				long ans = input / base[i];
				if (ans != 0)// �p�G������s
					System.out.print(ans + " " + arr[i] + " ");
				else if (i == base.length - 1)// �̫�@���~�L�X0,��L���N���L�F
					System.out.print(ans);
				input = input % base[i];// ���l��
			}
			count++;
		}
	}
}