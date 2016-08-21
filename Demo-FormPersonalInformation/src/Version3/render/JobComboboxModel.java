package Version3.render;

import Version3.bean.Job;
import Version3.model.ModelJob;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class JobComboboxModel implements ComboBoxModel{
    
    private ArrayList<Job> list = new ArrayList<Job>();
    private Job object;
            
    public JobComboboxModel(){
        //Set value default to view Item
        list = new ModelJob().getList();
        object = list.get(0);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        object  = (Job)anItem;
    }

    @Override
    public Object getSelectedItem() {
        return object;
    }

    @Override
    public int getSize() {
        return list.size();
    }

    @Override
    public Object getElementAt(int index) {
        return list.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
    }
}
