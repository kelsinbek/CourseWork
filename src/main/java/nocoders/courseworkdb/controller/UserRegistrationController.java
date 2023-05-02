package nocoders.courseworkdb.controller;

//package net.javaguides.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import nocoders.courseworkdb.service.UserService;
import nocoders.courseworkdb.dto.UserRegistrationDto;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {


    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }


    @ModelAttribute("user")
    public UserRegistrationDto UserRegistrationDto()
    {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm()
    {
        return "registration";
    }

//	@PostMapping
//	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto)
//	{
//		userService.save(registrationDto);
//		return "redirect:/index";
//	}

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto, HttpServletRequest request) {
        userService.save(registrationDto);
        try {
            request.login(registrationDto.getEmail(), registrationDto.getPassword());
        } catch (ServletException e) {
            e.printStackTrace();
        }
        return String.format("redirect:/%s/",registrationDto.getEmail());
    }


}

