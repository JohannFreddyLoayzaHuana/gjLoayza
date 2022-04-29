package ILP.jLoayza.DAO;

import ILP.jLoayza.Entity.Estudiante;
import ILP.jLoayza.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDao extends JpaRepository<Estudiante, Long> {

}
