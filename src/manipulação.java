public class manipulação {
    public static void main(String[] args) {
        //Olá, {nome}. Hoje é {dis-da-semana}, BOM DIA.

        String nome = "Marcelo";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "marcelo";
        System.out.println(nome.equals(nomeOutro));
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
    }
}