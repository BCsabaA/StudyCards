package com.barab.presenter;

import com.barab.view.IViewListener;
import com.barab.view.MainFrame;

public class StudyCardPresenter implements IViewListener {
	
	private final MainFrame mainFrame;

	public StudyCardPresenter(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		mainFrame.addListener(this);
	}

	public void onMainFrameTestButtonClicked() {
		System.out.println("Teszt gomb megnyomva.");
	}

}
