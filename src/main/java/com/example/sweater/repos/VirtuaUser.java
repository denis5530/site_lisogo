package com.example.sweater.repos;

import com.example.sweater.domain.VirtualUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface VirtuaUser extends JpaRepository<VirtualUser, Long> {

    List<VirtualUser> findById(long id);

}

