package com.matheusfreitas.pontointeligente.api.services;

import com.matheusfreitas.pontointeligente.api.entities.Empresa;

import java.util.Optional;

public interface EmpresaService {

    /**
     * Retorna uma empresa dado um CNPJ
     * @param cnpj
     * @return Optional<Empresa>
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * Cadastra uma nova empresa na base de dados.
     * @param empresa
     * @return Empresd
     */
    Empresa persistir(Empresa empresa);
}
