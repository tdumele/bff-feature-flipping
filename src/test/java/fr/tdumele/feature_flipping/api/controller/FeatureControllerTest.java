package fr.tdumele.feature_flipping.api.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@Sql("/data.sql")
@SpringBootTest
@AutoConfigureMockMvc
class FeatureControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getFeaturesReturnsAllFeaturesWhenServiceHasFeatures() throws Exception {
        mockMvc.perform(get("/api/v1/features")
                        .header("X-API-KEY", "123456"))
                .andExpect(status().isOk());
    }
}