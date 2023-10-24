É possível que um subPrograma altere o conteúdo original de variável recebida por parâmetro sem que o subPrograma realize o retorno desse valor, ou seja, o programa principal, envia como parâmetro para o subPrograma o conteúdo de uma variável, sendo assim,será possível alterar o valor original sem realizar retorno no subPrograma? Justifique sua resposta.
Sim na global ,
ESCOPO DE UMA VARIÁVEL Ao declararmos uma variável, ela sempre terá uma definição quanto ao seu escopo, ou seja, ela sempre terá uma definição de onde ela será visível aos subprogramas do código. 
Devemos imaginar que existe um limite para que determinada variável seja acessada pelo programa, o escopo é a definição deste limite. 
É possível dividir essa “visibilidade” em duas situações distintas:
• escopo global; • escopo local.
ESCOPO GLOBAL Quando o escopo de uma variável é global, indica que seu valor será visível em todo o programa, por qualquer outro subprograma que a solicitar. 
Sua declaração deverá ser feita fora de todos os subprogramas existentes
é possível perceber que, mesmo que a variável não tenha sido declarada dentro das funções “main” e “somar”, por ser global, foi possível alterar e exibir o conteúdo desta variável.
ESCOPO LOCAL Quando o escopo de uma variável é local, indica que seu valor só estará visível ao programa ou subprograma que a declarar. 
Quando o escopo de uma variável é local, indica que seu valor só estará visível ao subprograma que a declarar. 
Sua declaração deverá ser feita dentro de um subprograma.
A declaração de uma variável local torna-a pertencente à função que a criou, e ocorre a vinculação do nome da variável à execução da função
Uma pertence à função “main” e a outra pertence à função “somar”, elas não são a mesma variável, cada uma tem seu valor associado a execução da função em que foi criada, e consequentemente, só estará ativa quando esta função também estiver. Isto só é possível devido ao escopo local. 
Existem algumas regras importantes que devemos observar durante a declaração de variáveis, para evitarmos conflitos:
• Duas variáveis locais, de uma mesma função, não poderão ter o mesmo nome. • Duas variáveis globais não poderão ter o mesmo nome. • Se uma variável global tiver o mesmo nome de uma variável local, prevalecerá o valor da variável local, onde esta for declarada.
