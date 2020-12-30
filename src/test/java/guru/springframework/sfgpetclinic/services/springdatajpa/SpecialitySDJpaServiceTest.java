package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

// TODO : 106. Injecting Mocks with Mockito


@ExtendWith(MockitoExtension.class)
class SpecialitySDJpaServiceTest {

    //Initialize the mock.  Create an repo instance.
    @Mock
    SpecialtyRepository specialtyRepository;

    //Tells mockito to create an instance of this service and inject it.
    @InjectMocks
    SpecialitySDJpaService service;

    // TODO : 111. Argument Matchers
    @Test
    void testDeleteByObject() {

        Speciality speciality = new Speciality();

        service.delete(speciality);

        //Using an argument matcher "any"
        //Makes sure that the delete is called with any object of Speciality.class
        verify(specialtyRepository).delete(any(Speciality.class));

    }

    // TODO : 110. Returning values from Mockito Mocks
    @Test
    void findByIdTest() {
        //Creates a new specialty object that our mock will return back
        Speciality speciality = new Speciality();

        //when specialtyRepository.findById() gets a call with value of 1l,
        //then return an optional of the specialty object we created above
        when(specialtyRepository.findById(1l)).thenReturn(Optional.of(speciality));

        //Make a method call on the class that is being tested
        Speciality foundSpecialty = service.findById(1l);

        //Make sure we get a specialty object back
        assertThat(foundSpecialty).isNotNull();

        //verify mock implementation was called once
        verify(specialtyRepository).findById(1l);

        // TODO : 111
        //verify mock implementation was called by any long value using argument matcher "anyLong()"
        verify(specialtyRepository).findById(anyLong());


    }

    @Test
    void deleteById() {
        service.deleteById(1l);
        //for the second mock invoke
        service.deleteById(1l);

        // TODO : 107. Verify Interactions with Mockito Mocks
        // handles how many times we expect the mock to get invoked
        verify(specialtyRepository, times(2)).deleteById(1l);
    }

    // TODO : 107
    @Test
    void deleteByIdAtLeast() {
        service.deleteById(1l);
        //for the second mock invoke
        service.deleteById(1l);

        verify(specialtyRepository, atLeastOnce()).deleteById(1l);
    }

    // TODO : 107
    @Test
    void deleteByIdAtMost() {
        service.deleteById(1l);
        //for the second mock invoke
        service.deleteById(1l);

        verify(specialtyRepository, atMost(5)).deleteById(1l);
    }

    // TODO : 107
    @Test
    void deleteByIdNever() {
        service.deleteById(1l);
        //for the second mock invoke
        service.deleteById(1l);

        verify(specialtyRepository, atLeastOnce()).deleteById(1l);

        //Will never get called with a long of 5
        verify(specialtyRepository, never()).deleteById(5l);
    }

    @Test
    void testDelete() {
        service.delete(new Speciality());
    }

}