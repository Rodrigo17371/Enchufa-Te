/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Empleados{
    int coddempleado;
    int codlocal;
    int codarea;
    String nombre_emp;
    String apellido_emp;
    String fechanacimiento_emp;
    String dni_emp;
    String sexo_emp;
    String celular_emp;
    String correo_emp;
    double salario_emp;
    //Getter and Setter

    public int getCodlocal() {
        return codlocal;
    }

    public void setCodlocal(int codlocal) {
        this.codlocal = codlocal;
    }

    public int getCodarea() {
        return codarea;
    }

    public void setCodarea(int codarea) {
        this.codarea = codarea;
    }

    public int getCoddempleado() {
        return coddempleado;
    }

    public void setCoddempleado(int coddempleado) {
        this.coddempleado = coddempleado;
    }

    public String getNombre_emp() {
        return nombre_emp;
    }

    public void setNombre_emp(String nombre_emp) {
        this.nombre_emp = nombre_emp;
    }

    public String getApellido_emp() {
        return apellido_emp;
    }

    public void setApellido_emp(String apellido_emp) {
        this.apellido_emp = apellido_emp;
    }

    public String getFechanacimiento_emp() {
        return fechanacimiento_emp;
    }

    public void setFechanacimiento_emp(String fechanacimiento_emp) {
        this.fechanacimiento_emp = fechanacimiento_emp;
    }

    public String getDni_emp() {
        return dni_emp;
    }

    public void setDni_emp(String dni_emp) {
        this.dni_emp = dni_emp;
    }

    public String getSexo_emp() {
        return sexo_emp;
    }

    public void setSexo_emp(String sexo_emp) {
        this.sexo_emp = sexo_emp;
    }

    public String getCelular_emp() {
        return celular_emp;
    }

    public void setCelular_emp(String celular_emp) {
        this.celular_emp = celular_emp;
    }

    public String getCorreo_emp() {
        return correo_emp;
    }

    public void setCorreo_emp(String correo_emp) {
        this.correo_emp = correo_emp;
    }

    public double getSalario_emp() {
        return salario_emp;
    }

    public void setSalario_emp(double salario_emp) {
        this.salario_emp = salario_emp;
    }
    
    public Object[] RegistroEmpleados(){
        Object[] fila= {coddempleado,nombre_emp,apellido_emp,fechanacimiento_emp,dni_emp,sexo_emp,celular_emp,correo_emp,salario_emp};
        return fila;
    }
}
