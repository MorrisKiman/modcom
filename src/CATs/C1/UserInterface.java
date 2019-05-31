package CATs.C1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class UserInterface extends JPanel {
    private JMenuBar Order;
    private JRadioButton rb_SingleBurger;
    private JRadioButton rb_DoubleBurger;
    private JCheckBox cbx_AddBacon;
    private JCheckBox cbx_AddCheese;
    private JCheckBox cbx_meal;
    private JTextArea tbx_yourOrder;
    private JLabel lbl_ord;
    private JLabel jcomp9;
    private JLabel jcomp10;
    private JLabel jcomp11;
    private JTextField jcomp12;
    private JTextField jcomp13;
    private JTextField jcomp14;
    private JButton btn_qtyAdd;
    private JButton btn_qtyToa;

    public static void main (String[] args) {
        JFrame frame = new JFrame ("UserInterface");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new UserInterface());
        frame.pack();
        frame.setVisible (true);
    }//end main



    public UserInterface() {
        //construct preComponents
        JMenu fileMenu = new JMenu ("File");
        JMenuItem printItem = new JMenuItem ("Print");
        fileMenu.add (printItem);
        JMenuItem exitItem = new JMenuItem ("Exit");
        fileMenu.add (exitItem);
        JMenu orderMenu = new JMenu ("Order");
        JMenuItem new_orderItem = new JMenuItem ("New Order");
        orderMenu.add (new_orderItem);
        JMenuItem clear_for_next_itemItem = new JMenuItem ("Clear for next item");
        orderMenu.add (clear_for_next_itemItem);
        JMenuItem add_to_orderItem = new JMenuItem ("Add to Order");
        orderMenu.add (add_to_orderItem);
        JMenu helpMenu = new JMenu ("Help");
        JMenuItem contentsItem = new JMenuItem ("Contents");
        helpMenu.add (contentsItem);
        JMenuItem aboutItem = new JMenuItem ("About");
        helpMenu.add (aboutItem);

        //construct components
        Order = new JMenuBar();
        Order.add (fileMenu);
        Order.add (orderMenu);
        Order.add (helpMenu);
        rb_SingleBurger = new JRadioButton ("Single Burger");
        rb_DoubleBurger = new JRadioButton ("Double Burger");
        cbx_AddBacon = new JCheckBox ("Add Bacon");
        cbx_AddCheese = new JCheckBox ("Add Cheese");
        cbx_meal = new JCheckBox ("Make it a meal");
        tbx_yourOrder = new JTextArea (5, 6);
        lbl_ord = new JLabel ("Your Order");
        jcomp9 = new JLabel ("Item Price: $");
        jcomp10 = new JLabel ("Total Price:");
        jcomp11 = new JLabel ("Quantity:");
        jcomp12 = new JTextField (5);
        jcomp13 = new JTextField (5);
        jcomp14 = new JTextField (5);
        btn_qtyAdd = new JButton ("+");
        btn_qtyToa = new JButton ("-");

        //set components properties
        jcomp12.setEnabled (false);
        jcomp14.setEnabled (false);
        btn_qtyAdd.setToolTipText ("Add More items to the cart");

        //adjust size and set layout
        setPreferredSize (new Dimension (583, 386));
        setLayout (null);

        //add components
        add (Order);
        add (rb_SingleBurger);
        add (rb_DoubleBurger);
        add (cbx_AddBacon);
        add (cbx_AddCheese);
        add (cbx_meal);
        add (tbx_yourOrder);
        add (lbl_ord);
        add (jcomp9);
        add (jcomp10);
        add (jcomp11);
        add (jcomp12);
        add (jcomp13);
        add (jcomp14);
        add (btn_qtyAdd);
        add (btn_qtyToa);

        //set component bounds (only needed by Absolute Positioning)
        Order.setBounds (0, 0, 585, 25);
        rb_SingleBurger.setBounds (5, 75, 125, 25);
        rb_DoubleBurger.setBounds (5, 105, 130, 25);
        cbx_AddBacon.setBounds (5, 160, 130, 25);
        cbx_AddCheese.setBounds (5, 190, 125, 25);
        cbx_meal.setBounds (5, 220, 135, 25);
        tbx_yourOrder.setBounds (225, 75, 335, 160);
        lbl_ord.setBounds (350, 50, 100, 25);
        jcomp9.setBounds (5, 290, 100, 25);
        jcomp10.setBounds (235, 330, 80, 25);
        jcomp11.setBounds (390, 260, 70, 25);
        jcomp12.setBounds (95, 290, 100, 25);
        jcomp13.setBounds (460, 260, 100, 25);
        jcomp14.setBounds (325, 330, 100, 25);
        btn_qtyAdd.setBounds (460, 285, 45, 25);
        btn_qtyToa.setBounds (515, 285, 45, 25);
    }
}
