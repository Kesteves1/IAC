// link replit https://replit.com/@kaiogomes3/TautUrbanBaitware

#include <iostream>

int main() {
  int V = 0, P = 0;
  char aux; 
  
  std::cout << "Informe V para vitória ou D para derrota!\n";
  std::cout << "Informe os resultados das partidas do participante: \n";

  for(int i=0; i<6; i++){
     std::cout << (i+1)<<"º: ";
    std::cin >> aux;
    if(aux == 'v'){
      V++;
    } else {
      P++;
    }
  }
  if(V >= 5){
    std::cout << "O participante venceu " << V << " partidas e está no grupo 1.";
  } else if (V == 3 || V == 4) {
    std::cout << "O participante venceu " << V << " partidas e está no grupo 2.";
  } else if (V == 1 || V == 2 ){
    std::cout << "O participante venceu " << V << " partidas e está no grupo 3.";
  } else if (P == 6) {
    std::cout << "O participante não venceu nenhuma partida e foi desclassificado.";
  }
}