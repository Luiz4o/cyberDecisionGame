import java.util.Scanner;

public class Main {
    private static int pontos = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("   LABIRINTO DE SEGURANÇA - EMPRESA TECHNOVA");
        System.out.println("==============================================");
        System.out.println("\nVocê é o analista de segurança da TechNova.");
        System.out.println("A empresa sofreu tentativas de invasão e você");
        System.out.println("precisa tomar decisões estratégicas para");
        System.out.println("proteger os dados e manter os serviços online.");
        System.out.println("\nObjetivo: Terminar com zero incidentes graves!");
        System.out.println("==============================================\n");

        etapa1();
        etapa2();
        etapa3();
        etapa4();
        etapa5();
        etapa6();
        etapa7();
        etapa8();
        etapa9();
        resultadoFinal();

        scanner.close();
    }

    private static void etapa1() {
        System.out.println("\n--- ETAPA 1: ANÁLISE DE RISCOS ---");
        System.out.println("O servidor está exposto à internet.");
        System.out.println("Qual é o primeiro passo?\n");
        System.out.println("A) Publicar o sistema direto na nuvem, sem restrições");
        System.out.println("B) Fazer uma análise de riscos antes da publicação");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ VAZAMENTO DE DADOS! Você ignorou os riscos.");
            pontos -= 1;
        } else {
            System.out.println("\n✓ Excelente! Você identificou vulnerabilidades e ganhou um escudo de prevenção.");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa2() {
        System.out.println("\n--- ETAPA 2: POLÍTICAS DE SEGURANÇA ---");
        System.out.println("A equipe solicita acesso total aos servidores.\n");
        System.out.println("A) Conceder acesso irrestrito (mais rápido)");
        System.out.println("B) Criar política de senhas, perfis e controle de acesso");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ Credenciais expostas e contas comprometidas!");
            pontos -= 1;
        } else {
            System.out.println("\n✓ Bom trabalho! O controle de acesso reduziu o risco interno.");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa3() {
        System.out.println("\n--- ETAPA 3: AUDITORIA E NORMAS ---");
        System.out.println("Um cliente exige comprovação de conformidade.\n");
        System.out.println("A) Ignorar normas, 'já temos antivírus'");
        System.out.println("B) Implementar controles baseados na ISO 27001 e LGPD");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ Penalidade por não conformidade e vazamento!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ Você reforçou a governança e ganhou um selo de conformidade!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa4() {
        System.out.println("\n--- ETAPA 4: FIREWALLS E MONITORAMENTO ---");
        System.out.println("Tráfego suspeito vindo do exterior foi detectado.\n");
        System.out.println("A) Abrir todas as portas para facilitar a comunicação");
        System.out.println("B) Configurar firewall e IDS para análise e bloqueio");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ INVASÃO TOTAL! O hacker explorou a porta 22!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ Alerta detectado e ataque bloqueado com sucesso!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa5() {
        System.out.println("\n--- ETAPA 5: SOFTWARES MALICIOSOS ---");
        System.out.println("Um e-mail de 'fatura urgente' chega ao financeiro.\n");
        System.out.println("A) O funcionário abre o anexo");
        System.out.println("B) Treinar a equipe sobre phishing");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ RANSOMWARE criptografa o servidor!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ A equipe identifica o golpe e evita o ataque!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa6() {
        System.out.println("\n--- ETAPA 6: PROTEÇÃO DE APLICAÇÕES WEB ---");
        System.out.println("O site usa formulários sem validação.\n");
        System.out.println("A) Ignorar, 'ninguém vai invadir'");
        System.out.println("B) Implementar filtros e segurança IP");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ Ataque SQL Injection rouba o banco de dados!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ Site protegido com WAF e validações!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa7() {
        System.out.println("\n--- ETAPA 7: CRIPTOGRAFIA E PROTEÇÃO DE DADOS ---");
        System.out.println("Dados de clientes são armazenados sem criptografia.\n");
        System.out.println("A) Armazenar em texto simples");
        System.out.println("B) Criptografar e usar chaves seguras");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ Dados vazam, multa da LGPD aplicada!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ Dados seguros, confiança mantida!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa8() {
        System.out.println("\n--- ETAPA 8: DETECÇÃO E RESPOSTA A INCIDENTES ---");
        System.out.println("O IDS detecta anomalias no sistema.\n");
        System.out.println("A) Ignorar o alerta");
        System.out.println("B) Acionar o plano de resposta a incidentes");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ O ataque escala e paralisa os serviços!");
            pontos -= 3;
        } else {
            System.out.println("\n✓ Você controla o incidente e restaura o ambiente!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static void etapa9() {
        System.out.println("\n--- ETAPA 9: BACKUP E RECUPERAÇÃO ---");
        System.out.println("É necessário implementar uma estratégia de backup.\n");
        System.out.println("A) Fazer backup local apenas, sem testes");
        System.out.println("B) Implementar backup redundante e testar restauração");

        String resposta = lerResposta();

        if (resposta.equals("A")) {
            System.out.println("\n❌ Backup corrompido, dados perdidos!");
            pontos -= 1;
        } else {
            System.out.println("\n✓ Estratégia de backup eficiente implementada!");
            pontos += 2;
        }
        System.out.println("Pontuação atual: " + pontos);
    }

    private static String lerResposta() {
        String resposta;
        while (true) {
            System.out.print("\nSua escolha: ");
            resposta = scanner.nextLine().trim().toUpperCase();

            if (resposta.equals("A") || resposta.equals("B")) {
                return resposta;
            } else {
                System.out.println("⚠ ERRO: Digite apenas A ou B!");
            }
        }
    }

    private static void resultadoFinal() {
        System.out.println("\n==============================================");
        System.out.println("           RESULTADO FINAL");
        System.out.println("==============================================");
        System.out.println("Pontuação total: " + pontos + " pontos\n");

        if (pontos >= 12) {
            System.out.println("🏆 EMPRESA PROTEGIDA!");
            System.out.println("Parabéns! Você demonstrou excelente conhecimento");
            System.out.println("em segurança da informação e protegeu a TechNova!");
        } else if (pontos >= 8) {
            System.out.println("📚 ANALISTA EM FORMAÇÃO");
            System.out.println("Bom trabalho, mas ainda há espaço para melhorar.");
            System.out.println("Continue estudando segurança da informação!");
        } else {
            System.out.println("⚠ EMPRESA COMPROMETIDA");
            System.out.println("A TechNova sofreu diversos incidentes de segurança.");
            System.out.println("Revise os conceitos e tente novamente!");
        }

        System.out.println("\nFeito por Luiz e Gabriela!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("==============================================");
    }
}