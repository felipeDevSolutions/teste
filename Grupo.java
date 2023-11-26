import java.util.ArrayList;
import java.util.List;

//Classe feita por Ricardo
public class Grupo {
    private int numeroDoGrupo;
    private List<Aluno> alunos;

    public Grupo(int numeroDoGrupo) {
        this.numeroDoGrupo = numeroDoGrupo;
        this.alunos = new ArrayList<>();
    }

    public void addAluno(Aluno aluno) {
        if (alunos.size() < 6) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado ao Grupo " + numeroDoGrupo);
        } else {
            System.out.println("O grupo já está completo. Não é possível adicionar mais alunos.");
        }
    }

    public void alunoSaiDoGrupo(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " saiu do Grupo " + numeroDoGrupo);
    }

    // Insira seu método aqui abaixo

    // Insira seu método aqui acima

    public int getNumeroDoGrupo() {
        return numeroDoGrupo;
    }

    @Override
    public String toString() {
        return "Grupo [Nº do Grupo: " + numeroDoGrupo + ", Alunos: " + alunos + "]";
    }

}
