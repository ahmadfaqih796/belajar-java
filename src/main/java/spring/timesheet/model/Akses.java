package spring.timesheet.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Akses {

   private int id;

   @JsonProperty("nama_akses")
   private String namaAkses;

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getNamaAkses() {
      return namaAkses;
   }

   public void setNamaAkses(String namaAkses) {
      this.namaAkses = namaAkses;
   }
}
