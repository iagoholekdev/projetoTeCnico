package br.com.front;

import br.com.serverside.dao.ProcedimentoDAO;
import br.com.serverside.infra.ConnectionFactory;
import br.com.serverside.model.Procedimento;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/mandarProcedimento")
public class mandarProcedimentoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int procedimento = Integer.parseInt(request.getParameter("procedimento"));
        int idade = Integer.parseInt(request.getParameter("idade"));
        String sexo = request.getParameter("sexo");
        List<Procedimento> procedimentoList = new ArrayList<Procedimento>();
        procedimentoList.add(new Procedimento(procedimento, idade, sexo));
        Connection connection = ConnectionFactory.getConnection();
        ProcedimentoDAO procedimentoDAO = new ProcedimentoDAO(connection);
        try {
            String validacao = procedimentoDAO.validate(procedimentoList);
            PrintWriter resposta = response.getWriter();
            if(validacao.equalsIgnoreCase("Procedimento válido!")) {
                resposta.println(constClass.classSuccess);
            } else {
                resposta.println(constClass.classError);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
