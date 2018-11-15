import java.util.ArrayList;

public class Heizung {
	S1 s1 = new S1();
	S2 s2 = new S2();
	S3 s3 = new S3();
	
	
	public void neuerMesswert(int Messwert) {
		s1.Weiterleitung(Messwert);
		s2.Weiterleitung(Messwert);
		s3.Weiterleitung(Messwert);
		
		
	}
	

}
