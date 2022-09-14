package com.example.bosonit63.services;

import com.example.bosonit63.model.HumanObject;
import com.example.bosonit63.model.helloWorldObject;

public interface Iservices {

     public helloWorldObject createObject(int id, String content);

     public HumanObject createHuman (int ID, String name);
}
