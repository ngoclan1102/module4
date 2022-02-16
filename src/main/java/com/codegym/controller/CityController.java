package com.codegym.controller;

import com.codegym.model.City;
import com.codegym.model.Country;
import com.codegym.service.city.ICityService;
import com.codegym.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.rmi.MarshalledObject;

@RestController
public class CityController {
    @Autowired
    ICityService cityService;

    @Autowired
    ICountryService countryService;

    @GetMapping("/city")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("city",cityService.getAll());
        return modelAndView;
    }

    @GetMapping("/delete")
    public String delete(int id){
        cityService.delete(id);
        return "redirect:/city";
    }

    @GetMapping("/create")
    public ModelAndView showCreate(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("city",new City());
        modelAndView.addObject("country",countryService.getAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(City city,int idCountry){
        Country country = new Country();
        country.setIdCountry(idCountry);
        city.setCountry(country);
        cityService.save(city);
        return "redirect:/city";
    }

    @GetMapping("/edit")
    public ModelAndView showEdit(int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("city",cityService.findCityById(id));
        modelAndView.addObject("country",countryService.getAll());
        return modelAndView;
    }

 @GetMapping("/view")
    public ModelAndView showView(int id){
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("city",cityService.findCityById(id));
        return modelAndView;
    }

}
