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
        int n=24;
        maior_Preco obj = new maior_Preco();
        System.out.println(String.format("Nome: %d", obj.nome, n));
        System.out.println("Preco: " + obj.preco);
    }
}