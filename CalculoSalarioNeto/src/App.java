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
        deduccionINSSPatronal = ingresoTotal * (tasaINSSPatronal/100);
        //Presentar resultados
        System.out.println("Reporte de salario mensual");
        System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("Salario bruto: C$" + salarioBruto);
        System.out.println("Ingresos por antiguedad: C$" + ingresoAntiguedad);
        System.out.println("Ingresos totales: C$" + ingresoTotal);
        System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("Deduccion por INSS: C$" + deduccionINSS);
        System.out.println("Deduccion por IR: C$" + deduccionIR);
        System.out.println("Deduccion por afiliacion al sindicato: C$" + deduccionSindicato);
        System.out.println("Deducciones totales: C$" + deduccionesTotales);
        System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("Ingreso neto: C$" + ingresoNeto);
        System.out.println(":::::::::::::::::::::::::::::");
        System.out.println("Deduccion a la empresa (INSS Patronal) C$" + deduccionINSSPatronal);
        System.out.println("Gracias por utilizar esta App.");
        lector.close();
    }
}
