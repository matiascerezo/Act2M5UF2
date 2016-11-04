
package Herencias;

public class MainClass {

    public static void main(String[] args) {
        
        Empleado[] emps = new Empleado[2];
        emps[0] = new Director("Directivo 0", 2300F);
        emps[1] = new Operario("Operario 0", 1950F, 20F);
        for (int i = 0; i < emps.length; i++) {
            System.out.println("Salario " + emps[i].getNom() + ": " + emps[i].getNomina());
        }
    }
    
}
