package com.example.spring.store;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("api/stores")
@RestController
public class StoreController {
    private final StoreService storeService;


    public StoreController(StoreService storeservice) {
        this.storeService = storeservice;
    }
    @PostMapping("")
    public String saveStore(@RequestBody Store store){
        storeService.saveStore(store);
        return storeService.toString()+"저장되었습니다";
    }

    @GetMapping("")
    public List<Store> findAll(){
        return storeService.findAll();
    }

    @GetMapping(value = "",params = "id")
    public Optional<Store> findOneById(@RequestParam Long id){
        return storeService.findOneById(id);
    }
}
