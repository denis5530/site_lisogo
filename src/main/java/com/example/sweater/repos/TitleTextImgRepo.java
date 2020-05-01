package com.example.sweater.repos;

import com.example.sweater.domain.Slider;
import com.example.sweater.domain.TitleTextImg;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TitleTextImgRepo extends CrudRepository<TitleTextImg, Long> {
    List<TitleTextImg> findById(String id);
    List<TitleTextImg> findAll();
}
