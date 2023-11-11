package Atendimento;

public class Ficha {
    public static void main(String[] args){

        Cliente c1 = new Cliente();
        c1.setCodigo(101010);
        c1.setNome("Gabriel Cardozo");
        c1.setCpf("11122233344");
        c1.setTelefone("(81) 99505-2246");
        c1.setEndereco("Rua Professor Avertano Rocha, 191 - San Martin");
        c1.status();
        c1.cadastrocompleto();
    }
}
