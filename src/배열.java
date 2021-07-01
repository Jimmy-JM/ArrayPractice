
public class ¹è¿­ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 5, 10, 7, 3, 4, 5};

		for(int index = 0; index < arr.length; index++) {
			for(int sub = index + 1 ; sub  < arr.length; sub++)
				if(arr[index] > arr[sub]) {
					int temp = arr[sub];
					arr[sub] = arr[index];
					arr[index] = temp;
				}
		}
		
		for(int index = 0; index < arr.length; index++) {
			System.out.printf("%d -> ", arr[index]);
		}
		
	}

}
