import javax.swing.JOptionPane;

public class app_compraTiquete {
    static cls_pasajero [] pasajeros = new cls_pasajero[100];
    static cls_tiquete [] tiquete = new cls_tiquete[100];
    static int posCliente = 0;
    static int posTiquete = 0;

    public static void main(String[] args) {
        fnt_menu(true);
    }

    public static void fnt_menu(boolean menu){
        while (menu){
            String Opciones1 = JOptionPane.showInputDialog(null, "<<MENU>>\n" +
            "1. Registrar Cliente\n" +
            "2. Registrar tiquete\n" +
            "3. Consultar tiquete\n" +
            "4. Cerrar programa");

            if (Opciones1.equals("1")){
                String id = JOptionPane.showInputDialog(null, "Registre numero de documento: ");
                String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
                String contacto = JOptionPane.showInputDialog(null, "Ingrese su contacto: ");
                String correo = JOptionPane.showInputDialog(null, "Ingrese su direccion de correo electronico: ");
                String sexo = JOptionPane.showInputDialog(null, "Ingrese su sexo: ");
                String memebrecia = JOptionPane.showInputDialog(null, "Elija de las siguiete membrecias\n" +
                    "1. Bronce\n" +
                    "2. Plata\n" +
                    "3. Oro\n" +
                    "4. Platino");
                pasajeros [posCliente] = new cls_pasajero(id, nombre, contacto, correo, sexo, memebrecia);
                posCliente++;
            }
            if(Opciones1.equals("2")){
                String idConsulta = JOptionPane.showInputDialog(null, "Ingrese el id del cliente: ");
                boolean sw = false;
                int pos = 0;
                for(int i = 0; i < pasajeros.length; i++){
                    if(pasajeros[i].getIdStr().equals(idConsulta)){
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if (sw == true){
                    String id = JOptionPane.showInputDialog(null, "Ingrese el codigo de tiquete");
                    String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de viaje que desea comprar: \n" +
                    "1. Economico\n" +
                    "2. Turista\n" +
                    "3. VIP");
                    String metodo_pago = JOptionPane.showInputDialog(null, "Ingrerse el metodo de pago\n" +
                    "1. Efectivo\n" +
                    "2. Targeta de credito\n" +
                    "3. Targeta debito\n" +
                    "3. Transferencia");
                    int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de tiquetes: "));
                    float descuentotipoPago = 0;

                    if (metodo_pago.equals("1")){
                        descuentotipoPago = 0.05f;
                    }else if(metodo_pago.equals("2")){
                        descuentotipoPago = -0.07f;
                    }else if(metodo_pago.equals("3")){
                        descuentotipoPago = 0.02f;
                    }else if(metodo_pago.equals("4")){
                        descuentotipoPago = 0.1f;
                    }
                    float descuento = pasajeros[pos].getDescuento() + descuentotipoPago;
                    cls_pasajero pasajeroTic = pasajeros [pos];

                    tiquete [posTiquete] = new cls_tiquete(id, cantidad, tipo, descuento, pasajeroTic);
                    posTiquete++;
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro el cliente");
                }
            }
            if (Opciones1.equals("3")){
                String idreporte = JOptionPane.showInputDialog(null, "Ingrese el numero de identificacion del tiquete: ");
                boolean sw = false;
                int pos = 0;
                for (int i = 0; i < posTiquete; i++) { // Aqui me ayudo dios
                    if (tiquete[i] != null && tiquete[i].getIdStr().equals(idreporte)) {
                        sw = true;
                        pos = i;
                        break;
                    }
                }
                if (sw) {
                    JOptionPane.showMessageDialog(null, "Cliente: " + tiquete[pos].getPasajero().getNombreStr() +
                    "\nID Tiquete: " + tiquete[pos].getIdStr() +
                    "\nPrecio Tiquete unitario: " + tiquete[pos].getSubtotalFlt() +
                    "\nDescuento: " + tiquete[pos].getDescuentoFlt() +
                    "\nTotal a pagar: " + tiquete[pos].getTotalFlt());
                } else {
                    JOptionPane.showMessageDialog(null, "El ticket no existe");
                }
            }
            if (Opciones1.equals("4")){
                menu = false;
            }
        }
    }

}
