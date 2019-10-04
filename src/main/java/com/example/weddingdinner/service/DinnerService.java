package com.example.weddingdinner.service;

import com.example.weddingdinner.model.Dinner;
import com.example.weddingdinner.repository.DinnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DinnerService {

    @Autowired
    private DinnerRepository dinnerRepository;

    public void create(Dinner dinner){
        dinnerRepository.save(dinner);
    }
}
