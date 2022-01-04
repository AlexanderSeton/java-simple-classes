public class Printer {

    private int sheetsLeft;
    private int tonerLeft;

    public Printer(int sheetsLeft, int tonerLeft) {
        this.sheetsLeft = sheetsLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getTonerLeft() {
        return tonerLeft;
    }

    public void setSheetsLeft(int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public void setTonerLeft(int tonerLeft) {
        this.tonerLeft = tonerLeft;
    }

    public void print(int numberPages, int numberCopies) {
        int sheetsRequired = numberPages * numberCopies;
        if (sheetsRequired <= this.sheetsLeft && this.tonerLeft >= 1) {
            this.setSheetsLeft(this.sheetsLeft - sheetsRequired);
            this.setTonerLeft(this.tonerLeft - 1);
        }
    }

}
