package com.escapooh.QuizPage.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizRight2 {

	   public void QuizTextRight2 () {
	    
		   try(BufferedWriter bw4 = new BufferedWriter(new FileWriter("QuizTextRight2.txt"));){
			   
			   bw4.write("������ �� + �������� - ������ �� = ?\n");
			   bw4.write("������ ��� �� �� �Դϱ�?\n");
			   
			   
			   
		   }catch (IOException e) {
			   
			   e.printStackTrace();
		   }
	   }
	   
	   public void QuizTextRight2out() {
		   
		   try(BufferedReader br4 = new BufferedReader(new FileReader("QuizTextRight2.txt"));){
			   
			String temp4;
			while ((temp4 = br4.readLine()) != null) {
				System.out.println(temp4);
				
			}
		   
		  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
	   }
	   
	   
}
