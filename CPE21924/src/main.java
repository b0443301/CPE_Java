import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class main {
	public static void main(String args[]) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		int run = Integer.parseInt(scanner.nextLine());// ���Ū�i��,�קK���U��Ū�J�|�X��

		for (int i = 0; i < run; i++) {// run�O����,
			String input = scanner.nextLine();// Ū�i�Ӫ���Ū��\n����,�s���r���X(input)EX:SpainDonnaElvira
			String[] inputSplit = input.split(" ");//��Ū�i�Ӫ��r��@�Ϊťհ�����,�s��inputSplitEX:Spain Donna Elvira

			if (treeMap.containsKey(inputSplit[0])) {  // �P�_�O�_���Y�@����� 
				int value = treeMap.get(inputSplit[0]);//���X�Ĥ@�ӭ�EX:Spain
				treeMap.replace(inputSplit[0], value + 1);//����(��a�W,���ƥ[�@)
			} else {
				treeMap.put(inputSplit[0], 1);//�p�G�SŪ�L����a�W����(��a�W,���Ƶ����@)
			}
		}

		for (Map.Entry<String, Integer> map : treeMap.entrySet()) {
			System.out.println(String.valueOf(map.getKey()) + " " + String.valueOf(map.getValue()));//��map��X,��String�j�૬���覡�^��,�]��java,c++���a�k���h�إ\��,�ۤv�w�q
		}

		scanner.close();//�O�����ٵ���
	}
}