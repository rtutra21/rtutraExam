package edu.javaDigitalCaf.rtutra.repository;

import edu.javaDigitalCaf.rtutra.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}
