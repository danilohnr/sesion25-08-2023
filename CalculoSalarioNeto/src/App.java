import java.util.Scanner;

public class App {
    //Declaracion de constantes
    static final double tasaINSS = 7.0;
    static final double tasaIR = 15.6;
    static final double tasaINSSPatronal = 22.5;
    static final double tasaSindicato = 1.0;
    static final double tasaAntiguedad = 15.0;
    public static void main(String[] args) {
        //Declaracion de variables
        double salarioBruto, ingresoNeto, ingresoTotal;
        double ingresoAntiguedad, deduccionesTotales;
        double deduccionINSS, deduccionIR, deduccionSindicato;
        double deduccionINSSPatronal;
        //Pedirle los datos al usuario
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su salario bruto/basico:");
        salarioBruto = lector.nextDouble();
        ingresoAntiguedad = salarioBruto * (tasaAntiguedad/100);
        ingresoTotal = salarioBruto + ingresoAntiguedad;
        deduccionINSS = ingresoTotal * (tasaINSS/100);
        deduccionIR = ingresoTotal * (tasaIR/100);
        deduccionSindicato = salarioBruto * (tasaSindicato/100);
        deduccionesTotales = deduccionINSS + deduccionIR + deduccionSindicato;
        ingresoNeto = ingresoTotal - deduccionesTotales;
    }
}
