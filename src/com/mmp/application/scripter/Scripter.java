package com.mmp.application.scripter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Scripter {
	
	public static final String BATCH_FILE_NAME = System.getProperty("file.separator") + "dl-convert-script.bat";
	
	private String[] cmds;
	private ProcessBuilder pb;
	private Process p;

	public Scripter() {
		this.cmds = null;
		this.pb = null;
		this.p = null;
	}
	
	public String pwd() {
		Path currentRelativePath = Paths.get("");
		String s = currentRelativePath.toAbsolutePath().toString();
		return s;
	}

	public void init() {
		if (!Files.exists(Paths.get(pwd() + BATCH_FILE_NAME))) {
			System.err.println(Paths.get(pwd() + BATCH_FILE_NAME));
			throw new RuntimeException("Error, missing file");
		}
		
		// http://stackoverflow.com/questions/515309/what-does-cmd-c-mean
		this.cmds = new String[3];
		this.cmds[0] = "cmd.exe";
		this.cmds[1] = "/C";
		this.cmds[2] = pwd() + BATCH_FILE_NAME;
		
		this.pb = new ProcessBuilder(this.cmds);		
		this.pb.inheritIO();
	}
	
	public void start() {
		try {
			this.p = this.pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public boolean isAlive() {
		return this.p.isAlive();
	}
	
	// if not work, see: http://stackoverflow.com/questions/6356340/killing-a-process-using-java
	public void stop() {
		int secondsToWait = 15;
		long timeOutMS = secondsToWait * 1000;
		long t = System.currentTimeMillis() + timeOutMS;
		this.p.destroy();
		while (System.currentTimeMillis() < t) {
			if (!this.p.isAlive())
				break;
		}
		if (this.p.isAlive()) {
			this.p.destroyForcibly();
		}
	}

}
