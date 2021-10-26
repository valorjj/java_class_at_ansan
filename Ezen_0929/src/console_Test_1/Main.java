package console_Test_1;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// ArrayList 를 사용하지 않고, Map 을 사용했기 때문에 중복 점수는 입력이 되지 않습니다.
		// 국어, 영어, 수학 개별 점수는 달라도 총점이 동일하면 그래도 TreeMap 에 데이터가 들어가지를 않습니다.

		// 구글 검색에서는 동일한 객체가 입력되면 나중에 들어간 객체로 대체된다고 봤는데 직접 해보니 그게 아니라 기존 객체가 그대로 남아있습니다.
		// Map은 이진 트리 자료 구조로인해 자료의 정렬, 탐색이 쉽습니다. 항상 정렬된 상태를 유지해야할 때 사용하면 좋다는 생각이 듭니다.

		// Comparator 인터페이스를 오버라이딩하여 내림차순 정렬로 바꾸었습니다.

		// 구글 검색결과 데이터의 입출력은 List 인터페이스에 비해서 느리지만, 자료를 정렬하고, 탐색하는 것은 훨씬 빠르다고 봤습니다.
		// 알고리즘 공부를 하면서 이진트리 탐색, 이진트리 정렬, DFS, BFS 등을 제대로 이해하지 못하고 그냥 풀이법을 외웠는데
		// 같은 문제를 Array, List, Set, Map 등으로 여러번 반복해서 풀어보니 개념이 잘 잡히는 느낌입니다.
		// 이번 노래방 프로그램 팀플에서도 ArrayList 가 아니라 Set 으로 전부 바꿔서 풀어야할 것 같습니다.
		//
		// 만약 List 를 사용했다면,
		// Collections.sort( 리스트, new Comparator<클래스>() { 오버라이딩 } );
		// 이렇게 정렬했을 것 입니다.

		// Key : Student 객체 | Value : Float (평균 점수)
		TreeMap<Student, Float> treeMap = new TreeMap<Student, Float>(new DescendingOrder());

		while (true) {

			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t1.입력\t\t2.출력\t\t3.종료 \t");
			System.out.println("---------------------------------------------------------------------");
			System.out.print("선택 : \t");

			try { // 입력에 관한 예외처리
				int ch = scanner.nextInt();
				if (ch == 1) {
					// 성적을 입력받습니다.
					System.out.print("이름 : ");
					String name = scanner.next();
					System.out.print("국어성적 : ");
					int score1 = scanner.nextInt();
					System.out.print("영어성적 : ");
					int score2 = scanner.nextInt();
					System.out.print("수학성적 : ");
					int score3 = scanner.nextInt();

					int total = (score1 + score2 + score3);

					// 소숫점 출력을 위해 평균점수는 float 으로 저장합니다.
					float avg = (float) (total) / 3;
					// 트리에 넣을 객체를 생성합니다.
					Student student = new Student(name, score1, score2, score3, total);
					treeMap.put(student, avg);

				} else if (ch == 2) {
					System.out.println("---------------------------------------------------------------------");
					System.out.println("\t\t\t\t[성적표]");
					System.out.println("---------------------------------------------------------------------");
					System.out.println("[이름]\t[국어]\t[영어]\t[수학]\t[총점]\t[평균]\t[석차]");
					System.out.println("---------------------------------------------------------------------");
					int i = 1; // 석차를 나타낼 Index, i++ 증감 연산자를 이용해서 석차 출력
					for (Entry<Student, Float> entry : treeMap.entrySet()) {
						// 출력문 안에 다 집어넣으니 보기에 너무 길어져서 굳이 변수에 할당했습니다.

						String name = entry.getKey().getName();
						int s1 = entry.getKey().getK_score();
						int s2 = entry.getKey().getE_score();
						int s3 = entry.getKey().getM_score();
						int total = entry.getKey().getTotal_score();
						float avg = entry.getValue();

						System.out.println(name + "\t " + s1 + "\t " + s2 + "\t " + s3 + "\t " + total + "\t "
								+ String.format("%.2f", avg) + "\t  " + (i++));
					}

				} else if (ch == 3) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("[에러] 유효한 입력이 아닙니다. 다시 시도해주세요. ");
				}

			} catch (Exception e) {
				scanner = new Scanner(System.in);
				System.out.println("[에러] 유효한 입력이 아닙니다. 다시 시도해주세요. ");
			}

		}

	}

}
