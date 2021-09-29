package Day02;

public class Day02_3 {

	public static void main(String[] args) {

		int i = 10;
		int j = 10;

		// p.40 : 증감연산자

		// 후위증가
		System.out.println("i++ : " + i++);
		System.out.println("i-- : " + i--);
		System.out.println("i : " + i);
		System.out.println("--j : " + --j);
		System.out.println("++j : " + ++j);
		System.out.println("j : " + j);

		// p.88 : 비교연산자

		int a = 10;
		int b = 20;
		System.out.println(" a>=b " + (a >= b));

		// p.92 : 논리연ㅅ난자 : AND / OR : 비교 연산자가 2개 이상일 때

		int a1 = 10, a2 = 20, a3 = 30;
		System.out.println(" AND : " + ((a1 >= a2) || (a2 <= a3)));

		// p.98 : 대입연산자

		int c = 1;
		System.out.println(c);
		System.out.println("c : " + c + " c += 1 => " + ++c);
		
		// p.100 : 조건연산자
		
		int var1 = 100;
		int var2 = 200;
		
		int var3 = var1 > var2 ? var1 : var2;		
	}

}
