package com.escapooh.QuizPage.model.vo;

	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class QuizLeft1 {
	   
		public void QuizTextLeft1 () {
			
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter("QuizTextLeft1.txt"));) {
				
				bw.write("���� ��󸶴� �����϶�\n");
				bw.write("*997! *988 �ø�����!\n");
				bw.write("���⼭ * �� �� ���ڴ� �����ΰ���?\n");
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		
		public void  QuizTextLeft1out() {
			
			try(BufferedReader br = new BufferedReader(new FileReader("QuizTextLeft1.txt"));) {
				
				String temp;
				while ((temp = br.readLine()) != null) {
					System.out.println(temp);
				}
				
				
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
}

