package Cadastros;

public class CadastroFornec {

    private String cnpj, inscrEstad, nomeFornec, enderFornec, contatoFornec, tipoProd;



    public CadastroFornec(String cnpj, String inscrEstad, String nomeFornec, String enderFornec, String contatoFornec, String tipoProd) {
        this.cnpj = cnpj;
        this.inscrEstad = inscrEstad;
        this.nomeFornec = nomeFornec;
        this.enderFornec = enderFornec;
        this.contatoFornec = contatoFornec;
        this.tipoProd = tipoProd;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscrEstad() {
        return inscrEstad;
    }
    public void setInscrEstad(String inscrEstad) {
        this.inscrEstad = inscrEstad;
    }

    public String getNomeFornec() {
        return nomeFornec;
    }

    public void setNomeFornec(String nomeFornec) {
        this.nomeFornec = nomeFornec;
    }

    public String getEnderFornec() {
        return enderFornec;
    }
    public void setEnderFornec(String enderFornec) {
        this.enderFornec = enderFornec;
    }

    public String getContatoFornec() {
        return contatoFornec;
    }
    public void setContatoFornec(String contatoFornec) {
        this.contatoFornec = contatoFornec;
    }

    public String getTipoProd() {
        return tipoProd;
    }
    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public void statusCadastroFornec() {
        System.out.println("-------CADASTRO DE FORNECEDOR-------");
        System.out.println("CNPJ: " + this.getCnpj());
        System.out.println("INSCRIÇÃO ESTADUAL: " + this.getInscrEstad());
        System.out.println("FORNECEDOR: " + this.getNomeFornec());
        System.out.println("ENDEREÇO: " + this.getEnderFornec());
        System.out.println("CONTATO: " + this.getContatoFornec());
        System.out.println("TIPO: " + this.getTipoProd());

        if (this.getCnpj() != null && this.getInscrEstad() != null && this.getNomeFornec() != null
                && this.getEnderFornec() != null && this.getContatoFornec() != null && this.getTipoProd() != null) {
            System.out.println(" ");
            System.out.println("!!Cadastro concluído com sucesso!!");
        } else {
            System.out.println("Cadastro incompleto, verifique as informações.");

        }

    }

}

