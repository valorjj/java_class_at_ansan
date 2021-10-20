package Day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import Day05.Board;

public class Day15_1 {
	
	// *************** 인수, 반환 값을 알면 API 를 사용할 수 있다. 
	
	// java collection 
	
		// [interface]
	
			// 1. List : 순서(인덱스)를 유지하고 저장
				// 1. ArrayList 2. Vector 3. LinkedList
					// 1. .add( ) : 해당 객체를 리스트에 저장
					// 2. .contains( ) : 해당 객체가 리스트에 존재하는지 여부( true, false ) 
					// 3. .get( 인덱스 or 객체명 ) : 해당 인덱스의 객체 호출 
					// 4. .isEmpty( ) : 리스트가 비어 있는지 확인 ( true, false ) 
					// 5. .clear( ) : 리스트 초기화 [모든 객체 삭제]
					// 6. .remove( 인덱스 or 객체명 ) : 
					// 7. .indexOf( 객체 ) : 해당 객체의 인덱스 리턴 
	
			// 2. Set : 순서를 유지하지 않고 저장 
				// 1. HashSet 2. TreeSet
					// 1. .add( ) : 해당 객체를 set에 저장
					// 2. .contains( ) : 해당 객체의 존재 여부 확인 
					// 3. .isEmpty( ) : 세트가 비어 있는지 확인 
					// *** 4. .iterator( ) : 저장된 객체를 하나씩 가져오는 반복자 리턴 
						// Set 는 저장 순서가 없기 때문에 꼭 사용해야한다.
						// 1. hashNext( ) :
						// 2. 
					// 5. .size( ) : set 내 객체 수 
					// 6. .clear( ) : 초기화 
					// 7. .remove( 객체 ) : 해당 인덱스 객체를 삭제 
	
	
	
			// 3. Map : Key : Value pair 를 이룬다. 
				// 1. HashMap 2. Hashtable 3. TreeMap
					// 1. .put( Key, Value ) : 키와 값으로 이루어진 엔트리 추가
					// 2. .containsKey( Key ) : 키 존재 여부 확인 
					// 3. .containsValue( Value ) : 값 존재 여부 확인
					// 4. .entrySet( ) : 해당 엔트리 set에 저장
					// 5. .get( Key ) : 해당 키의 값을 호출
					// 6. .isEmpty( ) : map 이 비어있는지 확인
					// 7. .keyset( ) : 해당 키를 set 에 저장  
					// 8. .size( ) :
		

	public static void main(String[] args) {
		
		// p.729
			// ArrayList : 동기화를 지원하지 않는다 --> 단일 스레드 
			// Vector : 동기화를 지원한다.  --> 멀티 스레드 
		
		List<Board> boards = new Vector<>();
		
		boards.add(new Board("제목1", "내용1", "글쓴이1"));
		boards.add(new Board("제목2", "내용2", "글쓴이2"));
		boards.add(new Board("제목3", "내용3", "글쓴이3"));
		boards.add(new Board("제목4", "내용4", "글쓴이4"));
		boards.add(new Board("제목5", "내용5", "글쓴이5"));
		boards.add(new Board("제목6", "내용6", "글쓴이6"));
		
		// Board board = new Board("제목2", "내용2", "글쓴이2");
		
		System.out.println(boards);
		
		ArrayList<String> list_1 = new ArrayList<>();
		LinkedList<String> list_2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list_1.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		
		float diff = (float)(endTime-startTime)/1000000;
		
		System.out.printf(" arrayList 10000개 삽입하는데 걸린 시간 : " + String.format("%.3f", diff) + "ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list_2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println();
		
		diff = (float)(endTime-startTime)/1000000;
		
		System.out.println(" LinkedList 10000개 삽입하는데 걸린 시간 : " + String.format("%.3f", diff) + "ns"); 

		
		
		
		
		
		
	}
	
	
}
