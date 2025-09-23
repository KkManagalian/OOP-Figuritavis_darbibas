package manPatikStradat;

public class Aplisss {

	public Figuras punkts;
	public double radiuss;
	
	public Aplisss(Figuras p, double r) {
		punkts=p;
		radiuss=r;
	}
	
	public String IzvaditAplaInfo() {
		return "Radiuss: "+radiuss+"cm";
	}
	
	public String RinkaLinija() {
		double C=2*Math.PI*radiuss;
		return "Rinka linija ir: "+Math.round(C*100.0)/100.0+"cm";
	}
	
	public String RinkaLaukums() {
		double S=Math.PI*radiuss*2;
		return "Rinka laukums ir: "+Math.round(S*100.0)/100.0+"cm";
	}
}
