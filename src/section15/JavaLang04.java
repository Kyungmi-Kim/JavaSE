package section15;
/*
 * StringBuffer
 *  문자열을 동적으로 다루기위한 클래스
 *  Thread Safe O
 *  
 * StringBuilder
 *  문자열을 동적으로 다루기위한 클래스
 * Thread Safe x
 */
public class JavaLang04 {
	public static void main(String[] args) {
		
		// 문자열을 동적으로 다루기 위한 클래스, Thread Safe O
		StringBuffer sb = new StringBuffer();
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		
		// 문자열을 동적으로 다루기 위한 클래스, Thread Safe x
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("안녕하세요");
		System.out.println(sBuilder);
		System.out.println(System.identityHashCode(sBuilder));
		
		sBuilder.append("Hello Java");
		System.out.println(sBuilder);
		System.out.println(System.identityHashCode(sBuilder));
		
	}

}
