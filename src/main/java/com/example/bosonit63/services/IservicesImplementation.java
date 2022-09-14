package com.example.bosonit63.services;

import com.example.bosonit63.model.HumanObject;
import com.example.bosonit63.model.helloWorldObject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IservicesImplementation implements Iservices {

    public helloWorldObject createObject(int id, String content) {
        helloWorldObject helloWorld = new helloWorldObject(id,content);
        return helloWorld;
    }

    @Override
    public HumanObject createHuman(int ID, String name) {
        HumanObject humOb = new HumanObject(ID, name);
        return humOb;
    }
}
