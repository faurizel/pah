package br.com.fas.pah.entity;

import br.com.fas.pah.modelo.Protocol;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "protocolo")
@Getter
@Setter
public class ProtocolEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idprotocolo")
    private Long idProtocol;

    @Column(name = "protocolo")
    private String protocol;

    @Column(name = "sintoma")
    private String symptoms;
      public static ProtocolEntity from(String protocol, String symptoms){
          ProtocolEntity entity = new ProtocolEntity();
          entity.setProtocol(protocol);
          entity.setSymptoms(symptoms);
        return entity;
    }

}
