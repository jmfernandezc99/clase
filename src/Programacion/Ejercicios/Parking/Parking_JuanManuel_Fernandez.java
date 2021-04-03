package Programacion.Ejercicios.Parking;
import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Parking_JuanManuel_Fernandez {
    private final int places_no_discapacitats;
    private final int places_discapacitats;
    public String expresion = "^[0-9]{4}[A-Z]{3}$";
    private final HashMap<String, Integer> cochesNoDiscapacitados = new HashMap<>();
    private final HashMap<String, Integer> cochesDiscapacitados = new HashMap<>();

    //Creamos el constructor para definir las plazas de no discapacitados y la de los discapacitados
    public Parking_JuanManuel_Fernandez(int places_no_discapacitats, int places_discapacitats) {
        this.places_no_discapacitats = places_no_discapacitats;
        this.places_discapacitats = places_discapacitats;
    }

    //Este método le pasamos una dirección de un fichero por parámetro y nos irá metiendo los coches
    //aleatoriamente en el aparcamiento de la gente discapacitada y no discapacitada mientras el fichero exista.
    public void llegirMatricules(String path) throws Exception{
        Random random = new Random();
        BufferedReader br;
        File fichero = new File(path);
        br = new BufferedReader(new FileReader(path));
        if (!fichero.exists()){
            throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
        } else {
            String linea = br.readLine();
            while (linea != null){
                int num = random.nextInt(1) + 1;
                switch (num) {
                    case 1 -> entraCotxe(linea);
                    case 2 -> entraCotxeDiscapacitat(linea);
                }
                linea = br.readLine();
            }
            br.close();
        }
    }

    //Este método le pasamos una matrícula válida por parámetro y nos comprueba si la matrícula es válida, si
    //la matrícula está dentro del parking, si el parking está lleno y si el 85% del parking está ocupado, y nos
    //irá metiendo coches dependiendo si es un garrulo o no.
    public int entraCotxe(String matricula) throws Exception{
        Random random = new Random();
        if(Pattern.matches(this.expresion, matricula)){
            if (this.cochesNoDiscapacitados.containsKey(matricula)){
                throw new Exception("El cotxe ja està al parking. No pot entrar.");
            } else {
                if (this.cochesNoDiscapacitados.size() < this.places_no_discapacitats){
                    int num = random.nextInt(9) + 1;
                    if (num < 9){
                        this.cochesNoDiscapacitados.put(matricula, this.cochesNoDiscapacitados.size());
                        if (((this.cochesNoDiscapacitados.size() * 100) / this.places_no_discapacitats) >= 85){
                            throw new Exception("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
                        }
                        return this.cochesNoDiscapacitados.get(matricula);
                    } else {
                        entraCotxeDiscapacitat(matricula);
                        throw new Exception("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça " + this.cochesDiscapacitados.get(matricula));
                    }
                } else {
                    throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
                }
            }
        } else {
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }
    }

    //Mismas comprobaciones que en el método entraCotxe(matricula) con la diferencia de que si este parking está
    //lleno lo meteremos dentro del parking de personas no discapacitadas y no hay garrulos.
    public int entraCotxeDiscapacitat(String matricula) throws Exception{
        if(Pattern.matches(this.expresion, matricula)){
            if (this.cochesNoDiscapacitados.containsKey(matricula)){
                throw new Exception("El cotxe ja està al parking. No pot entrar.");
            } else {
                if (this.cochesDiscapacitados.size() < this.places_discapacitats){
                    this.cochesDiscapacitados.put(matricula, this.cochesDiscapacitados.size());
                    if (((this.cochesDiscapacitados.size() * 100) / this.places_discapacitats) >= 85){
                        throw new Exception("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");
                    }
                    return this.cochesDiscapacitados.get(matricula);
                } else {
                    if (this.cochesNoDiscapacitados.size() < this.places_no_discapacitats){
                        if (((this.cochesNoDiscapacitados.size() * 100) / this.places_no_discapacitats) >= 85){
                            throw new Exception("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
                        }
                        this.cochesNoDiscapacitados.put(matricula, this.cochesNoDiscapacitados.size());
                        throw new Exception("ALERTA =====> Parking per discapacitats ple. Ha ocupat la plaça normal num " + this.cochesNoDiscapacitados.get(matricula));
                    } else {
                        throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
                    }
                }
            }
        } else {
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }
    }

    //Este método le metemos por parámetro una matrícula y nos sacará el coche del parking siempre y cuando
    //la matricula sea correcta y el coche esté dentro del parking.
    public void surtCotxe(String matricula) throws Exception{
        if(Pattern.matches(this.expresion, matricula)){
            if (!this.cochesNoDiscapacitados.containsKey(matricula)){
                throw new Exception("El cotxe no és al parking.");
            } else {
                cochesNoDiscapacitados.remove(matricula);
            }
        } else {
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }
    }

    //Misma función que surtCotxe(matricula) con la diferencia de que se refiere al parking de coches discapacitados.
    public void surtCotxeDiscapacitats(String matricula) throws Exception{
        if(Pattern.matches(this.expresion, matricula)){
            if (!this.cochesDiscapacitados.containsKey(matricula)){
                throw new Exception("El cotxe no és al parking.");
            } else {
                cochesDiscapacitados.remove(matricula);
            }
        } else {
            throw new Exception("ALERTA =====> Matrícula incorrecte.");
        }
    }

    //Este método nos devuelve el número de plazas ocupadas según el parking que le especifiquemos por parámetro.
    public int getPlacesOcupades(TipusPlacesParking tipus) {
        if (tipus == TipusPlacesParking.Discapacitat){
            return cochesDiscapacitados.size();
        }
        else{
            return cochesNoDiscapacitados.size();
        }
    }

    //Este método nos devuelve las plazas libres del parking según el parking que le especifiquemos por parámetro.
    public int getPlacesLliures(TipusPlacesParking tipus) {
        if (tipus == TipusPlacesParking.Discapacitat){
            return this.places_discapacitats - cochesDiscapacitados.size();
        }
        else{
            return this.places_no_discapacitats - cochesNoDiscapacitados.size();
        }
    }

    //Este método nos guarda todas las matrículas independientemente del parking en el que esté
    //en el fichero que le especifiquemos por parámetro, esté creado o no.
    public void guardarMatricules(String path) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        Iterator it = this.cochesNoDiscapacitados.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            bw.write(e.getKey() + "");
            bw.newLine();
        }
        it = this.cochesDiscapacitados.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            bw.write(e.getKey() + "");
            bw.newLine();
        }
        bw.close();
    }

}

//Esta clase nos servirá para especificar el parking que trataremos el los métodos.
enum TipusPlacesParking {
    Discapacitat, No_Discapacitat
}