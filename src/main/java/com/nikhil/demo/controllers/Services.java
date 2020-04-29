package com.nikhil.demo.controllers;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Services {

    List<Schema> Schema_Data = new ArrayList(
            Arrays.asList(new Schema(1, "nikhil", "kumar", 21,
                            "https://localhost:8080/list", "kasthurinikhilkumar13@gmail.com"),
                    new Schema(2, "vishnu", "preetham", 18, "kgjnjgndndndgnh", "bknbbj@gmail.com")
            )
    );
    public List<Schema> GetData(){
        return Schema_Data;
    }
    public Schema GetSelectedData(int id){
//        for(int  i = 0; i<Schema_Data.size();i++){
//            Schema t = Schema_Data.get(i);
//            if(t.getId() == id){
//                return Schema_Data.get(i);
//            }
//            else{
//                return null;
//            }
//        }
//        return null;
        //it will return the topic from the topics class which topic.id is equal to id
        return Schema_Data.stream().filter( t -> t.getId()== id).findFirst().get();
    }
}