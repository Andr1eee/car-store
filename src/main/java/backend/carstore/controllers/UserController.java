package backend.carstore.controllers;


import backend.carstore.dtos.UserDto;
import backend.carstore.models.User;
import backend.carstore.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public User save(@RequestBody UserDto userDto){
        User user = new User();

        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhoneNumber(userDto.getPhoneNumber());

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody UserDto userDto){
        User user = userRepository.findByEmail(userDto.getEmail());
        if(user.getPassword().equals(userDto.getPassword())){
            return user;
        }
        return null;
    }

}
