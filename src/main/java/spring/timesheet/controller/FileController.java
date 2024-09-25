package spring.timesheet.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import spring.timesheet.util.FileUtility;

@RestController
@RequestMapping("file")
public class FileController {

   @PostMapping("/kirim-file")
   public String uploadFile(@RequestParam(value = "kiriman") MultipartFile file) {
      String strFileName = file.getOriginalFilename();
      try {
         FileUtility.saveFile("user-files", strFileName, file);
      } catch (IOException e) {
         throw new RuntimeException(e);
      }
      return strFileName;
   }

}
