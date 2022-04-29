package ILP.jLoayza.Entity;

import javax.persistence.*;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Profesor extends Persona {

    @Column(name = "salario", length = 15)
    private String salario;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Profesor profesor;

    public Profesor() {
    }

    public Profesor(String salario, Profesor profesor) {
        this.salario = salario;
        this.profesor = profesor;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
