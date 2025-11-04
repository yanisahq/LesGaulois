package personnages;

public class Romain {
    private String nom;
    private int force;

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
}