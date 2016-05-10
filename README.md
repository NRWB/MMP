# MMP - MMP Media Please

## Currently Early Beta Staging...

* Downloads a list of video URL's located in a text file.
* automatically downloads best quality video & audio!
* Software to create an interface over command line utilities.
* Requires youtube-dl, ffmpeg

## Software Program Prerequisites
* have installed a recent java development kit (jdk)
* downloaded youtube-dl software
* downloaded ffmpeg software

## How To (build for windows users - note: prerequisites)
### 1. Make a folder somewhere (for example on your desktop or in documents folder), call it whatever you want, I'll use 'MMP' for this how-to guide
1. copy/move the youtube-dl software to this newly created folder
2. copy/move the ffmpeg software to this newly created folder

### 2. Download this project (https://github.com/NRWB/MMP/archive/master.zip)
### 3. move the downloaded zip archive into the folder created from step #1
### 4. extract (unzip) the downloaded zip file into the folder
### 5. The file/folder layout should look something like:
```
.../MMP/
.../MMP/MMP-master.zip
.../MMP/MMP-master/
.../MMP/MMP-master/MMP-master/
.../MMP/MMP-master/MMP-master/.gitattributes
.../MMP/MMP-master/MMP-master/README.md
.../MMP/MMP-master/MMP-master/src/dl-convert-script.bat
.../MMP/MMP-master/MMP-master/src/manifest.mf
.../MMP/MMP-master/MMP-master/src/winMake.bat
.../MMP/MMP-master/MMP-master/src/com/mmp/application/App.java
.../MMP/MMP-master/MMP-master/src/com/mmp/application/gui/
.../MMP/MMP-master/MMP-master/src/com/mmp/application/scripter/
.../MMP/MMP-master/MMP-master/src/com/mmp/application/gui/GUI.java
.../MMP/MMP-master/MMP-master/src/com/mmp/application/scripter/Scripter.java
```
### 6. navigate to the winMake.bat file, double click it in order to start a batch script to compile and make the jar
### 7. drag the copied/moved files from step 1.1 & 1.2, to .../MMP/MMP-master/MMP-master/ folder
### 8. the .../MMP/MMP-master/MMP-master/ folder should contain the following files/folders:
```
/com/
/dl-convert-script.bat
/ffmpeg.exe
/manifest.mf
/MMP.jar
/sources.txt
/winMake.bat
/youtube-dl.exe
```

### 9. create another file in the .../MMP/MMP-master/MMP-master/ folder called links.txt
### 10. copy and paste all your video links into the links.txt file, presumabley each line contains a single video url
### 11. double click MMP.jar
### 12. with the application that runs from MMP.jar, simply hit start!
### 13. wait for downloading to finish
