package common;

interface CommonMethodParent {

	//プレイヤーとディーラー共通
	int randomCard();
	int getFirstCard();
	void setFirstCard(int firstCard);
	int getSecondCard();
	void setSecondCard(int secondCard);
	int getSumNum();
	void sumCardNum(int num);
	int numEx10To13(int num);
	void numExchange(int num);
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
