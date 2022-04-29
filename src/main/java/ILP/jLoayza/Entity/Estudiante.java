package ILP.jLoayza.Entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 10)
    private String serie;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Persona persona;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, Persona persona) {
        this.codigo = codigo;
        this.serie = serie;
        this.persona = persona;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
