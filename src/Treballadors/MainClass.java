package Treballadors;

import java.text.DecimalFormat;

public class MainClass {

    public static void main(String[] args) throws DatosIncorrectos {

        Treballador[] treballadors = new Treballador[4];
        for (int i = 0; i < treballadors.length; i++) {
            treballadors[i] = new Treballador(0,
                    2000, 60);
        }
        System.out.println("Cost total del personal: "
                + new DecimalFormat("#.##").format(CostPersonal.costDelPersonal(treballadors)));
    }
}
