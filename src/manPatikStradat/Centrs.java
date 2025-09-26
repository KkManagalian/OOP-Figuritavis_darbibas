package manPatikStradat;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import kakisi.minkuTante;

public class Centrs {

	static String[] objektuPogas= {"Centrs", "Četrstūris", "Aplis", "Trijstūris", "Atgriezties"};
	static ArrayList<Figuras> centraObjekti=new ArrayList<>();
	static ArrayList<Cetrustruris> cetraObjekti=new ArrayList<>();
	static ArrayList<Aplisss> aplaaObjekti=new ArrayList<>();
	static ArrayList<Trijsturis> trisObjekti=new ArrayList<>();
	
	public static void main(String[] args) {
	/*	
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
	*/	
	
		int izvele,poga;
	
		do {
			izvele=minkuTante.skaitlaParbaude("Ko vēlaties darīt?\n"
					+ "0-Apturēt\n"
					+ "1-Izveidot objektu\n"
					+ "2-Aplūkot objektu\n"
					+ "3-Izsaukt metodi", 0,3);
			if(izvele==-1) {
				izvele=0;
			}
			
			switch(izvele) {
			
			case 0:
				JOptionPane.showMessageDialog(null, "Programma apturēta!","Info",JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case 1:
				GoatIzveide.izveidotObjektu();
				break;
			}		
		}while(izvele!=0);
	}

}
