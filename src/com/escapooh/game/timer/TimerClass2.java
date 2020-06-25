package com.escapooh.game.timer;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.escapooh.game.bee.BeeRun;
import com.escapooh.pooo.MainFrame;
import com.escapooh.pooo.Test;


//라벨로 한번 바꿔서 해보기
public class TimerClass2 extends JPanel{
//	private MainFrame mf = new MainFrame();
	
	private JFrame jf;
	
	private JTextField timeOP = new JTextField(6);
	private JLabel display = new JLabel();

	static String timerBuffer; 


	public TimerClass2(JFrame jf, JPanel jp) {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {

				for(int i = 0;;i++) {
					System.out.println(i);
					secTo(i);
					timeOP.setText(timerBuffer);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Timer timer = new Timer();
		timer.schedule(task, 100);

		
		timeOP.setEditable(false);
		timeOP.setFont(new Font("맑은 고딕", 0, 36));

		timeOP.setBounds(1000, 10, 140, 80);

		display.add(timeOP);
		this.add(display);
//		display.setBackground(Color.red);
		
//		jf.setLayout(null);
//		jf.setBounds(0, 0, 1200, 800);
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void secTo(int secs) {
		int hour, min, sec;

		sec  = secs % 60;
		min  = secs / 60 % 60;
		hour = secs / 3600;

		timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	}

//테스트용 임시 메인 삭제
//  public static void main(String[] args) {
//      new TimerClass();
//  }
	
}
