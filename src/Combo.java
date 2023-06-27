import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{
    private List<Comprable> comprableList;
    private Double descuento;

    public Combo(Double descuento) {
        this.descuento = descuento;
        comprableList = new ArrayList<>();
    }
    @Override
    public Double calcularPrecio() {
        Double sumarPrecio = 0.0;
        for (Comprable comprable : comprableList) {
            sumarPrecio += comprable.calcularPrecio();
        }
        Double precioFinal = sumarPrecio - sumarPrecio*descuento;
        return precioFinal;
    }

    public void agregarComprable(Comprable comprable){
        comprableList.add(comprable);
    }
}
