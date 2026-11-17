import java.util.ArrayList;

public class SparseArrayMain {

    public static void main(String args[]){
        SparseArray sa = new SparseArray();//creates a new SparseArray
        sa.addEntry(1, 4, 4);
        sa.addEntry(2, 0, 1);
        sa.addEntry(3, 1, -9);
        sa.addEntry(1, 1, 5);

        //System.out.println(sa.findCol(-9));//returns 1
        //System.out.println(sa.findCol(3));//returns 0
        System.out.println(sa.countRowValues(-2));

        sa.removeRow(1);

        ArrayList<SparseArrayEntry> entries = sa.getSparseArray();

        for(int e = 0; e < entries.size(); e++){
            //System.out.println(entries.get(e).getRow());
        }

    }
    
}
