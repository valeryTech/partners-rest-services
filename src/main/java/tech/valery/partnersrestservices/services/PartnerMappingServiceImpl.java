package tech.valery.partnersrestservices.services;

import org.springframework.beans.factory.annotation.Autowired;
import tech.valery.partnersrestservices.model.PartnerMapping;
import tech.valery.partnersrestservices.repository.PartnerMappingRepository;

import java.util.Optional;

public class PartnerMappingServiceImpl implements PartnerMappingService {

    @Autowired
    PartnerMappingRepository partnerMappingRepository;

    @Override
    public Optional<PartnerMapping> findById(Long partnerId) {
        return partnerMappingRepository.findById(partnerId);
    }

    @Override
    public <S extends PartnerMapping> S save(S entity) {
        return partnerMappingRepository.save(entity);
    }

    @Override
    public void deleteById(Long partnerId) {
        partnerMappingRepository.deleteById(partnerId);
    }
}
