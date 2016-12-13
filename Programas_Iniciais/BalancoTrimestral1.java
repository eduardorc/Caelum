//Exercício 3.3 pág 29 - Variáveis e Tipos Primitivos

class BalancoTrimestral1 {

  public static void main (String[] args){
    int gastosJaneiro = 15000, gastosFevereiro = 23000, gastosMarco = 17000;
    int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
    System.out.println ("\nO Valor gasto no trimestre foi de "+ gastosTrimestre +
    " Reais\n");
    int mediaMensal = gastosTrimestre/3;
    System.out.println ("O valor médio mensal foi de R$"+mediaMensal+"\n");
  }

}
