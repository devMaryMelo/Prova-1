public class Livro
{
    private String nome;
    private String categoria;
    private int paginas;
    
    public Livro(String nome, String categoria, int paginas)
    {
        this.nome = nome;
        this.categoria = categoria;
        this.paginas = paginas;
    }

   public void abrir()
   {
        System.out.println("Livro aberto");
        folhear();
   }

   private void folhear()
   {
        System.out.println("Folheando..");
   }

   public void fechar()
   {
        System.out.println("Fechando livro");
   }

   public void status()
    {
        System.out.println("---------------");
        System.out.println("Livro");
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Paginas: " + this.paginas);
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setCategoria(String categoria)
    {
        this.categoria = categoria;
    }

    public String getCategoria()
    {
        return this.categoria;
    }

    public void setPaginas(int paginas)
    {
        this.paginas = paginas;
    }

    public int getPaginas()
    {
        return this.paginas;
    }
}
