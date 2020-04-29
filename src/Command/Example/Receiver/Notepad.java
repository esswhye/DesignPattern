package Command.Example.Receiver;

public class Notepad extends Receiver {

    private String copiedData;

    private StringBuilder content;

    public Notepad(String text) {
        this.content = new StringBuilder(text);
    }

    @Override
    public void append(String data) {
        this.content.append(data);
    }

    @Override
    public String getContent() {
        return this.content.toString();
    }

    @Override
    public void delete() {
        if (content.length() > 0)
            this.content.deleteCharAt(content.length() - 1);
    }

    @Override
    public void copy(String data) {
        this.copiedData = data;
    }

    @Override
    public void paste() {
        this.append(copiedData);
    }

    @Override
    public void cut(int startIndex, int endIndex) {
        this.copiedData = content.substring(startIndex, endIndex);
        this.content = content.delete(startIndex, endIndex);
    }

    @Override
    public void setContent(String content) {
        this.content = new StringBuilder(content);
    }

    @Override
    public String getName() {
        return "Notepad";
    }

    public void insert(String preContent, int start) {
        this.content = content.insert(start, preContent);
    }
}
