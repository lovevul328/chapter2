package test_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_15 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J���");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
			case 1:
			{
				System.out.println("��J���O1");
			}
			case 2:
			{
				System.out.println("��J���O2");
			}
			default :
			{
				System.out.println("�п�J1��2");
			}
			
		}
	}

}