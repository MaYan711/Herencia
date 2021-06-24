package Vehiculos;

public abstract class vehiculo {
    private boolean esdiesel;
    private int cantidad;
    private int cantidadPasajeros;
    private double vMax;
    private double aBase;


    public vehiculo(boolean esdiesel, int cantidad, int cantidadPasajeros, double vMax, double aBase) {
        this.esdiesel = esdiesel;
        this.cantidad = cantidad;
        this.cantidadPasajeros = cantidadPasajeros;
        this.vMax = vMax;
        this.aBase = aBase;
    }

    public boolean isEsdiesel() {
        return esdiesel;
    }

    public void setEsdiesel(boolean esdiesel) {
        this.esdiesel = esdiesel;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public double getvMax() {
        return vMax;
    }

    public void setvMax(double vMax) {
        this.vMax = vMax;
    }

    public double getaBase() {
        return aBase;
    }

    public void setaBase(double aBase) {
        this.aBase = aBase;
    }

    @Override
    public String toString() {
        return "vehiculo{" +
                "esdiesel=" + esdiesel +
                ", cantidad=" + cantidad +
                ", cantidadPasajeros=" + cantidadPasajeros +
                ", vMax=" + vMax +
                ", aBase=" + aBase +
                '}';
    }
}