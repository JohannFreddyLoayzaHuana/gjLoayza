package ILP.jLoayza.controller;

import ILP.jLoayza.Entity.Direccion;
import ILP.jLoayza.Entity.Estudiante;
import ILP.jLoayza.Entity.Persona;
import ILP.jLoayza.services.IDireccionServices;
import ILP.jLoayza.services.IEstudianteServices;
import ILP.jLoayza.services.IPersonaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public abstract class PruebController {

    @Autowired
    private IPersonaServices personaServices;
    private IEstudianteServices EstudianteServices;
    private IDireccionServices DireccionServices;

    @GetMapping("/listaPersona")
    public List<Persona> listaEscuelas(){return this.personaServices.listarPersonas();}

    @GetMapping("/BuscarEstudiantePorCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){return this.EstudianteServices.obtenerEstudiantePorCodigo(codigo);
    }

    @GetMapping("/ObtenerDireccionDeEstudiante")
    public Direccion ObtenerDireccionDeEstudianteByCodigo(@RequestParam String codigo){return this.DireccionServices.ObtenerDireccionDeEstudiante(codigo);
    }
}
