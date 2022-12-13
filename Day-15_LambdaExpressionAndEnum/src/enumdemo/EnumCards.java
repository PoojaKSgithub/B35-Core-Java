package enumdemo;

public enum EnumCards implements CardDemo {
	HEART,CLUB,DIAMOND,SPADES;
	@Override

	
	public void accept() {
		System.out.println("Selected shape in the cards are:"+this);
	}

}
