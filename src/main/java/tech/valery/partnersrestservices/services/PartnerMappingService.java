package tech.valery.partnersrestservices.services;

import tech.valery.partnersrestservices.model.PartnerMapping;

import java.util.Optional;

public interface PartnerMappingService {

    Optional<PartnerMapping> findById(Long aLong);

    <S extends PartnerMapping> S save(S entity);

    void deleteById(Long aLong);
}
