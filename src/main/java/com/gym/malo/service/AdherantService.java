package com.gym.malo.service;

import com.gym.malo.dao.AdherantDao;
import com.gym.malo.entity.Adherant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdherantService {

    @Autowired
    private AdherantDao adherantDao;

    public Adherant saveAdherant(Adherant adherant){
      return  adherantDao.save(adherant);
    }

    public List<Adherant> getAdherants(){
        List<Adherant> adherants=new ArrayList<>();
        adherantDao.findAll().forEach(adherants::add);
        return adherants;
    }

    public Adherant getAdherants(Integer adherantId){
        return adherantDao.findById(adherantId).orElseThrow();
        //orElseThrow() :if adherantId doesn't exict he return error
    }

    public void deleteAdherant(Integer adherantId){
        adherantDao.deleteById(adherantId);
    }

    public Adherant updateAdherant(Adherant adherant){
        adherantDao.findById(adherant.getAdherantId()).orElseThrow();
        return adherantDao.save(adherant);
    }
}
