
class ExercicioX2 {

  public static double fatorial (int n){
    double fat = 1;
    for (int i = n; i>0; i--){
      fat *= i;
    }
    return fat;
  }

  public static void main (String[] args){
    //Imprima todos os números de 150 a 300
    for (int i = 150; i<=300; i++){
      System.out.printf (i+" ");
    }
    System.out.printf ("\n");

    //Imprima a soma de 1 até 1000
    int soma = 0;
    for (int i = 1; i<=1000; i++){
      if (i != 1000){
        soma += i;
      }
      else {
        System.out.println ("\nSoma de 1 até 1000 é "+soma+"\n\n");
      }
    }

    //Imprima todos os múltiplos de 3 entre 1 e 100
    for (int i = 1; i<=100; i++){
      if (i%3 == 0){
        System.out.printf (i+" ");
      }
    }
    System.out.printf ("\n");

    //Imprima os fatoriais de 1 a 10
    for (int i=1; i<=40; i++){
      double fat = fatorial(i);
      System.out.printf ("Fatorial de %d é "+fat+"\n",i);
    }












  }
}
