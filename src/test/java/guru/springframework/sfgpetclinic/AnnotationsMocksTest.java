package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

// TODO : 104. Creating Mockito Mocks with Annotations
public class AnnotationsMocksTest {

    @Mock
    Map<String, Object> mapMock;

    //This will initialize this class
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    void testMethod() {
        mapMock.put("keyvalue", "foo");
    }
}
