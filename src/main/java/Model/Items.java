package model;

public class Items {
    private String itemName;
    private double itemPrice;
    private int itemCount;
    private Header invoice;

    public Items(String item, double price, int count, Header invoice) {
        this.itemName = item;
        this.itemPrice = price;
        this.itemCount = count;
        this.invoice = invoice;
    }

    public int getItemCount() {
        return itemCount;
    }
    
     public double getTotal() {
        return itemPrice * itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getInvoiceNum() + ", item=" + itemName + ", price=" + itemPrice + ", count=" + itemCount + '}';
    }

    public Header getInvoice() {
        return invoice;
    }
    
    public String getAsCSV() {
        return invoice.getInvoiceNum() + "," + itemName + "," + itemPrice + "," + itemCount;
    }
    
}
