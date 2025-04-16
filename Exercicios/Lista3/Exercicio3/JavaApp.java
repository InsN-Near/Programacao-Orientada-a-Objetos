//public class JavaApp {
  //  public static void main (String[] args){
     // Java javaObj = new Java("Java 11");
      //System.out.println(javaobj.getNome());
   // }
 // }
  
  // Supomos que a classe Java exista em outro arquivo:
  // public class Java {
  //     private String nome;
  //     public Java(String nome) { this.nome = nome; }
  //     public String getNome() { return nome; }
  // }

  /*Exemplo de Objeto (Instância):
javaObj (na linha 3 e 4): É uma variável que referencia um objeto criado a partir da classe Java. A instanciação ocorre com new Java("Java 11").
System.out: É um objeto estático pré-definido da classe PrintStream, usado para saída padrão.
Exemplo de Método:
main: É o método principal onde a execução do programa JavaApp começa.
println: É um método chamado no objeto System.out para imprimir dados no console.
getNome: É um método chamado no objeto javaObj (linha 4) para obter o valor do atributo nome desse objeto (assumindo a existência da classe Java com este método).
Java("Java 11"): É a chamada ao construtor da classe Java (um tipo especial de método usado para criar objetos).
Exemplo de Classe:
JavaApp: É o nome da classe que contém o método main.
Java: É o nome da classe usada para criar o objeto javaObj.
String: É uma classe pré-definida em Java, usada para representar texto (args, "Java 11").
System: É uma classe pré-definida em Java que fornece acesso a recursos do sistema, como o out.

lasse (Class): É um modelo, um blueprint ou um protótipo a partir do qual os objetos são criados. Define um conjunto de atributos (variáveis que representam o estado) e métodos (funções que representam o comportamento) que os objetos criados a partir dela terão. Ex: A classe Livro define que todo livro terá titulo e autor.
Objeto (Object): É uma instância concreta de uma classe. Enquanto a classe é o modelo, o objeto é a entidade real criada a partir desse modelo, existindo na memória durante a execução do programa. Cada objeto tem seu próprio estado (valores específicos para seus atributos) e pode executar os comportamentos (métodos) definidos pela sua classe. Ex: livro1 é um objeto da classe Livro com título "O Senhor dos Anéis".
Método (Method): É uma função ou procedimento associado a uma classe ou a um objeto. Define um comportamento ou uma ação que a classe ou o objeto pode realizar. Métodos manipulam os atributos do objeto ou realizam alguma tarefa. Ex: O método imprimirDetalhes() na classe Livro exibe os valores dos atributos titulo e autor de um objeto Livro específico.*/