package br.com.fas.pah.service;

import br.com.fas.pah.entity.ProtocolEntity;
import br.com.fas.pah.modelo.Protocol;
import br.com.fas.pah.service.repositry.ProtocolRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProtocolServiceImpl implements ProtocolService {

    @Autowired
    ProtocolRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public void createProtocol(ProtocolEntity protocol) {
        repository.save(protocol);
    }

    @Override
    public List<Protocol> listProtocols() {
        List<ProtocolEntity> listProtocol = repository.findAll();
       return listProtocol.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @Override
    public ProtocolEntity findByIdProtocol(Long id) {
        return  repository.findById(id).get();
    }

    @Override
    public void deleteProtocol(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ProtocolEntity updateProtocol(ProtocolEntity protocol) {
        return repository.save(protocol);
    }

    private Protocol convertToDto(ProtocolEntity entity) {
        Protocol protocol = modelMapper.map(entity, Protocol.class);
        protocol.setId(entity.getIdProtocol());
        protocol.setSintoma(entity.getSymptoms());
        protocol.setProtocolo(entity.getProtocol());
        return protocol;
    }
}
