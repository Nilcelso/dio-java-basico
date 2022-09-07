public class Nome {

    public static void main(String[] args) {
        String primeiroNome = "Nilcelso";
        String segundoNome = "Sobrinho";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do mértodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
