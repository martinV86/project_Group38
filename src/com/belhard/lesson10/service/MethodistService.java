package com.belhard.lesson10.service;

import com.belhard.lesson10.model.staff.Methodist;
import com.belhard.lesson10.repository.MethodistRepository;

import java.util.List;

public class MethodistService {
    private MethodistRepository methodistRepository;

    public MethodistService(MethodistRepository methodistRepository) {
        this.methodistRepository = methodistRepository;
    }
    public void addMethodist(List<Methodist>newMethodist){
        System.out.println("addMethodist");
        newMethodist.forEach(methodist -> System.out.println(methodist.toString()));
    }
    public void removeMethodist(List<Methodist>removeMethodist){
        System.out.println("removeMethodist");
        removeMethodist.forEach(methodist -> System.out.println(methodist.toString()));
    }
}
