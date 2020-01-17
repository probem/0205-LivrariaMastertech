package SistemaLivraria;

public class Editora {
    private String nome;
    private int ano;
    private String cnpj;
    private String endereco;
    private String pais;
    private String estado;

    public Editora(String nome, int ano, String cnpj, String endereco, String pais, String estado) {
        this.nome = nome;
        this.ano = ano;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.pais = pais;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano <= 1455){
            System.out.println("Não foi possível adicionar este ano");
        }
        else{
            this.ano = ano;
        }
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String listarDados() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", pais='" + pais + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
