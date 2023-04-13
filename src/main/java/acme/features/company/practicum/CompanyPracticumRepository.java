
package acme.features.company.practicum;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.course.Course;
import acme.entities.practicum.Practicum;
import acme.entities.practicumSession.PracticumSession;
import acme.framework.repositories.AbstractRepository;
import acme.roles.Company;

@Repository
public interface CompanyPracticumRepository extends AbstractRepository {

	@Query("select p from Practicum p where p.company.id = :companyId")
	Collection<Practicum> findPracticumByCompanyId(int companyId);

	@Query("select p from Practicum p where p.id = :id")
	Practicum findPracticumById(int id);

	@Query("select c from Company c where c.id = :id")
	Company findCompanyById(int id);

	@Query("select c from Course c where c.id = :id")
	Course findCourseById(int id);

	@Query("select c from Course c")
	Collection<Course> findAllCourses();

	@Query("select ps from PracticumSession ps where ps.practicum.id = :id")
	Collection<PracticumSession> findPracticumSessionsByPracticumId(int id);
}
