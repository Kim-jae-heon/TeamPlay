package makingKiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Kiosk extends JFrame implements ActionListener{
	

	protected JPanel centerPanel = new JPanel();
	
	
	protected int count = 0;						// 수량 및 금액
	protected int sum = 0;
	
//	JButton[] col = new JButton[19]; // 필드 초기화를 배열로 하려했으나 나중에 시도하기로..
	
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
	
	
	public Kiosk() {								// 메뉴 선택 화면 디자인
		
		this.setSize(500, 580);
		setPanels();
		setComponents();
		setLayout(null);
		
		
		add(centerPanel);
//		add(buttonCof);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	
	protected void setPanels() {						// 버튼 디자인
		
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
	
	protected void setComponents() {					// 초기화면 디자인
		
		//최상단 2행 3열에 들어갈 텍스트
		buttonCof.setText("커피");
		buttonBev.setText("음료수");
		buttonDes.setText("디저트");
		
		
		//우중단 주문내역
		textAOL.setText("주문 내역");
		textBucket.setText("");
		textTQ.setText("총 수량 : " + count);
		textTP.setText("총 가격 : " + sum);
		
		//우하단 주문하기, 처음으로 및 clear
		buttonOrder.setText("주문하기");
		buttonClear.setText("처음으로");
		buttonTrash.setText("모두 없애기");
		
		
		// JButton[] jbu = {buttonCof,buttonBev,buttonDes};
		// 각 항목별 이벤트 읽기
		for(int i = 0; i < jbu.length; i++) {
			jbu[i].addActionListener(this);
			}
		
		
	}
	
	
	protected void cofcom() {						// 커피 클릭시 디자인
		 
		textAOL.setText("주문 내역");
		textBucket.setText("");
		textTQ.setText("총 수량 : " + count);
		textTP.setText("총 가격 : " + sum);
		
		buttonCof.setText("커피");
		buttonBev.setText("음료수");
		buttonDes.setText("디저트");
				
		//좌하단 9개 버튼에 들어갈 텍스트
		button1.setText("아메리카노");
		button2.setText("카페라떼");
		button3.setText("카푸치노");
		button4.setText("카라멜 마끼아또");
		button5.setText("콜드브루");
		button6.setText("에스프레소");
		button7.setText("아이스 카페라떼");
		button8.setText("스페니쉬 밀크 라떼");
		button9.setText("티라미수 라떼");
		
		//우하단 주문하기, 처음으로 및 clear
		buttonOrder.setText("주문하기");
		buttonClear.setText("처음으로");
		buttonTrash.setText("모두 없애기");
		 
	 }
	 
	protected void dricom() {						// 음료 클릭시 디자인
		 
		 textAOL.setText("주문 내역");
			textBucket.setText("");
			textTQ.setText("총 수량 : " + count);
			textTP.setText("총 가격 : " + sum);
	
			buttonCof.setText("커피");
			buttonBev.setText("음료수");
			buttonDes.setText("디저트");
			
			//좌하단 9개 버튼에 들어갈 텍스트
			button1.setText("아이스티");
			button2.setText("레몬티");
			button3.setText("카모마일");
			button4.setText("포도주스");
			button5.setText("딸기주스");
			button6.setText("멜론주스");
			button7.setText("사과주스");
			button8.setText("바나나주스");
			button9.setText("망고주스");
			
			//우하단 주문하기, 처음으로 및 clear
			buttonOrder.setText("주문하기");
			buttonClear.setText("처음으로");
			buttonTrash.setText("모두 없애기");
		 
	 }
		
	protected void descom() {						// 후식 클릭시 디자인
		 
		 
		 textAOL.setText("주문 내역");
			textBucket.setText("");
			textTQ.setText("총 수량 : " + count);
			textTP.setText("총 가격 : " + sum);
			
			buttonCof.setText("커피");
			buttonBev.setText("음료수");
			buttonDes.setText("디저트");
					
			//좌하단 9개 버튼에 들어갈 텍스트
			button1.setText("d1");
			button2.setText("d2");
			button3.setText("d3");
			button4.setText("d4");
			button5.setText("d5");
			button6.setText("d6");
			button7.setText("d7");
			button8.setText("d8");
			button9.setText("d9");
			
			//우하단 주문하기, 처음으로 및 clear
			buttonOrder.setText("주문하기");
			buttonClear.setText("처음으로");
			buttonTrash.setText("모두 없애기");
	 }


	
	
		// 
	 @Override   		
		public void actionPerformed(ActionEvent e) {// 각 메뉴 이동 이벤트 처리
			
			if(e.getSource() == jbu[0]) {
				
				cofcom();
				
//				System.exit(0);
			}
			if(e.getSource() == jbu[1]) {
				
				dricom();
				
			}
			
			if(e.getSource() == jbu[2]) {
				descom();
			}
			
		}

	 
	 
	 
	 
	 
}
