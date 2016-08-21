package Version3.utils;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;

public class ButtonGroupGT {
    public String getText(ButtonGroup btGioiTinh){
        String outString = "";
        Enumeration<AbstractButton> el = btGioiTinh.getElements();
        while(el.hasMoreElements()){
            AbstractButton btGT = el.nextElement();
            if(btGT.isSelected()){
                outString = btGT.getText();
            }
        }
        return outString;
    }
}   
