package br.com.fas.pah.service.repositry;

import br.com.fas.pah.entity.ProtocolEntity;
import br.com.fas.pah.modelo.Protocol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProtocolRepository extends JpaRepository<ProtocolEntity,Long> {
}
