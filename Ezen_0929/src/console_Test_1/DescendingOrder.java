package console_Test_1;

import java.util.Comparator;

public class DescendingOrder implements Comparator<Student> {
	
	/*
	 * TreeMap 을 정렬할 때 사용되는 클래스입니다.
	 * Comparator 인터페이스를 상속받습니다.
	 * 정렬 기준은 Student 객체의 필드 중 total_score 입니다.
	 * 평균으로 정렬했다면, Student 대신에 Float 를 집어넣고 o2 - o1 을 기준으로 정렬했을 것 입니다.
	 * 
	 * 
	 */

	@Override
	public int compare(Student o1, Student o2) {
		
		// return 결과가 양수이면 두 값을 swap 하기 때문에 간단하게 한줄로 작성했습니다.
		// 구글 검색결과 이런식으로 하면, underflow 혹은 overflow 가 발생할 수 있기 때문에 알고리즘 테스트를 보거나 아주 큰 값이 들어가는 경우에는 지양해야합니다.
		// 만약 인수값으로 MAX_INTEGER 이런 값이 들어가면 바로 오류 발생할 수 있습니다. 
		return o2.getTotal_score() - o1.getTotal_score();
	}

}
