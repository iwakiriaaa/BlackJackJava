package mainGame;

import dealer.Dealer;
import player.Player;

public class MainGameBJ {
	private static String[] cardList = new String[52];
	
	public static void main(String[] args) {
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		for (;;) {
			for (;;) {
				//カードのリストは1つのみ存在する
				cardList = createCardList();
				
				//山札から2枚カードを引く。
				//プレイヤーとディーラのインスタンスに、引いたカードの情報を渡す。
				player.setFirstCard(player.randomCard());
				player.setSecondCard(player.randomCard());
				dealer.setFirstCard(dealer.randomCard());
				dealer.setSecondCard(dealer.randomCard());
				
				//乱数値を実際のカードの値に交換する
				player.numExchange(player.getFirstCard());
				player.numExchange(player.getSecondCard());
				dealer.numExchange(dealer.getFirstCard());
				dealer.numExchange(dealer.getSecondCard());
				
				//引いたカードをコンソールに表示する。プレイヤーは1枚目のみ表示。
				System.out.println("1枚目のプレイヤーのカード： " + cardList[player.getFirstCard()]);
				System.out.println("2枚目のプレイヤーのカード： " + cardList[player.getSecondCard()]);
				//System.out.println("2枚目のプレイヤーのカード： " + "???");
				System.out.println(player.getSumNum());
				System.out.println("1枚目のディーラーのカード： " + cardList[dealer.getFirstCard()]);
				System.out.println("2枚目のディーラーのカード： " + cardList[dealer.getSecondCard()]);
				System.out.println(dealer.getSumNum());
				
				
				
				
				
				break;
			}
			break;
		}
	}
	
	public static String[] createCardList() {
		final String[] cardPattern = {"スペード", "ハート", "ダイヤ", "クラブ"};
		final String[] cardNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		int count = 0;
		String[] cardList = new String[52];
		
		for (int i = 0; i < cardPattern.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				cardList[count++] = cardPattern[i] + "の" + cardNum[j];
			}
		}
		return cardList;
	}
}
