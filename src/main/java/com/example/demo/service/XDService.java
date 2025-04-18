package com.example.demo.service;

import com.example.demo.dto.Categoria;
import com.example.demo.entity.Category;
import com.example.demo.mapper.POOXMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XDService {

    // Inyectar el mapper
    private final POOXMapper pooxMapper;

    @Autowired
    public XDService(POOXMapper pooxMapper) {
        this.pooxMapper = pooxMapper;
    }

   public Categoria getAll() {
        Category category = new Category();
        category.setIdCategory("1");
        category.setName("Category 1");

        return pooxMapper.getCategoria(category);
    }

}
