package com.shopmanagementsystem.spring.Converter;

import com.shopmanagementsystem.spring.DTO.UserDTO;
import com.shopmanagementsystem.spring.Entity.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/*
Convert user dto <-> entity
 */
@Service
public class UserConverter {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO entityToDTO(User user){
        UserDTO userdto = new UserDTO();
        userdto = modelMapper.map(user, UserDTO.class);
        return userdto;
    }

    public User dtoToEntity(UserDTO userDTO){
        User user = new User();
        user = modelMapper.map(userDTO, User.class);
        return user;
    }
}
