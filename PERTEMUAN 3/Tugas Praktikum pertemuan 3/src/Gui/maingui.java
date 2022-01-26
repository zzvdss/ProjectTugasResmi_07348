package Gui;

import Gui.componengui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class maingui extends componengui {
    JTable tabelstash = new JTable();
    JScrollPane spsepatu = new JScrollPane(tabelstash);
    JTextField textpilih = new JTextField();
    int kode;

    void initComponent(final int cek){
        setTitle("PROGRAM GUDANG SEPATU");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);

        setLayout(null);
        setVisible(true);

        btnubahmerek.setBounds(540, 50, 110, 25);
        btnubahmerek.setFocusPainted(false);
        btnubahmerek.setBorder(null);
        btnubahmerek.setBackground(Color.black);
        btnubahmerek.setForeground(Color.white);
        add(btnubahmerek);

        btndelete.setBounds(540, 95, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);

        btnubahsize.setText("UBAH UKURAN");
        btnubahsize.setBounds(540, 140, 110, 25);
        btnubahsize.setFocusPainted(false);
        btnubahsize.setBorder(null);
        btnubahsize.setBackground(Color.black);
        btnubahsize.setForeground(Color.white);
        add(btnubahsize);

        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);

        btnregister.setText("TAMBAH STOCK");
        btnregister.setBounds(540, 185, 110, 25);
        btnregister.setFocusPainted(false);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        add(btnregister);

        tabelstash.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelstash.getSelectedRow();
                textpilih.setText(AllObjectControler.gudangController.daftarsepatu().getValueAt(i, 0).toString());
            }
        });

        btnubahmerek.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih.getText());
                AllObjectControler.gudangController.ubahmerk(kode);
                JOptionPane.showMessageDialog(null, "Berhasil Ubah Merk Sepatu");
                tabelstash.setModel(AllObjectControler.gudangController.daftarsepatu());
            }
        });

        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih.getText());
                AllObjectControler.gudangController.deleteData(kode);
                tabelstash.setModel(AllObjectControler.gudangController.daftarsepatu());
                JOptionPane.showMessageDialog(null, "Berhasil HAPUS DATA");
            }
        });

        btnback.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                btnback.setForeground(Color.yellow);
            }

            @Override
            public void mouseExited(MouseEvent e){
                btnback.setForeground(Color.black);
            }
        });

        btnubahsize.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputsize = JOptionPane.showInputDialog("Masukkan Ukuran Baru");
                    if(inputsize.length() > 0){
                        AllObjectControler.gudangController.updateukuran(inputsize, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Ukuran");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
    }
}