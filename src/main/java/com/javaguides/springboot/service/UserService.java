package com.javaguides.springboot.service;

import com.javaguides.springboot.dto.UserLocationDTO;
import com.javaguides.springboot.model.User;
import com.javaguides.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired //injeção de dependencia
    private UserRepository userRepository;

    public List<UserLocationDTO> getAllUsersLocation(){
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertEntityToDto(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLongitude(user.getLocation().getLatitude());
        return userLocationDTO;


    }


}
