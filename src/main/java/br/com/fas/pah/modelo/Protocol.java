package br.com.fas.pah.modelo;

import br.com.fas.pah.entity.ProtocolEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Protocol {
    private Long id;
    private String protocolo;
    private String sintoma;

    public static  Protocol from(ProtocolEntity entity){
        Protocol protocol = new Protocol();
        protocol.setId(entity.getIdProtocol());
        protocol.setProtocolo(entity.getProtocol());
        protocol.setSintoma(entity.getSymptoms());
        return protocol;
    }

    public static  ProtocolEntity from(Protocol protocol){
        ProtocolEntity entity = new ProtocolEntity();
        entity.setIdProtocol(protocol.getId());
        entity.setProtocol(protocol.getProtocolo());
        entity.setSymptoms(protocol.getSintoma());
        return entity;
    }
}
