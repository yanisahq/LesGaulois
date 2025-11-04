package personnages;

public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, Gaulois chef, int nbHabitantsMax) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[nbHabitantsMax];
        chef.setVillage(this);
    }

    public String getNom() {
        return nom;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(this);
        } else {
            System.out.println("Le village est plein, impossible d'ajouter " + gaulois.getNom());
        }
    }

    public Gaulois trouverVillageois(int numVillageois) {
        int index = numVillageois - 1;
        
        if (index >= 0 && index < nbVillageois) {
            return villageois[index];
        } else {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
    }
    
    public void afficherVillage() {
        
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        
        for (int i = 0; i < nbVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
    
 
}