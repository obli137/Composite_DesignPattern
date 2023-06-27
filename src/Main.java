public class Main {
    public static void main(String[] args) {
        Producto hamburguesa = new Producto("Hamburguesa",2200.0);
        Producto papaFritas = new Producto("Papas Fritas",600.0);
        Producto gaseosa = new Producto("Gaseosa",700.0);
        Producto helado = new Producto("Helado",250.0);

        Carrito carrito = new Carrito();

        Combo combo1 = new Combo(0.10);
        combo1.agregarComprable(hamburguesa);
        combo1.agregarComprable(papaFritas);
        combo1.agregarComprable(gaseosa); //----Hasta aquí no se usa el patrón composite.

        //Aquí comienza el uso del patrón

        Combo comboPareja = new Combo(0.20);
        comboPareja.agregarComprable(combo1);
        comboPareja.agregarComprable(combo1);

        Combo comboFamilia = new Combo(0.25);
        comboFamilia.agregarComprable(comboPareja);
        comboFamilia.agregarComprable(combo1);
        comboFamilia.agregarComprable(helado);
        comboFamilia.agregarComprable(helado);
        comboFamilia.agregarComprable(helado);

        //---Agrego todos los combos y productos al carrito.

        carrito.agregarComprable(hamburguesa);
        carrito.agregarComprable(combo1);
        carrito.agregarComprable(comboPareja);
        carrito.agregarComprable(comboFamilia);

        //---Calculo el total del precio del carrito.
        System.out.println(carrito.calcularTotalCompra());
    }
}