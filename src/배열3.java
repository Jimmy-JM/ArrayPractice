import java.util.Scanner;

public class �迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner myInput = new Scanner(System.in);
		String[] name = new String[100];
		int[] englishPoint = new int[100];
		int[] mathPiont = new int[100];
		int count = 0, type, engTotal = 0, mathTotal = 0, sumTotal = 0;
		float engAve = 0, mathAve = 0, classAve = 0;
		
		do {	
			System.out.print("�̸��� �Է��ϼ��� : ");
	        name[count] = myInput.next();
	        System.out.print("���������� �����Դϱ�? ");
	        englishPoint[count] = myInput.nextInt();
	        System.out.print("���������� �����Դϱ�? ");
	        mathPiont[count] = myInput.nextInt();
	        System.out.print("�߰� �Է��Ͻðڽ��ϱ�? (1.�߰� 2.����) : ");
	        type = myInput.nextInt();
	        engTotal = engTotal + englishPoint[count];
	        mathTotal = mathTotal + mathPiont[count];
	        count++;
		}while(type == 1);
			System.out.printf("%s \t %s \t %s \t %s \t %s\n", "�̸�", "����", "����", "����", "���");		
		
		for(int index = 0; index < count; index++) {
			int persnalSum = englishPoint[index] + mathPiont[index];
			float personalAverage = persnalSum / 2;
			System.out.printf("%s \t %d \t %d \t %d \t %.2f\n",  name[index], englishPoint[index],  mathPiont[index], persnalSum, personalAverage);
			sumTotal = sumTotal + englishPoint[index] + mathPiont[index];
			engAve = engTotal / count;
			mathAve = mathTotal / count;
			classAve = (engAve + mathAve) / 2;
		}

		System.out.printf("%s \t %d \t %d \n", "����", engTotal, mathTotal);
		System.out.printf("%s \t %.2f \t %.2f \t\t %.2f\n", "�б����", engAve, mathAve, classAve);
			
		myInput.close();
	}
}
