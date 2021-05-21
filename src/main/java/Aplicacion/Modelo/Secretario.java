package Aplicacion.Modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Victor
 */
@Entity
@Table
public class Secretario {

    @Id
    @Column
    private String DNI;

    @Column
    private String Nombre;

    @Column
    private String Apellidos;

    @Column
    private int Telefono;

    @Column
    private Date Fecha_Nacimiento;

    @ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "secretarios")
    private List<Proveedor> proveedores;

    @OneToMany
    @JoinColumn(name = "Secretario")
    private List<Factura> Facturas;

    public Secretario(String DNI, String Nombre, String Apellidos, int Telefono, Date Fecha_Nacimiento, List<Factura> Facturas) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Facturas = Facturas;
    }

    public Secretario() {

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

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public List<Factura> getFactura() {
        return Facturas;
    }

    public void setFactura(List<Factura> Factura) {
        this.Facturas = Factura;
    }

    @Override
    public String toString() {
        return "Secretario{" + "DNI=" + DNI + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + ", Fecha_Nacimiento=" + Fecha_Nacimiento + ", proveedores=" + proveedores + ", Factura=" + Facturas + '}';
    }

}
