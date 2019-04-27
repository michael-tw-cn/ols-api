package com.thoughtworks.nho.olsapi.controller;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.service.taskcard.TaskCardService;
import com.thoughtworks.nho.olsapi.util.ResponseCode;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
//@DataJpaTest
public class TaskCardControllerTest {

    private MockMvc mockMvc;

    @Before
    public void setUp(){
        TaskCardController controller = new TaskCardController();
        controller.service = new TaskCardService() {
            @Override
            public void addTaskCard(TaskCard taskCard) {

            }
        };
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void testAddTimeCard() throws Exception {
        RequestBuilder requestBuilder = post("/taskCard/").param("name", "task1")
                .param("description", "test save task card");
        mockMvc.perform(requestBuilder).andExpect(status().isOk())
                .andExpect(content().string(ResponseCode.SUCCESS));
    }

}