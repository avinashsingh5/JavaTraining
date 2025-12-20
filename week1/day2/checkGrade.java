import java.util.Scanner;

public class checkGrade {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int score = sc.nextInt();
		String Grade  = "";
		if(score>= 90){
			Grade = "A";
		}
		else if(score>=75  ){
			Grade = "B";
		}
		else if(score>=60 ){
			Grade ="C";
		}
		else if(score>=40 ){
			Grade = "D";
		}
		else{
			Grade = "FAIL";
		}
		System.out.println(Grade);
		sc.close();

	}
}