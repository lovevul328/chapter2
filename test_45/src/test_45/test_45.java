package test_45;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_45 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J5�ӤH������");
		int[] test = new int[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i] = Integer.parseInt(br.readLine());   //��J
		}
		for(int j=0;j<test.length-1;j++)
		{
			for(int i=0;i<test.length-1;i++)
			{
				if(test[i+1] > test[i])
				{
					int tmp = test[i];
					test[i] = test[i+1];
					test[i+1] = tmp;
				}
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("��"+(i+1)+"�W�����ƬO"+test[i]);
		}
		
	}


}
