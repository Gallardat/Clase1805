package com.softtek.comunicacionback.servicio;

import com.softtek.comunicacionback.modelo.Medico;
import com.softtek.comunicacionback.repositorio.IMedicoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MedicoServicio implements IMedicoServicio{
    @Autowired
    IMedicoRepo repo;
    @Override
    public List<Medico> listar() {
        return repo.listar();
    }

    @Override
    public Medico buscarPorId(int id) {
        return repo.buscarPorId(id);
    }
}
