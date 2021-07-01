import java.util.ArrayList;

public class 배열_Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0); //값 추가
		list.add(1); //값 추가
		list.add(2); //값 추가
		list.add(3); //값 추가
		list.add(4); //값 추가
		list.add(null); //null값도 add가능
		list.add(5); //값 추가
		list.add(6); //값 추가

		list.remove(3);  //index 1 제거 (뒤의 배열들의 순서 앞으로 땡겨짐)
		list.add(5,10); //index 1 자리에 10 삽입 (끼워넣기, 뒤의 배열들의 순서 뒤로 밀림)
//		list.clear();  //모든 값 제거
		
		System.out.println(list.get(6));//0번째 index 출력
		for(int index = 0; index < list.size(); index++) {
			System.out.println(list.get(index));
		}
		
	}
}
