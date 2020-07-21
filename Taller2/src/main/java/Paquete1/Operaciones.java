package Paquete1;

import java.util.ArrayList;
/**
 *
 * @author sebas
 */
public class Operaciones {
    private ArrayList<Empleados> lista;

	public  Operaciones() {
		lista = new ArrayList<Empleados>();
	}
	public ArrayList<Empleados> darLista(){
		return lista;
	}
	public Empleados buscar_Empleado( int id ) {	
		for (int i = 0; i < lista.size(); i++) {
		if (lista.get(i).getId() == id) {
		return lista.get(i);
			}
		}
		return null;
	}
	public boolean agregar(int id, String nombre, String apellido) throws Exception {
		if (buscar_Empleado(id) !=null) {
		throw new Exception("Este ID Ya Existe");
		}else {Empleados nuevo = new Empleados(id, nombre, apellido); 
		lista.add(nuevo);
		return true;
		}
	}
        public boolean modificar(int id, String nombre, String apellido)throws Exception {

		Empleados A_Modificar = buscar_Empleado(id);
		if (A_Modificar != null) {
		A_Modificar.setNombre(nombre);
		A_Modificar.setApellido(apellido);
		return true;
                        
		}else {throw new Exception("No existe, Verifique Nuevamente");
		}	
	}
        public String mostrar() {
		String res  = "Empleados:" +"\n";
		for (int i = 0; i < lista.size(); i++) {
		res += lista.get(i).toString() + "\n";
		}
		return res;
	}
	public boolean eliminar_Empleado( int id) throws Exception{
		Empleados eliminar = buscar_Empleado(id);
		if (eliminar != null) {
		lista.remove(eliminar);
		return true;
		}
		else { throw new Exception("El Empleado Que Intenta Eliminar No Exite, Verifique nuevamente ");
		}
	}
}