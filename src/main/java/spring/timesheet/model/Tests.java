package spring.timesheet.model;

// import java.security.Timestamp;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parent")
public class Tests {

   @Id
   private Long id;

   private String myFieldName;

   @Column(name = "create_date", columnDefinition = "TIMESTAMP")
   private Timestamp agentId;

   @Column(name = "hello", columnDefinition = "TIMESTAMP")
   private Timestamp hello;

   @Column(name = "kkkkk", columnDefinition = "TIMESTAMP")
   private Timestamp kkkkk;

}
