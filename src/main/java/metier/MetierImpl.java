package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    public MetierImpl(IDao iDao){
        this.dao = iDao;
    }
    IDao dao; // loose coupling
    @Override
    public double calculation() {
        double dummy = dao.getData();
        return dummy * 42;
    }

    // inject an object of a class that implements IDao

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
