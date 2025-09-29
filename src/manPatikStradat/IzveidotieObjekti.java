package manPatikStradat;

import java.util.ArrayList;

public class IzveidotieObjekti {

	static String izvadit(ArrayList<Figuras> centruSaraksts) {
		String str="";
		for(int i=0; i<centruSaraksts.size();i++) {
			str += i+"0.objekts "+centruSaraksts.get(i).izvaditKoordinates();
		}
		
		
		return str;
	}
	
}
