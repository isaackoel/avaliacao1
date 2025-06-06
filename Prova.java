import java.util.Scanner;
public class Prova {
	
	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Digite a temperatura em celsius: ");
	double celsius = sc.nextDouble();
    double f = (celsius * 9/5 + 32);
	double k = celsius + 273.15;
	
    System.out.println("Temperatura em Celsius:" + celsius + " °C"
		+ "\nTemperatura em Fahrenheit: " + f + " °F "
		+ "\nTemperatura wm Kelvin: " + k + " k ");
   
    
    sc.close();
	}

}


	
	
	
	
	
	

