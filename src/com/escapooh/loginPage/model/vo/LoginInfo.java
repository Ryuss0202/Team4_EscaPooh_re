package com.escapooh.loginPage.model.vo;


	import javax.swing.JPasswordField;
	import javax.swing.JTextField;

	public class LoginInfo {
		private static String id;
		private static String pwd;
		
		public LoginInfo() {}

		public LoginInfo(String id, String pwd) {
			super();
			this.id = id;
			this.pwd = pwd;
		}

		public static String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public static String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}

		@Override
		public String toString() {
			return "LoginInfo [id=" + id + ", pwd=" + pwd + "]";
		}
		
	}


