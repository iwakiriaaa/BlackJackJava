package common;

interface CommonMethodParent {
	final String[] cardPattern = {"スペード", "ハート", "ダイヤ", "クラブ"};
	final String[] cardNum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	
	//プレイヤーとディーラー共通
	abstract int randomCard();
	//bj
	//sum
	//hit
	//stand
	
	
	//プレイヤーのみ
	//1枚目は見せる
	//2枚目は見せない
	
	
	//ディーラーのみ
	//1枚目も2枚目も見せる
}
