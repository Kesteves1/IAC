using System;



namespace Atv_IAC
{
    class Program
    {
        static void Main(string[] args)
        {
            int V = 0, P = 0;

            Console.WriteLine("informe V para vitória ou P para derrota!");
            Console.WriteLine("Informe os resultados das partidas do participante: \n");
            for (int i = 0; i < 6; i++)
            {
                Console.Write(i + 1 + "º: ");
                String resultado = Console.ReadLine();
                resultado = resultado.ToLower();

                if (resultado.Equals("v"))
                {
                    V++;
                }
                else
                {
                    P++;
                }
            }

                if (V >= 5) {
                    Console.WriteLine("O participante venceu " + V + " partidas e está no grupo 1.");
                } else if (V == 3 || V == 4)  {
                    Console.WriteLine("O participante venceu " + V + " partidas e está no grupo 2.");
                } else if (V == 1 || V == 2) { 
                    Console.WriteLine("O participante venceu " + V + " partidas e está no grupo 3.");
                } else if (P == 6) {
                    Console.WriteLine("O participante não venceu nenhuma partida e foi desclassificado."); 
                }
        }
    }
}
