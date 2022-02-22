package ru.avbugorov.architecturesandpatterns.dto;

import lombok.Builder;

import java.util.List;

public class MessageDto {
    Long id;
    UserDto sender;
    UserDto recipient;
    String content;
    List<UserDto> UsersLikes;
    boolean isAlreadyRead;

    public MessageDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDto getSender() {
        return sender;
    }

    public void setSender(UserDto sender) {
        this.sender = sender;
    }

    public UserDto getRecipient() {
        return recipient;
    }

    public void setRecipient(UserDto recipient) {
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<UserDto> getUsersLikes() {
        return UsersLikes;
    }

    public void setUsersLikes(List<UserDto> usersLikes) {
        UsersLikes = usersLikes;
    }

    public boolean isAlreadyRead() {
        return isAlreadyRead;
    }

    public void setAlreadyRead(boolean alreadyRead) {
        isAlreadyRead = alreadyRead;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id=" + id +
                ", sender=" + sender +
                ", recipient=" + recipient +
                ", content='" + content + '\'' +
                ", UsersLikes=" + UsersLikes +
                ", isAlreadyRead=" + isAlreadyRead +
                '}';
    }
}
