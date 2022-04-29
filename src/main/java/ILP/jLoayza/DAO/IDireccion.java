package ILP.jLoayza.DAO;

import ILP.jLoayza.Entity.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDireccion extends JpaRepository<Direccion, Long> {
    Direccion findBycodigo_Postal(String codigo_Postal);

    @Query("SELECT d FROM direccion d WHERE d.codigo_Postal = ?1")
    Direccion obtenerDireccionPorCodigopostal(String codigo_Postal);

    @Query("SELECT d FROM direccion d WHERE d.codigo_Postal = :codigo_Postal")
    Direccion obtenerEscuelaPorParam(@Param("codigo_Postal") String codigo_Postal);
}
