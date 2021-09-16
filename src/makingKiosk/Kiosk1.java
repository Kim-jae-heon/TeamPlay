package makingKiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


//import java.awt.*;
//import javax.swing.*;
//import java.awt.event.*;


public class Kiosk1 extends JFrame implements ActionListener{

	
	//Center Panel Components
		JButton buttonCof = new JButton();
		JButton buttonBev = new JButton();
		JButton buttonDes = new JButton();
		
		JButton button1 = new JButton();
		JButton button2 = new JButton();
		JButton button3 = new JButton();
		JButton button4 = new JButton();
		JButton button5 = new JButton();
		JButton button6 = new JButton();
		JButton button7 = new JButton();
		JButton button8 = new JButton();
		JButton button9 = new JButton();
		
		JButton buttonOrder = new JButton();
		JButton buttonTrash = new JButton();
		JButton buttonClear = new JButton();
		
		JButton textAOL = new JButton();
		JButton textBucket = new JButton();
		JButton textTQ = new JButton();
		JButton textTP = new JButton();
	
		JButton[] jbu = {buttonCof,buttonBev,buttonDes};
		
		private int count;
		private int sum;
	
	 public Kiosk1() {
		
		setLayout(null);
		setSize(500,580);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPanels();
		setComponents();
		
//		setVisible(true);
		
		
		
		
		
		
	}

	
	//Screen Design
		protected void setPanels() {
			
			//최상단 2행3열
			buttonCof.setBounds(10, 10, 160, 80);
			buttonBev.setBounds(170, 10, 160, 80);
			buttonDes.setBounds(330, 10, 160, 80);
			add(buttonCof);
			add(buttonBev);
			add(buttonDes);
			
			//좌하단 9개 버튼
			button1.setBounds(10, 200, 100, 100);
			button2.setBounds(120, 200, 100, 100);
			button3.setBounds(230, 200, 100, 100);
			
			button4.setBounds(10, 310, 100, 100);
			button5.setBounds(120, 310, 100, 100);
			button6.setBounds(230, 310, 100, 100);
			
			button7.setBounds(10, 420, 100, 100);
			button8.setBounds(120, 420, 100, 100);
			button9.setBounds(230, 420, 100, 100);
			
			add(button1);
			add(button2);
			add(button3);
			
			add(button4);
			add(button5);
			add(button6);
			
			add(button7);
			add(button8);
			add(button9);
			
			//우중단 주문내역
			textAOL.setBounds(340, 100, 140, 20);
			textBucket.setBounds(340, 130, 140, 150);
			textTQ.setBounds(340, 290, 140, 20);
			textTP.setBounds(340, 310, 140, 20);
			add(textAOL);
			add(textBucket);
			add(textTQ);
			add(textTP);
			
			//우하단 주문하기, 처음으로 및 clear
			buttonTrash.setBounds(340, 470, 40, 25);
			buttonOrder.setBounds(380, 470, 110, 25);
			buttonClear.setBounds(340, 495, 150, 25);
			add(buttonTrash);
			add(buttonClear);
			add(buttonOrder);
			
		}
	
	
		void setComponents() {
			
			
			//최상단 2행 3열에 들어갈 텍스트
			buttonCof.setText("커피");
			buttonBev.setText("음료수");
			buttonDes.setText("디저트");
//			buttonCof.addActionListener(this);
			
			//우중단 주문내역
			textAOL.setText("주문 내역");
			textBucket.setText("");
			textTQ.setText("총 수량 : " + count);
			textTP.setText("총 가격 : " + sum);
			
			//우하단 주문하기, 처음으로 및 clear
			buttonOrder.setText("주문하기");
			buttonClear.setText("처음으로");
			buttonTrash.setText("모두 없애기");
			
			
			for(int i = 0; i < jbu.length; i++) {
				jbu[i].addActionListener(this);
			}
		}
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == jbu[0]) {
			Coffee cof = new Coffee();
			
//			System.exit(0);
		}
		if(e.getSource() == jbu[1]) {
			new Drink();
			
		}
		
		if(e.getSource() == jbu[2]) {
			new Desert();
		}
		
	}
	
	

}
