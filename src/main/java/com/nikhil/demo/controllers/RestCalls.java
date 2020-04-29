package com.nikhil.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
import java.util.List;

@RestController("/All")
public class RestCalls {
    @Autowired
    Services services;
    @RequestMapping
    public List<Schema> get_All_Data(){
        return services.GetData();
    }
    @RequestMapping("/{foo}")
    public Schema Get_Data_By_Id(@PathVariable("foo") int id){
        return services.GetSelectedData(id);
    }

}
