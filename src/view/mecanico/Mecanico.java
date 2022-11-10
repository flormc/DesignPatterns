/*
 * Created by JFormDesigner on Mon Nov 07 19:58:51 ART 2022
 */

package view.mecanico;

//import com.toedter.calendar.*;
import model.dto.Speciality;

import java.awt.*;
import javax.swing.*;


/**
 * @author flor
 */
public class Mecanico extends JDialog {
    public Mecanico(Window owner) {
        super(owner);
//        initComponents();
    }
/**
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - flor
        label1 = new JLabel();
        Jcbespecility = new JComboBox();
        label2 = new JLabel();
        label3 = new JLabel();
        calendar1 = new JCalendar();
        spinner1 = new JSpinner();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========
        setTitle("Mec\u00e1nico");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("Especialidad");
        contentPane.add(label1);
        label1.setBounds(15, 15, 145, 25);
        contentPane.add(Jcbespecility);
        Jcbespecility.setBounds(95, 20, 200, 25);

        //---- label2 ----
        label2.setText("Calendario");
        contentPane.add(label2);
        label2.setBounds(15, 60, 105, 15);

        //---- label3 ----
        label3.setText("Horario");
        contentPane.add(label3);
        label3.setBounds(new Rectangle(new Point(25, 200), label3.getPreferredSize()));
        contentPane.add(calendar1);
        calendar1.setBounds(101, 50, 280, 145);
        contentPane.add(spinner1);
        spinner1.setBounds(95, 200, 140, 20);

        //---- button1 ----
        button1.setText("Aceptar");
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(240, 240), button1.getPreferredSize()));

        //---- button2 ----
        button2.setText("Cancelar");
        contentPane.add(button2);
        button2.setBounds(new Rectangle(new Point(345, 240), button2.getPreferredSize()));

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
     Jcbespecility.setModel(new DefaultComboBoxModel(Speciality.values()));
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - flor
    private JLabel label1;
    private JComboBox Jcbespecility;
    private JLabel label2;
    private JLabel label3;
    private JCalendar calendar1;
    private JSpinner spinner1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
 */
}
