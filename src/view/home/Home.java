/*
 * Created by JFormDesigner on Sun Nov 06 07:37:09 ART 2022
 */

package view.home;

import view.turn.Turn;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ResourceBundle;

/**
 * @author unknown
 */
public class Home extends JFrame {
    public Home() {
        initComponents();
    }

    private void menuItem1(ActionEvent e) {
        new Turn(this).setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        ResourceBundle bundle = ResourceBundle.getBundle("resources.config");
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem2 = new JMenuItem();
        menu2 = new JMenu();
        menuItem1 = new JMenuItem();
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        textField1 = new JTextField();
        button1 = new JButton();
        panel1 = new JPanel();
        label2 = new JLabel();
        textField2 = new JTextField();
        textField3 = new JTextField();
        label3 = new JLabel();
        textField6 = new JTextField();
        label6 = new JLabel();
        comboBox1 = new JComboBox();
        label7 = new JLabel();
        panel2 = new JPanel();
        label4 = new JLabel();
        label5 = new JLabel();
        comboBox2 = new JComboBox();
        comboBox3 = new JComboBox();
        label8 = new JLabel();
        textField4 = new JTextField();
        panel3 = new JPanel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        setTitle(bundle.getString("Home.this.title"));
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText(bundle.getString("Home.menu1.text"));

                //---- menuItem2 ----
                menuItem2.setText(bundle.getString("Home.menuItem2.text"));
                menu1.add(menuItem2);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText(bundle.getString("Home.menu2.text"));

                //---- menuItem1 ----
                menuItem1.setText(bundle.getString("Home.menuItem1.text"));
                menuItem1.addActionListener(e -> menuItem1(e));
                menu2.add(menuItem1);
            }
            menuBar1.add(menu2);
        }
        setJMenuBar(menuBar1);

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- label1 ----
                label1.setText(bundle.getString("Home.label1.text"));
                contentPanel.add(label1);
                label1.setBounds(10, 13, 90, label1.getPreferredSize().height);
                contentPanel.add(textField1);
                textField1.setBounds(110, 5, 125, textField1.getPreferredSize().height);

                //---- button1 ----
                button1.setText("Buscar");
                contentPanel.add(button1);
                button1.setBounds(240, 5, 90, button1.getPreferredSize().height);

                //======== panel1 ========
                {
                    panel1.setAlignmentX(9.5F);
                    panel1.setBorder(new TitledBorder(bundle.getString("Home.panel1.border")));
                    panel1.setLayout(null);

                    //---- label2 ----
                    label2.setText(bundle.getString("Home.label2.text"));
                    panel1.add(label2);
                    label2.setBounds(10, 30, 80, 16);
                    panel1.add(textField2);
                    textField2.setBounds(105, 20, 330, 30);
                    panel1.add(textField3);
                    textField3.setBounds(105, 55, 330, 30);

                    //---- label3 ----
                    label3.setText(bundle.getString("Home.label3.text"));
                    panel1.add(label3);
                    label3.setBounds(10, 65, 80, 11);
                    panel1.add(textField6);
                    textField6.setBounds(300, 90, 135, 30);

                    //---- label6 ----
                    label6.setText(bundle.getString("Home.label6.text"));
                    panel1.add(label6);
                    label6.setBounds(190, 100, 100, 15);
                    panel1.add(comboBox1);
                    comboBox1.setBounds(105, 90, 75, comboBox1.getPreferredSize().height);

                    //---- label7 ----
                    label7.setText(bundle.getString("Home.label7.text"));
                    panel1.add(label7);
                    label7.setBounds(10, 100, 100, 16);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel1.getComponentCount(); i++) {
                            Rectangle bounds = panel1.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel1.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel1.setMinimumSize(preferredSize);
                        panel1.setPreferredSize(preferredSize);
                    }
                }
                contentPanel.add(panel1);
                panel1.setBounds(5, 40, 450, 135);

                //======== panel2 ========
                {
                    panel2.setAlignmentX(9.5F);
                    panel2.setBorder(new TitledBorder(bundle.getString("Home.panel2.border")));
                    panel2.setLayout(null);

                    //---- label4 ----
                    label4.setText(bundle.getString("Home.label4.text"));
                    panel2.add(label4);
                    label4.setBounds(10, 30, 60, 16);

                    //---- label5 ----
                    label5.setText(bundle.getString("Home.label5.text"));
                    panel2.add(label5);
                    label5.setBounds(10, 60, 60, 16);
                    panel2.add(comboBox2);
                    comboBox2.setBounds(110, 20, 160, comboBox2.getPreferredSize().height);
                    panel2.add(comboBox3);
                    comboBox3.setBounds(110, 55, 160, 30);

                    //---- label8 ----
                    label8.setText(bundle.getString("Home.label8.text"));
                    panel2.add(label8);
                    label8.setBounds(10, 95, 100, 16);
                    panel2.add(textField4);
                    textField4.setBounds(110, 90, 160, textField4.getPreferredSize().height);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel2.getComponentCount(); i++) {
                            Rectangle bounds = panel2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel2.setMinimumSize(preferredSize);
                        panel2.setPreferredSize(preferredSize);
                    }
                }
                contentPanel.add(panel2);
                panel2.setBounds(455, 40, 285, 135);

                //======== panel3 ========
                {
                    panel3.setAlignmentX(9.5F);
                    panel3.setBorder(new TitledBorder(bundle.getString("Home.panel3.border")));
                    panel3.setLayout(null);

                    //======== scrollPane1 ========
                    {
                        scrollPane1.setViewportView(table1);
                    }
                    panel3.add(scrollPane1);
                    scrollPane1.setBounds(10, 25, 715, 175);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < panel3.getComponentCount(); i++) {
                            Rectangle bounds = panel3.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = panel3.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        panel3.setMinimumSize(preferredSize);
                        panel3.setPreferredSize(preferredSize);
                    }
                }
                contentPanel.add(panel3);
                panel3.setBounds(5, 180, 735, 210);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText(bundle.getString("Home.okButton.text"));
                buttonBar.add(okButton, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText(bundle.getString("Home.cancelButton.text"));
                buttonBar.add(cancelButton, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem2;
    private JMenu menu2;
    private JMenuItem menuItem1;
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JTextField textField1;
    private JButton button1;
    private JPanel panel1;
    private JLabel label2;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel label3;
    private JTextField textField6;
    private JLabel label6;
    private JComboBox comboBox1;
    private JLabel label7;
    private JPanel panel2;
    private JLabel label4;
    private JLabel label5;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JLabel label8;
    private JTextField textField4;
    private JPanel panel3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
