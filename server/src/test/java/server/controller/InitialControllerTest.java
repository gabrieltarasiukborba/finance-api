package server.controller;

import com.fasterxml.jackson.core.JsonParser;
import org.assertj.core.api.Assertions;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import server.utils.ConstantsCreator;

@SpringBootTest
class InitialControllerTest {

    @InjectMocks
    private InitialController initialController;

    @Test
    @DisplayName("Hello Test")
    void should_return_hello_when_successful() throws JSONException {
        String expectedName = ConstantsCreator.hello;

        JSONObject initialSearch = new JSONObject(initialController.hello().getBody());
        Assertions.assertThat(initialSearch).isNotNull();

        Assertions.assertThat(initialSearch.getString("message"))
                .isEqualTo(expectedName);
    }


}
