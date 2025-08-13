class maior_Preco
{
    private String nome;
    private int preco;

    public maior_Preco()
    {
        this.nome = "";
        this.preco = 0;
    }

    public static void main(String[] args) 
    {
        maior_Preco obj = new maior_Preco();
        System.out.println("Nome: " + obj.nome);
        System.out.println("Preco: " + obj.preco);
    }
}