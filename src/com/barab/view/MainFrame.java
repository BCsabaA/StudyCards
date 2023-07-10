package com.barab.view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.barab.presenter.StudyCardPresenter;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	
	private ArrayList<IViewListener> listeners;
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public MainFrame() {
		
		this.listeners = new ArrayList<IViewListener>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTeszt = new JButton("Teszt");
		btnTeszt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				notifyOnMainFrameTestButtonClicked();
			}
		});
		btnTeszt.setBounds(12, 12, 117, 25);
		contentPane.add(btnTeszt);
		
		this.setVisible(true);
	}

	protected void notifyOnMainFrameTestButtonClicked() {
		for (IViewListener listener : listeners) {
			listener.onMainFrameTestButtonClicked();
		}
	}

	public void addListener(IViewListener listener) {
		this.listeners.add(listener);
	}
}
