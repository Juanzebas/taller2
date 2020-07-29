package Paquete1;

import java.util.ArrayList;
import java.util.Comparator;
/**
 *
 * @author sebas
 */
public class Operaciones {
    private ArrayList<Empleados> lista;

	public  Operaciones() {
            
		lista = new ArrayList<Empleados>();
                lista.add(new Empleados( 1,"Jorge", "Martinez", 1100000.0));
        lista.add(new Empleados(2, "Yuly", "Gaitan", 1200000.0));
        lista.add(new Empleados(3,"Sofia", "Narvaez",  670000.0));
        lista.add(new Empleados(8,"Sebastián", "Sanchez",  870000.0));
        lista.add(new Empleados(9,"Justo", "Panqueva",  460000.2));
        lista.add(new Empleados(12,"Toby", "Rojas",  230000.5));
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
	public boolean agregar(int id, String nombre, String apellido,double salario) throws Exception {
		if (buscar_Empleado(id) !=null) {
		throw new Exception("Este ID Ya Existe");
		}else {Empleados nuevo = new Empleados(id, nombre, apellido,salario); 
		lista.add(nuevo);
		return true;
		}
	}
        public boolean modificar(int id, String nombre, String apellido,double salario)throws Exception {

		Empleados A_Modificar = buscar_Empleado(id);
		if (A_Modificar != null) {
		A_Modificar.setNombre(nombre);
		A_Modificar.setApellido(apellido);
                A_Modificar.setSalario(salario);
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
	
	public String empleadoConMayorSalario() {
		return lista.stream()
                .max(Comparator.comparing(Empleados::getSalario))
                .map(Empleados::toString)
                .orElse("No hay empleados");
	}
	
	public String empleadoConMenorSalario() {
		return lista.stream()
                .min(Comparator.comparing(Empleados::getSalario))
                .map(Empleados::toString)
                .orElse("No hay empleados");
	}
	
	public String ordenarPorNombre() {
		String res = "";
		res = lista.stream()
        .sorted(Comparator.comparing(Empleados::getNombre))
        .map(Empleados::toString)
        .reduce(" ", (a,b) -> {
        	return a+"\n"+b; 
        });
		
		return res;
	}
	
	public long mostrarNumeroTotalDeNombresPorA() {
		return lista.stream()
        .filter(empleado -> empleado.getApellido().toUpperCase().startsWith("A"))
        .count();
		
	}
	
	public String cincoEmpleadosConMayorSalario() {
		 return lista.stream()
                .sorted(Comparator.comparing(Empleados::getSalario).reversed())
                .map(Empleados::toString)
                .limit(5)
                .reduce(" ", (a,b) -> {
                	return a+"\n"+b; 
                });
	}
	
	public double sumaSalariosMayorSiete() {
		return lista.stream().filter((lista) -> {
			return lista.getSalario() > 700000;
		})
		.map(Empleados::getSalario)
		.reduce(0.0, (a,b) ->{
			return a+b;
		});
        }
}
