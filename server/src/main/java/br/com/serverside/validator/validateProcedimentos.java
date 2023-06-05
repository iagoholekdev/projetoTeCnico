package br.com.serverside.validator;

import br.com.serverside.model.Procedimento;
import br.com.serverside.consts.utils;

import java.util.List;


public class validateProcedimentos implements IvalidateProcedimentos{
    private boolean validateProcedimentos(int procedimento) {
        if (procedimento < 0) {
            return false;
        }
        return true;
    }

    private boolean validateIdade(int idade) {
        if (idade < 0) {
            return false;
        }
        return true;
    }

    private boolean validateSexo(String sexo) {
        if (sexo == null ||sexo.isEmpty()) {
            return false;
        }
        return true;
    }

    private boolean validateRegra(int procedimento, int idade, String sexo) {
        switch (procedimento) {
            case utils.procedimentoUm:
                if (idade == 10 && sexo.equalsIgnoreCase(utils.masculino))
                    return false;
                if (idade == 20 && sexo.equalsIgnoreCase(utils.masculino))
                    return true;
                return false;

            case utils.procedimentoDois:
                if (idade == 20 && sexo.equalsIgnoreCase(utils.masculino))
                    return true;
                if (idade == 30 && sexo.equalsIgnoreCase(utils.feminino))
                    return true;
                return false;


            case utils.procedimentoTres:
                if (idade == 10 && sexo.equalsIgnoreCase(utils.feminino))
                    return false;
                if (idade == 10 && sexo.equalsIgnoreCase(utils.masculino))
                    return true;
                return false;
            default: return false;
        }

    }

    public String validate(List<Procedimento> procedimento) {
        if (!this.validateProcedimentos(procedimento.get(0).getProcedimento())){
            return utils.procedimentoInvalido;
        }
        if (!this.validateIdade(procedimento.get(0).getIdade())){
           return utils.idadeInvalida;
        }
        if (!this.validateSexo(procedimento.get(0).getSexo())){
            return utils.sexoInvalido;
        }

        if (this.validateRegra(procedimento.get(0).getProcedimento(), procedimento.get(0).getIdade(), procedimento.get(0).getSexo())){
            return utils.sucesso;
        } else {
            return utils.procedimentoInvalido;

        }

    }

}
