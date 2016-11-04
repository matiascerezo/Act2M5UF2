package Treballadors;

public class CostPersonal {

    /**
     * Li passem a treballador l'array "treballadors" i comprova si el tipus de
     * treballador correspon a "DIRECTOR" o a "SUBDIRECTOR" i si el tipus es
     * igual a algun d'aquest tipus, fa el calcul del costFinal, sumant-li la
     * nomina al costFinal.
     *
     * Sino, agafa la nomina del treballador i li afegeix les hores extres (les
     * multiplica per 20 per obtenir les hores en diners). Després retorna el
     * cost final.
     *
     * @param treballadors
     * @return
     * @throws Treballadors.DatosIncorrectos
     */
    public static float CostDelPersonal(Treballador treballadors[]) throws DatosIncorrectos {

        float costFinal = 0;
        int dinersHoraExtra = 20;

        Treballador treballador;

        for (int i = 0; i < treballadors.length; i++) {

            treballador = treballadors[i];

            int nomina = (int) treballador.getNomina();
            int horesExtra = (int) treballador.getHoresExtres();
            int tipus = treballador.getTipusTreballador();

            if (treballador.getNomina() < 0 || treballador.getHoresExtres() < 0) {
                throw new DatosIncorrectos();
            }
            if (esDirectorOesSubdirector(tipus)) {
                costFinal = calculCostFinal(costFinal, nomina);
            } else if (treballador.getTipusTreballador() > 1) {
                costFinal = calculCostFinalExtra(costFinal, nomina, horesExtra, dinersHoraExtra);
            } else {
                throw new DatosIncorrectos();
            }
        }

        return costFinal;
    }

    /**
     * Comprova si es director o subdirector
     *
     * @param tipus
     * @return
     */
    public static boolean esDirectorOesSubdirector(int tipus) {
        return tipus == Treballador.DIRECTOR || tipus == Treballador.SUBDIRECTOR;
    }

    /**
     * Calcula el cost final sense hores extras
     *
     * @param costFinal
     * @param nomina
     * @return
     */
    public static float calculCostFinal(float costFinal, int nomina) {
        return costFinal += nomina;
    }

    /**
     * Calcula el cost final amb hores extras
     *
     * @param costFinal
     * @param nomina
     * @param horesExtra
     * @param dinersHoraExtra
     * @return
     */
    public static float calculCostFinalExtra(float costFinal, int nomina, int horesExtra, int dinersHoraExtra) {
        return costFinal += (nomina + (horesExtra * dinersHoraExtra));

    }

    static Object costDelPersonal(Treballador[] treballadors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}