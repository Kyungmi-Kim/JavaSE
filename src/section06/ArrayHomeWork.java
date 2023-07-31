package section06;
/*
 *숙제! 
 *                          i	j
 * 1  2  3  4  5  6  7		0	0~6
 * 8  9  10 11 12 13 14     1	7~13
 * 15 16 17 18 19 20 21     2
 * 22 23 24 25 26 27 28		3
 * 29 30 31 32 33 34 35		4
 * 36 37 38 39 40 41 42		5
 * 43 44 45 46 47 48 49		6
 * 
 * 
 * 1. 2중배열 선언하고
 * 2. for문으로 1~49까지 대입하기
 * 3. 아래 모양으로 출력하기!!!!!
 * 
 * 1    [0][0]
 * 2 8	[0][1] [1][0]
 * 15 9 3
 * 4 10 16 22
 * 29 23 17 11 5
 * 6 12 18 24 30 36
 * 43 37 31 25 19 13 7
 * 14 20 26 32 38 44
 * 45 39 33 27 21
 * 28 34 40 46
 * 47 41 35
 * 42 48
 * 49
 */
public class ArrayHomeWork {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				array[i][j] =i * 7 + j + 1;
			}			
		}
		for(int i = 0; i < 13; i++) {
			if(i < 7) {
				for(int j = 0; j < i+1; j++) {
					if(i % 2 == 0){
						System.out.print(array[i-j][j]+ " ");
					}else {
						System.out.print(array[j][i-j]+ " ");
					}
				}
			}else {
				for(int j = 0; j < 13-i; j++) {
					if(i % 2 == 0) {
						System.out.print(array[6-j][i-6+j]+ " ");
					}else {
						System.out.print(array[i-6+j][6-j]+ " ");
					}
				}
			}
			System.out.println();
		}
  }
}

