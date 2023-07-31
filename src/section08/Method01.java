package section08;
/*
 * 메서드(Method)
 *  프로그래밍에서 메서드는 하나의 특별한 목적의 작업을 수행하기 위해
 *  설계된 프로그램 코드 집합.
 *  객체의 기능 역할을 한다.
 * 
 * 메서드 구조
 *  (접근제한자)(static) 반환타입 메서드이름(매개변수타입 매개변수명){
 *  	실행할 코드(명령문 집합)
 *  
 *  	(return 반환값;)
 *  }
 *  
 * 오버로딩(Overloading)*****중요!!
 *  클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하는 것을 말한다.
 *  매개변수 개수 또는 타입이 다르면 선언 가능
 * 
 */
public class Method01 {
	public static void main(String[] args) {
		hello(); // hello() 메서드 호출(call a method)
		
		printName("도라에몽");
		
		printPokemon("025", "피카츄", 29);
		
		printPokemon("025", "피카츄", "전기");
		
		String[] pokemons = {"피카츄", "라이츄", "파이리", "꼬부기"};
		printPokeMon(pokemons);

	}
	
	// 1. 인자x, 리턴x(void) -> 호출시 실행하고 끝나는 메서드
	public static void hello() {
		System.out.println("Hello, World!");
	}

	// 2. 인자o, 리턴x(void) 
	public static void printName(String name) {   // String name = "도라에몽";
		System.out.println("이름: " + name);
	}
	
	// 3. 인자 여러개 여러타입, 리턴x 
	public static void printPokemon(String id, String name, int age) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		
	}
	
	// 4. 오버로딩(overloading) 메서드
	public static void printPokemon(String id, String name, String type) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Type: " + type);
		
	}
	
	// 5. 인자O 배열타입, 리턴x
	public static void printPokeMon(String[] mons) {   // String... mons 도 사용가능
		for (String mon : mons) {
			System.out.println(mon);
		}
	}
}
