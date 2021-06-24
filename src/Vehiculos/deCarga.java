package Vehiculos;

public class deCarga extends  vehiculo {

    private String tipoMaterial;

    public deCarga( int cantidad, int cantidadPasajeros, double vMax, double aBase, String tipoMaterial) {
        super(true, cantidad, cantidadPasajeros, vMax, aBase);
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
}