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
				
			case 2:
				poga=JOptionPane.showOptionDialog(null, "Kuras figuras aplūkot?", "Izvēle", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE, null, objektuPogas, objektuPogas[0]);
				
				
				switch(poga) {
				case 0:
					if(centraObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav centra punktu!","Brīdinājums!",JOptionPane.WARNING_MESSAGE);
					break;
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvadit(centraObjekti),"Centra punkti",JOptionPane.PLAIN_MESSAGE);
					break;
					
				case 1:
					if(cetraObjekti.size()<1) {
						JOptionPane.showMessageDialog(null, "Nav četrstūra lielumi!","Brīdinājums!",JOptionPane.WARNING_MESSAGE);
					break;
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditC(cetraObjekti),"Četrstūra lielumi",JOptionPane.PLAIN_MESSAGE);
					break;
				
				
				case 2:
					if(aplaaObjekti.size()<1) {
					JOptionPane.showMessageDialog(null, "Nav apļa lielumi!","Brīdinājums!",JOptionPane.WARNING_MESSAGE);
					break;
					}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditA(aplaaObjekti),"Apļa lielumi",JOptionPane.PLAIN_MESSAGE);
					break;
				
			
				case 3:
					if(trisObjekti.size()<1) {
					JOptionPane.showMessageDialog(null, "Nav trijstūra lielumi!","Brīdinājums!",JOptionPane.WARNING_MESSAGE);
					break;
				}
					JOptionPane.showMessageDialog(null, IzveidotieObjekti.izvaditT(trisObjekti),"Trijstūra lielumi",JOptionPane.PLAIN_MESSAGE);
					break;
				}
				
				break;
			
				
				
			}		
		}while(izvele!=0);
	}

}
