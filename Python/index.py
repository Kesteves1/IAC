V = 0
P = 0
x = 0
print("Informe V para vitória ou P para derrota!\n")
print(("Informe os resultados das partidas do participante: \n"))

for i in range(6):
    print((i+1), str("º: "))
    x = input()

    if x.lower() == "v":
        V+=1
    else:
        P+=1
        
    
if V >= 5:
    print("O participante venceu ", str(V) ," partidas e está no grupo 1.")
elif V == 3 or V == 4:
    print("O participante venceu ", str(V) ," partidas e está no grupo 2.")
elif V == 1 or V == 2:
    print("O participante venceu ", str(V) ," partidas e está no grupo 3.")
elif P == 6:
    print("O participante não venceu nenhuma partida e foi desclassificado.")