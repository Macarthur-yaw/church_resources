package com.example.church_resources.services;

import com.example.church_resources.dto.UserInputDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public String saveSubscriber(UserInputDto userInputDto);

}
