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
			 
			 bw2.write("여기는 꽃이 있는 정원입니다\n");
			 bw2.write("흰 장미, 노란장미, 그리고 푸른 나팔꽃과 노란 달맞이 꽃이 있습니다\n");
			 bw2.write("그거 아시나요?\n");
			 bw2.write("꽃마다 피는 시간이 다르담니다");
			 bw2.write("나팔꽃은 새벽에 피고 장미는 낮에 피고 닮맞이 꽃은 밤에피네요\n");
			 bw2.write("지금은 낮이네요??\n");
			 bw2.write("지금 핀 꽃의 종류는 몇개입니까??\n");
			 
			 
			 
			 
			 
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
