package com.softtek.comunicacionback.repositorio;

import com.softtek.comunicacionback.modelo.Medico;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MedicoRepo implements IMedicoRepo{
   Medico medicos[]= new Medico[4];

   @Override
   public List<Medico> listar() {
      List<Medico> medicos = new ArrayList<>();

      medicos.add(new Medico(1, "11223", "Dra Carla", 35));
      medicos.add(new Medico(2, "55555", "Dra Manuela", 24));
      medicos.add(new Medico(3, "12345", "Dra Petra", 30));
      return medicos;
   }

   @Override
   public Medico buscarPorId(int id) {
      return null;
   }

}
