package personnages;


import objets.Chaudron;

public class Druide {
    private String nom;
    private int force;
    private Chaudron chaudron;

    public Druide(String nom, int force, Chaudron chaudron) {
        this.nom = nom;
        this.force = force;
        this.chaudron = chaudron;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "� " + texte + "�");
    }

    private String prendreParole() {
        return "Le druide " + nom + " : ";
    }

    public void fabriquerPotion(int quantite, int forcePotion) {
        chaudron.remplirChaudron(quantite, forcePotion);
        parler("J'ai concoct� " + quantite + " doses de potion magique. Elle a une force de " + forcePotion + ".");
    }

    public void booster(Gaulois gaulois) {
        if (gaulois.getNom().equals("Ob�lix")) {
            parler("Non, Ob�lix Non !... Et tu le sais tr�s bien !");
        } else if (chaudron.resterPotion()) {
            int forcePotion = chaudron.prendreLouche();
            gaulois.boirePotion(forcePotion);
            parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
        } else {
            parler("D�sol� " + gaulois.getNom() + " il n'y a plus une seule goutte de potion.");
        }
    }
}