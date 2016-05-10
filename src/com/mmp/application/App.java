package com.mmp.application;

import javax.swing.SwingUtilities;

import com.mmp.application.gui.GUI;

public class App {
	
	public static final String APPLICATION_WINDOW_TITLE = "MMP Media Please";
	public static final String LN_SEP = System.getProperty("line.separator");
	
	/*
	 * args[0] = true/false
	 * args[1] = 
	 */
	public static void main(String[] args) {
		
		args = new String[] { "false" };
		
		preChecks(Boolean.valueOf(args[0]));
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI gui = new GUI();
				gui.initDisplay();
			}
		});

	}
	
	private static void prnt(Object o, boolean dbg) {
		if (dbg)
			System.out.println(o);
	}
	
	private static void preChecks(boolean showDebug) {
		prnt("Using java environment: ", showDebug);
		prnt(System.getProperties(), showDebug);
		
		prnt(LN_SEP, showDebug);
		
		prnt("Configuring Operating System...", showDebug);
		String os = System.getProperty("os.name").toLowerCase();
		prnt("OS Name: " + os, showDebug);
		String osDetected = "";
		if (os.contains("win")) {
			osDetected = "windows";
		} else if (os.contains("mac")) {
			osDetected = "macintosh";
		} else {
			osDetected = "likely a *nix variant";
		}
		prnt("OS Detected: " + osDetected, showDebug);
	}

}
