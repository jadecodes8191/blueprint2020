#NoEnv  ; Recommended for performance and compatibility with future AutoHotkey releases.
; #Warn  ; Enable warnings to assist with detecting common errors.
SendMode Input  ; Recommended for new scripts due to its superior speed and reliability.
SetWorkingDir %A_ScriptDir%  ; Ensures a consistent starting directory.
Loop 11
{
	Click, 410, 750
	Sleep, 5000
	Click, 395, 60
	Sleep, 5000
	Click, 150, 750
	Sleep, 5000
	Click, 425, 160
	Sleep, 5000
	Send, {#}Blueprint2020
	Sleep, 5000
	Click, 400, 225
	Click, 400, 225
	Sleep, 5000
	Click, 550, 150
	Click, 550, 150
	Sleep, 5000
	Click, 860, 535
	Sleep, 5000
}