package Cadastros;

public class CadastroCliente {
    private int codCliente;
    private String nomeCliente, cpf, contatoCLiente, enderecoCliente;

    public CadastroCliente(int codCliente, String nomeCliente, String cpf, String contatoCLiente, String enderecoCliente) {
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.contatoCLiente = contatoCLiente;
        this.enderecoCliente = enderecoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }
    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getContatoCLiente() {
        return contatoCLiente;
    }
    public void setContatoCLiente(String contatoCLiente) {
        this.contatoCLiente = contatoCLiente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void statusCadastroCliente(){
        System.out.println("Código: "+ this.codCliente);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("CPF: "+ this.cpf);
        System.out.println("Telefone: " + this.contatoCLiente);
        System.out.println("Endereço: " + this.enderecoCliente);

        if(this.codCliente != 0 && this.nomeCliente != null && this.cpf != null
                && this.contatoCLiente!= null && this.enderecoCliente != null){
            System.out.println(" ");
            System.out.println("!!Cadastro concluído com sucesso!!");
        }else{
            System.out.println("Cadastro incompleto, verifique as informações.");
    }

    }

    public void compra(){
        System.out.println("Pedido: " );
        System.out.println("Valor da compra: " );
    }

}
