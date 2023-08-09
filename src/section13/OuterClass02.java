package section13;
/*
 * 내부클래스 컴파일
 * 
 *  Outer$Inner.class
 * 
 *  내부클래스도 외부클래스 안에 생성되는것 외에도 별도에 클래스이기에 컴파일시 별도로 생성된다.
 * 
 */

public class OuterClass02 {
	public static void main(String[] args) {
		
		new OuterClass02.InnerClass().info();
		OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
		inner.info();
		// OuterClass02.InnerClass.staticInfo();
		
	}

	
	static class InnerClass{
		public static void staticInfo() {
			// System.out.println("static 메서드 입니다.");
		}
		
		public void info() {
			System.out.println("static 내부 클래스의 일반메서드 입니다.");


		}

	}
}
