package Day12;

import java.util.Calendar;

public class Day12_Calendar {
	
	// 메소드형 달력 
		// 입력받은 연도, 월의 달력 출력
	

	public static void main(String[] args) {
		// 1. 캘린더 객체

		Calendar calendar = Calendar.getInstance();

		// 2. 연도, 월, 일
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;
		int day = calendar.get(Calendar.DAY_OF_MONTH); // 이건 0부터 시작 (0 ~ 11)
		
			// *해당 월의 1일 요일찾기
			int sweek = calendar.get(Calendar.DAY_OF_WEEK); // 이건 1부터 시작 ( 1. 일 2. 월 3. 화 4. 수 5. 목 6. 금 7. 토 )
			// *해당 월의 마지막 일 찾기
			int eday = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 해당 필드가 표현할 수 있는 최대 길이 
		
		System.out.println(" ***************** " + year + " 년 " + month + " 월 ****************** ");
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		// 3. 현재 월 1일의 위치 앞에 공백 채우기 
		for(int i=1; i<sweek; i++) {
			System.out.print(" \t");
		}
		
		// 4. 1일부터 마지막 날까지 출력 
		
		for(int i=1; i<=eday; i++) {
			System.out.print(i+"\t");
			// 토요일마다 줄바꿈 
			if(sweek % 7 ==0) {
				System.out.println();
			}
			sweek++;
		}
		
		
		
	}

}
