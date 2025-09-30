package manPatikStradat;

public class Figuras {

	public int x, y;
	
	public Figuras (int x, int y) {
		this.x=x;
		this.y=y;
	}

	public String izvaditKoordinates() {
		return "Centra punkts atordas:\n x="+x+"\ny="+y;
	}
	
	
	public void parvietot (int koordX, int koordY) {
		x+=koordX;
		y+=koordY;
	}
	
}
