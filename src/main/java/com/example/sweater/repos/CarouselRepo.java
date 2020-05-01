package com.example.sweater.repos;

import com.example.sweater.domain.Carousel;
import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface CarouselRepo extends JpaRepository<Carousel, Long> {
  //  List<Carousel> findByid(int id);

}