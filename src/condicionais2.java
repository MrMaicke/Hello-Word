public class condicionais2 {
    public static void main(String[] args) {

        int nota = 100;
        String graduacao;
        //a 80 b 70 c 60 d 0
        if (nota >= 80) {
            graduacao = "A";
            //System.out.println("Graduação a");
        }else if (nota < 80 && nota >= 70) {
            graduacao = "B";
            //System.out.println("Graduação b");
        }else if (nota < 70 && nota >= 60) {
            graduacao = "C";
            //System.out.println("Graduação c");
        }else if (nota < 60 && nota >= 0) {
            graduacao = "D";
            //System.out.println("Graduação d");
        }else {
            graduacao = "";
            //System.out.println("Nota inválida!");
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Não aprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }
    }
}