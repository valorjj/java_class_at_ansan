package Day05;

public class Day05_3 {
	// 힙 : 변수 내 실제 값
	// 스택 : 변수 이름 저장 // int name = 100;
	
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int len = 0;
		
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				
			}
			len += array[i].length;
		}
		
		avg = (double) sum / len;
		
		System.out.println("sum >>>> " + sum);
		System.out.printf("%.2f >>>> ", avg);
		
		
	}
}
