
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("Daniel", "Rodrigues", 20848161);
        Alunos aluno2 = new Alunos("Rodrigues", "Daniel", 20848161);
        List<Integer> alunos = new ArrayList<>();
        alunos.add(20848161);
        alunos.add(20848161);


        System.out.println(aluno1.equals(aluno2));
    }
}
