package br.com.guilhermevillaca.exemplos;
// Exercícios de introdução à programação em Java

import java.util.*;

public class ExerciciosIntroducao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha um exercício (1-18) ou 0 para sair: ");
            int escolha = scanner.nextInt();
            if (escolha == 0)
                break;
            switch (escolha) {
                case 1:
                    exercicio1();
                    break;
                case 2:
                    exercicio2();
                    break;
                case 3:
                    exercicio3();
                    break;
                case 4:
                    exercicio4();
                    break;
                case 5:
                    exercicio5();
                    break;
                case 6:
                    exercicio6();
                    break;
                case 7:
                    exercicio7();
                    break;
                case 8:
                    exercicio8();
                    break;
                case 9:
                    exercicio9();
                    break;
                case 10:
                    exercicio10();
                    break;
                case 11:
                    exercicio11();
                    break;
                case 12:
                    exercicio12();
                    break;
                case 13:
                    exercicio13();
                    break;
                case 14:
                    exercicio14();
                    break;
                case 15:
                    exercicio15();
                    break;
                case 16:
                    exercicio16();
                    break;
                case 17:
                    exercicio17();
                    break;
                case 18:
                    exercicio18();
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
        scanner.close();
    }

    public static void exercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá " + nome);
    }

    public static void exercicio2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Produto: " + (num1 * num2));
        System.out.println("Diferença: " + (num1 - num2));
        System.out.println("Média: " + ((num1 + num2) / 2.0));
        System.out.println("Razão: " + ((double) num1 / num2));
        System.out.println("Resto: " + (num1 % num2));
    }

    public static void exercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println(numero % 2 == 0 ? "Par" : "Ímpar");
    }

    public static void exercicio4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;
        System.out.println("Média: " + media);
        
        if (media > 7) {
            System.out.println("A média é maior que 7.");
        } else if (media < 7) {
            System.out.println("A média é menor que 7.");
        } else {
            System.out.println("A média é igual a 7.");
        }
    }

    public static void exercicio5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número (0 a 6): ");
        String[] dias = { "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };
        int diaNum = scanner.nextInt();
        System.out.println("Bom " + dias[diaNum]);
    }

    public static void exercicio6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um dia da semana: ");
        String dia = scanner.nextLine().toLowerCase();
        
        if (dia.equals("segunda") || dia.equals("terca") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
            System.out.println("Bom dia!");
        } else if (dia.equals("sabado") || dia.equals("domingo")) {
            System.out.println("Mal dia!");
        } else {
            System.out.println("Dia inválido!");
        }
    }

    public static void exercicio7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        long num = scanner.nextLong();
        long fatorial = 1L;
        long i = num;
        while (i > 1) {
            fatorial *= i;
            i--;
        }
        System.out.println("O fatorial de " + num + " é " + fatorial);
    }

    public static void exercicio8() {
        Scanner scanner = new Scanner(System.in);
        int count = 0, val;
        do {
            System.out.print("Digite um número (-1 para parar): ");
            val = scanner.nextInt();
            count++;
        } while (val != -1);
        System.out.println("Total de números lidos: " + (count - 1));
    }

    public static void exercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para fatorial: ");
        int f = scanner.nextInt(), fat = 1;
        for (int i = 1; i <= f; i++)
            fat *= i;
        System.out.println("Fatorial: " + fat);
    }

    public static void exercicio10() {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            if (num > maior)
                maior = num;
        }
        System.out.println("Média: " + (soma / 10) + " | Maior: " + maior);
    }

    public static void exercicio11() {
        Scanner scanner = new Scanner(System.in);
        class Aluno {
            String nome;
            double nota;
        }
        Aluno[] alunos = new Aluno[10];
        for (int i = 0; i < 10; i++) {
            alunos[i] = new Aluno();
            System.out.print("Digite o nome do aluno: ");
            alunos[i].nome = scanner.next();
            System.out.print("Digite a nota do aluno: ");
            alunos[i].nota = scanner.nextDouble();
        }
        for (Aluno aluno : alunos) {
            System.out.println(aluno.nome + " - " + (aluno.nota >= 7 ? "Aprovado" : "Reprovado"));
        }
    }

    public static void exercicio12() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder nomes = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um nome: ");
            nomes.append(scanner.nextLine()).append(" ");
        }
        System.out.println("Nomes concatenados: " + nomes);
    }

    public static void exercicio13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite dois números: ");
        double base = scanner.nextDouble(), expoente = scanner.nextDouble();
        double resultado = Math.pow(base, expoente);
        System.out.println("Raiz quadrada arredondada para cima: " + Math.ceil(Math.sqrt(resultado)));
    }

    public static void exercicio14() {
        Random rand = new Random();
        int num1 = rand.nextInt(101);
        int num2 = 51 + rand.nextInt(50);
        int maior = Math.max(num1, num2);
        System.out.println("Maior número ao cubo: " + Math.pow(maior, 3));
    }

    public static void exercicio15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = scanner.nextDouble();
        System.out.println("Raiz cúbica: " + Math.cbrt(num));
    }

    public static void exercicio16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();
        String resultado = "";
        for (char c : str.toCharArray()) {
            switch (Character.toLowerCase(c)) {
                case 'a':
                    resultado += '4';
                    break;
                case 'e':
                    resultado += '3';
                    break;
                case 'i':
                    resultado += '1';
                    break;
                case 'o':
                    resultado += '0';
                    break;
                default:
                    resultado += c;
                    break;
            }
        }
        System.out.println("String transformada: " + resultado);
    }

    public static void exercicio17() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();
        System.out.println("String invertida: " + new StringBuilder(str).reverse());
    }

    public static void exercicio18() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma String: ");
        String str = scanner.nextLine();
        String resultado = "";
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                resultado += Character.toUpperCase(c);
            } else {
                resultado += Character.toLowerCase(c);
            }
        }
        System.out.println("String transformada: " + resultado);
    }

}
