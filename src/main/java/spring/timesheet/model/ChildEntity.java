package spring.timesheet.model;

import jakarta.persistence.*;

@Entity
public class ChildEntity {

   @Id
   private int id;

   private String namaChild;

   @ManyToOne
   private ParentEntity parentEntity;

}