
public class GreenStudent {

	public static void main(String[] args) {
		
		String [] students = new String[] {"강지우","안효욱","강서인"};

		System.out.println("우리반 훈련생 명단");
		System.out.println("----------------------");
		
		for (int i = 0; i < students.length; i++) {
			if (i==0) {
				System.out.println((i+1)+".우수 학생:" + students[i] );
			} else {
				System.out.println((i+1)+".일반 학생:"+ students[i]);
			}
		}
		
}}
