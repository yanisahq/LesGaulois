package test_fonctionnel;

import personnages.Gaulois;
import personnages.Village;

public class TestVillage {
    public static void main(String[] args) {
        System.out.println("=== TP2 - Le village des Gaulois ===\n");
        
        // Créer le chef
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        
        // Créer le village
        Village village = new Village("Village des Irréductibles", 30, abraracourcix);
        
        // Test trouverVillageois(30) - ne doit pas lever d'exception
        System.out.println("=== Test trouverVillageois(30) ===");
        Gaulois gaulois = village.trouverVillageois(30);
        System.out.println("Résultat : " + gaulois + " (aucune exception levée)");
        
        // Créer et ajouter Astérix
        System.out.println("\n=== Ajout d'Astérix ===");
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);
        System.out.println("Astérix ajouté au village !");
        
        // Tests trouverVillageois
        System.out.println("\n=== Tests trouverVillageois ===");
        System.out.print("Villageois n°1 : ");
        gaulois = village.trouverVillageois(1);
        System.out.println(gaulois);
        
        System.out.print("Villageois n°2 : ");
        gaulois = village.trouverVillageois(2);
        System.out.println(gaulois);
        
        // e. Afficher le village
        System.out.println("\n=== Affichage du village ===");
        village.afficherVillage();
        
        // g. Ajouter Obélix
        System.out.println("\n=== Ajout d'Obélix ===");
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        System.out.println("Obélix ajouté au village !");
        
        // Afficher le village mis à jour
        System.out.println("\n=== Village mis à jour ===");
        village.afficherVillage();
        
        // g. Créer DoublePolémix (sans village)
        System.out.println("\n=== Création de DoublePolémix (sans village) ===");
        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);
        
        // Appeler sePresenter sur tous
        System.out.println("\n=== Présentations des Gaulois ===");
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
