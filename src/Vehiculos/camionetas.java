package Vehiculos;

public class camionetas extends vehiculo{

    private boolean TrasportaPersonas;

    public camionetas( int cantidad, int cantidadPasajeros, double vMax, double aBase, boolean trasportaPersonas) {
        super(true, cantidad, cantidadPasajeros, vMax, aBase);
        TrasportaPersonas = trasportaPersonas;
    }

    public boolean isTrasportaPersonas() {
        return TrasportaPersonas;
    }

    public void setTrasportaPersonas(boolean trasportaPersonas) {
        TrasportaPersonas = trasportaPersonas;
    }
}