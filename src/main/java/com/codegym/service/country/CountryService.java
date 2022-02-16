package com.codegym.service.country;

import com.codegym.model.Country;
import com.codegym.repository.ICityRepository;
import com.codegym.repository.ICountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService{
    @Autowired
    ICountryRepository countryRepository;

    @Override
    public List<Country> getAll() {
        return (List<Country>) countryRepository.findAll();
    }
}
