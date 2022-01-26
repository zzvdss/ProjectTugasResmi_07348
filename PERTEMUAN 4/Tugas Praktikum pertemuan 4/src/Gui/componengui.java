package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class componengui extends JFrame {
    protected JButton btnregister = new JButton("Konfirmasi");
    protected JButton btnback = new JButton("<");
    protected JButton btndelete = new JButton("HAPUS DATA");

    protected JLabel labelregister = new JLabel("Masukkan Stock Baru");
    protected JLabel labelid = new JLabel("ID");
    protected JLabel labelmerek = new JLabel("MERK");
    protected JLabel labelsize = new JLabel("SIZE");
    protected JLabel labelpcs = new JLabel("PCS");

    protected JTextField fieldmerek = new JTextField();
    protected JTextField fieldsize = new JTextField();
    protected JTextField fieldpcs = new JTextField();

    protected JButton btnubahmerek = new JButton("Ubah");
    protected JButton btnubahsize = new JButton("Ubah");
    protected JButton btnubahpcs = new JButton("Ubah");

    void kosong(){
        fieldmerek.setText(null);
        fieldsize.setText(null);
        fieldpcs.setText(null);
    }
}
