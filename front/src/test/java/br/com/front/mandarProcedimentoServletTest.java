

import br.com.serverside.dao.ProcedimentoDAO;
import br.com.serverside.infra.ConnectionFactory;
import br.com.serverside.model.Procedimento;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


class mandarProcedimentoServletTest {

    String makeTest(int procedimento, int idade, String sexo) {
        List<Procedimento> procedimentoList = new ArrayList<Procedimento>();
        procedimentoList.add(new Procedimento(procedimento, idade, sexo));
        Connection connection = ConnectionFactory.getConnection();
        ProcedimentoDAO procedimentoDAO = new ProcedimentoDAO(connection);
        try {
            String validacao = procedimentoDAO.validate(procedimentoList);
            if(validacao.equalsIgnoreCase("Procedimento válido!")) {
               return validacao;
            } else {
                return validacao;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void doPost() {
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(1234, 10, "M"));
        Assertions.assertEquals("Procedimento válido!",this.makeTest(4567, 20, "M"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(6789, 10, "F"));
        Assertions.assertEquals("Procedimento válido!",this.makeTest(6789, 10, "M"));
        Assertions.assertEquals("Procedimento válido!",this.makeTest(1234, 20, "M"));
        Assertions.assertEquals("Procedimento válido!",this.makeTest(4567, 30, "F"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(1234, 11, "M"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(4567, 21, "M"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(6789, 11, "M"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(1234, 21, "M"));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(4567, 31, "F"));
        Assertions.assertEquals("Idade inválida!",this.makeTest(4567, -1, "F"));
        Assertions.assertEquals("Sexo inválido!",this.makeTest(4567, 10, null));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(-1, 10, null));
        Assertions.assertEquals("Procedimento inválido!",this.makeTest(4564151, 10, null));
    }
}