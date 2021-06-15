//Rizky H1051201073 [ PROJECT GUI ] - [ DAFTAR MENU PESANAN ]

package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Button;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JCheckBox;

import java.util.ArrayList;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle.ComponentPlacement;
public class FrameMenu extends JFrame {

	
	private JPanel contentPane;
	private JTextField atasnamatxt;
	private JTextField txtNasiTelur;
	private JTextField txtNasiLele;
	private JTextField txtNasiAyam;
	private JTextField txtNasiSate;
	private JSpinner jumlah1;
	private JSpinner jumlah2;
	private JSpinner jumlah3;
	private JSpinner jumlah4;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameMenu frame = new FrameMenu();
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
	//Frame
	public FrameMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 579);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DAFTAR MENU");
		lblNewLabel.setFont(new Font("Modern No. 20", Font.BOLD, 24));
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblPemesanAtasNama = new JLabel("Pemesan Atas Nama :");
		lblPemesanAtasNama.setFont(new Font("Modern No. 20", Font.BOLD, 13));
		lblPemesanAtasNama.setBackground(Color.LIGHT_GRAY);
		
		atasnamatxt = new JTextField();
		atasnamatxt.setColumns(10);
		atasnamatxt.setBorder(null);
		
		JLabel lblMeja = new JLabel("MEJA");
		lblMeja.setFont(new Font("Modern No. 20", Font.BOLD, 24));
		lblMeja.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Modern No. 20", Font.BOLD, 24));
		lblMenu.setBackground(Color.LIGHT_GRAY);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JCheckBox paket1 = new JCheckBox("Paket 1");
		
		JCheckBox paket2 = new JCheckBox("Paket 2");
		
		JCheckBox paket3 = new JCheckBox("Paket 3");
		
		JCheckBox paket4 = new JCheckBox("Paket 4");
		
		txtNasiTelur = new JTextField();
		txtNasiTelur.setEditable(false);
		txtNasiTelur.setText("Nasi + Telur Balado + Tumisan Sayur + Es Teh");
		txtNasiTelur.setColumns(10);
		
		txtNasiLele = new JTextField();
		txtNasiLele.setEditable(false);
		txtNasiLele.setText("Nasi + Lele Goreng + Sambal + Es Teh\r\n");
		txtNasiLele.setColumns(10);
		
		txtNasiAyam = new JTextField();
		txtNasiAyam.setEditable(false);
		txtNasiAyam.setText("Nasi + Ayam Goreng + Sambal + Es Teh");
		txtNasiAyam.setColumns(10);
		
		txtNasiSate = new JTextField();
		txtNasiSate.setEditable(false);
		txtNasiSate.setText("Nasi + Sate Ayam + Kerupuk + Air Mineral");
		txtNasiSate.setColumns(10);
		
		JRadioButton abutton = new JRadioButton("A");
		abutton.setSelected(true);
		buttonGroup.add(abutton);
		
		JRadioButton bbutton = new JRadioButton("B");
		buttonGroup.add(bbutton);
		
		JButton btnNewButton = new JButton("PESAN");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {

			String atasnama = atasnamatxt.getText();
			
			if  (atasnamatxt.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null,"Nama Pemesan tidak boleh kosong");
			} else {
			
			// Bagian Meja
			String meja;
			if (abutton.isSelected()) {
				meja = "A";
			} else if (bbutton.isSelected()) { 
				meja = "B";
			} else {
				meja = "C";
			}
			
			ArrayList data = new ArrayList();
			
			int jumlah1txt = (int) jumlah1.getValue();
			int jumlah2txt = (int) jumlah2.getValue();
			int jumlah3txt = (int) jumlah3.getValue();
			int jumlah4txt = (int) jumlah4.getValue();
			
			/* int jumlah1txt = Integer.valueOf(jumla1.getText());
			int jumlah2txt = Integer.valueOf(jumlah2.getText());
			int jumlah3txt = Integer.valueOf(jumlah3.getText());
			int jumlah4txt = Integer.valueOf(jumlah4.getText());*/
			
			if(paket1.isSelected()) {
				data.add("[ " + jumlah1txt + " Porsi ] Paket 1 = Nasi + Sate Ayam + Kerupuk + Air Mineral");
			} 
			if (paket2.isSelected()) {
				data.add("[ " + jumlah2txt + " Porsi ] Paket 2 = Nasi + Ayam Goreng + Sambal + Es Teh");
			}
			if (paket3.isSelected()) {
				data.add("[ " + jumlah3txt + " Porsi ] Paket 3 = Nasi + Lele Goreng + Sambal + Es Teh");
			}
			if (paket4.isSelected()) {
				data.add("[ " + jumlah4txt + " Porsi ] Paket 4 = Nasi + Telur Balado + Tumisan Sayur + Es Teh");
			}
			
			
			JOptionPane.showMessageDialog(null,"Pemesan Atas Nama : " + atasnama + "\nMeja : " + meja + "\nPesanan : " + data);
			// [textArea] menampilkan data Input ke Tableview (textArea)
			textArea.append("\nPemesan Atas Nama : " + atasnama + "\nMeja : " + meja + "\nPesanan : " + data + "\n=====================================================");
			textArea.setLineWrap(true);
			}
			
		}
		
		});
		
		JRadioButton cbutton = new JRadioButton("C");
		buttonGroup.add(cbutton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		jumlah1 = new JSpinner();
		
		jumlah2 = new JSpinner();
		
		jumlah3 = new JSpinner();
		
		jumlah4 = new JSpinner();
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(204)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(lblPemesanAtasNama))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(262)
							.addComponent(lblMeja, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(65)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(183)
									.addComponent(bbutton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(23)
									.addComponent(abutton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(336)
									.addComponent(cbutton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 485, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(259)
							.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(15)
								.addComponent(paket3)
								.addGap(18)
								.addComponent(jumlah3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(txtNasiLele))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(15)
								.addComponent(paket2)
								.addGap(18)
								.addComponent(jumlah2, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(txtNasiAyam))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(15)
								.addComponent(paket1)
								.addGap(18)
								.addComponent(jumlah1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(txtNasiSate))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(54)
								.addComponent(atasnamatxt, GroupLayout.PREFERRED_SIZE, 519, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(15)
								.addComponent(paket4)
								.addGap(18)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(129)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(jumlah4, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(txtNasiTelur))))))
					.addGap(18)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(5)
							.addComponent(lblPemesanAtasNama, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
							.addComponent(atasnamatxt, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
							.addGap(19)
							.addComponent(lblMeja, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(bbutton))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(abutton))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(16)
									.addComponent(cbutton))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblMenu, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(paket1)
									.addComponent(jumlah1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtNasiSate, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(paket2)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(txtNasiAyam, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addComponent(jumlah2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(paket3)
										.addComponent(jumlah3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addComponent(txtNasiLele, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(9)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(paket4)
										.addComponent(jumlah4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(8)
									.addComponent(txtNasiTelur, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)))
							.addGap(33)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 496, Short.MAX_VALUE)))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		contentPane.setVisible(true);
		
		
	}
}
