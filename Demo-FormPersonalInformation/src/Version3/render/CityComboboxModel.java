package Version3.render;

import Version3.bean.City;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

public class CityComboboxModel implements ComboBoxModel{

    private ArrayList<City> list = new ArrayList<City>();
    private City object;
        
    public CityComboboxModel(){
        list.add(new City(1,"Đà Nẵng"));
        list.add(new City(2,"Huế"));
        list.add(new City(3,"Quảng Trị"));
        list.add(new City(4,"Tuyên Quang"));
        list.add(new City(5,"Bình Định"));
        list.add(new City(6,"Quảng Ngãi"));
        list.add(new City(7,"Phú Yên"));
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
