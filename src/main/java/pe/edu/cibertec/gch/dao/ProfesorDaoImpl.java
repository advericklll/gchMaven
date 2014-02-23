package pe.edu.cibertec.gch.dao;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import pe.edu.cibertec.gch.modelo.Profesor;

public class ProfesorDaoImpl implements ProfesorDao {
    
    private static ProfesorDaoImpl instance =null;

    @Override
    public void registrar(Profesor profesor) {
        Contenedor.PROFESORES.add(profesor);
    }

    @Override
    public void actualizar(Profesor profesor) {
        Contenedor.PROFESORES.set(searchByCodigo(profesor.getCodigo()), profesor);
    }

    @Override
    public void eliminarSegun(String codigo) {
        Contenedor.PROFESORES.remove(searchByCodigo(codigo));
    }

    @Override
    public List<Profesor> listarTodo() {
        return Contenedor.PROFESORES;
    }

    @Override
    public List<Profesor> listarSegun(String nombres, String apellidoPaterno, String apellidoMaterno) {
        List<Profesor> profesores = new LinkedList();
        for (Profesor profesor : Contenedor.PROFESORES) {
            boolean nombreCoincide = nombres == null 
                    || nombres.isEmpty()
                    || profesor.getNombres().toLowerCase(Locale.ENGLISH)
                    .contains(nombres.toLowerCase(Locale.ENGLISH));
            boolean apellidoPaternoCoincide = apellidoPaterno == null 
                    || apellidoPaterno.isEmpty()
                    || profesor.getApellidoPaterno().toLowerCase(Locale.ENGLISH)
                    .contains(apellidoPaterno.toLowerCase(Locale.ENGLISH));
            boolean apellidoMaternoCoincide = apellidoMaterno == null 
                    || apellidoMaterno.isEmpty() 
                    || profesor.getApellidoMaterno().toLowerCase(Locale.ENGLISH)
                    .contains(apellidoMaterno.toLowerCase(Locale.ENGLISH));
            if (nombreCoincide && apellidoPaternoCoincide && apellidoMaternoCoincide) {
                profesores.add(profesor);
            }
        }
        return profesores;
    }

    @Override
    public Profesor obtenerSegun(String codigo) {
        return Contenedor.PROFESORES.get(searchByCodigo(codigo));
    }

    private static class Contenedor {

        private static List<Profesor> PROFESORES = new LinkedList<Profesor>();
    }
    
    private int searchByCodigo(String codigo){
        int i=-1;
       for (Profesor unProfesor : Contenedor.PROFESORES){
           if (codigo.equals(unProfesor.getCodigo()))
               i= Contenedor.PROFESORES.indexOf(unProfesor);
       }
       return i;
    }
    
    //initiate using singleton
   protected ProfesorDaoImpl() {
      // Exists only to defeat instantiation.
   }
   public static ProfesorDaoImpl getInstance() {
      if(instance == null) {
         instance = new ProfesorDaoImpl();
      }
      return instance;
   }
}
