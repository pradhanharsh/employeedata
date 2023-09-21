package com.employee.data.employeedata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void processFormData(EmployeeFormData formData) {
        Employee employee = new Employee();
        employee.setName(formData.getName());
        employee.setEmail(formData.getEmail());

        if(formData.getReportingToBaseLocation().equals("No")) {
            employee.setExplanation(formData.getExplanation());
        }

        if(formData.getTrainingActivity().equals("Yes")) {
            employee.setTrainingActivity(true);
            employee.setOtherActivity(formData.getOtherActivity());
            employee.setActivityCompletionDate(formData.getActivityCompletionDate());
        } else {
            employee.setTrainingActivity(false);
        }

        if(formData.getPreviousProject().equals("Yes")) {
            ProjectDetails projectDetails = formData.getProjectDetails();
            employee.setPreviousProject(true);
            employee.setProjectName(projectDetails.getProjectName());
            employee.setRole(projectDetails.getRole());
            employee.setTaggingStartDate(projectDetails.getTaggingStartDate());
            employee.setTaggingEndDate(projectDetails.getTaggingEndDate());
            employee.setProjectManagerName(projectDetails.getProjectManagerName());
            employee.setProjectManagerEmail(projectDetails.getProjectManagerEmail());
            employee.setReleaseReason(projectDetails.getReleaseReason());
            employee.setTechnologies(projectDetails.getTechnologies());
            employee.setRemarks(projectDetails.getRemarks());
        } else {
            employee.setPreviousProject(false);
        }


        employeeRepository.save(employee);
    }
}
