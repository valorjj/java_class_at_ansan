package test;

public class arraytest {
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 11, 2, 6};
		int tmp=0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j] ) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int s : arr) {
			System.out.println(s);
		}
	}

}
