package pekan8_2511532019;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class OperatorAritmatikaGUI_2511532019 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);}
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511532019 frame = new OperatorAritmatikaGUI_2511532019();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511532019() {
		setResizable(false);
		setTitle("OPERATOR ARITMATIKA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(154, 17, 0, 0);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(133, 17, 184, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setBounds(66, 56, 127, 14);
		contentPane.add(lblBilangan);
		
		JLabel lblBilangan_2 = new JLabel("Bilangan 2");
		lblBilangan_2.setBounds(66, 81, 127, 14);
		contentPane.add(lblBilangan_2);
		
		JLabel lblBilangan_2_1 = new JLabel("Operator");
		lblBilangan_2_1.setBounds(66, 126, 71, 14);
		contentPane.add(lblBilangan_2_1);
		
		JLabel lblBilangan_2_1_1 = new JLabel("Hasil");
		lblBilangan_2_1_1.setBounds(66, 172, 71, 14);
		contentPane.add(lblBilangan_2_1_1);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(154, 53, 110, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		JButton Proses = new JButton("Proses");
		Proses.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Silahkan Input Bilangan 1");
				}else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Silahkan Input Bilangan 2");
				}else if(txtBil2.getText().trim().startsWith("0")) {
					pesanPeringatan("Bilangan 2 tidak boleh angka 0");
				}else {
					try {
						int a = Integer.parseInt(txtBil1.getText());
						int b = Integer.parseInt(txtBil2.getText());
						int c = cbOperator.getSelectedIndex();
						if (c==0) {hasil = a+b;}
						if (c==1) {hasil = a-b;}
						if (c==2) {hasil = a*b;}
						if (c==3) {hasil= a/b;}
						if (c==4) {hasil = a%b;}
						
						txtHasil.setText(String.valueOf(hasil));
						
					}catch (NumberFormatException ex) {
						pesanError ("Bilangan 1 dan Bilangan 2 harus Angka");
					}
				}
				int a = Integer.parseInt(txtBil1.getText());
				int b = Integer.parseInt(txtBil2.getText());
				int c = cbOperator.getSelectedIndex();
				if (c==0) {hasil = a+b;}
				if (c==1) {hasil = a-b;}
				if (c==2) {hasil = a*b;}
				if (c==3) {hasil= a/b;}
				if (c==4) {hasil = a%b;}
				
				txtHasil.setText(String.valueOf(hasil));
			}
		});
		Proses.setBounds(250, 122, 88, 22);
		contentPane.add(Proses);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		txtBil2.setBounds(154, 78, 110, 20);
		contentPane.add(txtBil2);
		
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(154, 114, 45, 31);
		contentPane.add(cbOperator);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setColumns(10);
		txtHasil.setBounds(154, 169, 110, 20);
		contentPane.add(txtHasil);

	}
}
