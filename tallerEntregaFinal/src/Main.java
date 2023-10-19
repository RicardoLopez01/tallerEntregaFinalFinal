import edu.princeton.cs.stdlib.StdIn;
import edu.princeton.cs.stdlib.StdOut;

public class Main {
    public static void main(String[] args) {

        Restoran Restoran = new Restoran("Angamos",18);
        boolean menu = true;


        while (!menu) {
            System.out.println("Bienvenido a Restorant Mexicano");
            System.out.println("Ingrese su opcion:");
            System.out.println("1)Gestionar disponibilidad mesa");
            System.out.println("2)Gestionar inventario");
            System.out.println("3)Administracion de trabajadores");
            System.out.println("4)Gestionar ordenes de clientes");
            System.out.println("5)Salir");
            int opcion = StdIn.readInt();

            switch (opcion) {

                case 1:
                    while(true){
                        System.out.println("Submenú para coordinar mesas");
                        System.out.println("1. Registrar cliente/asignar mesa");
                        System.out.println("2. Checkear disponibilidad mesa");
                        System.out.println("3. Volver al menú principal");
                        int opcionSubMenu1 = StdIn.readInt();
                            switch (opcionSubMenu1){
                                case 1: Restoran.atenderCliente();
                                //case 2: Restoran.consultarDisponibilidad(); <-- Aca me da error y no se porque
                                case 3: break;
                            }
                        }

                case 2:
                       System.out.println("Submenú para gestionar inventario:");
                       System.out.println("1. Agregar producto al inventario");
                       System.out.println("2. Actualizar producto en el inventario");
                       System.out.println("3. Eliminar producto del inventario");
                       System.out.println("4. Mostrar productos");
                       int opcionSubMenu2 = StdIn.readInt();
                       switch(opcionSubMenu2){
                           case 1:Restoran.agregarProducto();
                           case 2:Restoran.actualizarProducto();
                           case 3:Restoran.eliminarProducto();
                           case 4:Restoran.mostrarInventario();
                       }

                case 3:
                       System.out.println("Submenú para administración de trabajadores:");
                       System.out.println("1. Renovar contrato de trabajador");
                       System.out.println("2. Finalizar contrato de trabajador");
                       System.out.println("3. Otorgar contrato indefinido a trabajador");
                       System.out.println("4. Mostrar Lista Trabajadores");
                       System.out.println("5. Contratar trabajador nuevo");
                        int opcionSubMenu3 = StdIn.readInt();
                        switch(opcionSubMenu3) {
                            case 1: Restoran.renovarContrato();
                            //case 2: Restoran.finalizarContrato();
                            case 3:   Restoran.darIndefinido();
                            case 4:   Restoran.mostrarTrabajadores();
                            case 5:   Restoran.contratarTrabajadores();

                    }
                case 4:
                case 5: menu = false;
                System.out.print("Adios!");

            }
        }
    }
}