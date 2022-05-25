package br.com.fas.pah.service;

import br.com.fas.pah.entity.ProtocolEntity;
import br.com.fas.pah.modelo.Protocol;

import java.util.List;

public interface ProtocolService {

    public void createProtocol(ProtocolEntity entity);

    public List<Protocol> listProtocols();

    public ProtocolEntity findByIdProtocol(Long id);

    public void deleteProtocol(Long id);

    public  ProtocolEntity updateProtocol(ProtocolEntity protocol);


}
