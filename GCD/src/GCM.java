import java.util.Scanner;

public class GCM {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1, num2;
		int min; // �� ���� �� ������
		int max = 0; //�ִ����� ����
		
		System.out.print("�� ���� ������ �Է��Ͻÿ�.(NUM 1): ");
		
		num1 = scanner.nextInt();
		
		System.out.print("�� ���� ������ �Է��Ͻÿ�.(NUM 2) : ");
		
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
        
		System.out.println(num1 + "," + num2 + "�� �ִ�����: " + max);

	}

}
