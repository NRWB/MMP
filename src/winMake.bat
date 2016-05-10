:: build for windows (intended, may work on different platforms)

:: https://docs.oracle.com/javase/tutorial/deployment/jar/appman.html

:: http://stackoverflow.com/questions/6623161/javac-option-to-compile-all-java-files-under-a-given-directory-recursively
dir /s /B *.java > sources.txt
javac @sources.txt

jar cfm MMP.jar manifest.mf com/mmp/application/App.class com/mmp/application/App$1.class com/mmp/application/gui/GUI.class com/mmp/application/scripter/Scripter.class

pause