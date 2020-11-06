public class Jogo
{
    private String nome;
    private String genero;
    private int ano;

    public Jogo(String nome, String genero, int ano)
    {
        this.nome = nome;
        this.genero = genero;
        this.ano = ano;
    }

    public void executar()
    {
        System.out.println("O jogo esta rodando");
        jogar();
    }

    private void jogar()
    {
        System.out.println("O jogador esta jogando");

    }

    public void encerrar()
    {
        System.out.println("O jogo sera encerrado se o jogador ficar inativo");
    }

    public void status()
    {
        System.out.println("***************");
        System.out.println("Jogo");
        System.out.println("Nome: " + this.nome);
        System.out.println("Genero: " + this.genero);
        System.out.println("Ano de lancamento: " + this.ano);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setGenero(String genero)
    {
        this.genero = genero;
    }

    public String getGenero()
    {
        return this.genero;
    }

    public void setLancamento(int ano)
    {
        this.ano = ano;
    }

    public float getAno()
    {
        return this.ano;
    }
}
