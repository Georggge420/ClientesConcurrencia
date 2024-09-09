import java.util.ArrayList;
import java.util.Arrays;

public class trabajo1 {
    public static void main(String[] args) {
        // Datos predefinidos para las variables
        String clienteName = "Juan Pérez";
        String clienteDireccion = "Calle Principal 123";
        int pedidoNumero = 12345;
        ArrayList<String> pedidoArticulos = new ArrayList<>(Arrays.asList("Producto A", "Producto B", "Producto C"));
        String pagoMetodo = "Tarjeta de crédito";
        int pagoCantidad = 500;
        String notificacionCorreo = "juanperez@example.com";

        Cliente cliente = new Cliente(clienteName, clienteDireccion);
        Pedido pedido = new Pedido(cliente, pedidoNumero, pedidoArticulos);
        Pago pago = new Pago(pedido, pagoMetodo, pagoCantidad);
        Notificacion notificacion = new Notificacion(pedido, notificacionCorreo);

        mostrarDatos(cliente, pedido, pago, notificacion);
    }

    public static void mostrarDatos(Cliente cliente, Pedido pedido, Pago pago, Notificacion notificacion) {
        System.out.println("-- Datos del Cliente --");
        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Dirección: " + cliente.getDireccion());

        System.out.println("\n-- Datos del Pedido --");
        System.out.println("Número de Pedido: " + pedido.getNumPedido());
        System.out.println("Artículos:");
        for (String articulo : pedido.getArticulos()) {
            System.out.println("- " + articulo);
        }

        System.out.println("\n-- Datos del Pago --");
        System.out.println("Método de Pago: " + pago.getmetodoPago());
        System.out.println("Cantidad: " + pago.getcantidad());

        System.out.println("\n-- Datos de la Notificación --");
        System.out.println("Correo: " + notificacion.getcorreo());
    }
}

class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumPedido() {
        return this.numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public ArrayList<String> getArticulos() {
        return this.articulos;
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
    public int getcantidad() {
        return cantidad;
    }
    public String getmetodoPago() {
        return metodoPago;
    }
}

class Notificacion {
    private Pedido pedido;
    private String correo;

    public Notificacion(Pedido pedido, String correo) {
        this.pedido = pedido;
        this.correo = correo;
    }
    public String getcorreo() {
        return correo;
    }
}
