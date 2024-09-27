package spring.timesheet.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class ParentEntity {
   @Id
   private int id;

   @Column(unique = true)
   private String name;

   /** modified when migration */
   @Column(length = 15, nullable = false)
   private String namaParent;

   private String active;

   @OneToMany(mappedBy = "parentEntity", cascade = CascadeType.PERSIST)
   private List<ChildEntity> child;

   public String getNamaParent() {
      return namaParent;
   }

   public void setNamaParent(String namaParent) {
      this.namaParent = namaParent;
   }

   public String getActive() {
      return active;
   }

   public void setActive(String active) {
      this.active = active;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
