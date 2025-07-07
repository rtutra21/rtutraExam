package edu.javaDigitalCaf.rtutra.repository;

import edu.javaDigitalCaf.rtutra.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    List<User> findByAgeGreaterThanEqualOrderByFirstNameAsc (Integer age);
}
