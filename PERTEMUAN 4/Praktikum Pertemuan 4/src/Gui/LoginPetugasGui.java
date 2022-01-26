package Gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginPetugasGui extends ComponentGui {
    
    JButton btnloginsiswa = new JButton("LOGIN SEBAGAI SISWA");
    String pathicon;
    public LoginPetugasGui(){
        initComponent();
    }
    
    void initComponent(){
        setTitle("Login Petugas");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labelnama.setBounds(35,250,40,25);
        add(labelnama);
        fieldnama.setBounds(130,250,130,25);
        add(fieldnama);
        
        labelpassword.setBounds(35,290,80,25);
        add(labelpassword);
        fieldpassword.setBounds(130,290,130,25);
        add(fieldpassword);
        
        btnlogin.setBounds(110,350,100,25);
        btnlogin.setBackground(Color.black);
        btnlogin.setForeground(Color.white);
        btnlogin.setBorder(null);
        add(btnlogin);
        
        btnloginsiswa.setBounds(70,400,180,25);
        btnloginsiswa.setBorder(null);
        btnloginsiswa.setBackground(Color.white);
        add(btnloginsiswa);
        
        bingkaigambar.setBounds(80,70,150,150);
        add(bingkaigambar);
        
        pathicon = "./src/Images/admin.png";
        
        try{
            bufferedImage = ImageIO.read(new File(pathicon));
        } catch (IOException ex) {
            Logger.getLogger(LoginGui.class.getName()).log(Level.SEVERE, null,ex);
        }
        
        gambarresize = bufferedImage.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        bingkaigambar.setIcon(new ImageIcon(gambarresize));
        
        btnloginsiswa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnloginsiswa.setForeground(Color.blue);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnloginsiswa.setForeground(Color.black);
            }
        });
        
        btnloginsiswa.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               dispose();
               new LoginGui().setVisible(true);
           }
        });
        
        btnlogin.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnlogin.setForeground(Color.black);
                btnlogin.setBackground(Color.green);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                btnlogin.setForeground(Color.white);
                btnlogin.setBackground(Color.black);
            }
        });
        
        btnlogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String nama = fieldnama.getText();
                String password = fieldpassword.getText();
                int cek = AllObjectController.petugas.login(nama, password);
                if(cek > 0){
                    dispose();
                    PetugasGui petugasGui = new PetugasGui(cek);
                    petugasGui.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "GAGAL LOGIN");
                    kosong();
                }
            }
        });
    }
}