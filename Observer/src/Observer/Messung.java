
public class Messung {
	
	Heizung h = new Heizung();
	
	public void setMesswert() {
		
		h.neuerMesswert((int) (Math.random() * 100));
	}
	
	
}
