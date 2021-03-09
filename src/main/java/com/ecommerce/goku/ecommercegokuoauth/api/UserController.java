//package com.ecommerce.goku.ecommercegokuoauth.api;
//
//import com.ecommerce.goku.ecommercegokuoauth.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(value = "/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService service;
//
//    @GetMapping("search")
//    public ResponseEntity findByEmail(@RequestParam String email) {
//        try {
//            return ResponseEntity
//                    .ok()
//                    .body(service.findByEmail(email));
//        } catch (IllegalArgumentException e) {
//            return ResponseEntity
//                    .status(HttpStatus.NOT_FOUND)
//                    .build();
//        }
//    }
//}
