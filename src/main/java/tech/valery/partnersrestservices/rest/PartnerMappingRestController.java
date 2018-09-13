package tech.valery.partnersrestservices.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import tech.valery.partnersrestservices.model.PartnerMapping;
import tech.valery.partnersrestservices.services.PartnerMappingService;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customers/{customerId}/mappings/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PartnerMappingRestController {

    private PartnerMappingService partnerMappingService;

    public PartnerMappingRestController(PartnerMappingService partnerMappingService) {
        this.partnerMappingService = partnerMappingService;
    }

    @GetMapping(value = "/{partnerId}")
    public ResponseEntity<PartnerMapping> getMapping(@PathVariable Long partnerId){

        Optional<PartnerMapping> partnerMappingOptional = partnerMappingService.findById(partnerId);

        if(partnerMappingOptional.isPresent()){
            return new ResponseEntity<>(partnerMappingOptional.get(), HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<PartnerMapping> createMapping(@Valid @RequestBody PartnerMapping partnerMapping,
                                                        @PathVariable Long customerId,
                                                        UriComponentsBuilder ucBuilder){

        HttpHeaders headers = new HttpHeaders();

        // check for correctness

        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

}
