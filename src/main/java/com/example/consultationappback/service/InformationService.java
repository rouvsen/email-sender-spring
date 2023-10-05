package com.example.consultationappback.service;

import com.example.consultationappback.email.EmailService;
import com.example.consultationappback.model.entity.Information;
import com.example.consultationappback.repository.InformationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InformationService {

    private final InformationRepository informationRepository;
    private final EmailService emailService;

    public void createConsultation(Information info) {
        emailService.sendMail(info);
        informationRepository.save(info);
    }
}
