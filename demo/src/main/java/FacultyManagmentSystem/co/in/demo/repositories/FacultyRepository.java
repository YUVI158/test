package FacultyManagmentSystem.co.in.demo.repositories;

import FacultyManagmentSystem.co.in.demo.models.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
