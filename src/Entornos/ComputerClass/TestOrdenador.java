package Entornos.ComputerClass;/*
Hecho dia vie. 04/12/2020
Creado por: Juanma
Paquete: EjercicioOrdenador
Descripcion:
*/

public class TestOrdenador {
    public static void main(String[] args) {

        //Creamos el pc
        ComputerClass computer1 = new ComputerClass("c1", 8, 100);

        //Creamos el sistema operativo
        OperatingSystem operatingSystem1 = new OperatingSystem("os1", "1.0", "64", true, 20, 2);

        //Creamos el primer programa
        Software software1 = new Software("s1", "1.0", 2, 1);

        //Creamos el segundo programa
        Software software2 = new Software("s2", "2.0", 1, 1);

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");

        //Instalamos el sistema operativo
        computer1.operatingSystemInstalled(operatingSystem1);
        System.out.println("Acabamos de instalar el S.O. " + operatingSystem1.getOsName());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");

        //Instalamos el primer programa en el sistema operativo
        computer1.getOperatingSystem().installSoftware(software1, computer1);
        System.out.println("Acabamos de instalar el software " + software1.getSoftwareName() + " en " + computer1.getName() + ".");

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");

        //Instalamos el segundo programa en el sistema operativo
        computer1.getOperatingSystem().installSoftware(software2, computer1);
        System.out.println("Acabamos de instalar el software " + software2.getSoftwareName() + " en " + computer1.getName() + ".");

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");

        //Desinstalamos el segundo programa del sistema operativo
        computer1.getOperatingSystem().uninstallSoftware(software2, computer1);
        computer1.getOperatingSystem().uninstallSoftware(software1, computer1);
        System.out.println("Acabamos de desinstalar " + software1.getSoftwareName() + " y " + software2.getSoftwareName());

        //Pedimos que nos de el espacio en disco que tenemos disponible
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");

        computer1.computerFormat();
        System.out.println("Acabamos de formatear el ordenador.");
        System.out.println("Tenemos " + computer1.getHardDisk() + "GB de disco duro disponible.");
    }
}
