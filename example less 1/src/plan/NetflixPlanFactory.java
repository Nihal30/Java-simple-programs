package plan;

public class NetflixPlanFactory {
	public NetflixPlan getPlan(String plan) {
		if (plan==null) {
			return null;
		}
		
		if(plan.equalsIgnoreCase("basic")) {
			return new Basic();
		}
		else if (plan.equalsIgnoreCase("standard")) {
			return new Standard();
			
		}
		else if (plan.equalsIgnoreCase("primium")){
			return new Primium();
		}
		return null;
	}
	

}
