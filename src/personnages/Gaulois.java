package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;
    private Village village;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public void setVillage(Village village) {
        this.village = village;
    }
    
    public Village getVillage() {
        return village;
    }

   
    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "� " + texte + "�");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
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
            effetPotion--;
        }
    }

    public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion;
    }
    
    public void sePresenter() {
        String message;
        if (village != null && village.getChef() == this) {
            message = "Bonjour, je m'appelle " + nom + ". Je suis le chef du village " + village.getNom() + ".";
        } else if (village != null) {
            message = "Bonjour, je m'appelle " + nom + ". J'habite le village " + village.getNom() + ".";
        } else {
            message = "Bonjour, je m'appelle " + nom + ". Je voyage de villages en villages.";
        }
        parler(message);
    }
}