package card;
import com.hz.Printer;

public abstract class Card {
    protected Printer printer;
    protected abstract void printHeader();
    protected abstract void printMessage();
    protected abstract void printImage();
    protected abstract void printFooter();

    public Card(Printer printer) {
        this.printer = printer;
    }

    public void print() {
        printHeader();
        printMessage();
        printImage();
        printFooter();
    };

}
