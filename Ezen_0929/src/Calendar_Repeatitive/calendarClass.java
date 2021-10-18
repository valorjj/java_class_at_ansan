package Calendar_Repeatitive;

import java.util.Calendar;

public class calendarClass {

	int beginYear;
	int beginMonth;
	int endYear;
	int endMonth;

	public void calendarPrint() {

		Main main = new Main();

		System.out.println("시작 연도 : ");
		int beginYear = main.scanner.nextInt();
		System.out.println("시작 월 : ");
		int beginMonth = main.scanner.nextInt();
		System.out.println("끝 연도 : ");
		int endYear = main.scanner.nextInt();
		System.out.println("끝 연도 : ");
		int endMonth = main.scanner.nextInt();
		calendarInput(beginYear, beginMonth, endYear, endMonth);
	}

	public void calendarInput(int beginYear, int beginMonth, int endYear, int endMonth) {

		// 시작연월, 끝 연월을 Arguments 로 넘겨받습니다.

		Calendar calendar = Calendar.getInstance(); // calendar 객체 생성

		// 입력값에 맞는 calendar 객체 변경
		calendar.set(beginYear, beginMonth - 1, 1);

		int startYear = calendar.get(Calendar.YEAR);
		int startMonth = calendar.get(Calendar.MONTH);

		// 1 : 일요일 2 : 월요일 3 : 화요일 4 : 수요일 5 : 목요일 6 : 금요일 7 : 토요일
		int startWeek = calendar.get(Calendar.DAY_OF_WEEK);
		int endDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		boolean run = true;

		int count = countRep(beginYear, beginMonth, endYear, endMonth);

		while (run) {
			System.out.println(" --- --- --- [" + startYear + "]년 [" + startMonth + "] --- --- ---");
			System.out.println("일\t월\t화\t수\t목\t금\t토");

			for (int i = 1; i < startWeek; i++) {
				System.out.println("\t");
			}

			for (int i = 1; i <= endDay; i++) {
				System.out.println(i + "\t");
				if (startWeek % 7 == 0) {
					System.out.println();
				}
			}

		}

	}

	public int countRep(int beginYear, int beginMonth, int endYear, int endMonth) {

		int diff1 = endYear - beginYear;
		int diff2 = endMonth - endMonth;
		int count = 0;
		if (diff1 == 0) {
			count += diff2 + 1;
		} else {
			if (endMonth > beginMonth) {
				count += 12 + (endMonth - beginMonth) + 1;
			} else {
				// 2021.7 ~ 2022.3
				count += (12 - beginMonth) + endMonth + 1;
			}
		}

		return count;

	}

}
