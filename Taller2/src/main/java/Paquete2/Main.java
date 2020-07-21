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
		
		int Opciones = 0;
		while(Opciones != 5) {
		Opciones = Integer.parseInt(JOptionPane.showInputDialog("Elige La Opcion a Emplear" + "\n" + "1: Agregar Empleado" + "\n" + "2: Modificar Empleado" + "\n" + "3:Mostrar Empleados" + "\n" + "4: Eliminar Empleado" + "\n" + "5: Salir"));
			
			switch (Opciones) {
			case 1:
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Digitar Id"));
					String nombre = JOptionPane.showInputDialog("Digitar Nombre");
					String apellido = JOptionPane.showInputDialog("Digitar Apellido");
					
					if(o.agregar(id, nombre, apellido)) {
						JOptionPane.showMessageDialog(null, "Se Agrego Correctamente");
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
					
					if(o.modificar(id, nombre, apellido)) {
						JOptionPane.showMessageDialog(null, "Se Modifico Correctamente");
					}
					break;
				}
				catch (Exception s) {
					JOptionPane.showMessageDialog(null, s.getMessage());
				}
				break;
                                
                                case 3:
				try {
					JOptionPane.showMessageDialog(null, o.mostrar());
					break;
				}
				catch (Exception s) {
					JOptionPane.showMessageDialog(null, s.getMessage());
				}
				break;
				
			case 4:
				try {
					int id = Integer.parseInt(JOptionPane.showInputDialog("Digite id"));
					if (o.eliminar_Empleado(id)) {
						JOptionPane.showMessageDialog(null, "Se Elimino Correctamente");
					}
					break;
				}
				catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;
			case 5:
				break;
			}
		}

	}

}