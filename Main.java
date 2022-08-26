import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==프로그램 시작==");
		
		while(true) {
			
			System.out.printf("명령어 ) ");
			
			String cmd = sc.nextLine().trim();
			
			if(cmd.equals("exit")) {
				System.out.println("==종료==");
				break;
			}
		}
	}
}