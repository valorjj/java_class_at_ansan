package Day12;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day12_3 {

	public static void main(String[] args) {

		Date date = new Date();

		System.out.println(date);

		// SimpleDateFormat : 커스텀 형식

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 [hh시 mm분 ss초]");
		// 형식을 설정한다.

		// 형식 적용

		// System.out.println(dateFormat.format(date));

		Calendar now = Calendar.getInstance(); // 기존에 있는 객체를 가져오기

		System.out.println(now.get(Calendar.YEAR));
		System.out.println(now.get(Calendar.MONTH) + 1); // 0부터 11까지
		System.out.println(now.get(Calendar.DAY_OF_MONTH));

		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;

		switch (week) {
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "금";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;

		}
		System.out.println("요일 : " + strWeek);

		System.out.println("오전/오후: " + now.get(Calendar.AM_PM));
		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;

		if (ampm == Calendar.AM) {
			strampm = "오전";
		} else {
			strampm = "오후";
		}
		System.out.println("오전/오후 : " + strampm);

		System.out.println("시 :" + now.get(Calendar.HOUR));
		System.out.println("분 :" + now.get(Calendar.MINUTE));
		System.out.println("초 :" + now.get(Calendar.SECOND));

		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시계 : " + zonedDateTime);

	}

}
