package set.Ordenacao;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(int matricula){
        Aluno alunoParaRemover = null;

        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet){
                if (a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }else {
            throw new RuntimeException("O conunto está vazio");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()){
            System.out.println(alunosPorNome);
        }else{
            System.out.println("Conjunto está vazio");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        if (!alunoSet.isEmpty()){
            alunosPorNota.addAll(alunoSet);
            System.out.println(alunosPorNota);
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 464332, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 53543, 6.8);

        //System.out.println("Alunos no gerenciador");
        //System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.removerAluno(123456);
        System.out.println(gerenciadorAlunos.alunoSet);

        gerenciadorAlunos.exibirAlunosPorNome();

        gerenciadorAlunos.exibirAlunosPorNota();
    }
}
