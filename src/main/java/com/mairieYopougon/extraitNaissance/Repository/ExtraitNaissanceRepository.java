package com.mairieYopougon.extraitNaissance.Repository;

import com.mairieYopougon.extraitNaissance.Domaine.ExtraitNaissance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ExtraitNaissanceRepository extends JpaRepository<ExtraitNaissance, Long> {
    List<ExtraitNaissance> findByNumeroExtrait(String numeroExtrait);
}
