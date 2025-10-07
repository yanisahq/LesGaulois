package test_fonctionnel;

import personnage.Gaulois;
import personnage.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 16);

		
		asterix.parler("Bonjour Ob�lix.");
		obelix.parler("Bonjour Ast�rix. �a te dirait d'aller chasser des sangliers ?)");
		asterix.parler("Oui tr�s bonne id�e.");

		
		Romain minus = new Romain("Minus", 6);
		System.out.println("Dans la for�t " + asterix + " et " + obelix + " tombent nez � nez sur le romain " + minus.getNom() + ".");

	
		for (int i = 0; i < 3; i++) {
			asterix.frapper(minus);
		}
	}
}
