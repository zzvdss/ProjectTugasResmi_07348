package Gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ComponentGui extends JFrame {
    protected JButton btnregister = new JButton("REGISTRASI ?");
    protected JButton btnnotreg = new JButton("BELUM REGISTRASI ?");
    protected JButton btnlogin = new JButton("LOGIN");
    protected JButton btnback = new JButton("<");
    protected JButton btndelete = new JButton("DELETE");
    protected JButton btnverif = new JButton("VERIFIKASI");
    
    protected JLabel labelregister = new JLabel("REGISTER");
    protected JLabel labellogin = new JLabel("LOGIN");
    protected JLabel labelid = new JLabel("ID");
    protected JLabel labelnama = new JLabel("NAMA");
    protected JLabel labelalamat = new JLabel("ALAMAT");
    protected JLabel labelkelas = new JLabel("KELAS");
    protected JLabel labeljeniskelamin = new JLabel("JENIS KELAMIN"); 
    protected JLabel labelpetugaskelas = new JLabel("PETUGAS KELAS");
    protected JLabel labelpassword = new JLabel("PASSWORD");
    protected JLabel labelnoTelp = new JLabel("NO TELP");
    protected JLabel bingkaigambar = new JLabel();
    
    protected JTextField fieldnama = new JTextField();
    protected JTextField fieldalamat = new JTextField();
    protected JPasswordField fieldpassword = new JPasswordField();
    protected JTextField fieldnoTelp = new JTextField();
    protected JTextField fieldkelas = new JTextField();
    protected JTextField fieldpetugaskelas = new JTextField();
    protected JTextField fieldjeniskelamin= new JTextField();
    
    protected JButton btnubahnama = new JButton("Ubah");
    protected JButton btnubahalamat = new JButton("Ubah");
    protected JButton btnubahpassword = new JButton("Ubah");
    protected JButton btnubahnoTelp = new JButton("Ubah");
    protected JButton btnubahpetugaskelas = new JButton("Ubah");
    protected JButton btnubahkelas = new JButton("Ubah");
    protected JButton btnubahjeniskelamin = new JButton("Ubah");
    BufferedImage bufferedImage = null;
    Image gambarresize;
    
    void kosong(){
        fieldnama.setText(null);
        fieldalamat.setText(null);
        fieldpassword.setText(null);
        fieldnoTelp.setText(null);
        fieldjeniskelamin.setText(null);
        fieldkelas.setText(null);
        fieldpetugaskelas.setText(null);
    }
}