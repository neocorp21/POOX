package com.example.demo.mapper;

import com.example.demo.dto.Categoria;
import com.example.demo.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
@Mapper(componentModel = "spring")

public interface POOXMapper {

    @Mapping(source = "idCategory", target = "id")
    @Mapping(source = "name", target = "nombre")
    Categoria getCategoria(Category category);


}


