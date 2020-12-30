package guru.springframework.sfgpetclinic;


import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

// TODO : 103. Creating Mockito Mocks Inline
public class InlineMockTest {

    @Test
    void testInlineMock() {

        Map mapMock = mock(Map.class);

        assertEquals(mapMock.size(), 0);

    }

}
