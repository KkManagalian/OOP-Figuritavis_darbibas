package manPatikStradat;

import javax.swing.JOptionPane;

import kakisi.minkuTante;

public class GoatIzveide {

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
		
		case 0:
			x=minkuTante.skaitlaParbaude("Ievadi centra punkta x koordinātes", -100, 100);
			y=minkuTante.skaitlaParbaude("Ievadi centra punkta y koordinātes", -100, 100);
			Centrs.centraObjekti.add(new Figuras(x,y));
		
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
				break;
			
			case"Centra punkts un malas":
				CenPNr=0;
				//CenPNr=CenPIzvele();
				p=minkuTante.skaitlaParbaude("Ievadi četrstūra platumu", 1, 100);
				a=minkuTante.skaitlaParbaude("Ievadi četrstūra augstumu", 1, 100);
				Centrs.cetraObjekti.add(new Cetrustruris(Centrs.centraObjekti.get(CenPNr), p, a));
				break;
			}
			break;
		
		
		
		
		}
	}
	
}
