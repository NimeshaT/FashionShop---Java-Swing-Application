package Controller;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

import View.ItemQtyViewReport;
import View.ViewForm;

import java.awt.event.*;

public class ItemByQtyController extends JFrame{

    private ViewForm form;
    private ItemQtyViewReport itemByQty;

    public ItemByQtyController(ViewForm form, ItemQtyViewReport itemByQty){

        this.form = form;
        this.itemByQty = itemByQty;

        itemByQty.getBtnBack().addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                form.setVisible(true);
                itemByQty.dispose();
            }
        });

    }
    
}
