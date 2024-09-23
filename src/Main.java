import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Class clazz = ClasseAnotada.class;

        TabelaAnnotation tabelaAnnotation = (TabelaAnnotation) clazz.getAnnotation(TabelaAnnotation.class);
        String nome_da_tabela = tabelaAnnotation.nome();

        System.out.println(nome_da_tabela);

    }
}