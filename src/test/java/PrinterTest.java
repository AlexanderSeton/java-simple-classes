import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer testPrinter;

    @Before
    public void before() {
        testPrinter = new Printer(100, 15);
    }

    @Test
    public void hasSheetsLeft() {
        assertEquals(100, testPrinter.getSheetsLeft());
    }

    @Test
    public void hasTonerLeft() {
        assertEquals(15, testPrinter.getTonerLeft());
    }

    @Test
    public void canSetSheetsLeft() {
        testPrinter.setSheetsLeft(10);
        assertEquals(10, testPrinter.getSheetsLeft());
    }

    @Test
    public void canSetTonerLeft() {
        testPrinter.setTonerLeft(10);
        assertEquals(10, testPrinter.getTonerLeft());
    }

    @Test
    public void canPrint() {
        testPrinter.print(5, 3);
        assertEquals(85, testPrinter.getSheetsLeft());
        assertEquals(14, testPrinter.getTonerLeft());
    }

    @Test
    public void canNotPrintIfInsufficientResources() {
        testPrinter.print(20, 6);
        assertEquals(100, testPrinter.getSheetsLeft());
        assertEquals(15, testPrinter.getTonerLeft());
    }

}
