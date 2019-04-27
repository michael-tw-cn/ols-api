package com.thoughtworks.nho.olsapi.service.taskcard;

import com.thoughtworks.nho.olsapi.entity.TaskCard;
import com.thoughtworks.nho.olsapi.repository.TaskCardRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskCardServiceImplTest {

    @Test
    public void should_add_task_card_successfully_when_input_invalid_task_card_info(){
        TaskCardRepository repository = new InMemoryTaskCardRepository();
        TaskCardService service = new TaskCardServiceImpl(repository);
        String taskCardId = UUID.randomUUID().toString();
        TaskCard taskCard = new TaskCard();
        taskCard.setId(taskCardId);
        taskCard.setName("English");
        taskCard.setDescription("test desc");
        service.addTaskCard(taskCard);


        Optional<TaskCard> existingCard = service.getTaskCardById(taskCardId);
        assertNotNull(existingCard);
        assertEquals("English", existingCard.get().getName());
        assertEquals("test desc", existingCard.get().getDescription());
    }


}