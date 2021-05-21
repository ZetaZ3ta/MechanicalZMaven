package Aplicacion.Modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Victor
 */
@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
public class Cliente {

    @Id
    @Column
    private String DNI;

    @Column
    private String Nombre;

    @Column
    private String Apellidos;

    @Column
    private String Direccion;

    @Column
    private int Telefono;

    @Column
    private Date Fecha_Nacimiento;

    @OneToMany
    @JoinColumn(name = "Dueño")
    private List<Moto> Motos;

    @OneToMany
    @JoinColumn(name = "Cliente")
    private List<Factura> Facturas;

    public Cliente(String DNI, String Nombre, String Apellidos, String Direccion, int Telefono, Date Fecha_Nacimiento, List<Moto> Motos, List<Factura> Facturas) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Motos = Motos;
        this.Facturas = Facturas;
    }

    public Cliente() {
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public List<Moto> getMotos() {
        return Motos;
    }

    public void setMotos(List<Moto> Motos) {
        this.Motos = Motos;
    }

    public List<Factura> getFactura() {
        return Facturas;
    }

    public void setFactura(List<Factura> Factura) {
        this.Facturas = Factura;
    }

    @Override
    public String toString() {
        return "Cliente{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", Motos=" + Motos + ", Factura=" + Facturas + '}';
    }

}
