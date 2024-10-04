package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; //couplage faible
    @Override
    public double calcul(){
        double d = dao.getData();
        double res = d*13;
        return res;
    }

    /*
    Pour injecter dans la varibale dao
    un objet de type dao= objet d'une classe qui implemente l'interface IDao
    */

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
