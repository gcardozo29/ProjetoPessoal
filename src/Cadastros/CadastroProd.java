package Cadastros;

public class CadastroProd {
    private int codProd; // o código autoincrement ou classificar por categoria?
    private String nomeProd;
    private int pesoProd;
    private String tipoProd;

    public CadastroProd(int codProd, String nomeProd, int pesoProd, String tipoProd) {
        this.codProd = codProd;
        this.nomeProd = nomeProd;
        this.pesoProd = pesoProd;
        this.tipoProd = tipoProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getPesoProd() {
        return pesoProd;
    }

    public void setPesoProd(int pesoProd) {
        this.pesoProd = pesoProd;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }


    public void statusCadastroProd() {
        System.out.println("CODIGO: " + this.getCodProd());
        System.out.println("Nome: " + this.getNomeProd());
        System.out.println("Peso: " + this.getPesoProd()+"Kg");
        System.out.println("Tipo: " + this.getTipoProd());

        if (this.getCodProd() != 0 && this.getNomeProd() != null && this.getPesoProd() != 0 && this.getTipoProd() != null) {
            System.out.println(" ");
            System.out.println("!!Cadastro concluído com sucesso!!");
        } else {
            System.out.println("Cadastro incompleto, verifique as informações.");
        }

    }
}
