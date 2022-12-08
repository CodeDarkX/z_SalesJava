package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Header_Table_Model extends AbstractTableModel {
    private ArrayList<Header> invoices;
    private String[] columns = {"No.","Date","Customer","Total"};
    
    public Header_Table_Model(ArrayList<Header> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Header invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getInvoiceNum();
            case 1: return invoice.getInvoiceDate();
            case 2: return invoice.getCustomerName();
            case 3: return invoice.getTotal();
            default: return "";
        }
    }
}
