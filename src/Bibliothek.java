// Datei: Bibliothek.java
import java.util.ArrayList;
import java.util.List;

public class Bibliothek {
    private String name;
    private List<Buch> buecher;
    
    public Bibliothek(String name) {
        this.name = name;
        this.buecher = new ArrayList<>();
    }
    
    public void buchHinzufuegen(Buch buch) {
        buecher.add(buch);
        System.out.println("➕ Buch hinzugefügt: " + buch.getTitel());
    }
    
    public void alleBuecherAnzeigen() {
        System.out.println(" === " + name + " ===");
        if (buecher.isEmpty()) {
            System.out.println("Keine Bücher vorhanden.");
        } else {
            for (Buch buch : buecher) {
                buch.info();
            }
        }
        System.out.println();
    }
    
    public Buch buchSuchen(String titel) {
        for (Buch buch : buecher) {
            if (buch.getTitel().equalsIgnoreCase(titel)) {
                return buch;
            }
        }
        return null;
    }
    
    public void statistik() {
        int verfuegbar = 0;
        int ausgeliehen = 0;
        
        for (Buch buch : buecher) {
            if (buch.istAusgeliehen()) {
                ausgeliehen++;
            } else {
                verfuegbar++;
            }
        }
        
        System.out.println("Statistik für " + name + ":");
        System.out.println("   Gesamt: " + buecher.size() + " Bücher");
        System.out.println("   Verfügbar: " + verfuegbar);
        System.out.println("   Ausgeliehen: " + ausgeliehen);
    }
}