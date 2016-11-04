
package Treballadors;

public class Treballador {
    
    public static final int DIRECTOR = 0;
    public static final int SUBDIRECTOR = 0;
    private final int tipusTreballador;
    private final float Nomina;
    private final float horesExtras;

    public Treballador( int tipusTreballador, float Nomina, float horesExtras) throws DatosIncorrectos {
        if (Nomina <= 0 ||horesExtras < 0) {
            throw new DatosIncorrectos();
        }        
        this.tipusTreballador = tipusTreballador;
        this.Nomina = Nomina;
        this.horesExtras = horesExtras;
    }

    public int getTipusTreballador() {
        return tipusTreballador;
    }

    public float getNomina() {
        return Nomina;
    }

    public float getHoresExtres() {
        return horesExtras;
    }
    
    
    
    
}

