package Gui;

import javax.swing.*;
import java.awt.*;//Import java.awt.*; AWT tersebut singkatan dari Abstract Windowing Toolkit yang merupakan Suatu Perintah Untuk memanggil library yang ada di awt agar dapat digunakan dalam pembuatan program.
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RegisterGui extends ComponentGui {
    public RegisterGui(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Register Akun");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelregister.setBounds(120, 50, 70, 25);
        add(labelregister);
        labelnama.setBounds(35, 95, 40, 25);
        add(labelnama);
        fieldnama.setBounds(130, 95, 130, 25);
        add(fieldnama);
        
        labelnama.setBounds(35, 140, 80, 25);
        add(labelnama);
        fieldnama.setBounds(130, 140, 130, 25);
        add(fieldnama);
        
        labelpassword.setBounds(35, 185, 80, 25);
        add(labelpassword);
        fieldpassword.setBounds(130, 185, 130, 25);
        add(fieldpassword);
        
        labelnoTelp.setBounds(35, 230, 80, 25);
        add(labelnoTelp);
        fieldnoTelp.setBounds(130, 230, 130, 25);
        add(fieldnoTelp);
        
        labelalamat.setBounds(35, 260, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(130, 260, 130, 25);
        add(fieldalamat);
        
        labeljeniskelamin.setBounds(35, 290, 80, 25);
        add(labeljeniskelamin);
        fieldjeniskelamin.setBounds(130, 290, 130, 25);
        add(fieldjeniskelamin);
        
        labelkelas.setBounds(35, 320, 80, 25);
        add(labelkelas);
        fieldkelas.setBounds(130, 320, 130, 25);
        add(fieldkelas);
        
        btnregister.setBounds(80, 360, 140, 25);
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
                String password = fieldpassword.getText();
                String noTelp = fieldnoTelp.getText();
                String alamat = fieldalamat.getText();
                String jeniskelamin = fieldjeniskelamin.getText();
                String kelas = fieldkelas.getText();
                if(nama.length() != 0 && password.length() != 0 && noTelp.length() != 0 && alamat.length() != 0 && jeniskelamin.length() != 0 && kelas.length() != 0){
                AllObjectController.siswa.insertData(nama, password, noTelp, alamat, jeniskelamin, kelas);
                    JOptionPane.showMessageDialog(null, "Silahkan Login Kembali");
                    dispose();
                    new LoginGui().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong();
                }
            }
        });
    }
}
