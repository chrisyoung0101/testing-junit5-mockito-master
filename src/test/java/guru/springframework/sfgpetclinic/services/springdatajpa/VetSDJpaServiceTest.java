package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.repositories.VetRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

// TODO : 109. Assignment Review
@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {

    //Make this a mock object
    @Mock
    VetRepository vetRepository;

    //Have mockito inject the mocks
    //Creates a mocked instance of the service with the mocked class injected into it
    @InjectMocks
    VetSDJpaService service;

    @Test
    void deleteById() {

        service.deleteById(1l);

        //verifies that this mock will be called with a ID value of 1l
        //verify (default behavior) that service.deleteById(1l); is only happening once
        verify(vetRepository).deleteById(1l);

    }
}