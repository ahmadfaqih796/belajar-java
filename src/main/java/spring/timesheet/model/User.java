package spring.timesheet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/** ANOTASI JPA */
@Entity
public class User {
   @Id
   private int id;
   private String nama;
   private String alamat;
   private String email;
   private String password;
   private String username;
   // private Akses akses;

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNama() {
      return nama;
   }

   public void setNama(String nama) {
      this.nama = nama;
   }

   public String getAlamat() {
      return alamat;
   }

   public void setAlamat(String alamat) {
      this.alamat = alamat;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   // public Akses getAkses() {
   // return akses;
   // }
   //
   // public void setAkses(Akses akses) {
   // this.akses = akses;
   // }
}
