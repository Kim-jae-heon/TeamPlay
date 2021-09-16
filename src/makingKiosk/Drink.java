package makingKiosk;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Drink extends Kiosk implements ActionListener{

	String[] drink = {"아이스티","레몬티","카모마일","포도주스","딸기주스","멜론주스","사과주스","바나나주스","망고주스"};
	int[] drinkMoney = {3000,3500,4000,4500,5000,6000,6500,7000,7500};
	
	
	public Drink() {
		
		
		 this.setComponents();
			

			//우중단 주문내역
//					textAOL.setText("주문 내역");
//					textBucket.setText("");
//					textTQ.setText("총 수량 : " + count);
//					textTP.setText("총 가격 : " + sum);
//			
//					buttonCof.setText("커피");
//					buttonBev.setText("음료수");
//					buttonDes.setText("디저트");
//					
//					//좌하단 9개 버튼에 들어갈 텍스트
//					button1.setText("아이스티");
//					button2.setText("레몬티");
//					button3.setText("카모마일");
//					button4.setText("포도주스");
//					button5.setText("딸기주스");
//					button6.setText("멜론주스");
//					button7.setText("사과주스");
//					button8.setText("바나나주스");
//					button9.setText("망고주스");
//					
//					//우하단 주문하기, 처음으로 및 clear
//					buttonOrder.setText("주문하기");
//					buttonClear.setText("처음으로");
//					buttonTrash.setText("모두 없애기");
			
		}


		
	
	

	
	
	
	
	@Override
	protected void setPanels() {

		super.setPanels();
	}
	
	
	

	@Override
	protected void setComponents() {
		

		//우중단 주문내역
//				textAOL.setText("주문 내역");
//				textBucket.setText("");
//				textTQ.setText("총 수량 : " + count);
//				textTP.setText("총 가격 : " + sum);
//		
//				buttonCof.setText("커피");
//				buttonBev.setText("음료수");
//				buttonDes.setText("디저트");
//				
//				//좌하단 9개 버튼에 들어갈 텍스트
//				super.button1.setText("아이스티");
//				super.button2.setText("레몬티");
//				super.button3.setText("카모마일");
//				super.button4.setText("포도주스");
//				super.button5.setText("딸기주스");
//				super.button6.setText("멜론주스");
//				super.button7.setText("사과주스");
//				super.button8.setText("바나나주스");
//				super.button9.setText("망고주스");
//				
//				//우하단 주문하기, 처음으로 및 clear
//				buttonOrder.setText("주문하기");
//				buttonClear.setText("처음으로");
//				buttonTrash.setText("모두 없애기");
		
	}





	
	
	
	
	
	
	
	
}
