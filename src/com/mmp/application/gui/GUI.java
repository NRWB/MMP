package com.mmp.application.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.mmp.application.App;
import com.mmp.application.scripter.Scripter;

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = -1438306200346760828L;
	
	private JButton start, stop;
	//private JButton start, stop, openSelectFile;

	//private JFileChooser rootFolderChooser;
	
	//private Path outputFolder;
	
	private Scripter s;
	
	public GUI() {
		super(App.APPLICATION_WINDOW_TITLE);
		
		this.start = new JButton("Start");
		this.stop = new JButton("Stop");
		
		//this.openSelectFile = new JButton("Choose output folder");

		//this.outputFolder = Paths.get(new Scripter().pwd()); // setup a default dir
		//this.rootFolderChooser = new JFileChooser(new Scripter().pwd()); // setup a default dir
		//this.rootFolderChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	}
	
	public void initDisplay() {
		
		JPanel panel = new JPanel(new FlowLayout());
		panel.add(this.start);
		panel.add(this.stop);
		
		JPanel rootPanel = new JPanel(new BorderLayout());
		rootPanel.add(panel, BorderLayout.CENTER);
		
		this.getContentPane().add(rootPanel);
		
		this.start.addActionListener(this);
		this.stop.addActionListener(this);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setLocationByPlatform(true);
		
		this.setSize(new Dimension(400, 200));
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.start) {
			this.s = new Scripter();
			this.s.init();
			this.s.start();
		} else if (e.getSource() == this.stop) {
			if (s != null)
				this.s.stop();
		}
		/*
		else if (e.getSource() == this.openSelectFile) {
			int status = this.rootFolderChooser.showOpenDialog(this);
			switch (status) {
			case JFileChooser.APPROVE_OPTION:
				this.outputFolder = this.rootFolderChooser.getSelectedFile().toPath();
				break;
			case JFileChooser.CANCEL_OPTION:
				this.outputFolder = Paths.get(new Scripter().pwd());
				break;
			default:
				System.out.println("error parsing JFileChooser result");
				break;
			}
		}
		*/
	}

}
