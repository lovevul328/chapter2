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
		
		System.out.println("請輸入5個人的分數");
		Integer test[] = new Integer[5];
		
		for(int i=0;i<test.length;i++)
		{
			test[i] = Integer.parseInt(br.readLine());   //輸入
		}
		
		Arrays.sort(test,Collections.reverseOrder());    //自動排序
		
		for(int i=0;i<5;i++)
		{
			System.out.println("第"+(i+1)+"名的分數是"+test[i]);
		}
		
	}


}
