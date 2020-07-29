/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete1;

/**
 *
 * @author sebas
 */
public class Empleados {
         private int id;
	private String Nombre;
	private String Apellido;
        private double salario;
        

	public Empleados(int id, String nombre, String apellido, double salario) {
		this.id = id;
		this.Nombre = nombre;
		this.Apellido = apellido;
                this.salario = salario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}
        public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return " Id: " + id + ", Nombre: " + Nombre + ", Apellido: " + Apellido + ", Salario: " + salario + "";
	}
}
