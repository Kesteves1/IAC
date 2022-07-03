import java.util.Scanner;

/**
 *                                                                          Torneio de tênis
 * 
        A prefeitura contratou um novo professor para ensinar as crianças do bairro a jogar tênis na quadra de tênis do parque municipal.
        O professor convidou todas as crianças do bairro interessadas em aprender a jogar tênis.
        Ao final do primeiro mês de aulas e treinamentos foi organizado um torneio em que cada participante disputou exatamente seis jogos.
        O professor vai usar o desempenho no torneio para separar as crianças em três grupos,
        de forma a ter grupos de treino em que os participantes tenham habilidades mais ou menos iguais, usando o seguinte critério:

            participantes que venceram 5 ou 6 jogos serão colocados no Grupo 1;
            participantes que venceram 3 ou 4 jogos serão colocados no Grupo 2;
            participantes que venceram 1 ou 2 jogos serão colocados no Grupo 3;
            participantes que não venceram nenhum jogo não serão convidados a continuar com os treinamentos.
            Dada uma lista com o resultado dos jogos de um participante, escreva um programa para determinar em qual grupo ele será colocado.
        Entrada:
            A entrada consiste de seis linhas, cada linha indicando o resultado de um jogo do participante. 
            Cada linha contém um único caractere: V se o participante venceu o jogo, ou P se o jogador perdeu o jogo. Não há empates nos jogos.
        Saída:
            Seu programa deve produzir uma única linha na saída, contendo um único inteiro, identificando o grupo em que o participante será colocado. 
            Se o participante não for colocado em nenhum dos três grupos seu programa deve imprimir o valor -1.
 */

public class app{
    public static void clear(){ 

        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    } 
    
    public static void main(String[] args) {
        int V = 0, P = 0;
        clear();
        Scanner key = new Scanner(System.in);

        System.out.println("informe V para vitória ou P para derrota!");
        System.out.println("Informe os resultados das partidas do participante: \n");
        for(int i=0; i<6; i++){
                System.out.print(i+1 + "º: ");
                String resultado = key.nextLine();
                resultado = resultado.toLowerCase();
      
            if(resultado.equals("v")){
                V++;
            } else {
                P++;
            }
        }

        if(V >= 5){
            System.out.println("O participante venceu " + V + " partidas e está no grupo 1.");
        } else if (V == 3 || V == 4){
            System.out.println("O participante venceu " + V + " partidas e está no grupo 2.");
        } else if (V == 1 || V == 2 ){
            System.out.println("O participante venceu " + V + " partidas e está no grupo 3.");
        } else if (P == 6) {
            System.out.println("O participante não venceu nenhuma partida e foi desclassificado.");
        }

    }
}
