import entity.Aluno;
import entity.Nota;
import entity.Professor;
import entity.Turma;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Turma turma1 = new Turma("abc",12);

        Professor professor1 = new Professor("Mauro","001","123456789","senha");

        Nota nota1 = new Nota(9.0);

        Aluno aluno1 = new Aluno("Bob","111","senha",9.0);
        Aluno aluno2 = new Aluno("Mary", "222","senha",10.0);

        List<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);

        List<Nota> notas = new ArrayList<>();
        notas.add(nota1);

        turma1.setProfessor(professor1);
        turma1.setAlunos(alunos);
        aluno1.setNotas(notas);

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(turma1);

        transaction.commit();

        List<Turma> turmas = session.createQuery("from Turma", Turma.class).list();

        for (int i = 0; i < turmas.size(); i++) {
            System.out.println(turmas.get(i));
        }
    }
}
