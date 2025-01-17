package com.mairieYopougon.extraitNaissance.Facade;

import com.mairieYopougon.extraitNaissance.Dto.ExtraitNaissancDto;
import com.mairieYopougon.extraitNaissance.Repository.ExtraitNaissanceRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.Arrays.stream;

@Service
public class ExtraitNaissanceFacade {

    private final ExtraitNaissanceRepository extraitNaissanceRepository;

    public ExtraitNaissanceFacade(ExtraitNaissanceRepository extraitNaissanceRepository) {
        this.extraitNaissanceRepository = extraitNaissanceRepository;
    }

    /**
     * Liste
     */
    @Transactional(readOnly = true)
    public List<ExtraitNaissancDto> lister() {
        return extraitNaissanceRepository
                .findAll()
                .stream()
                .map(ExtraitNaissancDto::new)
                .toList();
    }

    @Transactional(readOnly = true)
    public ExtraitNaissancDto listerUnExtrait(String numeroExtrait) {
        return extraitNaissanceRepository.findByNumeroExtrait(numeroExtrait)
                .stream()
                .map(ExtraitNaissancDto::new)
                .findFirst()
                .orElse(null); }





}
