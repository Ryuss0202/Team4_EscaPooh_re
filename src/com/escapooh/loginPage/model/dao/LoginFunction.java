package com.escapooh.loginPage.model.dao;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.escapooh.loginPage.model.vo.LoginInfo;


public class LoginFunction {

	public void writeLogin() {

		LoginInfo [] linfo = {new LoginInfo(LoginInfo.getId(), LoginInfo.getPwd())};

		try(ObjectOutputStream objOut = 
				new ObjectOutputStream(
						new FileOutputStream("Members.txt"));){

			for(int i = 0; i<linfo.length ; i++) {
				objOut.writeObject(linfo[i]);
			}
			objOut.flush();

		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

	public void loginFileOpen() {
		LoginInfo[] linfo = new LoginInfo[1];
		try(ObjectInputStream objIn= 
				new ObjectInputStream(
						new FileInputStream("Members.txt"));) {
			for (int i=0; i<linfo.length;i++) {
				linfo[i] = (LoginInfo)objIn.readObject();
			}
			for(LoginInfo l : linfo) {
				System.out.println(l);

			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}



