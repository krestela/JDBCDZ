package hibernate.service;

import hibernate.model.City;

import java.util.List;

public interface CityDAO {
    City getById(int id);

    City add(City city);

    List<City> getAllCity();

    City updateCity(City city);
}
