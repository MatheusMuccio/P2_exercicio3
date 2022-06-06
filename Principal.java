public class Principal {

    public static void main(String [] args){
        Pessoa pessoa = new Pessoa();
        PessoaFisica pessoaFisica = new PessoaFisica();
        PessoaJuridica pessoaJuridica = new PessoaJuridica();

        pessoa.setNome("Matheus");
        pessoa.setEndereco("Parque das nações");
        pessoaFisica.setCPF("830.456.769-89");
        pessoaJuridica.setCNPJ("20.300.850/0001-01");

        System.out.println("Nome: " + pessoa.Nome);
        System.out.println("Endereço: " + pessoa.Endereco);
        System.out.println("CPF: " + pessoaFisica.CPF);
        System.out.println("CNPJ: " + pessoaJuridica.CNPJ);





    }
    
}
