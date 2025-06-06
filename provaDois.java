 import java.util.Scanner;
public class provaDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva a sua nota 1: ");
		double nota1 = sc.nextDouble();
		System.out.println("escreva a sua nota 2: ");
		double nota2 = sc.nextDouble();
		System.out.println("escreva a sua nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.println("escreva a sua nota 4: ");
        double nota4 = sc.nextDouble();
        System.out.println("escreva a sua nota 5: ");
        double nota5 = sc.nextDouble();
        System.out.println("escreva a sua nota 6: ");
        double nota6 = sc.nextDouble();
        System.out.println("escreva a sua nota 7: ");
        double nota7 = sc.nextDouble();
        System.out.println("escreva a sua nota 8: ");
        double nota8 = sc.nextDouble();
        
        double bimestre1 = (nota1 + nota2)/2;
        double bimestre2 = (nota3 + nota4)/2;
        double semestre1 = (nota5 + nota6)/2;
        double bimestre3 = (nota5 + nota6)/2;
        double bimestre4 = (nota7 + nota8)/2;
        double semestre2 = (bimestre3 + bimestre4)/2;
        double mediaFinal = (semestre1 + semestre2)/2;
        
        System.out.println("1° bimestre : " + bimestre1 + 
        	"\n2° bimestre : " + bimestre2 +
        	"\n1° semestre : " + bimestre1 +
        	"\n3° bimestre : " + bimestre3 +
        	"\n4° bimestre : " + bimestre4 +
        	"\n2° semestre : " + semestre2 +
        	"\nMédia Final: " + mediaFinal
        );
	      
	}        
}



