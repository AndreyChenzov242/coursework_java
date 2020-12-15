package edu.javavt18.service;

import edu.javavt18.dao.CarModelDAO;
import edu.javavt18.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * Hibernate implementation for  CarModelService.
 */

@Service("carModelHibernateService")
@Transactional(readOnly=false, value = "hibernateTransactionManager")
public class CarModelHibernateServiceImpl implements CarModelService {
    @Autowired
    @Qualifier("getCarModelHibernateDAO")
    private CarModelDAO carModelDAO;

    /**
     * Saves CarModel to the database by adding or updating it.
     * @param item to save in the database.
     */

    public void saveOrUpdate(CarModel item) {
        carModelDAO.saveOrUpdate(item);
    }

    /**
     * Deletes itemId from database.
     * @param itemId to delete in the database.
     */

    public void delete(int itemId) {
        carModelDAO.delete(itemId);
    }

    /**
     * Get single CarModel item by itemId from database.
     * @param itemId to get from the database.
     * @return CarModel from the database.
     */

    public CarModel get(int itemId) {
        return carModelDAO.get(itemId);
    }

    /**
     * Selects all CarModels from the database.
     * @return CarModel list from the database.
     */

    public List<CarModel> list() {
        return carModelDAO.list();
    }
}