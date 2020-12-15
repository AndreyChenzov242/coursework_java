package edu.javavt18.service;

import edu.javavt18.dao.CarBrandDAO;
import edu.javavt18.model.CarBrand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * JPA implementation for CarBrandService.
 */

@Service("carBrandJpaService")
@Transactional(readOnly=false, value = "jpaTransactionManager")
public class CarBrandJpaServiceImpl implements CarBrandService {
    @Autowired
    @Qualifier("getCarBrandJpaDAO")
    private CarBrandDAO carBrandDAO;

    /**
     * Selects all CarBrands from the database.
     * @return CarBrand list from the database.
     */

    public List<CarBrand> list() {
        return carBrandDAO.list();
    }

    /**
     * Get single CarBrand item by itemId from database.
     * @param itemId to get from the database.
     * @return CarBrand from the database.
     */

    public CarBrand get(int itemId) {
        return carBrandDAO.get(itemId);
    }

    /**
     * Saves CarBrand to the database by adding or updating it.
     * @param item to save in the database.
     */

    public void saveOrUpdate(CarBrand item) {
        carBrandDAO.saveOrUpdate(item);
    }

    /**
     * Deletes itemId from database.
     * @param itemId to delete in the database.
     */

    public void delete(int itemId) {
        carBrandDAO.delete(itemId);
    }
}