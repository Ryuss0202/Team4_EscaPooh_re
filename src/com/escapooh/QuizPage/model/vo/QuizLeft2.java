package com.escapooh.QuizPage.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizLeft2 {

	   public void QuizTextLeft2 () {
	     
		 try(BufferedWriter bw2 = new BufferedWriter(new FileWriter("QuizTextLeft2.txt"));){
			 
			 bw2.write("����� ���� �ִ� �����Դϴ�\n");
			 bw2.write("�� ���, ������, �׸��� Ǫ�� ���Ȳɰ� ��� �޸��� ���� �ֽ��ϴ�\n");
			 bw2.write("�װ� �ƽó���?\n");
			 bw2.write("�ɸ��� �Ǵ� �ð��� �ٸ���ϴ�");
			 bw2.write("���Ȳ��� ������ �ǰ� ��̴� ���� �ǰ� ����� ���� �㿡�ǳ׿�\n");
			 bw2.write("������ ���̳׿�??\n");
			 bw2.write("���� �� ���� ������ ��Դϱ�??\n");
			 
			 
			 
			 
			 
		 }catch (IOException e) {
			 
			 e.printStackTrace();
		 }
		   
	} 
	   
	  public void QuizTextLeft2out() {
		  
		  try(BufferedReader br2 = new BufferedReader(new FileReader("QuizTextLeft2.txt"));){
		
			  String temp2;
			  while ((temp2 = br2.readLine()) != null){
				  System.out.println(temp2);
			  }
			  
			  
			  
		  }catch (IOException e) {
			  e.printStackTrace();
		  }
		  
		 
	  }
	   
	   
	   
	   
	   
	   
	   
	   
	   
}
