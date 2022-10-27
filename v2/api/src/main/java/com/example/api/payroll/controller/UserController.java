package com.example.api.payroll.controller;
import com.example.api.payroll.entity.UserModel;
import com.example.api.payroll.exception.UserNotFoundException;
import com.example.api.payroll.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
class UserController {
        @Autowired
        private final UserRepo repository;

    UserController(UserRepo repository) {
        this.repository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/users")
    List<UserModel> all() {
        return repository.findAll();
    }

    // end::get-aggregate-root[]

    @PostMapping("/user")
    UserModel newUser(@RequestBody UserModel newUser) {
        return repository.save(newUser);
    }

    // Single item
    @GetMapping("/user/{id}")
    UserModel one(@PathVariable Long id) {
        return repository.findById(id) //
                .orElseThrow(() -> new UserNotFoundException(id));
    }


    @PutMapping("/user/{id}")
    UserModel replaceUser(@PathVariable Long id, @RequestBody UserModel newUser) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newUser.getName());
                    employee.setEmail(newUser.getEmail());
                    employee.setPhone(newUser.getPhone());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
