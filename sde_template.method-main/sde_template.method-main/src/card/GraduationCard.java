package card;

import com.hz.Printer;

public class GraduationCard extends Card {

    public GraduationCard(Printer printer) {
        super(printer);
    }

    protected void printHeader() {
        String header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);
    }

    protected void printMessage() {
        String msg = "This calls for celebrating! Congratulations!";
        this.printer.printLine(msg);
    }

    protected void printImage() {
        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");
    }

    protected void printFooter() {
        String footer = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(footer);
    }
}
