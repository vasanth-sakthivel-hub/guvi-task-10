package com.example.employee.controller;

import com.example.employee.model.Employees;
import com.example.employee.repository.EmployeesRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Optional;


@Controller
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeesController {

//    @Autowired
    private EmployeesRepository employeeRepo;

    @GetMapping("/index")
    public String indexPage(Model model) {
//        Employees employees=
        model.addAttribute("employees", new Employees());
        return "index";
    }

    @PostMapping("/addEmployee")
    @ResponseBody
    public String addEmployee(@ModelAttribute("employees") Employees employees, Model model) {
        employeeRepo.save(employees);
        model.addAttribute("employeeSdetails",employees);
        return "add";
    }

    @GetMapping
    @ResponseBody
    public List<Employees> defaultEmployees() {
        return employeeRepo.findAll();
    }





    @GetMapping("/displayAll")
//    @ResponseBody
    public String getAllEmployees(Model model) {
        List<Employees> alluser= employeeRepo.findAll();
        model.addAttribute("totalemployeesDetails",alluser);
        return "displayAllusers";
    }

    @GetMapping("/display/{id}")
//    @ResponseBody
    public String getEmployeeById(@PathVariable("id") String id, Model model) {
            Optional<Employees> singleuser=employeeRepo.findById(id);
            model.addAttribute("singleuserdata",singleuser.orElse(null));
        return "singleuserhtm";
    }
}

