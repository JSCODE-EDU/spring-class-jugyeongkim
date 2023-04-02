package com.example.spring.store;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StoreService {
    private final StoreRepository storeRepository;


    public StoreService(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    public List<Store> findAll(){
        return storeRepository.findAll();
    }

    public Optional<Store> findOneById(Long id) {
        return storeRepository.findById(id);
    }

    public void saveStore(Store store) {
        storeRepository.save(store);
    }
}
