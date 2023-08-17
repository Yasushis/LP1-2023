import entity.Endereço;
import entity.Pessoa;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("fortnite kid",new Endereço("porão"));
        Pessoa pessoa1 = new Pessoa("bito132", new Endereço("mochila"));

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(pessoa);

        transaction.commit();

        List<Pessoa> pessoaList = session.createQuery("from Pessoa",Pessoa.class).list();
    }
}
