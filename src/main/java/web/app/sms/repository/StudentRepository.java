package web.app.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import web.app.sms.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
