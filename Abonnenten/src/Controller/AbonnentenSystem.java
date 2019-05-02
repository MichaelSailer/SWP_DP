package Controller;

import java.util.ArrayList;

import Kanal.User;

public class AbonnentenSystem {
	ArrayList<User> abo = new ArrayList<>();
	String youtubeTitel;
	
	public String getYoutubeTitel() {
		return youtubeTitel;
	}
	public void setYoutubeTitel(String youtubeTitel) {
		this.youtubeTitel = youtubeTitel;
		noitfyAllUsers();
		
	}
	public void addAbonnent(User u) {
		abo.add(u);
	}
	public void noitfyAllUsers() {
		for(User u : abo) {
			u.update(getYoutubeTitel());
		}
	}
}
