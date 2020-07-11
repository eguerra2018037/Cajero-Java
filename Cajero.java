import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class Cajero{
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	BigInteger numTrans= new BigInteger(50, rand);
	String usuario;
	String contrasenia;
	String opcion = null;
	String repetir = null;
	String vacio;
	int saldo1 = 5000;
	int monto1 = 0;
	int nuevo1 = 0;
	int saldo2 = 3000;
	int monto2 = 0;
	int nuevo2 = 0;
	int saldo3 = 8000;
	int monto3 = 0; 
	int nuevo3 = 0;
	int retiro;
	int op;
	int variable;
	int acumulado = 0;
	int acumulado2 = 0;
	int acumulado3 = 0;

	/*usuarios y contraseñas:
		Carlos - carl05	
		Gabriel - gabr13l
		Mario - mar10  */
	
	do{
		System.out.println("=================================================");
		System.out.println("|	Bienvenido a nuestra red de cajeros	|");
		System.out.println("=================================================");		
		System.out.println("|	    INGRESE SU NOMBRE DE USUARIO	|");
		System.out.println("=================================================");
		usuario = scan.next();
		System.out.println("=================================================");
		System.out.println("|	         NGRESE SU CONTRASENIA		|");
		System.out.println("=================================================");
		contrasenia = scan.next();
		scan.nextLine();

		if(usuario.equals("Carlos") && contrasenia.equals("carl05")){
			System.out.println("Bienvenido Carlos a su cuenta bancaria");
			
			do{
			System.out.println("\nElija una accion:");
			System.out.println("1. Consulta de saldos");
			System.out.println("2. Retiro de efectivo");
			System.out.println("3. Cancelar");
			op = scan.nextInt();

			switch(op){
				case 1:
					if(monto1 == 0){
						System.out.println("Su saldo disponible es de: " + saldo1);
					}else{
						System.out.println("Su saldo disponible es de: " + nuevo1);
						}
					break;
				case 2:

				if(acumulado < 2000){
					System.out.println("Seleccione el monto que desea retirar:");
					System.out.println("1. 100");
					System.out.println("2. 200");
					System.out.println("3. 300");
					System.out.println("4. 400");
					System.out.println("5. 500");
					System.out.println("6. 600");
					System.out.println("7. Monto Variable");
					System.out.println("Elija una opcion");
					retiro = scan.nextInt();

					switch(retiro){
						case 1:
							monto1 = 100;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 2:
							monto1 = 200;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 3:
							monto1 = 300;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 4:
							monto1 = 400;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 5:
							monto1 = 500;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}break;
			
						case 6:
							monto1 = 600;
						if (monto1 < saldo1){
							nuevo1 = (saldo1 - monto1);
							saldo1 = nuevo1;
							acumulado = acumulado + monto1;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 7:
							System.out.println("Ingrese el monto que desea retirar");
							variable = scan.nextInt();
						if(((variable%50) == 0) && (variable < saldo1) && (variable <= 2000)){
							nuevo1 = (saldo1 - variable);
							saldo1 = nuevo1;
							acumulado = (acumulado + variable);
							System.out.println("Tome su dinero. \nSu nuevo saldo disponible es de " + nuevo1 + " quetzales. \nNumero de transaccion " + numTrans);
						}else if(variable >= saldo1){
							System.out.println("No cuenta con suficiente dinero para retirar");
						}else{
							System.out.println("Ingrese una cantidad valida");
						}
						break;
					
						default:
							System.out.println("Elija una opcion valida");

						break;
						}break;
					}else{
						System.out.println("No tiene permitido retirar mas dinero");
					}
			
				case 3:
					break;

				default:
					System.out.println("Elija una opcion valida");
				break;
					}
			
			System.out.println("Desea realizar otra accion?");
			opcion = new Scanner(System.in).nextLine();
			usuario = null;
			contrasenia = null;
			}while (opcion.equals("si") || opcion.equals("Si"));
				}else if(usuario.equals("Gabriel") && contrasenia.equals("gabr13l")){
			System.out.println("Bienvenido Gabriel a su cuenta bancaria");

			do{

			System.out.println("\nElija una accion:");
			System.out.println("1. Consulta de saldos");
			System.out.println("2. Retiro de efectivo");
			System.out.println("3. Cancelar");
			op = scan.nextInt();

			switch(op){
				case 1:
					if(monto2 == 0){
						System.out.println("Su saldo disponible es de: " + saldo2);
					}else{
						System.out.println("Su saldo disponible es de: " + nuevo2);
						}
					break;
				case 2:

				if(acumulado2 < 2000){
					System.out.println("Seleccione el monto que desea retirar:");
					System.out.println("1. 100");
					System.out.println("2. 200");
					System.out.println("3. 300");
					System.out.println("4. 400");
					System.out.println("5. 500");
					System.out.println("6. 600");
					System.out.println("7. Monto Variable");
					System.out.println("Elija una opcion");
					retiro = scan.nextInt();

					switch(retiro){
						case 1:
							System.out.println("No cuenta con suficiente dinero para retirar");
							monto2 = 300;
							monto2 = 100;
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 2:
							monto2 = 200;
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
						}
						break;
			
						case 3:
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 4:
							monto2 = 400;
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 5:
							monto2 = 500;
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}break;
			
						case 6:
							monto2 = 600;
						if (monto2 < saldo2){
							nuevo2 = (saldo2 - monto2);
							saldo2 = nuevo2;
							acumulado2 = acumulado2 + monto2;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 7:
							System.out.println("Ingrese el monto que desea retirar");
							variable = scan.nextInt();
						if(((variable%50) == 0) && (variable < saldo2) && (variable <= 2000)){
							nuevo2 = (saldo2 - variable);
							saldo2 = nuevo2;
							acumulado2 = (acumulado2 + variable);
							System.out.println("Tome su dinero. \nSu nuevo saldo disponible es de " + nuevo2 + " quetzales. \nNumero de transaccion " + numTrans);
						}else if(variable >= saldo2){
							System.out.println("No cuenta con suficiente dinero para retirar");
						}else{
							System.out.println("Ingrese una cantidad valida");
						}
						break;
					
						default:
							System.out.println("Elija una opcion valida");

						break;
						}break;
					}else{
						System.out.println("No tiene permitido retirar mas dinero");
					}
			
				case 3:
					break;

				default:
					System.out.println("Elija una opcion valida");
				break;
					}
			
			System.out.println("Desea realizar otra accion?");
			opcion = new Scanner(System.in).nextLine();
			usuario = null;
			contrasenia = null;
			}while (opcion.equals("si") || opcion.equals("Si"));
				}else if(usuario.equals("Mario") && contrasenia.equals("mar10")){
			System.out.println("Bienvenido Mario a su cuenta bancaria");

			do{

			System.out.println("\nElija una accion:");
			System.out.println("1. Consulta de saldos");
			System.out.println("2. Retiro de efectivo");
			System.out.println("3. Cancelar");
			op = scan.nextInt();

			switch(op){
				case 1:
					if(monto3 == 0){
						System.out.println("Su saldo disponible es de: " + saldo3);
					}else{
						System.out.println("Su saldo disponible es de: " + nuevo3);
						}
					break;
				case 2:

				if(acumulado3 < 2000){
					System.out.println("Seleccione el monto que desea retirar:");
					System.out.println("1. 100");
					System.out.println("2. 200");
					System.out.println("3. 300");
					System.out.println("4. 400");
					System.out.println("5. 500");
					System.out.println("6. 600");
					System.out.println("7. Monto Variable");
					System.out.println("Elija una opcion");
					retiro = scan.nextInt();

					switch(retiro){
						case 1:
							monto3 = 100;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 2:
							monto3 = 200;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 3:
							monto3 = 300;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 4:
							monto3 = 400;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 5:
							monto3 = 500;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}break;
			
						case 6:
							monto3 = 600;
						if (monto3 < saldo3){
							nuevo3 = (saldo3 - monto3);
							saldo3 = nuevo3;
							acumulado3 = acumulado3 + monto3;
							System.out.println("Tome su dinero. \nSu nuevo saldo es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else{
							System.out.println("No cuenta con suficiente dinero para retirar");
						}
						break;
			
						case 7:
							System.out.println("Ingrese el monto que desea retirar");
							variable = scan.nextInt();
						if(((variable%50) == 0) && (variable < saldo3) && (variable <= 2000)){
							nuevo3 = (saldo3 - variable);
							saldo3 = nuevo3;
							acumulado3 = (acumulado3 + variable);
							System.out.println("Tome su dinero. \nSu nuevo saldo disponible es de " + nuevo3 + " quetzales. \nNumero de transaccion " + numTrans);
						}else if(variable >= saldo3){
							System.out.println("No cuenta con suficiente dinero para retirar");
						}else{
							System.out.println("Ingrese una cantidad valida");
						}
						break;
					
						default:
							System.out.println("Elija una opcion valida");

						break;
						}break;
					}else{
						System.out.println("No tiene permitido retirar mas dinero");
					}
			
				case 3:
					break;

				default:
					System.out.println("Elija una opcion valida");
				break;
					}
			
			System.out.println("Desea realizar otra accion?");
			opcion = new Scanner(System.in).nextLine();
			}while (opcion.equals("si") || opcion.equals("Si"));
				}else{
					System.out.println("Nombre de usuario y/o contrasenia no validos");
				}
		System.out.println("Desea regresar al menu principal?");
		repetir = new Scanner(System.in).nextLine();
		}while (repetir.equals("si") || repetir.equals("Si"));
	}
}