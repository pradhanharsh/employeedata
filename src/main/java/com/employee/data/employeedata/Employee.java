package com.employee.data.employeedata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String baseLocation;
    private String reportingToBaseLocation;
    private String explanation;
    private String certifications;
    private String benchStatus;
    private String attendingBenchCalls;
    private String currentWork;
    private boolean trainingActivity;
    private String otherActivity;
    private String activityCompletionDate;
    private String interviewPreparedness;
    private String updatingDigiDashboard;
    private boolean previousProject;
    private String projectName;
    private String role;
    private String taggingStartDate;
    private String taggingEndDate;
    private String projectManagerName;
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getReportingToBaseLocation() {
		return reportingToBaseLocation;
	}
	public void setReportingToBaseLocation(String reportingToBaseLocation) {
		this.reportingToBaseLocation = reportingToBaseLocation;
	}
	public String getExplanation() {
		return explanation;
	}
	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	public String getCertifications() {
		return certifications;
	}
	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}
	public String getBenchStatus() {
		return benchStatus;
	}
	public void setBenchStatus(String benchStatus) {
		this.benchStatus = benchStatus;
	}
	public String getAttendingBenchCalls() {
		return attendingBenchCalls;
	}
	public void setAttendingBenchCalls(String attendingBenchCalls) {
		this.attendingBenchCalls = attendingBenchCalls;
	}
	public String getCurrentWork() {
		return currentWork;
	}
	public void setCurrentWork(String currentWork) {
		this.currentWork = currentWork;
	}
	public boolean isTrainingActivity() {
		return trainingActivity;
	}
	public void setTrainingActivity(boolean trainingActivity) {
		this.trainingActivity = trainingActivity;
	}
	public String getOtherActivity() {
		return otherActivity;
	}
	public void setOtherActivity(String otherActivity) {
		this.otherActivity = otherActivity;
	}
	public String getActivityCompletionDate() {
		return activityCompletionDate;
	}
	public void setActivityCompletionDate(String activityCompletionDate) {
		this.activityCompletionDate = activityCompletionDate;
	}
	public String getInterviewPreparedness() {
		return interviewPreparedness;
	}
	public void setInterviewPreparedness(String interviewPreparedness) {
		this.interviewPreparedness = interviewPreparedness;
	}
	public String getUpdatingDigiDashboard() {
		return updatingDigiDashboard;
	}
	public void setUpdatingDigiDashboard(String updatingDigiDashboard) {
		this.updatingDigiDashboard = updatingDigiDashboard;
	}
	public boolean isPreviousProject() {
		return previousProject;
	}
	public void setPreviousProject(boolean previousProject) {
		this.previousProject = previousProject;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getTaggingStartDate() {
		return taggingStartDate;
	}
	public void setTaggingStartDate(String taggingStartDate) {
		this.taggingStartDate = taggingStartDate;
	}
	public String getTaggingEndDate() {
		return taggingEndDate;
	}
	public void setTaggingEndDate(String taggingEndDate) {
		this.taggingEndDate = taggingEndDate;
	}
	public String getProjectManagerName() {
		return projectManagerName;
	}
	public void setProjectManagerName(String projectManagerName) {
		this.projectManagerName = projectManagerName;
	}
	public String getProjectManagerEmail() {
		return projectManagerEmail;
	}
	public void setProjectManagerEmail(String projectManagerEmail) {
		this.projectManagerEmail = projectManagerEmail;
	}
	public String getReleaseReason() {
		return releaseReason;
	}
	public void setReleaseReason(String releaseReason) {
		this.releaseReason = releaseReason;
	}
	public String getTechnologies() {
		return technologies;
	}
	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	private String projectManagerEmail;
    private String releaseReason;
    private String technologies;
    private String remarks;

    // Getters and setters for the above properties

    // ...
}
