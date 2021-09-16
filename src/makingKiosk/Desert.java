package makingKiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Desert extends Kiosk implements ActionListener{

	
	
	public Desert() {
		
		this.setComponents();
	}

	@Override
	protected void setComponents() {
		
		
//		textAOL.setText("주문 내역");
//		textBucket.setText("");
//		textTQ.setText("총 수량 : " + count);
//		textTP.setText("총 가격 : " + sum);
//		
//		buttonCof.setText("커피");
//		buttonBev.setText("음료수");
//		buttonDes.setText("디저트");
//				
//		//좌하단 9개 버튼에 들어갈 텍스트
//		button1.setText("d1");
//		button2.setText("d2");
//		button3.setText("d3");
//		button4.setText("d4");
//		button5.setText("d5");
//		button6.setText("d6");
//		button7.setText("d7");
//		button8.setText("d8");
//		button9.setText("d9");
//		
//		//우하단 주문하기, 처음으로 및 clear
//		buttonOrder.setText("주문하기");
//		buttonClear.setText("처음으로");
//		buttonTrash.setText("모두 없애기");
		
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.setComponents();
		
	}
	
	
}
