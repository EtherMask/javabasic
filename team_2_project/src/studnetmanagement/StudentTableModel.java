package studnetmanagement;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel{
	
	public ArrayList data = new ArrayList();
	String [] columnNames = {"학번","학과","학생이름","전화번호", "성별", "나이", "주소"};

	    public int getColumnCount() { 
	        return columnNames.length; 
	    } 
	     
	    public int getRowCount() { 
	        return data.size(); 
	    } 

	    public Object getValueAt(int row, int col) { 
			ArrayList temp = (ArrayList)data.get( row );
	        return temp.get( col ); 
	    }
	    
	    public String getColumnName(int col){
	    	return columnNames[col];
	    }
}
