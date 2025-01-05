package com.example.church_resources.services;

import com.example.church_resources.dto.UserInputDto;
import com.example.church_resources.dto.UserOutputDto;
import com.example.church_resources.entity.Subscribe;
import com.example.church_resources.repository.UserRepository;

public class UserServicesImpl implements UserService {
Subscribe subscribe;
    UserRepository userRepository;

    @Override
    public UserOutputDto saveSubscriber(UserInputDto userInputDto) {
        subscribe=Subscribe.builder().emailAddress(userInputDto.getEmail()).build();
return  userRepository.save(subscribe).stream();



    }
}
