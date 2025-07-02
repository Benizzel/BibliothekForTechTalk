// Datei: Buch.java
public class Buch {
    private String titel;
    private String autor;
    private boolean ausgeliehen;
    
    public Buch(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
        this.ausgeliehen = false;
    }
    
    public void ausleihen() {
        if (!ausgeliehen) {
            ausgeliehen = true;
            System.out.println("&#x1f4da; '" + titel + "' wurde ausgeliehen.");
        } else {
            System.out.println("❌ '" + titel + "' ist bereits ausgeliehen!");
        }
    }
    
    public void zurueckgeben() {
        if (ausgeliehen) {
            ausgeliehen = false;
            System.out.println("✅ '" + titel + "' wurde zurückgegeben.");
        } else {
            System.out.println("❌ '" + titel + "' war nicht ausgeliehen!");
        }
    }
    
    public void info() {
        String status = ausgeliehen ? "ausgeliehen" : "verfügbar";
        System.out.println("&#x1f4d6; " + titel + " von " + autor + " - Status: " + status);
    }
    
    // Getter
    public String getTitel() { return titel; }
    public String getAutor() { return autor; }
    public boolean istAusgeliehen() { return ausgeliehen; }
}
