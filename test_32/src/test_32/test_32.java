package test_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_32 {
	public static void main(String[] args) throws  IOException {
	
		System.out.println("�аݭn�b�ĴX���B�z�����j��O(1~10)");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
			System.out.println("��"+ i +"�����B�z");	
			if(i == num)                              
			{
				break;                                 //break
			}	
		}
	}


}
