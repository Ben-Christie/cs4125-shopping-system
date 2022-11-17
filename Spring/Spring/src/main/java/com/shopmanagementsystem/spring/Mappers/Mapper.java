package com.shopmanagementsystem.spring.Mappers;

public interface Mapper<DTO, Entity> {
    DTO entityToDTO(Entity entity);
    Entity DTOToEntity(DTO dto);
}
