# LSP-Arquitetura-de-sistemas

 Violação de Design: LSP (Liskov Substitution Principle)
 O Problema: PedidoComFreteGratis
No "Mau Design", ao herdar de Pedido, a classe PedidoComFreteGratis quebra o contrato da classe pai.

Por que quebra o LSP? O Princípio de Liskov diz que uma subclasse deve poder substituir a pai sem alterar o comportamento esperado. Se o Pedido espera aplicar uma taxa e a subclasse "ignora" ou anula esse método, ela engana o sistema. Ela não é um substituto real, é uma exceção à regra.

 Impacto no Cliente (ProcessadorDePagamento)
Quando o design é ruim, a classe cliente (que usa o Pedido) sofre as consequências:

Código "Sujo" (instanceof): O Processador precisa começar a perguntar "Você é um pedido normal ou grátis?" usando if/else.

Rigidez: Toda vez que surgir um frete novo (Ex: Frete Fixo), você terá que mexer no código do Processador, violando também o OCP (Princípio Aberto/Fechado).

Insegurança: O desenvolvedor nunca sabe se ao chamar aplicarFrete(), o valor será realmente processado ou ignorado silenciosamente pela subclasse.

# A Solução: Padrão Strategy
Em vez de herança, usamos composição. O ProcessadorDePagamento agora recebe uma EstrategiaDeFrete. Isso torna o sistema flexível, onde qualquer frete pode substituir outro perfeitamente.

O cálculo do frete estava "preso" dentro da classe Pedido. Isso forçava o uso de herança indevida (PedidoComFreteGratis), quebrando o LSP (Princípio de Liskov) ao forçar comportamentos que o cliente não esperava.

 A Solução:
Removi a lógica de frete da entidade Pedido (SRP).

Criei a interface EstrategiaDeFrete (Strategy Pattern).

Implementei classes concretas (FretePadrao, FreteGratis) que são intercambiáveis.

 Resultado:
O ProcessadorDePagamento agora aceita qualquer estratégia de frete sem precisar de if/else ou instanceof. O código ficou flexível, limpo e fácil de expandir.
