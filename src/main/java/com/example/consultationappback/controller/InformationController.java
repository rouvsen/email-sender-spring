package com.example.consultationappback.controller;

import com.example.consultationappback.model.entity.Information;
import com.example.consultationappback.model.dto.ResponseDTO;
import com.example.consultationappback.service.InformationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/informations")
@CrossOrigin(origins = "*")
public class InformationController {

    private final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping
    public String meet() {
        return "Hi";
    }

    @PostMapping
    public ResponseEntity<?> createConsultation(@RequestBody Information info) {
        informationService.createConsultation(info);
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setFirstName(info.getFirstName());
        responseDTO.setMessage("your consultation operation is done.");
        return ResponseEntity.status(HttpStatus.OK)
                .body(responseDTO);
    }

}
