package makingKiosk;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Kiosk extends JFrame {
	
	private JPanel centerPanel = new JPanel();
	
	//Center Panel Components
	JButton buttonCof = new JButton();
	JButton buttonBev = new JButton();
	JButton buttonDes = new JButton();
	
	JButton buttonAme = new JButton();
	JButton buttonCL = new JButton();
	JButton buttonCC = new JButton();
	JButton buttonCMacchiato = new JButton();
	JButton buttonColdBrew = new JButton();
	JButton buttonEspresso = new JButton();
	JButton buttonIceCL = new JButton();
	JButton buttonSpanishML = new JButton();
	JButton buttonTiramisuL = new JButton();
	
	JButton buttonOrder = new JButton();
	JButton buttonTrash = new JButton();
	JButton buttonClear = new JButton();
	
	JTextArea textAOL = new JTextArea();
	JTextArea textBucket = new JTextArea();
	JTextArea textTQ = new JTextArea();
	JTextArea textTP = new JTextArea();
	
	//Methods in Constructor
	public Kiosk() {
		
		this.setSize(500, 580);
		setPanels();
		setComponents();
		setLayout(null);
		
		add(centerPanel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	//Screen Design
	private void setPanels() {
		
		//최상단 2행3열
		buttonCof.setBounds(10, 10, 160, 80);
		buttonBev.setBounds(170, 10, 160, 80);
		buttonDes.setBounds(330, 10, 160, 80);
		add(buttonCof);
		add(buttonBev);
		add(buttonDes);
		
		//좌하단 9개 버튼
		buttonAme.setBounds(10, 200, 100, 100);
		buttonCL.setBounds(120, 200, 100, 100);
		buttonCC.setBounds(230, 200, 100, 100);
		
		buttonCMacchiato.setBounds(10, 310, 100, 100);
		buttonColdBrew.setBounds(120, 310, 100, 100);
		buttonEspresso.setBounds(230, 310, 100, 100);
		
		buttonIceCL.setBounds(10, 420, 100, 100);
		buttonSpanishML.setBounds(120, 420, 100, 100);
		buttonTiramisuL.setBounds(230, 420, 100, 100);
		
		add(buttonAme);
		add(buttonCL);
		add(buttonCC);
		
		add(buttonCMacchiato);
		add(buttonColdBrew);
		add(buttonEspresso);
		
		add(buttonIceCL);
		add(buttonSpanishML);
		add(buttonTiramisuL);
		
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
	
	private void setComponents() {
		
		//최상단 2행 3열에 들어갈 텍스트
		buttonCof.setText("커피");
		buttonBev.setText("음료수");
		buttonDes.setText("디저트");
		
		//좌하단 9개 버튼에 들어갈 텍스트
		buttonAme.setText("아메리카노");
		buttonCL.setText("카페라떼");
		buttonCC.setText("카푸치노");
		buttonCMacchiato.setText("카라멜 마끼아또");
		buttonColdBrew.setText("콜드브루");
		buttonEspresso.setText("에스프레소");
		buttonIceCL.setText("아이스 카페라떼");
		buttonSpanishML.setText("스페니쉬 밀크 라떼");
		buttonTiramisuL.setText("티라미수 라떼");
		
		//우중단 주문내역
		textAOL.setText("주문 내역");
		textBucket.setText("");
		textTQ.setText("총 수량");
		textTP.setText("총 가격");
		
		//우하단 주문하기, 처음으로 및 clear
		buttonOrder.setText("주문하기");
		buttonClear.setText("처음으로");
		buttonTrash.setText("모두 없애기");
		
	}

}
