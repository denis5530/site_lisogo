package com.example.sweater.repos;

import com.example.sweater.domain.POP3user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageRepo extends CrudRepository<POP3user, Long> {

    List<POP3user> findByLogin(String login);


}
