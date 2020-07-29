/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;
import java.util.ArrayList;
/**
 *
 * @author sebas
 */
import javax.swing.JOptionPane;

import Paquete1.Operaciones;

public class Main {

	public static void main(String[] args) {
		Operaciones o = new Operaciones();
		
		int numero = -1;
		try {
			while(numero != 11) {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite La Opcion Que Se Requiera" + "\n" + "1: Agregar Empleado"
						 +"                                         2: Modificar Empleado      " + "\n" +"3: Mostrar Empleados" +"                                       4: Eliminar Empleados    " + "\n" + "5: Empleado mayor salario"
								+"                              6: Empleado menor salario        "+ "\n" +"7: Ordenar por nombre la lista" +"                        8: Total de Apellidos por 'A'        " + "\n" + "9: Cinco empleados con mayor salario" +"       10: Sumatoria salarios mayores a 700k" + "\n"+ "11: Salir"));
		
				switch (numero) {
				case 1:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						String nombre = JOptionPane.showInputDialog("Digite Nombre");
						String apellido = JOptionPane.showInputDialog("Digite Apellido");
						double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite salario"));
						
						if(o.agregar(id, nombre, apellido, salario)) {
							JOptionPane.showMessageDialog(null, "Se Agregó Correctamente");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
					
				
				case 2:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						String nombre = JOptionPane.showInputDialog("Digite Nombre");
						String apellido = JOptionPane.showInputDialog("Digite Apellido");
						double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite salario"));
						
						if(o.modificar(id, nombre, apellido, salario)) {
							JOptionPane.showMessageDialog(null, "Se Modificó Correctamente");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				
				case 3:
					try {
						JOptionPane.showMessageDialog(null, o.mostrar());
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
                                        
                                        case 4:
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
						if (o.eliminar_Empleado(id)) {
							JOptionPane.showMessageDialog(null, "Se Eliminó Correctamente");
						}
						break;
					}
					catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
					
					
				case 5:
					try {
						JOptionPane.showMessageDialog(null, o.empleadoConMayorSalario());
					} catch (Exception e) {
						
					}
					break;
                                        
					
				case 6:
					try {
						JOptionPane.showMessageDialog(null, o.empleadoConMenorSalario());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo Anda Mal!");
					}
					break;
						
				case 7:
					try {
						JOptionPane.showMessageDialog(null, o.ordenarPorNombre());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo Anda Mal!");
					}
					break;
					
				case 8:
					try {
						JOptionPane.showMessageDialog(null, o.mostrarNumeroTotalDeNombresPorA());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo Anda Mal!");
					}
					break;
				
				case 9:
					try {
						JOptionPane.showMessageDialog(null, o.cincoEmpleadosConMayorSalario());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo Anda Mal!");
					}
					break;
					
				case 10: 
					try {
						JOptionPane.showMessageDialog(null, o.sumaSalariosMayorSiete());
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Algo Anda Mal");
					}
				}
			}
		}
		catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Gracias Por Usar Este Servicio");
		}
	}

}
