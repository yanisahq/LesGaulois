package personnages; 

public class Village {
    private String nom;
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nbVillageois = 0;
    
    public Village(String nom, int nbHabitantsMax, Gaulois chef) {
        this.nom = nom;
        this.villageois = new Gaulois[nbHabitantsMax];
        this.chef = chef;
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
            System.out.println("Le village est plein !");
        }
    }
    
    public Gaulois trouverVillageois(int numVillageois) {
        if (numVillageois >= 1 && numVillageois <= nbVillageois) {
            return villageois[numVillageois - 1];
        } else {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
    }
    
    public void afficherVillage() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            if (villageois[i] != null) {
                System.out.println("- " + villageois[i].getNom());
            }
        }
    }
    
    public class TestVillage {
        public static void main(String[] args) {
            
            Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
            
            Village village = new Village("Village des Irréductibles", 30, abraracourcix);
            
            Gaulois gaulois = village.trouverVillageois(30);
            
            Gaulois asterix = new Gaulois("Astérix", 8);
            village.ajouterVillageois(asterix);
            
            
            gaulois = village.trouverVillageois(1);
            System.out.println(gaulois);  
            gaulois = village.trouverVillageois(2);
            System.out.println(gaulois); 
            
          
            System.out.println("Village d'Astérix : " + asterix.getVillage().getNom());
        }
    }
}

