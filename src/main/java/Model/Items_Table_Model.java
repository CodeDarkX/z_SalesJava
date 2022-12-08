package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Items_Table_Model extends AbstractTableModel {

    private ArrayList<Items> items;
    private String[] columns = {"No.","Item Name","Item Price","Count","Item Total"};

    public Items_Table_Model(ArrayList<Items> items) {
        this.items = items;
    }

    public ArrayList<Items> getItems() {
        return items;
    }
    
    
    @Override
    public int getRowCount() {
        return items.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Items line = items.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return line.getInvoice().getInvoiceNum();
            case 1: return line.getItemName();
            case 2: return line.getItemPrice();
            case 3: return line.getItemCount();
            case 4: return line.getTotal();
            default : return "";
        }
    }
    
}
