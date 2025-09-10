public class MeineBibliothek {
    public static void main(String[] args) {
        // Bibliothek erstellen
        Bibliothek stadtbibliothek = new Bibliothek("Stadtbibliothek Zürich");
        
        // Bücher erstellen (Buch-Objekte)
        Buch buch1 = new Buch("Java ist auch eine Insel", "Christian Ullenboom");
        Buch buch2 = new Buch("Clean Code", "Robert C. Martin");
        Buch buch3 = new Buch("Design Patterns", "Gang of Four");
        
        // Bücher zur Bibliothek hinzufügen (Bibliothek ruft Buch-Methoden auf)
        stadtbibliothek.buchHinzufuegen(buch1);
        stadtbibliothek.buchHinzufuegen(buch2);
        stadtbibliothek.buchHinzufuegen(buch3);
        
        // Alle Bücher anzeigen
        stadtbibliothek.alleBuecherAnzeigen();
        
        // Bücher ausleihen (Main ruft Buch-Methoden auf)
        buch1.ausleihen();
        buch2.ausleihen();
        
        System.out.println();
        stadtbibliothek.alleBuecherAnzeigen();
        
        // Buch zurückgeben
        buch1.zurueckgeben();
        
        // Buch über Bibliothek suchen (Bibliothek ruft Buch-Methoden auf)
        System.out.println("&#x1f50d; Suche nach 'Clean Code':");
        Buch gefunden = stadtbibliothek.buchSuchen("Clean Code");
        if (gefunden != null) {
            gefunden.info();
        } else {
            System.out.println("Buch nicht gefunden!");
        }
        
        System.out.println();
        stadtbibliothek.statistik();
    }
}