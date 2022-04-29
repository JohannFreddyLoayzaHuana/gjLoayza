package ILP.jLoayza.DAO;

import ILP.jLoayza.Entity.Persona;
import ILP.jLoayza.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProfesorDao extends JpaRepository<Profesor,Long> {
}
