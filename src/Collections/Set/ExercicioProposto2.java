package Collections.Set;

import java.util.*;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/
public class ExercicioProposto2 {
    public static void main(String[] args) {

        System.out.println("-- Ordem de Inserção --");
        Set<LinguagemFavorita> listaDeLinguagens = new LinkedHashSet<>() {{
           add(new LinguagemFavorita("Java",1991,"IntelliJ"));
           add(new LinguagemFavorita("JavaScript", 1995, "VisualCode"));
           add(new LinguagemFavorita("Python", 1991, "IDLE"));
        }};
        for (LinguagemFavorita linguagem: listaDeLinguagens) System.out.println(linguagem.getNome() + " - "
        + linguagem.getAnoDeCriacao() + " - " + linguagem.getIDE());

        System.out.println("-----------------------------");

        System.out.println("-- Ordem Natural (nome) --");
        Set<LinguagemFavorita> listaDeLinguagens1 = new TreeSet<>(){{
            add(new LinguagemFavorita("Java",1991,"IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "VisualCode"));
            add(new LinguagemFavorita("Python", 1991, "IDLE"));
        }};
        for (LinguagemFavorita linguagem1: listaDeLinguagens1) System.out.println(linguagem1.getNome() + " - "
                + linguagem1.getAnoDeCriacao() + " - " + linguagem1.getIDE());

        System.out.println("-----------------------------");

        System.out.println("-- Ordem IDE --");
        Set<LinguagemFavorita> listaDeLinguagensFavoritas = new HashSet<>();
        listaDeLinguagensFavoritas.add(new LinguagemFavorita("Java",1991,"IntelliJ"));
        listaDeLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "VisualCode"));
        listaDeLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "IDLE"));

        Set<LinguagemFavorita> listaDeLinguagemIDE = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        listaDeLinguagemIDE.addAll(listaDeLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listaDeLinguagemIDE) System.out.println(linguagem);

        System.out.println("-----------------------------");

        System.out.println("-- Ordem Ano de Criação e Nome --");
        Set<LinguagemFavorita> listaDeLinguagemCriacaoNome = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        listaDeLinguagemCriacaoNome.addAll(listaDeLinguagensFavoritas);
        for (LinguagemFavorita linguagem: listaDeLinguagemCriacaoNome) System.out.println(linguagem);

        System.out.println("-----------------------------");

        System.out.println("-- Ordem Nome, Ano de Criação e IDE --");
        Set<LinguagemFavorita> listaDeLinguagemNomeCriacaoIDE = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        listaDeLinguagemNomeCriacaoIDE.addAll(listaDeLinguagensFavoritas);
        for(LinguagemFavorita linguagem : listaDeLinguagemNomeCriacaoIDE) System.out.println(linguagem);
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    public String ide;
    private String nome;
    private int anoDeCriacao;
    private String IDE;

    public LinguagemFavorita(String nome, int anoDeCriacao, String IDE) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.IDE = IDE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(int anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return anoDeCriacao == that.anoDeCriacao && nome.equals(that.nome) && IDE.equals(that.IDE);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, IDE);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita>{
    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.getIDE().compareToIgnoreCase(lf2.getIDE());
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getNome().compareToIgnoreCase(lf2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return lf1.getIDE().compareToIgnoreCase(lf2.getIDE());
    }
}

