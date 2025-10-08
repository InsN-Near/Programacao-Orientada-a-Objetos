package Trabalhos.TrabalhoFinal.src;


import java.util.ArrayList;
import java.util.List;

// Este arquivo contém comentários detalhados para facilitar a apresentação e a compreensão do código.
// A ideia é que cada comentário sirva como um guia durante a defesa do projeto.

/**
 * REQUISITO 1: Classes e Objetos
 * Classe principal que gerencia as operações do restaurante, como mesas, menu e clientes.
 */
public class Restaurante {

    // REQUISITO 4: Encapsulamento
    private String nome;

    // REQUISITO 2: Agregação
    // O Restaurante POSSUI várias Mesas. É uma relação "tem-um", onde as mesas são parte do
    // restaurante, mas poderiam, conceitualmente, existir sem ele.
    // REQUISITO 6: Arrays e Coleções
    private List<Mesa> mesas;
    private List<Prato> menu;
    private List<Cliente> clientes;

    public Restaurante(String nome) {
        this.nome = nome;
        this.mesas = new ArrayList<>();
        this.menu = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    // Métodos para adicionar elementos ao restaurante
    public void adicionarMesa(Mesa mesa) {
        this.mesas.add(mesa);
    }

    public void adicionarPratoAoMenu(Prato prato) {
        this.menu.add(prato);
    }

    public void cadastrarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    /**
     * REQUISITO 9: Manipulação de Strings
     * Implementa a busca de pratos no menu. A busca é "case-insensitive" (ignora maiúsculas/minúsculas)
     * e verifica se o termo de busca está contido no nome OU na categoria do prato.
     * @param termo O texto a ser buscado (nome ou categoria).
     * @return Uma lista de pratos que correspondem ao critério de busca.
     */
    public List<Prato> buscarPratoPorNomeOuCategoria(String termo) {
        List<Prato> resultados = new ArrayList<>();
        String termoBusca = termo.toLowerCase(); // Converte para minúsculas para busca case-insensitive

        for (Prato prato : menu) {
            if (prato.getNome().toLowerCase().contains(termoBusca) ||
                prato.getCategoria().toLowerCase().contains(termoBusca)) {
                resultados.add(prato);
            }
        }
        return resultados;
    }

    /**
     * Encontra uma mesa pelo seu número e a marca como ocupada.
     * @param numeroMesa O número da mesa a ser ocupada.
     * @throws MesaIndisponivelException se a mesa não for encontrada ou já estiver ocupada.
     */
    public void ocuparMesa(int numeroMesa) throws MesaIndisponivelException {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numeroMesa) {
                if (mesa.isOcupada()) {
                    // REQUISITO 7: Lançando a exceção
                    throw new MesaIndisponivelException("A mesa " + numeroMesa + " já está ocupada.");
                }
                mesa.ocupar();
                System.out.println("Mesa " + numeroMesa + " ocupada com sucesso.");
                return; // Encerra o método após ocupar a mesa
            }
        }
        // Se o loop terminar e não encontrar a mesa
        throw new MesaIndisponivelException("A mesa " + numeroMesa + " não existe.");
    }
    
    // --- Getters ---
    public String getNome() {
        return nome;
    }

    public List<Mesa> getMesas() {
        return mesas;
    }

    public List<Prato> getMenu() {
        return menu;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
}