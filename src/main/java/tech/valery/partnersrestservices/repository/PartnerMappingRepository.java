package tech.valery.partnersrestservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.valery.partnersrestservices.model.PartnerMapping;

import java.util.Optional;

public interface PartnerMappingRepository extends JpaRepository<PartnerMapping, Long> {

    @Override
    Optional<PartnerMapping> findById(Long aLong);

    @Override
    <S extends PartnerMapping> S save(S entity);

    @Override
    void deleteById(Long aLong);
}
