
public class Salle {
	Heure heure;
	
	String nom;
	
	public Salle(String nom, Heure heure) {
		this.nom = nom;
		this.heure = new Heure (heure.getHeure(),heure.getMinute());
	}
	
	public String toString() {
		return "Salle : "+this.nom+" , heure : "+this.heure.toString();
	}
}
