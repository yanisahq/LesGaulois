package test_fonctionnel;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;
import objets.Chaudron;

public class TestGaulois {
    public static void main(String[] args) {
        // 1.1
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        Gaulois obelix = new Gaulois("Ob�lix", 16);

        // 1.2
        asterix.parler("Bonjour Ob�lix.");
        obelix.parler("Bonjour Ast�rix. �a te dirait d'aller chasser des sangliers ?");
        asterix.parler("Oui, tr�s bonne id�e.");

        // 3.3
        Romain minus = new Romain("Minus", 6);
        System.out.println("Dans la for�t " + asterix + " et " + obelix + " tombent nez � nez sur le romain " + minus + ".");

        for (int i = 0; i < 3; i++) {
            asterix.frapper(minus);
        }

        // 4.5
        Romain brutus = new Romain("Brutus", 14);
        Chaudron chaudron = new Chaudron();
        Druide panoramix = new Druide("Panoramix", 2, chaudron);

        panoramix.fabriquerPotion(4, 3);
        panoramix.booster(obelix);
        panoramix.booster(asterix);

        for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }
    }
}