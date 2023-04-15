package common;

public class CommonProcessParent implements CommonMethodParent{
	private int firstCard, secondCard, sumNum = 0;

	public CommonProcessParent() {}

	
	@Override
	public int getFirstCard() {
		return firstCard;
	}

	
	@Override
	public void setFirstCard(int firstCard) {
		this.firstCard = firstCard;
	}

	
	@Override
	public int getSecondCard() {
		return secondCard;
	}

	
	@Override
	public void setSecondCard(int secondCard) {
		this.secondCard = secondCard;
	}
	
	
	@Override
	public int getSumNum() {
		return sumNum;
	}
	
	
	@Override
	public int randomCard() {
		int rnd = (int)(Math.random() * 51 + 0);
		
		return rnd;
	}
	
	
	@Override
	public void numExchange(int num) {
		int afterNum = numEx10To13(num);
		
		//1.合計を計算する。
		sumCardNum(afterNum);
		
		//2.ブラックジャックを判定する
		
		//3.1枚目か2枚目にAがきたら、両方の合計値を出す
		
		//4.ヒット/スタンドをプレイヤーが選ぶ。スタンドを選択した時点でプレイヤー側は終了、6に行く
		
		//5.プレイヤーがスタンド、21、バーストになるまで山札からカードを引く
		
		//6.ディーラーが山札からカードを引き、17以上の値になるまで続ける（バースト、bjも含む）。
		
		//7.判定する（メインメソッドとかで）
	}
	
	
	//乱数を1～13の数字に変換し、11から13までの値のカードを10に変更
	@Override
	public int numEx10To13(int num) {
		//0~51までの乱数値を、カードの実際の値として扱うため+1加算
		num += 1;
		
		for (int i = num; i > 13; i-=13) {num -=13;}
		
		if (num >= 11 && num <= 13) num = 10;
		
		return num;
	}
	
	
	//最後に、引いた値を足す
	@Override
	public void sumCardNum(int num) {
		sumNum += num;
	}
}
