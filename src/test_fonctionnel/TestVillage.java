package test_fonctionnel;

import personnages.Gaulois;
import personnages.Village;

public class TestVillage {
    public static void main(String[] args) {
        
        
        //d.1
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);
        
        //d.2
        Gaulois gaulois = village.trouverVillageois(30);
        
        //d.3
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        
        //d.4
        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
       
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);
        
        //e
        village.afficherVillage();
        
        //f
        abraracourcix.sePresenter(); 
        asterix.sePresenter();      

        // gaulois sans village 
        Gaulois doublepolemix = new Gaulois("Doublepolémix", 4);
        doublepolemix.sePresenter(); 
        
        //g.1 
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        
        //g.2 
        village.afficherVillage();
        
        //g.3 (déjà créé plus haut)


        //g.4 
        abraracourcix.sePresenter();
        asterix.sePresenter(); 
        doublepolemix.sePresenter();  
        obelix.sePresenter(); 
        
    }
}