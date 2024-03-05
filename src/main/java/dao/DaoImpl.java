package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements  IDao{
    @Override
    public double getData() {
        return 80 * 2.5;
    }
}
