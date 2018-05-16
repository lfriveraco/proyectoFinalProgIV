/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Commune;
import Model.Neighborhood;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

/**
 *
 * @author Luis Fernando Rivera Cortés
 */
public class Contract {

    SecureRandom sr = new SecureRandom();
    public static final int MAX_VERTEX = 5;

    public static final Commune[] COMMUNES = {
        new Commune("COMM-1", "COMUNA ATARDECERES"),
        new Commune("COMM-2", "SAN JOSE"),
        new Commune("COMM-3", "CUMANDAY"),
        new Commune("COMM-4", "ESTACION"),
        new Commune("COMM-5", "CIUDADELA DEL NOTE"),
        new Commune("COMM-6", "ECOTURISTICO CERRO DE ORO"),
        new Commune("COMM-7", "TESORITO"),
        new Commune("COMM-8", "PALOGRANDE"),
        new Commune("COMM-9", "UNIVERSITARIA"),
        new Commune("COMM-10", "LA FUENTE"),
        new Commune("COMM-11", "LA MACARENA"),};

    public static final Neighborhood[] NEIGHBORHOODS = {
        new Neighborhood("1010", "CIUDADELA LA LINDA", 2),
        new Neighborhood("1011", "LA QUINTANA", 2),
        new Neighborhood("1020", "BELLA MONTAÑA", 3),
        new Neighborhood("1021", "HOSPITAL GERIATRICO SAN ISIDRO", 0),
        new Neighborhood("1022", "ESCUELA DE TRABAJO LA LINDA", 0),
        new Neighborhood("1030", "SACATIN", 1),
        new Neighborhood("1040", "VILLA PILAR", 4),
        new Neighborhood("1041", "VILLA PILAR II", 4),
        new Neighborhood("1042", "TORRES DE AVILA", 4),
        new Neighborhood("1043", "VENEDA", 4),
        new Neighborhood("1044", "SAN LUIS", 4),
        new Neighborhood("1045", "AQUILINO VILLEGAS", 4),
        new Neighborhood("1046", "URB ATALAYA", 4),
        new Neighborhood("1047", "URB BELLO HORIZONTE", 4),
        new Neighborhood("1048", "URB SANTA MONICA", 4),
        new Neighborhood("1050", "CHIPRE", 4),
        new Neighborhood("1051", "CHIPRE VIEJO", 3),
        new Neighborhood("1052", "BALCONES DE CHIPRE", 4),
        new Neighborhood("1053", "BELLAVISTA", 4),
        new Neighborhood("1060", "CAMPO HERMOSO", 4),
        new Neighborhood("1061", "LA CHIMENEA I Y II", 4),
        new Neighborhood("1062", "ALTOS DE CASTILLA", 4),
        new Neighborhood("1063", "TERRAZAS DE CAMPOHERMOSO", 4),
        new Neighborhood("1064", "CONJUNTO DE CAMPO HERMOSO", 4),
        new Neighborhood("1065", "UNIVERSIDAD DE MANIZALES", 0),
        new Neighborhood("1070", "MORROGACHO", 2),
        new Neighborhood("1071", "TAPADO", 2),
        new Neighborhood("1072", "MONTAÑA", 4),
        new Neighborhood("1080", "LA FRANCIA", 6),
        new Neighborhood("1081", "PALMAR", 6),
        new Neighborhood("1082", "SAN FRANCISCO", 6),
        new Neighborhood("1083", "POBLADO", 6),
        new Neighborhood("1084", "SAN REMO", 5),
        new Neighborhood("1085", "CANDELARIA", 4),
        new Neighborhood("1090", "LOS ALCAZARES", 4),
        new Neighborhood("1091", "PORTAL DE LOS ALCAZARES", 4),
        new Neighborhood("1092", "PORTALES", 5),
        new Neighborhood("1093", "VILLA REAL", 4),
        new Neighborhood("1094", "QUINTA HISPANA", 2),
        new Neighborhood("1095", "ASTURIAS", 4),
        new Neighborhood("1100", "ARENILLO", 2 - 3)
    };

    public static int random(int min, int max) {
        SecureRandom sr = null;
        int number;
        try {
            sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
            // para garantizar el caracter aleatorio generemos una nueva semilla
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        }
        
        number  = sr.nextInt(max);
        if(number < min){
            number+=min;
        }

        return number;
    }

}
