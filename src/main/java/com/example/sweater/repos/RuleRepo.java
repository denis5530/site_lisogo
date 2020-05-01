package com.example.sweater.repos;

import com.example.sweater.domain.Rules;
import com.example.sweater.domain.VirtualUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RuleRepo extends CrudRepository<Rules, Long> {
    List<Rules> findByLogin(String login);

    }


