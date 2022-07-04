#include <stdio.h>
#include <stdlib.h>
#include<string.h>

// link replit https://replit.com/@kaiogomes3/C#main.c

int main(void) {
  int V=0,P=0;
  char aux;
  
  
  printf("informe V para vitória ou D para derrota!\n\n");
  printf("Informe os resultados das partidas do participante: \n");

  for(int i=0; i<6; i++){
    printf("%d º: ", i+1);
    scanf("%s", &aux);
       fflush(stdin);

    if(aux == 'v'){
      V++;
    } else {
      P++;
    }
  
  }
  if(V >= 5){
  printf("O participante venceu %d partidas e está no grupo 1.", V);
  } else if (V == 3 || V == 4){
    printf("O participante venceu %d partidas e está no grupo 2.", V);
  } else if(V == 1 || V == 2 ){
    printf("O participante venceu %d partidas e está no grupo 3.", V);
  } else if (P == 6) {
    printf("O participante não venceu nenhuma partida e foi desclassificado.");
  }
  return 0;
}