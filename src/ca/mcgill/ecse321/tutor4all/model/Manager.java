package ca.mcgill.ecse321.tutor4all.model;

import javax.persistence.Entity;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Id;

@Entity
public class Manager extends Person{
   private Set<SubjectRequest> subjectRequest;
   
   @OneToMany(mappedBy="manager" )
   public Set<SubjectRequest> getSubjectRequest() {
      return this.subjectRequest;
   }
   
   public void setSubjectRequest(Set<SubjectRequest> subjectRequests) {
      this.subjectRequest = subjectRequests;
   }
   
   private Set<Review> review;
   
   @OneToMany(mappedBy="manager" )
   public Set<Review> getReview() {
      return this.review;
   }
   
   public void setReview(Set<Review> reviews) {
      this.review = reviews;
   }
   
   private Set<Commission> commission;
   
   @OneToMany(mappedBy="manager" )
   public Set<Commission> getCommission() {
      return this.commission;
   }
   
   public void setCommission(Set<Commission> commissions) {
      this.commission = commissions;
   }
   
   private Integer managerID;

public void setManagerID(Integer value) {
    this.managerID = value;
}
@Id
public Integer getManagerID() {
    return this.managerID;
}
   private Set<Classroom> classroom;
   
   @OneToMany(mappedBy="manager" )
   public Set<Classroom> getClassroom() {
      return this.classroom;
   }
   
   public void setClassroom(Set<Classroom> classrooms) {
      this.classroom = classrooms;
   }
   
   }
