package naderdeghaili.u5w3d3hw.esercizio3;

public abstract class Ufficiale {
    private Ufficiale next;
    private int stipendio;

    public Ufficiale(int stipendio) {
        this.stipendio = stipendio;
    }

    public void setNext(Ufficiale next) {
        this.next = next;
    }

    public void verificaStipendio(int importo) {
        if (stipendio >= importo) {
            System.out.println("posso essere un: " + getClass().getSimpleName());
        }
        if (next != null) {
            next.verificaStipendio(importo);
        } else {
            System.out.println("non sono nessuno");
        }
    }
}
