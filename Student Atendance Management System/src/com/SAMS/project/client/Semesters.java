package com.SAMS.project.client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;

public class Semesters extends JFrame {

	private JPanel contentPane;
	private JButton btnSemesterI;
	private JButton btnSemesterIi;
	private JButton btnSemesterIii;
	private JButton btnSemesterIv;
	private JButton btnSemesterV;
	private JButton btnSemesterVi;
	private JButton btnSemesterVii;
	private JButton btnSemesterViii;
	private JLabel lblBatch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Semesters frame = new Semesters();
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
	public Semesters() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnSemesterI());
		contentPane.add(getBtnSemesterIi());
		contentPane.add(getBtnSemesterIii());
		contentPane.add(getBtnSemesterIv());
		contentPane.add(getBtnSemesterV());
		contentPane.add(getBtnSemesterVi());
		contentPane.add(getBtnSemesterVii());
		contentPane.add(getBtnSemesterViii());
		contentPane.add(getLblBatch());
	}
	private JButton getBtnSemesterI() {
		if (btnSemesterI == null) {
			btnSemesterI = new JButton("Semester I");
			btnSemesterI.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterI.setBounds(90, 137, 157, 43);
		}
		return btnSemesterI;
	}
	private JButton getBtnSemesterIi() {
		if (btnSemesterIi == null) {
			btnSemesterIi = new JButton("Semester II");
			btnSemesterIi.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterIi.setBounds(90, 216, 157, 43);
		}
		return btnSemesterIi;
	}
	private JButton getBtnSemesterIii() {
		if (btnSemesterIii == null) {
			btnSemesterIii = new JButton("Semester III");
			btnSemesterIii.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterIii.setBounds(90, 307, 157, 43);
		}
		return btnSemesterIii;
	}
	private JButton getBtnSemesterIv() {
		if (btnSemesterIv == null) {
			btnSemesterIv = new JButton("Semester IV");
			btnSemesterIv.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterIv.setBounds(90, 403, 157, 43);
		}
		return btnSemesterIv;
	}
	private JButton getBtnSemesterV() {
		if (btnSemesterV == null) {
			btnSemesterV = new JButton("Semester V\r\n\r\n");
			btnSemesterV.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterV.setBounds(444, 137, 157, 43);
		}
		return btnSemesterV;
	}
	private JButton getBtnSemesterVi() {
		if (btnSemesterVi == null) {
			btnSemesterVi = new JButton("Semester VI");
			btnSemesterVi.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterVi.setBounds(444, 216, 157, 43);
		}
		return btnSemesterVi;
	}
	private JButton getBtnSemesterVii() {
		if (btnSemesterVii == null) {
			btnSemesterVii = new JButton("Semester VII");
			btnSemesterVii.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterVii.setBounds(444, 307, 157, 43);
		}
		return btnSemesterVii;
	}
	private JButton getBtnSemesterViii() {
		if (btnSemesterViii == null) {
			btnSemesterViii = new JButton("Semester VIII");
			btnSemesterViii.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnSemesterViii.setBounds(444, 403, 157, 43);
		}
		return btnSemesterViii;
	}
	private JLabel getLblBatch() {
		if (lblBatch == null) {
			lblBatch = new JLabel("Batch 2073");
			lblBatch.setFont(new Font("Tahoma", Font.PLAIN, 30));
			lblBatch.setBounds(88, 30, 228, 58);
		}
		return lblBatch;
	}
}
