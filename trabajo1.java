import java.util.ArrayList;

public class trabajo1 {

}

class Cliente {
    private String nombre;
    private String dierccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.dierccion = direccion;
    }
}

class Pedido {
    private Cliente cliente;
    private int numPedido;
    private ArrayList<String> articulos;

    public Pedido(Cliente cliente, int numPedido, ArrayList<String> articulos) {
        this.cliente = cliente;
        this.numPedido = numPedido;
        this.articulos = articulos;
    }

    public void addArticulos(String articulo) {
        this.articulos.add(articulo);
    }
}

class Pago {
    private Pedido pedido;
    private String metodoPago;
    private int cantidad;

    public Pago(Pedido pedido, String metodoPago, int cantidad) {
        this.pedido = pedido;
        this.metodoPago = metodoPago;
        this.cantidad = cantidad;
    }
}

class Notificacion {
    private Pedido pedido;
    private String correo;

    public Notificacion(Pedido pedido, String correo) {
        this.pedido = pedido;
        this.correo = correo;
    }
}