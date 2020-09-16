package buzz.xinyan.java.debugText;



public class TestBubble {
	public static void main(String[] args) {
		TestBubble t = new TestBubble();
		int[] arr = new int[]{1,3,5,7,9,-1,0};
		t.Bubble(arr);
	}
	public void Bubble(int[] arr) {
		for(int i = 1;i <= arr.length;i++) {
			for(int j = 0;j < arr.length-i;j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
