package FacultyManagmentSystem.co.in.demo.controllers;

import FacultyManagmentSystem.co.in.demo.models.Faculty;
import FacultyManagmentSystem.co.in.demo.repositories.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins ="*")
public class MyController {

    @Autowired
    FacultyRepository facultyRepository;

    @GetMapping("/faculties")
    public List<Faculty> getListOfFaculties(){
        return facultyRepository.findAll();

    }
}
