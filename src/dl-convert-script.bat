:: @echo off
:: https://github.com/rg3/youtube-dl/blob/master/README.md

for /F "tokens=*" %%A in (links.txt) do (

    :: the current line in the file
	echo %%A
	
	:: obtain the best video and audio from the line/URL from links.txt
	youtube-dl -vf "bestvideo[ext=mp4]+bestaudio[ext=m4a]/best[ext=mp4]/best" --merge-output-format mp4 "%%A"
)

pause
