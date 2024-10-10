package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        //Injection des dependances par instanciation statique => new (couplage fort)
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl(dao);
        // metier.setDao(dao); // Injection de dependances
        System.out.println("Resultat = "+metier.calcul());
    }
}
