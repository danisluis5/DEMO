package Version2.render;

import Version2.bean.City;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class RenderComboboxModel implements ComboBoxModel{

    private ArrayList<City> list = new ArrayList<City>();
    private City object;
        
    public RenderComboboxModel(){
        list.add(new City(1,"Đà Nẵng"));
        list.add(new City(2,"Huế"));
        list.add(new City(3,"Quảng Trị"));
        list.add(new City(4,"Tuyên Quang"));
        list.add(new City(5,"Bình Định"));
        // default - you can replace in here
        object = list.get(0);
    }
    
    @Override
    public void setSelectedItem(Object anItem) {
        object = (City) anItem;
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
