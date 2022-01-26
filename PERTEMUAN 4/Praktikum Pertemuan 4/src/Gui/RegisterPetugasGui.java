package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterPetugasGui extends ComponentGui {
    public RegisterPetugasGui(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Admin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelregister.setText("REGISTER ADMIN");
        labelregister.setBounds(100, 50, 110, 25);
        add(labelregister);
        labelnama.setBounds(35, 95, 40, 25);
        add(labelnama);
        fieldnama.setBounds(130, 95, 130, 25);
        add(fieldnama);
        
        labelalamat.setBounds(35, 140, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 140, 130, 25);
        add(fieldalamat);
        
        labelnoTelp.setBounds(35, 185, 80, 25);
        add(labelnoTelp);
        fieldnoTelp.setBounds(130, 185, 130, 25);
        add(fieldnoTelp);
        
        labelpassword.setBounds(35, 230, 80, 25);
        add(labelpassword);
        fieldpassword.setBounds(130, 230, 130, 25);
        add(fieldpassword);
        
        labelpetugaskelas.setBounds(35, 275, 80, 25);
        add(labelpetugaskelas);
        fieldpetugaskelas.setBounds(130, 275, 130, 25);
        add(fieldpetugaskelas);
        
        btnregister.setBounds(80, 350, 140, 25);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        btnregister.setFocusPainted(false);
        add(btnregister);
        
        btnregister.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnregister.setForeground(Color.black);
                btnregister.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnregister.setForeground(Color.white);
                btnregister.setBackground(Color.black);
            }
        });
        
        btnregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama = fieldnama.getText();
                String alamat = fieldalamat.getText();
                String noTelp = fieldnoTelp.getText();
                String password = fieldpassword.getText();
                String petugaskelas = fieldpetugaskelas.getText();
                if(nama.length() != 0 && alamat.length() != 0 && noTelp.length() != 0 && password.length() != 0 && petugaskelas.length() != 0){
                    AllObjectController.petugas.insert(nama, alamat, noTelp, password, petugaskelas);
                    JOptionPane.showMessageDialog(null, nama + "Adalah Admin");
                    dispose();
                    new LoginPetugasGui().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
