package ca.mcgill.ecse321.tutor4all.model;

import java.util.Set;
import java.sql.Date;
import java.sql.Time;
import java.util.HashSet;

public class AvaliableSession {
   private Time startTime;
   
   public void setStartTime(Time value) {
      this.startTime = value;
   }
   
   public Time getStartTime() {
      return this.startTime;
   }
   
   private Time endTime;
   
   public void setEndTime(Time value) {
      this.endTime = value;
   }
   
   public Time getEndTime() {
      return this.endTime;
   }
   
   private Date day;
   
   public void setDay(Date value) {
      this.day = value;
   }
   
   public Date getDay() {
      return this.day;
   }
   
   /**
    * <pre>
    *           0..*     1..*
    * AvaliableSession ------------------------- Tutor
    *           avaliableSession        &lt;       tutor
    * </pre>
    */
   private Set<Tutor> tutor;
   
   public Set<Tutor> getTutor() {
      if (this.tutor == null) {
         this.tutor = new HashSet<Tutor>();
      }
      return this.tutor;
   }
   
   /**
    * <pre>
    *           0..*     1..1
    * AvaliableSession ------------------------- TutoringSystem
    *           avaliableSession        &lt;       tutoringSystem
    * </pre>
    */
   private TutoringSystem tutoringSystem;
   
   public void setTutoringSystem(TutoringSystem value) {
      this.tutoringSystem = value;
   }
   
   public TutoringSystem getTutoringSystem() {
      return this.tutoringSystem;
   }
   
   private Integer avaliableSessionID;
   
   public void setAvaliableSessionID(Integer value) {
      this.avaliableSessionID = value;
   }
   
   public Integer getAvaliableSessionID() {
      return this.avaliableSessionID;
   }
   
   }
