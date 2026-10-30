package poo;


public class Impressora {
    public String modelo;
    public int totalDeFolhas;

    public void statusDaImpressora(){
        System.out.println("MODELO: "+modelo);
        System.out.println("QUANTIDADE DE FOLHAS: "+ totalDeFolhas);
    }

    public void imprimir(int quantidadeImprimir){
        if (quantidadeImprimir <= 0){
            System.out.println("NÃO É POSSIVEL IMPRIMIR ESSA QUANTIDADE!");
            return;
        }
        if (quantidadeImprimir > totalDeFolhas){
            System.out.println("QUANTIDADE DE FOLHAS INDISPONÍVEL, POR FAVOR COLOQUE MAIS FOLHAS E TENTE NOVAMENTE!");
            return;
        }
        totalDeFolhas -= quantidadeImprimir;
        for (int i = 3; i > 0; i--) {
            System.out.println("IMPRIMINDO: "+ i);
        }
        System.out.println(quantidadeImprimir +" FOLHAS FORAM IMPRESSAS COM SUCESSO! \n FOLHAS RESTANTES:" + totalDeFolhas);

  }

  public void adicionarFolhas(int acrescentarFolhas){
            if ((totalDeFolhas + acrescentarFolhas) <=100 && acrescentarFolhas >0){
                totalDeFolhas +=acrescentarFolhas;
                System.out.println(acrescentarFolhas +" FOLHAS FORAM ADICIONADAS COM SUCESSO! \n TOTAL DE FOLHAS:  "+ totalDeFolhas);
                return;
            }

      System.out.println("NÃO FOI POSSIVEL ADICIONAR ESSA QUANTIDADE DE FOLHAS, COLOQUE NO MIN: 1 FOLHA E MAX:100 FOLHAS NA BANDEJA!");
  }

}
