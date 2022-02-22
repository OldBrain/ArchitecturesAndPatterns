package ru.avbugorov.architecturesandpatterns.utils.msg;

import ru.avbugorov.architecturesandpatterns.dto.MessageDto;
import ru.avbugorov.architecturesandpatterns.dto.UserDto;

import java.util.List;

public class MessageBuilderImpl implements MessageBuilder {
    MessageDto msg = new MessageDto();

    @Override
    public MessageBuilder setId(Long id) {
        msg.setId(id);
        return this;
    }

    @Override
    public MessageBuilder setSender(UserDto sender) {
        msg.setSender(sender);
        return this;
    }

    @Override
    public MessageBuilder setRecipient(UserDto recipient) {
        msg.setRecipient(recipient);
        return this;
    }

    @Override
    public MessageBuilder setContent(String content) {
        msg.setContent(content);
        return this;
    }

    @Override
    public MessageBuilder setUserLikes(List<UserDto> usersLikes) {
        msg.setUsersLikes(usersLikes);
        return this;
    }

    @Override
    public MessageBuilder isAlreadyRead(boolean isAlreadyRead) {
        msg.setAlreadyRead(isAlreadyRead);
        return this;
    }

    @Override
    public MessageDto build() {
        return msg;
    }
}
