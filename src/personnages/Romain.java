package personnages;

import objets.Equipement;

public class Romain {
    private String nom;
    private int force;
    private Equipement[] equipements = new Equipement[2]; 
    private int nbEquipement = 0; 

    public Romain(String nom, int force) {
        this.nom = nom;
        this.force = force;
        assert isInvariantVerified() : "force négative à la création";
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "« " + texte + "»");
    }

    private String prendreParole() {
        return "Le romain " + nom + " : ";
    }

    public void recevoirCoup(int forceCoup) {
        // PRÉCONDITION 
        assert forceCoup > 0 : "Précondition violée : forceCoup doit être positive";
        int ancienneForce = force;
        
        force -= forceCoup;
        if (force > 0) {
            parler("Aïe");
        } else {
            force = 0;
            parler("J'abandonne...");
        }
        
        // POSTCONDITION 
        assert force <= ancienneForce : "Postcondition violée : la force n'a pas diminué";
        assert isInvariantVerified() : "force négative après recevoirCoup";
    }
    
    private boolean isInvariantVerified() {
        return force >= 0;
    }
    
    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 2:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
                
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    ajouterEquipement(equipement);
                }
                break;
                
            case 0:
                ajouterEquipement(equipement);
                break;
                
            default:
                System.out.println("Erreur : nombre d'équipements invalide");
        }
    }

    private void ajouterEquipement(Equipement equipement) {
        equipements[nbEquipement] = equipement;
        nbEquipement++;
        System.out.println("Le soldat " + nom + " s'équipe avec un " + equipement + ".");
    }
}