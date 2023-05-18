package com.softtek.comunicacionback.repositorio;

import com.softtek.comunicacionback.modelo.Medico;

import java.util.List;

public interface IMedicoRepo {

    List<Medico> listar();
    Medico buscarPorId(int id);
}
