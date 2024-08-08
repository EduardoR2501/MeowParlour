package meowparlour;

import java.util.ArrayList;
import java.util.List;

public class DatosFactura {
    private int facturaID;
    private String nit;
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    private String subtotalSinIVA;
    private String iva;
    private String total;

    public DatosFactura(int facturaID, String nit, String nombre, String direccion, 
                       String subtotalSinIVA, String iva, String total) {
        this.facturaID = facturaID;
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
        this.subtotalSinIVA = subtotalSinIVA;
        this.iva = iva;
        this.total = total;
    }

    public void agregarProducto(String codigoDeBarras, String nombreProducto, 
                                int cantidad, String subtotal, String total) {
        productos.add(new Producto(codigoDeBarras, nombreProducto, cantidad, subtotal, total));
    }

    // Getters y Setters

    public int getFacturaID() {
        return facturaID;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String getSubtotalSinIVA() {
        return subtotalSinIVA;
    }

    public String getIva() {
        return iva;
    }

    public String getTotal() {
        return total;
    }

    public static class Producto {
        private String codigoDeBarras;
        private String nombreProducto;
        private int cantidad;
        private String subtotal;
        private String total;

        public Producto(String codigoDeBarras, String nombreProducto, int cantidad, 
                        String subtotal, String total) {
            this.codigoDeBarras = codigoDeBarras;
            this.nombreProducto = nombreProducto;
            this.cantidad = cantidad;
            this.subtotal = subtotal;
            this.total = total;
        }

        // Getters y Setters

        public String getCodigoDeBarras() {
            return codigoDeBarras;
        }

        public String getNombreProducto() {
            return nombreProducto;
        }

        public int getCantidad() {
            return cantidad;
        }

        public String getSubtotal() {
            return subtotal;
        }

        public String getTotal() {
            return total;
        }
    }
}

