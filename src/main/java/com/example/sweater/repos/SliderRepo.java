package com.example.sweater.repos;


import com.example.sweater.domain.POP3user;
import com.example.sweater.domain.Rules;
import com.example.sweater.domain.Slider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


public interface SliderRepo extends CrudRepository<Slider, Long>{
    List<Slider> findById(String id);
    List<Slider> findAll();
}
