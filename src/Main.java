import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner JHOEL = new Scanner(System.in);

        // 1. Pedir el tamaño del cine
        System.out.println("Ingresa la cantidad de filas:");
        int filas = JHOEL.nextInt();
        System.out.println("Ingrese la cantidad de columnas:");
        int columnas = JHOEL.nextInt();

        // 2. Crear la matriz de asientos (0 = Libre, 1 = Ocupado)
        int[][] asientos = new int[filas][columnas];

        // Inicializar todos los asientos como Libres (0)
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                asientos[i][j] = 0;
            }
        }

        // Variables para guardar las compras del cliente
        int palomitas = 0;
        int gaseosas = 0;
        int opcion = 0;

        // Menú interactivo con un bucle while
        while (opcion != 7) {
            System.out.println("\n------- CINEPLANET JULIACA -------");
            System.out.println("1. Mostrar mapa general de asientos");
            System.out.println("2. Mostrar asientos (Ocupados y Libres)");
            System.out.println("3. Comprar una butaca");
            System.out.println("4. Comprar palomitas");
            System.out.println("5. Comprar gaseosas");
            System.out.println("6. Mostrar boleto");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");
            opcion = JHOEL.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("--- MAPA GENERAL (0: Libre, 1: Ocupado) ---");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            System.out.print(asientos[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    System.out.println("--- ESTADO DE ASIENTOS (1: Ocupado, .: Libre) ---");
                    for (int i = 0; i < filas; i++) {
                        for (int j = 0; j < columnas; j++) {
                            if (asientos[i][j] == 1) {
                                System.out.print("1 ");
                            } else {
                                System.out.print(". ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número de fila (0 a " + (filas - 1) + "): ");
                    int f = JHOEL.nextInt();
                    System.out.print("Ingrese el número de columna (0 a " + (columnas - 1) + "): ");
                    int c = JHOEL.nextInt();


                    if (f >= 0 && f < filas && c >= 0 && c < columnas) {
                        if (asientos[f][c] == 0) {
                            asientos[f][c] = 1;
                            System.out.println("¡Butaca [" + f + "][" + c + "] comprada con éxito!");
                        } else {
                            System.out.println("¡Error! Ese asiento ya está ocupado.");
                        }
                    } else {
                        System.out.println("¡Error! Las coordenadas están fuera de la sala.");
                    }
                    break;

                case 4:
                    System.out.print("¿Cuántas palomitas quieres comprar?: ");
                    int cantidadP = JHOEL.nextInt();
                    palomitas = palomitas + cantidadP;
                    System.out.println("¡Palomitas agregadas!");
                    break;

                case 5:
                    System.out.print("¿Cuántas gaseosas quieres comprar?: ");
                    int cantidadG = JHOEL.nextInt();
                    gaseosas = gaseosas + cantidadG;
                    System.out.println("¡Gaseosas agregadas!");
                    break;

                case 6:
                    System.out.println("======== BOLETA DE COMPRA =========");
                    System.out.println("Palomitas: " + palomitas);
                    System.out.println("Gaseosas: " + gaseosas);
                    System.out.println("===== ¡GRACIAS POR SU COMPRA! =====");
                    break;

                case 7:
                    System.out.println("Gracias por su visita a Cineplanet.");
                    break;

                default:
                    System.out.println("Opción incorrecta. Intenta con un número del 1 al 7.");
                    break;
            }
        }
    }
}