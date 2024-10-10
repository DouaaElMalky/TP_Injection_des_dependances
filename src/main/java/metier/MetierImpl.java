package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; //couplage faible

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp * 540 / Math.cos(tmp * Math.PI);
        return res;
    }

    /*
    Pour injecter dans la varibale dao
    un objet de type dao= objet d'une classe qui implemente l'interface IDao
    */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
