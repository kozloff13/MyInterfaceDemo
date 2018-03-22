package Reader;

public class Reader implements IReader {

    private final String str;

    public Reader(final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}
