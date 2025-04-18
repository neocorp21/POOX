package com.example.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface POOXMapper {

    POOXMapper INSTANCE = Mappers.getMapper(POOXMapper.class);

    // Aquí puedes definir los métodos de mapeo que necesites
}
