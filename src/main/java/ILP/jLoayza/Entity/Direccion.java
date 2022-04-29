package ILP.jLoayza.Entity;

import javax.persistence.*;

@Entity
@Table(name = "direccion")
@PrimaryKeyJoinColumn(referencedColumnName="idpersona")
public class Direccion extends Persona {

    @Column(name = "calle", length = 10, nullable = false)
    private String calle;

    @Column(name = "ciudad", length = 10, nullable = false)
    private String ciudad;

    @Column(name = "estado", length = 10, nullable = false)
    private String estado;

    @Column(name = "codigo_Postal", length = 10, nullable = false)
    private String codigoPostal;

    @Column(name = "pais", length = 10, nullable = false)
    private String pais;

    @OneToOne(cascade=CascadeType.ALL)//one-to-one
    @JoinColumn(name="idpersona")
    private Direccion direccion;

    public Direccion() {
    }

    public Direccion(String calle, String ciudad, String estado, String codigoPostal, String pais, Direccion direccion) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.pais = pais;
        this.direccion = direccion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
