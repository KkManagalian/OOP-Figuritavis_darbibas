package manPatikStradat;

import javax.swing.JOptionPane;

import kakisi.minkuTante;

public class GoatIzveide {

	static int CenPIzvele() {
		if(Centrs.centraObjekti.size()<1) {
			return -1;
		}
		
		int izvele = minkuTante.skaitlaParbaude(IzveidotieObjekti.izvadit(Centrs.centraObjekti),0,Centrs.centraObjekti.size()-1);
		
	return (izvele);
	}
	
	static void izveidotObjektu() {
		int x, y, CenPNr;
		double p, a;
		
		int izvele=JOptionPane.showOptionDialog(null, "Kuru objektu vieodt?","Izvēle", JOptionPane.YES_NO_CANCEL_OPTION
				,JOptionPane.QUESTION_MESSAGE,null,Centrs.objektuPogas,Centrs.objektuPogas[0]);
		if(izvele==-1) {
			izvele=0;
		}
		switch(izvele) {
		
		case 4:
			JOptionPane.showMessageDialog(null, "Atgriežas uz galveno, izvēli!", "Info", JOptionPane.INFORMATION_MESSAGE);
		break;
			
		case 0:
			x=minkuTante.skaitlaParbaude("Ievadi centra punkta x koordinātes", -100, 100);
			y=minkuTante.skaitlaParbaude("Ievadi centra punkta y koordinātes", -100, 100);
			if((x==-1||y==-1) && minkuTante.ievade==null) {
				JOptionPane.showMessageDialog(null, "Centra punkts netika izveidots!", "Brīdinājums",JOptionPane.WARNING_MESSAGE);
			break;
			}
			Centrs.centraObjekti.add(new Figuras(x,y));
			
			
			JOptionPane.showMessageDialog(null, "Centra punkts izveidots","Paziņojums",JOptionPane.INFORMATION_MESSAGE);
			break;
		
		case 1:
			String[] ceIzvelesVeids={"Noklusējums", "Centra punkts un malas"};
			
	String veids = (String)JOptionPane.showInputDialog(null,"Izvēlies, kuru konstruktoru izsaukt","Četrstūra izveide"
			,JOptionPane.QUESTION_MESSAGE,null,ceIzvelesVeids,ceIzvelesVeids[0]);		
			
			if(veids==null) {
			veids="Noklusējums";
			}
			
			switch(veids) {
			case"Noklusējums":
				Centrs.cetraObjekti.add(new Cetrustruris());
				JOptionPane.showMessageDialog(null, "Noklusējuma četrstūris izveidots","Paziņojums",JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case"Centra punkts un malas":
				CenPNr=CenPIzvele();
				if(CenPNr == -1) {
					JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
					break;
				}
				p=minkuTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
				a=minkuTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
				if(p==-1||a==-1) {
					JOptionPane.showMessageDialog(null, "Četrstūris netika izveidots!", "Brīdinājums", JOptionPane.WARNING_MESSAGE);
				}
				Centrs.cetraObjekti.add(new Cetrustruris(Centrs.centraObjekti.get(CenPNr), p, a));
				break;
			}
		break;
		
		case 2:
			CenPNr = CenPIzvele();
			if(CenPNr == -1) {
				JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
				break;
			}
			int r = minkuTante.skaitlaParbaude("Ievadi apļa rādiusu", 1, 100);
			Centrs.aplaaObjekti.add(new Aplisss(Centrs.centraObjekti.get(CenPNr), r));
			JOptionPane.showMessageDialog(null, "Aplis izveidots","Paziņojums",JOptionPane.INFORMATION_MESSAGE);
			break;
		
		case 3:
			CenPNr = CenPIzvele();
			if(CenPNr == -1) {
				JOptionPane.showMessageDialog(null, "Nav centra punkts ko izvēlēties!", "Kļūda", JOptionPane.ERROR_MESSAGE);
				break;
			}
			int m1 = minkuTante.skaitlaParbaude("Ievadi trijstūra 1.malās garumu", 1, 100);
			int m2 = minkuTante.skaitlaParbaude("Ievadi trijstūra 2.malās garumu", 1, 100);
			int m3 = minkuTante.skaitlaParbaude("Ievadi trijstūra 3.malās garumu", 1, 100);
			
			if(m1==-1||m2==-1||m3==-1) {
				break;
			}
			
			Centrs.trisObjekti.add(new Trijsturis(Centrs.centraObjekti.get(CenPNr), m1, m2, m3));
			JOptionPane.showMessageDialog(null, "Trijstūris izveidots","Paziņojums",JOptionPane.INFORMATION_MESSAGE);
			break;
		}
	}
	
}
