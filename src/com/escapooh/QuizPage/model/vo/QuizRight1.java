package com.escapooh.QuizPage.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizRight1 {

	   public void QuizTextRight1 () {
	     
		   try(BufferedWriter bw3 = new BufferedWriter(new FileWriter("QuizTextRight1.txt"));){
			   
			   bw3.write("�Ŷ��� �źΰ� ��ȥ���� �ø��� �ֽ��ϴ�\n");
			   bw3.write("�Ŷ��� �ź� ��� ���� �հ����� ������ �����ֳ׿�\n");
			   bw3.write("������ ���� �ִ� �հ����� �� ��° �հ��� �ΰ���??\n");
			   
			   
			   
			   
		   } catch (IOException e) {
			
			e.printStackTrace();
		}
		   
	   }
	   
	   public void QuizTextRight1out() {
		   
		   try(BufferedReader br3 = new BufferedReader(new FileReader("QuizTextRight1.txt"));){
			   
			   String temp3;
			   while ((temp3 = br3.readLine()) != null) {
				   System.out.println(temp3);
				   
			   }
			   
			   
		   }catch (IOException e){
			   e.printStackTrace();
		   }
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

