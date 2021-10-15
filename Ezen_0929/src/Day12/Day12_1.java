package Day12;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Day12_1 {

	public static void main(String[] args) {

		// p.521
		// 배열 복사

		// 현재 클래스 내 다른 클래스에 속한 메소드 호출 방법
		// . : 접근 제한자를 통한 메소드 호출 (동일한 클래스 내에서는 생략)
		// 1. 객체를 통한 메소드 호출
		// 클래스명 객체명 = new 생성자();
		// 객체명.메소드명()
		// 2. static : 객체 없이 메소드 호출
		// 클래스명.메소드명()

		// Arrays.toString(배열) : 인덱스 순으로 데이터 출력

		Character[] arr1 = { 'J', 'A', 'V', 'A' };

		Character[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr2));

		Character[] arr3 = Arrays.copyOfRange(arr1, 1, 3);

		System.out.println(Arrays.toString(arr3));

		Character[] arr4 = new Character[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);

		System.out.println(Arrays.toString(arr4));

		for (int i = 0; i < arr4.length; i++) {
			System.out.println("arr4[" + i + "] = " + arr4[i]);
		}

		System.out.println(Arrays.equals(arr1, arr2));

		// 문자 정렬은 byte 기준으로 정렬된다.

		Arrays.sort(arr1);

		System.out.println(Arrays.toString(arr1));

		// 내림 차순 sort 는 오름차순인데 내림 차순은 어떻게 할래???

		// Arrays.sort(arr1, Collections.reverseOrder());
		// System.out.println(Arrays.toString(arr1));

		// binarySearch 는 오름차순으로 정렬됐을 때만 사용 가능한듯
		System.out.println(Arrays.binarySearch(arr1, 0, arr1.length, 'K'));

	}

}
