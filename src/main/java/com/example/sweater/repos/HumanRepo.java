package com.example.sweater.repos;

import com.example.sweater.domain.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HumanRepo extends CrudRepository<Human, Long> {
    List<Human> findById(String id);
    List<Human> findAll();
}
