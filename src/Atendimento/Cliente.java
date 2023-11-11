package Atendimento;

public class Cliente {
    private double codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;



    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void status(){
        System.out.println("Código: "+ this.codigo);
        System.out.println("Atendimento.Cliente: " + this.nome);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
    }
    public void cadastrocompleto(){
        if(this.codigo != 0 && this.nome != null && this.cpf != null
                && this.telefone != null && this.endereco != null){
            System.out.println("Cadastro concluído com sucesso!");
        }else{
            System.out.println("Cadastro incompleto, verifique as informações.");
        }
    }

    public void compra(){
        System.out.println("Pedido: " );
        System.out.println("Valor da compra: " );
    }

}
