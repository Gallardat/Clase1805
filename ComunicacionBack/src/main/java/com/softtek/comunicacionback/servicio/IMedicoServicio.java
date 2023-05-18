package com.softtek.comunicacionback.servicio;

import com.softtek.comunicacionback.modelo.Medico;

import java.util.List;

public interface IMedicoServicio {


    List<Medico> listar();
    Medico buscarPorId(int id);
}
