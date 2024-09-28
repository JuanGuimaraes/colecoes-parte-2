package br.com.juan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

        static List <Pessoa> grupoMasculino = new ArrayList<>();
        static List<Pessoa> grupoFeminino = new ArrayList<>();

    public static void main(String[] args) {
        pergunta();
        exibirGrupos(grupoMasculino, grupoFeminino);
    }


    public static void adicionaPessoas() {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = s.nextLine();

        System.out.println("Digite o sexo (M/F): ");
        String sexo = s.nextLine();

        Pessoa pessoa = new Pessoa(nome, sexo);

        if(sexo.equalsIgnoreCase("M")) {
            grupoMasculino.add(pessoa);
        }else if(sexo.equalsIgnoreCase("F")) {
            grupoFeminino.add(pessoa);
        }else{
            System.out.println("Sexo inválido! Use M para Masculino ou F para Feminino.");
        }
    }

    public static void pergunta() {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja adicionar uma nova pessoa? (sim/não)");
        String resposta = s.nextLine();

        while (resposta.equalsIgnoreCase("sim")) {
            adicionaPessoas();
            exibirGrupos(grupoMasculino, grupoFeminino);

            System.out.println("Deseja adicionar um novo pessoa?");
            resposta = s.nextLine();
        }
        System.out.println("Obrigado");
    }

    public static void exibirGrupos(List<Pessoa> grupoMasculino, List<Pessoa> grupoFeminino) {
        System.out.println("\n--- Grupo Masculino ---");
        if (grupoMasculino.isEmpty()) {
            System.out.println("Nenhuma pessoa no grupo masculino.");
        } else {
            for (Pessoa pessoa : grupoMasculino) {
                System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());
            }
        }

        System.out.println("\n--- Grupo Feminino ---");
        if (grupoFeminino.isEmpty()) {
            System.out.println("Nenhuma pessoa no grupo feminino.");
        } else {
            for (Pessoa pessoa : grupoFeminino) {
                System.out.println("Nome: " + pessoa.getNome() + ", Sexo: " + pessoa.getSexo());
            }
        }
        System.out.println("-----------------------\n");
    }
}