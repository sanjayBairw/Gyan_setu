adb shell svc wifi disable
adb shell svc data disable
adb shell am force-stop com.indiaquiz.app
adb shell am start -n com.indiaquiz.app/.ui.main.MainActivity
Start-Sleep -Seconds 2
adb shell input tap 373 725
Start-Sleep -Seconds 2

$act = adb shell dumpsys activity activities | Select-String 'top-activity'
Write-Host "Top Activity: $act"

adb shell screencap -p /sdcard/14_offline_quiz.png
adb pull /sdcard/14_offline_quiz.png d:\Desktop\Pynexia\quiz_app\screenshots\14_offline_quiz.png
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\screenshots\14_offline_quiz.png' -Destination 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\screenshots\' -Force

adb shell svc wifi enable
adb shell svc data enable

Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\app\build\outputs\apk\debug\app-debug.apk' -Destination 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\app-debug.apk' -Force
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\GyanSetu_Android_Project.zip' -Destination 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\GyanSetu_Android_Project.zip' -Force

Get-Item 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\app-debug.apk' | Select-Object FullName, Length
Get-Item 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\GyanSetu_Android_Project.zip' | Select-Object FullName, Length
Get-Item 'd:\Desktop\Pynexia\quiz_app\screenshots\14_offline_quiz.png' | Select-Object FullName, Length
