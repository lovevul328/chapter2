package test_47;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
public class test_47 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�п�J5�ӤH������");
		Integer test[] = new Integer[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i] = Integer.parseInt(br.readLine());   //��J
		}
		
		Arrays.sort(test,Collections.reverseOrder());    //�۰ʱƧ�
		
		for(int i=0;i<5;i++)
		{
			System.out.println("��"+(i+1)+"�W�����ƬO"+test[i]);
		}
		
	}


}
