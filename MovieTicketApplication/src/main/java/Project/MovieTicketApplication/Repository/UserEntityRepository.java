package Project.MovieTicketApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Project.MovieTicketApplication.Model.UserEntity;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity, Long>{

}
