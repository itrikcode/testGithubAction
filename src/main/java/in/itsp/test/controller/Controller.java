package in.itsp.test.controller;

import in.itsp.test.bean.Employee;
import in.itsp.test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    EmployeeService service;
    @RequestMapping(value = "/save",method = RequestMethod.POST,consumes = "application/json")
    public ResponseEntity<String> createEmployee(@RequestBody Employee e ){
       String s = service.save(e);
       return new ResponseEntity<>(s, HttpStatus.CREATED);
    }
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public ResponseEntity<List<String>> showAll( ){

        return new ResponseEntity<>(service.getAll(), HttpStatus.OK);
    }



}
