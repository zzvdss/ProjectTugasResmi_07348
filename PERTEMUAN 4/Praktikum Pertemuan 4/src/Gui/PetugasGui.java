package Gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class PetugasGui extends ComponentGui {
    JTable tabelsiswa = new JTable();
    JScrollPane spsiswa = new JScrollPane(tabelsiswa);
    JTextField textpilih = new JTextField();
    int kode;
    
    public PetugasGui(int cek){
        initComponent(cek);
    }
    
    void initComponent(final int cek){
        setTitle("PROGRAM VERIFIKASI SISWA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setVisible(true);
        
        spsiswa.setBounds(20, 50, 500, 350);
        tabelsiswa.setModel(AllObjectController.siswa.dataSiswa());
        add(spsiswa);
        
        btnverif.setBounds(540, 50, 110, 25);
        btnverif.setFocusPainted(false);
        btnverif.setBorder(null);
        btnverif.setBackground(Color.black);
        btnverif.setForeground(Color.white);
        add(btnverif);
        
        btndelete.setBounds(540, 95, 110, 25);
        btndelete.setFocusPainted(false);
        btndelete.setBorder(null);
        btndelete.setBackground(Color.black);
        btndelete.setForeground(Color.white);
        add(btndelete);
        
        btnubahpassword.setText("UBAH PASSWORD");
        btnubahpassword.setBounds(540, 140, 110, 25);
        btnubahpassword.setFocusPainted(false);
        btnubahpassword.setBorder(null);
        btnubahpassword.setBackground(Color.black);
        btnubahpassword.setForeground(Color.white);
        add(btnubahpassword);
        
        btnback.setBounds(25, 20, 80, 25);
        btnback.setBackground(Color.white);
        btnback.setFocusPainted(false);
        btnback.setBorder(null);
        add(btnback);
        
        btnregister.setText("REGIST ADMIN");
        btnregister.setBounds(540, 185, 110, 25);
        btnregister.setFocusPainted(false);
        btnregister.setBorder(null);
        btnregister.setBackground(Color.black);
        btnregister.setForeground(Color.white);
        add(btnregister);
        
        tabelsiswa.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i = tabelsiswa.getSelectedRow();
                textpilih.setText(AllObjectController.siswa.dataSiswa().getValueAt(i, 0).toString());
            }
        });
        
        btnverif.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih.getText());
                AllObjectController.petugas.verifsiswa(kode);
                JOptionPane.showMessageDialog(null, "Berhasil Verifikasi");
                tabelsiswa.setModel(AllObjectController.siswa.dataSiswa());
            }
        });
        
        btndelete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                kode = Integer.parseInt(textpilih.getText());
                AllObjectController.petugas.deleteData(kode);
                tabelsiswa.setModel(AllObjectController.siswa.dataSiswa());
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
        
        btnback.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                LoginPetugasGui loginAdminGui = new LoginPetugasGui();
                loginAdminGui.setVisible(true);
                dispose();
            }
        });
        
        btnubahpassword.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    String inputpass = JOptionPane.showInputDialog("Masukkan Password Baru");
                    if(inputpass.length() > 0){
                        AllObjectController.petugas.updatepassword(inputpass, cek);
                        JOptionPane.showMessageDialog(null, "Berhasil Ubah Password");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        btnregister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                RegisterPetugasGui registerAdminGui = new RegisterPetugasGui();
                registerAdminGui.setVisible(true);
                dispose();
            }
        });
    } 
}
