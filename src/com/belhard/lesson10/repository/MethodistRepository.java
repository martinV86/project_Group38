package com.belhard.lesson10.repository;

import com.belhard.lesson10.model.staff.Methodist;

import java.util.ArrayList;
import java.util.List;

public class MethodistRepository {
    private List<Methodist>methodists=new ArrayList<>();
    public void removeMethodist(List<Methodist>removeMethodist){
        methodists.remove(removeMethodist);
    }
    public void addMethodist(List<Methodist>addMethodist){
        methodists.addAll(addMethodist);
    }

    public List<Methodist> getMethodists() {
        return methodists;
    }
}
