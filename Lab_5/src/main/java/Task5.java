import java.time.LocalDateTime;
public class Task5 implements IForumMessage {private String author;
    private String topic;
    private String text;
    private LocalDateTime creationTime;
    private LocalDateTime editTime;

    public Task5(String author, String topic, String text) {
        this.author = author;
        this.topic = topic;
        this.text = text;
        this.creationTime = LocalDateTime.now();
        this.editTime = null; // Повідомлення ще не редагувалося
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void setText(String text) {
        this.text = text;
        this.editTime = LocalDateTime.now(); // Оновлення часу редагування
    }

    @Override
    public void editMessage(String newText) {
        this.text = newText;
        this.editTime = LocalDateTime.now(); // Оновлення часу редагування
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    @Override
    public LocalDateTime getEditTime() {
        return editTime;
    }
}

interface IForumMessage {
    void setAuthor(String author);
    void setTopic(String topic);
    void setText(String text);
    void editMessage(String newText);

    String getAuthor();
    String getTopic();
    String getText();
    LocalDateTime getCreationTime();
    LocalDateTime getEditTime();
}