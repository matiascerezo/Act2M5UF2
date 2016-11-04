
package Herencias;

public class Operario extends Empleado {
 
    private float horesExtras;
    private final int PRECIO_HORES_EXTRES = 20;

    public Operario(String nom, float nomina, float horesExtres) {
        super(nom, nomina);
        this.horesExtras = horesExtras;
        super.setNomina(nomina + (horesExtras * PRECIO_HORES_EXTRES));
    }

    public float getHoresExtres() {
        return horesExtras;
    }

    public void setHoresExtras(float horesExtras) {
        this.horesExtras = horesExtras;
    }
}
