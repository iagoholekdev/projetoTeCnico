package br.com.serverside.validator;

import br.com.serverside.model.Procedimento;

import java.util.List;

public interface IvalidateProcedimentos {
    String validate(List<Procedimento> procedimento);
}
