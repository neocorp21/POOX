package com.example.demo.mapper;

import com.example.demo.dto.Categoria;
import com.example.demo.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-04-17T22:45:15-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 22.0.1 (Oracle Corporation)"
)
@Component
public class POOXMapperImpl implements POOXMapper {

    @Override
    public Categoria getCategoria(Category category) {
        if ( category == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setId( category.getIdCategory() );
        categoria.setNombre( category.getName() );

        return categoria;
    }
}
