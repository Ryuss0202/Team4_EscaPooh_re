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
			   
			   bw3.write("신랑과 신부가 결혼식을 올리고 있습니다\n");
			   bw3.write("신랑과 신부 모두 같은 손가락에 반지를 끼고있네요\n");
			   bw3.write("반지를 끼고 있는 손가락은 몇 번째 손가락 인가요??\n");
			   
			   
			   
			   
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

