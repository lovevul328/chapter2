package test_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_21 {
	public static void main(String[] args) throws IOException {
	
		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		char ans = (num == 1)?'A':'B';               //�S�O���y�k
		System.out.println("��ܤF"+ ans +"���u");
	}


}
