package ru.avbugorov.architecturesandpatterns.utils.msg;

import ru.avbugorov.architecturesandpatterns.dto.MessageDto;
import ru.avbugorov.architecturesandpatterns.dto.UserDto;

import java.util.List;

public interface MessageBuilder {
    MessageBuilder setId(Long id);

    MessageBuilder setSender(UserDto sender);

    MessageBuilder setRecipient(UserDto recipient);

    MessageBuilder setContent(String content);

    MessageBuilder setUserLikes(List<UserDto> usersLikes);

    MessageBuilder isAlreadyRead(boolean isAlreadyRead);

    MessageDto build();

}
