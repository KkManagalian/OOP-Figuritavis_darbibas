package manPatikStradat;

public class Centrs {

	public static void main(String[] args) {
		
		Figuras centraP1 = new Figuras(-10,12);
		System.out.println(centraP1.izvaditKoordinates());
		centraP1.parvietot(5, -2);
		System.out.println(centraP1.izvaditKoordinates());
		
		
		Cetrustruris cetrsturis1 = new Cetrustruris();
		System.out.println(cetrsturis1.izvaditCetrInfo());
		
		System.out.println(cetrsturis1.punkts.izvaditKoordinates());
		
		Cetrustruris cetrsturis2 = new Cetrustruris(centraP1, 5 ,11);
		System.out.println(cetrsturis2.izvaditCetrInfo()+"\n"+
				cetrsturis2.punkts.izvaditKoordinates()+"\n"+
				cetrsturis2.CetrLaukums());
		
		Figuras punkts2 = new Figuras(5,23);
		Aplisss aplis1= new Aplisss(punkts2, 5);
		System.out.println(aplis1.IzvaditAplaInfo()+"\n"+
		aplis1.RinkaLaukums()+"\n"+
				aplis1.RinkaLinija());
	}

}
