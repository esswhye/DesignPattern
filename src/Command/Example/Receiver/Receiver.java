package Command.Example.Receiver;

public abstract class Receiver {

    public abstract void append(String data);

    public abstract String getContent();

    public abstract void delete();

    public abstract void copy(String data);

    public abstract void paste();

    public abstract void cut(int startIndex, int endIndex);

    public abstract void setContent(String content);

    public abstract String getName();

}
