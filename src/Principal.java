public class Principal
{
    public static void main(String[] args) throws Exception 
    {
        Carro carro1 = new Carro("Preto", "Toyota", 2.0f);
        
        carro1.status();
        carro1.desligar();
        carro1.ligar();
        

        Livro livro1 = new Livro("O chamado de Cthullhu", "Terror", 70);

        livro1.status();
        livro1.abrir();
        livro1.fechar();

        Jogo jogo1 = new Jogo("Undertale", "RPG", 2015);
        
        jogo1.status();
        jogo1.executar();
        jogo1.encerrar();
    }
}
