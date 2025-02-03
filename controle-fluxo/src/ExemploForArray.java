public class ExemploForArray {
    public static void main(String[] args) {

        // Em arrays o indice de elementos inicia em ZERO
        String alunos [] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x= " + x + " é " + alunos[x]);
        }

        // For Each
        for (String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
