package br.com.serverside.dao;

import br.com.serverside.model.Procedimento;

import java.sql.*;
import java.util.List;

import br.com.serverside.validator.validateProcedimentos;
import br.com.serverside.consts.utils;
import br.com.serverside.consts.sqlConsts;

public class ProcedimentoDAO {
    private final Connection connection;
    public ProcedimentoDAO(Connection connection) {
        this.connection = connection;
    }
    public String validate(List<Procedimento> procedimento) throws SQLException {
        String sql = sqlConsts.getProcedimentos;
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, procedimento.get(0).getProcedimento());
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
          validateProcedimentos validator = new validateProcedimentos();
          return validator.validate(procedimento);
        } else {
          return utils.procedimentoInvalido;
        }
    }
}
