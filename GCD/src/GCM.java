import java.util.Scanner;

public class GCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		int min; // 두 정수 중 작은수
		int max = 0; //최대공약수 변수
		
		System.out.print("두 개의 정수를 입력하시오.(NUM 1): ");
		
		num1 = scanner.nextInt();
		
		System.out.print("두 개의 정수를 입력하시오.(NUM 2) : ");
		
		num2 = scanner.nextInt();

		if(num1<=num2) {
			min = num1;
		} else {
			min = num2;
		}
		
		
		for(int i=1; i<=min; i++) {
	        
			if(num1%i==0 && num2%i==0) { 
				max = i; 
			}
            
		}
        
		System.out.println(num1 + "," + num2 + "의 최대공약수: " + max);

	}

}
