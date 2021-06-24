package Vehiculos;

public class deCarreras extends vehiculo{
    public static int ACELERACION=3;
    private int turbo;

    public deCarreras( int cantidad, int cantidadPasajeros, double vMax, double aBase, int turbo ) {
        super(false, cantidad, cantidadPasajeros, vMax, (aBase*(ACELERACION)));
        this.turbo=turbo;
    }

    public int getACELERACION() {
        return ACELERACION;
    }

    public void setACELERACION(int ACELERACION) {
        this.ACELERACION = ACELERACION;
    }

    public int getTurbo() {
        return turbo;
    }

    public void setTurbo(int turbo) {
        this.turbo = turbo;
    }
}