package com.barab.app;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.barab.view.MainFrame;

import javax.swing.JButton;

public class StudyCard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudyCard window = new StudyCard();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudyCard() {
		MainFrame mainFrame = new MainFrame();
	}

}
