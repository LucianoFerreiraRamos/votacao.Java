package votacao;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Em que ano voce nasceu ?");
		int nasc = teclado.nextInt();
		int i = 2021-nasc;
		System.out.println("Seus anos de vida s�o : " + i );
		if (i <= 16) {
			System.out.println("VOC� NAO VOTA ");
		}else {
			if ((i>=16) && (i<18) || (i>70)){
				System.out.println("SEU VOTO � OPCIONAL ");
			}else{ 
					System.out.println("SEU VOTO � OBRIGATORIO ");
				}
				}
			}
		}
				
		
	


