package test_34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_34 {
	public static void main(String[] args) throws  IOException {

		System.out.println("�n���L�X�����B�z�O(1~10)");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
			if(i == num)                              
				continue;              //continue�Ϊk�S�O�Aif����A��
				System.out.println("��"+ i +"�����B�z�C");	
			
		}
		
	}


}
