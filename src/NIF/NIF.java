
package NIF;


public class NIF {

    private String nif;

    private final char[] llista = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
        'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    private String missatge;
    int num = 0;
    String letra;
    String numero;
    char[] charnif;
    int dniMaxim = 9;
    int dniMinim = 8;

    /**
     * Constructor NIF
     *
     * @param nif
     */
    public NIF(String nif) {
        this.nif = nif;
    }

    /**
     * Comprova si el DNI és vàlid. Primer comprova la longitud del DNI i si es
     * correcte comprova que la lletra coincideixi amb la posició del l'array.
     */
    public void esValid(String nif) {

        letra = nif.substring(nif.length() - 1);
        numero = nif.substring(0, nif.length() - 1);

        // primer mirem que la cadena tingui 8 o 9 caràcters:
        if (!longitudDNI()) {
            missatge = "Format Incorrecte";
        } // Després mirem que el número sigui convertible a enter.
        else {
            try {
                num = Integer.parseInt(numero);

                if (comprovarLletra()) {
                    missatge = "NIF Vàlid";
                } else {
                    missatge = "NIF Invàlid";
                }
            } catch (NumberFormatException e) {
                missatge = "Format Incorrecte";
            }

        }
    }

    /**
     *Aquest mètode comprova que la longitud del DNI és correcte. Retorna true si es correcte sino un false.
     * @return
     */
    private boolean longitudDNI() {
        return nif.length() < dniMinim || nif.length() > dniMaxim;
    }

    /**
     * Aquest mètode comprova que la lletra del DNI és correcta. Retorna true si es correcte sino un false.
     *
     * @return
     */
    private boolean comprovarLletra() {
        int posicioLlista = num % llista.length;

        return !String.valueOf(llista[posicioLlista]).equals(letra);
    }
}
