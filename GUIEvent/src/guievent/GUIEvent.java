/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guievent;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author joaovittordjesus
 */
public class GUIEvent extends JFrame{
    public GUIEvent(){
        super("Exemple 1 - Event");
        JPanel mainPanel = new JPanel(new GridLayout(3,2));
        this.add(mainPanel);
        //Addind the components to de main panel
        mainPanel.add(new JLabel("Name: "));
        JTextField nameBox = new JTextField();
        mainPanel.add(nameBox);
        mainPanel.add(new JLabel("Surname: "));
        JTextField surnameBox = new JTextField();
        mainPanel.add(surnameBox);
        JButton jbutton1 = new JButton("Submit");
        this.add(jbutton1);
        JLabel surnameName = new JLabel();
        mainPanel.add(surnameName);
        //Setting Frame
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 300, 150);
        this.setVisible(true);
        //Shortened event treatment method
        //Normal event treatment
        jbutton1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nameSurname.setText(nameBox.getText()+ " "+ surnameBox.getText());
                nameBox.setText();
                surnameBox.setText();
            }
        });
        
        
        
        
    }
}
