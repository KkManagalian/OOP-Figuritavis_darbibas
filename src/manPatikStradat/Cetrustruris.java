package manPatikStradat;

public class Cetrustruris {
	public double platums, augstums;
	public Figuras punkts;

	public Cetrustruris() {
	punkts=new Figuras(0, 0);
}
	
	public Cetrustruris(Figuras punkts, double p, double a) {
		this.punkts=punkts;
		platums=p;
		augstums=a;
	}
	
	public String izvaditCetrInfo() {
		return "\nPlatums: "+platums+"cm \nAugstums: "+augstums+"cm";
	}
	
	public double CetrLaukums() {
		double S = platums * augstums;
		return S;
	}
}
