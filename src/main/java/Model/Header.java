package model;

import java.util.ArrayList;

public class Header {
    private int invoiceNum;
    private String invoiceDate;
    private String customerName;
    private ArrayList<Items> items;
    
    public Header(int invoiceNum, String invoiceDate, String customerName) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }
    
    public ArrayList<Items> getItems() {
        if (items == null) {
            items = new ArrayList<>();
        }
        return items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + invoiceNum + ", date=" + invoiceDate + ", customer=" + customerName + '}';
    }
    
    public String getAsCSV() {
        return invoiceNum + "," + invoiceDate + "," + customerName;
    }
    
     public double getTotal() {
        double total = 0.0;
        for (Items line : getItems()) {
            total += line.getTotal();
        }
        return total;
    }
}
