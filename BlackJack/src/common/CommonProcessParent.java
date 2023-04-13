package common;

public class CommonProcessParent implements CommonMethodParent{
	protected String[][] cardList = new String[4][13];
	
	{
		for (int i = 0; i < cardList.length; i++) {
			for (int j = 0; j < cardList[i].length; j++) {
				cardList[i][j] = cardPattern[i] + "の" + cardNum;
			}
		}
	}
	
	public CommonProcessParent() {
		
	}
	
	@Override
	public int randomCard() {
		return 0;
	}
}
