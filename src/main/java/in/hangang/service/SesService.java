package in.hangang.service;

import org.springframework.http.ResponseEntity;
import in.hangang.domain.test.SampleMail;

public interface SesService {
    ResponseEntity send(SampleMail sampleMail);
}
