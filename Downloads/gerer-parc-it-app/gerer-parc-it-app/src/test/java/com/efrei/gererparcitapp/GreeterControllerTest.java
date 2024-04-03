package com.efrei.gererparcitapp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

    @SpringBootTest
    @AutoConfigureMockMvc
    @ExtendWith(SpringExtension.class)
    public class GreeterControllerTest {

        @Autowired
        private MockMvc mockMvc;

        @Test
        public void helloEndpointTest() throws Exception {
            mockMvc.perform(get("/hello"))
                    .andExpect(content().string(containsString("Hello")));
        }
    }


