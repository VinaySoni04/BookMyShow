package com.June.BookMyShow.Services;

import com.June.BookMyShow.DTOs.RequestDTOs.UserRequestDTO;
import com.June.BookMyShow.DTOs.ResponseDTOs.UserResponseDTO;
import com.June.BookMyShow.Exceptions.UserNotFoundException;
import com.June.BookMyShow.Models.User;
import com.June.BookMyShow.Repository.UserRepository;
import com.June.BookMyShow.Transformers.UserTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public String addUser(UserRequestDTO userDTO) {
        User user= UserTransformer.convertDtoToEntity(userDTO);
        userRepository.save(user);
        return "User is added successfully!!";
    }

    public UserResponseDTO getOldestUser() throws UserNotFoundException {
        List<User> users=userRepository.findAll();
        int maxAge=0;
        User userAns=null;
        for(User user:users){
            if(user.getAge()>maxAge){
                maxAge= user.getAge();
                userAns=user;
            }
        }
        if (userAns==null)
            throw new UserNotFoundException("User not found");
        UserResponseDTO userResponseDTO=UserTransformer.convertEntityToDto(userAns);
        return userResponseDTO;
    }

    public List<User> getAllUsersGreaterThanAge(int age) throws UserNotFoundException{
        List<User> users=userRepository.findUserWithGreaterAge(age);
        if(users.size()==0)
            throw new UserNotFoundException("No user having age greater than a given age");
        return users;
    }
}
