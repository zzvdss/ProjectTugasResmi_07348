package Gui;

import Entity.SiswaEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SiswaGui extends ComponentGui {
    int id;
    int status;
    String nama, password, noTelp, alamat, jeniskelamin, kelas;
    
    public SiswaGui(int cek){
        initComponent(cek);
    }
    
    void initComponent(final int cek){
        for(SiswaEntity SiswaEntities : AllObjectController.siswa.getByid(cek)) {
            this.id       = SiswaEntities.getid();
            this.nama     = SiswaEntities.getnama();
            this.password      = SiswaEntities.getpassword();
            this.noTelp = SiswaEntities.getnoTelp();
            this.alamat   = SiswaEntities.getalamat();
            this.jeniskelamin   = SiswaEntities.getjeniskelamin();
            this.kelas   = SiswaEntities.getkelas();
            this.status   = SiswaEntities.getstatus();
        }
        
        setTitle("PROGRAM VERIFIKASI SISWA");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(380,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        labelnama.setBounds(50, 50, 40, 25);
        add(labelnama);
        fieldnama.setBounds(120, 50, 100, 25);
        fieldnama.setText(nama);
        fieldnama.setEditable(false);
        add(fieldnama);
        
        labelpassword.setBounds(50, 90, 40, 25);
        add(labelpassword);
        fieldpassword.setBounds(120, 90, 100, 25);
        fieldpassword.setText(password);
        fieldpassword.setEditable(false);
        add(fieldpassword);
        
        labelnoTelp.setBounds(50, 135, 80, 25);
        add(labelnoTelp);
        fieldnoTelp.setBounds(120, 135, 100, 25);
        fieldnoTelp.setText(noTelp);
        fieldnoTelp.setEditable(false);
        add(fieldnoTelp);
        
        labelalamat.setBounds(50, 180, 80, 25);
        add(labelalamat);
        fieldalamat.setBounds(120, 180, 100, 25);
        fieldalamat.setText(alamat);
        fieldalamat.setEditable(false);
        add(fieldalamat);
        
        labeljeniskelamin.setBounds(50, 225, 80, 25);
        add(labeljeniskelamin);
        fieldjeniskelamin.setBounds(120, 225, 100, 25);
        fieldjeniskelamin.setText(jeniskelamin);
        fieldjeniskelamin.setEditable(false);
        add(fieldjeniskelamin);
        
        labelkelas.setBounds(50, 270, 80, 25);
        add(labelkelas);
        fieldkelas.setBounds(120, 270, 100, 25);
        fieldkelas.setText(kelas);
        fieldkelas.setEditable(false);
        add(fieldkelas);
        
        bingkaigambar.setBounds(50, 245, 150, 200);
        add(bingkaigambar);
        
        btnubahnama.setBounds(240, 50, 80, 25);
        btnubahpassword.setBounds(240, 90, 80, 25);
        btnubahnoTelp.setBounds(240, 135, 80, 25);
        btnubahalamat.setBounds(240, 180, 80, 25);
        btnubahjeniskelamin.setBounds(240, 220, 80, 25);
        btnubahkelas.setBounds(240, 270, 80, 25);
        
        add(btnubahnama);
        add(btnubahpassword);
        add(btnubahnoTelp);
        add(btnubahalamat);
        add(btnubahjeniskelamin);
        add(btnubahkelas);
       
        bingkaigambar.setBounds(50, 225, 150, 200);
        add(bingkaigambar);
        
        btnback.addMouseListener(new MouseAdapter(){
           
            public void mouseEntered(MouseEvent e){
        btnback.setForeground(Color.blue);
            }
            
            public void mouseExited(MouseEvent e){
        btnback.setForeground(Color.black);
            }
        });
        
        btnback.addActionListener((ActionEvent e) -> {
            LoginGui loginGui = new LoginGui();
            loginGui.setVisible(true);
            dispose();
        });
    
        btnubahnama.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnama = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama.length() > 0){
                        AllObjectController.siswa.update(1, inputnama, cek);
                        fieldnama.setText(inputnama);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahpassword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputpassword = JOptionPane.showInputDialog("Masukan PASSWORD Baru");
                    if(inputpassword.length() > 0){
                        AllObjectController.siswa.update(2, inputpassword, cek);
                        fieldpassword.setText(inputpassword);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahnoTelp.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputnoTelp = JOptionPane.showInputDialog("Masukan NoTelp Baru");
                    if(inputnoTelp.length() > 0){
                        AllObjectController.siswa.update(3, inputnoTelp, cek);
                        fieldnoTelp.setText(inputnoTelp);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnubahalamat.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputalamat = JOptionPane.showInputDialog("Masukan alamat Baru");
                    if(inputalamat.length() > 0){
                        AllObjectController.siswa.update(4, inputalamat, cek);
                        fieldalamat.setText(inputalamat);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
     btnubahjeniskelamin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputjeniskelamin = JOptionPane.showInputDialog("Masukan Jenis Kelamin Baru");
                    if(inputjeniskelamin.length() > 0){
                        AllObjectController.siswa.update(5, inputjeniskelamin, cek);
                        fieldjeniskelamin.setText(inputjeniskelamin);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
       btnubahkelas.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputkelas = JOptionPane.showInputDialog("Masukan Kelas Baru");
                    if(inputkelas.length() > 0){
                        AllObjectController.siswa.update(6, inputkelas, cek);
                        fieldkelas.setText(inputkelas);
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
    }
