package section15;
/*
 * String 클래스
 *  자바에서 문자열을 다루기 위해 사용되는 클래스
 *  java.lang 패키지에 포함
 *  
 * 불변(immutable)의 객체 - 생성된 후 메모리에서 문자열 값이 변경되지 않는다.(변경불가 객체)
 *  1. 메모리 절약
 *  2. 보안성 up
 *  3. Thread Safe
 * 
 */
public class JavaLang03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str2 += "d";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("==================================");
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		
		if(str1 == str2) {   // 참조주소로 비교, 문자열과 다를수 있음
			System.out.println("str1 == str2 true");
		}else {
			System.out.println("str1 == str2 false");
				
		
		}
		if(str1 == str2) {
			System.out.println("str1 == str3 true");
		}else {
			System.out.println("str1 == str3 false");
		}
		
		// String 에서 값비교 equals 사용해야한다.
		if(str1.equals(str3)) {   // 문자열 비교할때는 equals 사용
			System.out.println("str1.equals(str3) true");
		}else {
			System.out.println("str1.equals(str3 false");
		}
	}
}
