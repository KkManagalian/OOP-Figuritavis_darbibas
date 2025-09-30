package manPatikStradat;

import java.util.ArrayList;

public class IzveidotieObjekti {

	static String izvadit(ArrayList<Figuras> centruSaraksts) {
		String str="";
		for(int i=0; i<centruSaraksts.size();i++) {
			str += i+".objekts\n "+centruSaraksts.get(i).izvaditKoordinates();
		}
		
		
		return str;
	}
	
	static String izvaditC(ArrayList<Cetrustruris> cetruSaraksts) {
		String str="";
		for(int i=0; i<cetruSaraksts.size();i++) {
			str += i+".objekts\n "+cetruSaraksts.get(i).izvaditCetrInfo();
		}
		return str;
	}
		
	static String izvaditA(ArrayList<Aplisss> aplaaObjekti) {
			String str="";
			for(int i=0; i<aplaaObjekti.size();i++) {
				str += i+".objekts\n "+aplaaObjekti.get(i).IzvaditAplaInfo();
			}
			return str;
	}
	
	static String izvaditT(ArrayList<Trijsturis> trisObjekti) {
				String str="";
				for(int i=0; i<trisObjekti.size();i++) {
					str += i+".objekts\n "+trisObjekti.get(i).izvaditTrijsturaInfo();
				}
				return str;
	}

	
}
