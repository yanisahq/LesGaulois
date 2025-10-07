package personnage;


public class Gaulois {
	private String nom;
	private int force;
	// effet de la potion (1 = pas d'effet)
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Gaulois " + nom + " : ";
	}

	@Override
	public String toString() {
		return nom;
	}

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		int forceCoup = (force * effetPotion) / 3;
		romain.recevoirCoup(forceCoup);
		if (effetPotion > 1) {
			effetPotion = Math.max(1, effetPotion - 1);
		}
	}

	public void boirePotion(int puissance) {
		if (puissance <= 0) return;
		this.effetPotion = puissance;
	}

	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		System.out.println(asterix); 
	}
}
