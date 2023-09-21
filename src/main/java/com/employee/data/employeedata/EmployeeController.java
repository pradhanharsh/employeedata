package com.employee.data.employeedata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {

 @Autowired
 private EmployeeService employeeService;

 @PostMapping("/submitForm")
 public void submitForm(@RequestBody EmployeeFormData formData) {
     employeeService.processFormData(formData);
 }
}
