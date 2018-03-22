import Printer.AdvancePrinter;
import Printer.IPrinter;
import Printer.Printer;
import Reader.IReader;
import Reader.Reader;

public class Subjoin {

    String fuck = ", fuck is...";

    private final IReader reader;
    private final IPrinter printer;

    public Subjoin(final IReader reader, final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void subj() {
        final String text = reader.read();
        final String subjoinText = text + fuck;
        printer.print(subjoinText);
    }

    public static void main(String[] args) {
        final IReader reader = new Reader("\n" +
                "You do not know nothing, John Snow");
        final IPrinter printer = new Printer();
        final IPrinter advPrinter = new AdvancePrinter();
        final Subjoin subjoin = new Subjoin(reader, printer);
        final Subjoin advSubjoin = new Subjoin(reader, advPrinter);
        subjoin.subj();
        advSubjoin.subj();
    }
}
