import java.util.ArrayList;

public class �迭_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); //�� �߰�
		list.add(1); //�� �߰�
		list.add(2); //�� �߰�
		list.add(3); //�� �߰�
		list.add(4); //�� �߰�
		list.add(null); //null���� add����
		list.add(5); //�� �߰�
		list.add(6); //�� �߰�

		list.remove(3);  //index 1 ���� (���� �迭���� ���� ������ ������)
		list.add(5,10); //index 1 �ڸ��� 10 ���� (�����ֱ�, ���� �迭���� ���� �ڷ� �и�)
//		list.clear();  //��� �� ����
		
		System.out.println(list.get(6));//0��° index ���
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
	}
}
