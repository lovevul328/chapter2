package test_34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class test_34 {
	public static void main(String[] args) throws  IOException {

		System.out.println("要跳過幾次的處理呢(1~10)");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for(int i=1;i<=10;i++)
		{
			if(i == num)                              
				continue;              //continue用法特別，if不能括號
				System.out.println("第"+ i +"次的處理。");	
			
		}
		
	}


}
