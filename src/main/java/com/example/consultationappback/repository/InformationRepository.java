package com.example.consultationappback.repository;

import com.example.consultationappback.model.entity.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationRepository
    extends JpaRepository<Information, Long> {
}
