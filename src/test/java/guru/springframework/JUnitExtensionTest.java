package guru.springframework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

// TODO : 105. JUnit Mockito Extension
// 104 is another way to do this.  105 is the preferred way.

@ExtendWith(MockitoExtension.class)
public class JUnitExtensionTest {

    @Mock
    Map<String, Object> mapMock;

    @Test
    void testMethod() {
        mapMock.put("keyvalue", "foo");
    }


}
