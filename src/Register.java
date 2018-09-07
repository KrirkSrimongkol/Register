import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Register {
    private JTextField txtUserLogin;
    private JPasswordField pwdUswePassword;
    private JPasswordField pwdUsweRePassword;
    private JButton btnconfirm;
    private JButton btnclear;
    private JPanel mainPanel;

    public Register() {
        btnconfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(txtUserLogin != null || pwdUswePassword != null || pwdUsweRePassword != null){
                    JOptionPane.showMessageDialog(null,"\n" +
                            "You have finished the filter");
                }
                /*JOptionPane.showMessageDialog(null, txtUserLogin.getText()
                +" "+new String(pwdUswePassword.getPassword()));*/
            }
        });

        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                txtUserLogin.setText("");
                pwdUswePassword.setText("");
                pwdUsweRePassword.setText("");
            }
        });

        }
        public JPanel getMainPanel(){
            return mainPanel;
        }
    }
