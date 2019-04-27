package com.thoughtworks.nho.olsapi.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskCardControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(new TaskCardController()).build();
    }

    @Test
    public void testAddTimeCard() throws Exception {
        RequestBuilder requestBuilder = post("/taskCard/").param("name", "task1")
                .param("description", "test save task card");
        mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andExpect(content().string(""));
    }

}