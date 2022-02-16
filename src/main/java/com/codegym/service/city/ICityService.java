package com.codegym.service.city;

import com.codegym.model.City;

import java.util.List;

public interface ICityService {
    List<City> getAll();
    void save(City city);
    void delete(int id);
    City findCityById(int id);
}
