import java.util.Scanner;

public class ValidacaoDeSenha {

    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer senhaCorreta = 12345, quantidadeMaximaTentativas = 3;
        Integer senhaDigidata = 0, quantidadeDeTeentativas = 0;

        do {
            System.out.println("Informe a senha:");
            senhaDigidata = prompt.nextInt();
            if (!senhaDigidata.equals(senhaCorreta)) {
                System.out.println("Senha incorreta");
                quantidadeDeTeentativas++;
            }
        } while (!senhaDigidata.equals(senhaCorreta) && quantidadeDeTeentativas < quantidadeMaximaTentativas);

        if (quantidadeDeTeentativas.equals(quantidadeMaximaTentativas)) {
            System.out.println("Sua conta esta bloqueada por errar mais de " + quantidadeMaximaTentativas + "X a senha");
        } else {
            System.out.println("Sua senha esta correta");
        }
    }
}
