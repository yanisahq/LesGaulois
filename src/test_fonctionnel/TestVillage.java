package test_fonctionnel;

import personnages.Gaulois;
import personnages.Village;

public class TestVillage {
    public static void main(String[] args) {
        System.out.println("=== TP2 - Le village des Gaulois ===\n");
        
        // Cr�er le chef
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        
        // Cr�er le village
        Village village = new Village("Village des Irr�ductibles", 30, abraracourcix);
        
        // Test trouverVillageois(30) - ne doit pas lever d'exception
        System.out.println("=== Test trouverVillageois(30) ===");
        Gaulois gaulois = village.trouverVillageois(30);
        System.out.println("R�sultat : " + gaulois + " (aucune exception lev�e)");
        
        // Cr�er et ajouter Ast�rix
        System.out.println("\n=== Ajout d'Ast�rix ===");
        Gaulois asterix = new Gaulois("Ast�rix", 8);
        village.ajouterVillageois(asterix);
        System.out.println("Ast�rix ajout� au village !");
        
        // Tests trouverVillageois
        System.out.println("\n=== Tests trouverVillageois ===");
        System.out.print("Villageois n�1 : ");
        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
        
        System.out.print("Villageois n�2 : ");
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);
        
        // e. Afficher le village
        System.out.println("\n=== Affichage du village ===");
        village.afficherVillage();
        
        // g. Ajouter Ob�lix
        System.out.println("\n=== Ajout d'Ob�lix ===");
        Gaulois obelix = new Gaulois("Ob�lix", 25);
        village.ajouterVillageois(obelix);
        System.out.println("Ob�lix ajout� au village !");
        
        // Afficher le village mis � jour
        System.out.println("\n=== Village mis � jour ===");
        village.afficherVillage();
        
        // g. Cr�er DoublePol�mix (sans village)
        System.out.println("\n=== Cr�ation de DoublePol�mix (sans village) ===");
        Gaulois doublePolemix = new Gaulois("DoublePol�mix", 4);
        
        // Appeler sePresenter sur tous
        System.out.println("\n=== Pr�sentations des Gaulois ===");
        System.out.println("1. Le chef :");
        abraracourcix.sePresenter();
        
        System.out.println("2. Un habitant du village :");
        asterix.sePresenter();
        
        System.out.println("3. Un autre habitant :");
        obelix.sePresenter();
        
        System.out.println("4. Un gaulois sans village :");
        doublePolemix.sePresenter();
        
        System.out.println("\n=== Fin du test ===");
    }
