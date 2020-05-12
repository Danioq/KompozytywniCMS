package io.kompozytywni.repository;

import io.kompozytywni.model.KompozytywniUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<KompozytywniUser, Long> {
}
