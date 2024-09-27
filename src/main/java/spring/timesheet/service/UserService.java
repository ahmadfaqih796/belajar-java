package spring.timesheet.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import spring.timesheet.core.IService;
import spring.timesheet.model.User;

/**
 * inventory platform code = INV
 * code module user = 07
 * fe -> 001 - 010
 * fv
 * 0107FV005
 */
@Service
public class UserService implements IService<User> {

   // @Autowired
   // UserRepo userRepo;
   @Override
   public ResponseEntity<Object> save(User user) {// 001-010
      // userRepo.save(user);
      return null;
   }

   @Override
   public ResponseEntity<Object> delete(Long id, User user) {// 011-020
      return null;
   }

   @Override
   public ResponseEntity<Object> findAll() {
      return null;
   }

   @Override
   public ResponseEntity<Object> findById(Long id) {
      return null;
   }

   @Override
   public ResponseEntity<Object> update(Long id, User user) {
      return null;
   }
}