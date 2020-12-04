package edu.javavt18.service;

import edu.javavt18.model.CarBrand;
import java.util.List;

public interface CarBrandService {

    void saveOrUpdate(CarBrand item);

    void delete(int itemId);

    CarBrand get(int itemId);

    List<CarBrand> list();
}