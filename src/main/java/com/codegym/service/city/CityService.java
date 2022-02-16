package com.codegym.service.city;

import com.codegym.model.City;
import com.codegym.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService{
    @Autowired
    ICityRepository cityRepository;

    @Override
    public List<City> getAll() {
        return (List<City>) cityRepository.findAll();
    }

    @Override
    public void save(City city) {
        cityRepository.save(city);
    }

    @Override
    public void delete(int id) {
        cityRepository.deleteById(id);
    }

    @Override
    public City findCityById(int id) {
        return cityRepository.findById(id).get();
    }
}
