package com.escapooh.game.timer;

import java.awt.Color;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


//¶óº§·Î ÇÑ¹ø ¹Ù²ã¼­ ÇØº¸±â
public class TimerClass2 extends JPanel{
	
	private JTextField timeOP = new JTextField(6);
	private JLabel display = new JLabel();

	static String timerBuffer; 


	public TimerClass2(JFrame jf) {
		TimerTask task = new TimerTask() {
			@Override
			public void run() {

				for(int i = 0;;i++) {
					//System.out.println(i);
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
		timeOP.setFont(new Font("¸¼Àº °íµñ", 0, 15));

		jf.add(timeOP);
		timeOP.setBounds(1000, 10, 80, 40);


	}

	public void secTo(int secs) {
		int hour, min, sec;

		sec  = secs % 60;
		min  = secs / 60 % 60;
		hour = secs / 3600;

		timerBuffer = String.format("%02d:%02d:%02d", hour, min, sec);
	}
	
}
