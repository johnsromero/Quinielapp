import java.io.*;
public class Quiniela{

  public static int resultados(int ganados){
    ganados = 3;
    return ganados;
  }

  public static int resultados1(int empatados){
    empatados = 2;
    return empatados;
  }

  public static void main(String[] args)throws IOException{

    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


    int opc, i , j, ds, cgana1=0, cgana2=0, cempate=0, a=0,b=0, menu=0;
    String [] equipos1 = new String [5];
    equipos1[0] = "America";
    equipos1[1] = "Cruz Azul";
    equipos1[2] = "Atlas";
    equipos1[3] = "Monterrey";
    equipos1[4] = "Santos";

    String [] equipos2 = new String [5];
    equipos2[0] = "Guadalajara";
    equipos2[1] = "Pumas";
    equipos2[2] = "Monarcas";
    equipos2[3] = "Tigres";
    equipos2[4] = "Leon";

    do{

    do{
    System.out.println("\t\nBienvenido a Quinielapp.");
    System.out.println("Elija una opcion:\n");
    System.out.println("1.-Para jugar.");
    System.out.println("2.-Para leer las intrucciones del juego.");
    System.out.println("3.-Para salir del juego");

    opc = Integer.parseInt(entrada.readLine());

    if(opc<1 || opc>3){
      System.out.println("\n\n------La opcion que eligio no es valida.------\n");
    }
  }while(opc<1 || opc>3);

    switch(opc){
      case 1:
      System.out.println("Jornada 5 de Liga MX.");



      for(i=0; i<5; i++){

        do{
      System.out.println("\n" + equipos1[i] + " vs. " + equipos2[i]);
      System.out.println("1.-Gana " + equipos1[i] + "\n2.-Gana " + equipos2[i] + "\n3.-Empate");
      ds = Integer.parseInt(entrada.readLine());
    }while(ds<1 || ds >3);


      if(ds == 1){
        cgana1++;
    }
    else if(ds == 2){
      cgana2++;
    }
    else if(ds == 3){
      cempate++;
    }

  }



  System.out.println("\nResultados\n");
  if((cgana1 + cgana2) == resultados(a)){
    System.out.println("Felicidades acertaste todos los partidos ganados: " + (cgana1+cgana2) + " de " + resultados(a));
  }
  if(cempate == resultados1(b)){
    System.out.println("Felicidades acertatste todos los partidos empatados: " + cempate + " de " + resultados1(b));
  }

  System.out.println("Partidos ganados." + (cgana1+cgana2) + " de " + resultados(a));
  System.out.println("Partidos empatados: " + cempate + " de " + resultados1(b));


      break;
      case 2:
      System.out.println("INSTRUCCIONES");
      System.out.println("Gana o pierde");

      System.out.println("¿Deseas volver al menu principal? Si [1], No [Oprima cualquier numero]");
      menu = Integer.parseInt(entrada.readLine());

      break;
      case 3:
      System.exit(0);
      break;
    }
  }while(menu == 1);


  }
}
