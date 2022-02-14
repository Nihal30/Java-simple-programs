package plan;

public abstract class NetflixPlan {
	protected int Price;
	
	abstract int getPrice();
	public int getFinalAmount(int month) {
		return Price * month;
	}

}
