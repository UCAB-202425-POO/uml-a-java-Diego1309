package ve.edu.ucab.lab;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;

public class Envio {

    private  int codigo;
    private LocalDate fecha;
    private String origen;
    private String destino;
    private float peso;
    private float volumen;

    private ArrayList<Ruta>rutas;
    private ArrayList<Conductor>conductors;
    private ArrayList<Vehiculo>vehiculos;

}
