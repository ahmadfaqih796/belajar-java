package spring.timesheet.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import spring.timesheet.dto.LoginDTO;
import spring.timesheet.model.User;

@RestController
@RequestMapping("/api")
public class PanggilController {

   private String strZ;
   // @GetMapping("/v1/contoh/1")
   // public String dataContoh(){
   //
   // String strContoh = ContohConfig.getFlagContoh();
   // String strContohLain = ContohConfig.getFlagContohLain();
   //
   // return "VALUE CONTOH : "+ strContoh +" -- VALUE CONTOH LAIN : "+
   // strContohLain;
   // }
   // @Value("${contoh.aja}")
   // private String strContohAja;

   @PostMapping("/contoh")
   public String save(@RequestBody User user) {
      // minimal 1 huruf kecil 1 huruf besar 1 angka 1 spesial karakter $_@!
      // panjang min 8 maks 16
      String strIp = "192.168.1.1";
      String[] strArr = strIp.split(".");
      int intIp = 0;
      if (strArr.length != 4) {
         for (int i = 0; i < strArr.length; i++) {
            intIp = Integer.parseInt(strArr[i]);
            if (intIp > 256 && intIp < 0) {

            }

         }

      }

      // ContohConfig.getFlagContoh()
      System.out.println(user.getAlamat());
      System.out.println(user.getEmail());
      System.out.println(user.getNama());
      // System.out.println(user.getAkses().getId());
      // System.out.println(user.getAkses().getNamaAkses());
      return user.getAlamat();
   }

   @PutMapping("/contoh/{id}/{page}/{nama}")
   public String update(
         @PathVariable(value = "nama") String strNama,
         @PathVariable(value = "id") Long id,
         @PathVariable(value = "page") Integer page,
         @RequestBody User user,
         @RequestParam(value = "p1") String strP1,
         @RequestParam(value = "p2") String strP2) {
      System.out.println(strNama);
      System.out.println(id);
      System.out.println(page);
      System.out.println("===================");
      System.out.println(user.getAlamat());
      System.out.println(user.getEmail());
      System.out.println(user.getNama());
      // System.out.println(user.getAkses().getId());
      // System.out.println(user.getAkses().getNamaAkses());
      System.out.println("===================");
      System.out.println(strP1);
      System.out.println(strP2);

      return user.getAlamat();
   }

   @DeleteMapping("/contoh/{id}")
   public String delete() {
      return null;
   }

   @GetMapping("/contoh")
   public String findAll() {
      System.out.println("KESINI");
      return null;
   }

   @GetMapping("/contoh/{id}")
   public String findById() {
      return null;
   }

   @GetMapping("/contoh/export")
   public String export() {
      return null;
   }

   @GetMapping("/contoh/template")
   public String getTemplate() {
      return null;
   }

   /** disini */
   @PostMapping("/contoh/import")
   public String contohImport(@Valid @RequestBody LoginDTO loginDTO) {
      return null;
   }
}