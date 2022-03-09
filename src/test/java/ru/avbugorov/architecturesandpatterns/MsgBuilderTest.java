package ru.avbugorov.architecturesandpatterns;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import ru.avbugorov.architecturesandpatterns.dto.MessageDto;
import ru.avbugorov.architecturesandpatterns.dto.UserDto;
import ru.avbugorov.architecturesandpatterns.utils.msg.MessageBuilderImpl;


public class MsgBuilderTest {

    @Test
    void testMsg() {
        MessageDto msg = new MessageBuilderImpl()
                .setSender(new UserDto(1l, "Im"))
                .setRecipient(new UserDto(2l, "Bob"))
                .setContent("Hi, Bob")
                .setUserLikes(null)
                .isAlreadyRead(false)
                .build();

        Assertions.assertEquals(msg.getId(), null);
        Assertions.assertEquals(msg.getSender().getName(), "Im");
        Assertions.assertEquals(msg.getSender().getId(), 1l);

        Assertions.assertEquals(msg.getRecipient().getId(), 2l);
        Assertions.assertEquals(msg.getRecipient().getName(), "Bob");

        Assertions.assertEquals(msg.getContent(), "Hi, Bob");
        Assertions.assertEquals(msg.getUsersLikes(), null);

        Assertions.assertFalse(msg.isAlreadyRead());

    }
}
