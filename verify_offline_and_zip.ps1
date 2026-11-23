$ErrorActionPreference = 'Stop'
$zipPath = 'd:\Desktop\Pynexia\quiz_app\GyanSetu_Android_Project.zip'
if (Test-Path $zipPath) { Remove-Item -Force $zipPath }

$tempDir = Join-Path $env:TEMP 'GyanSetuCleanProject'
if (Test-Path $tempDir) { Remove-Item -Recurse -Force $tempDir }
New-Item -ItemType Directory -Path "$tempDir\app" | Out-Null

Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\app\src' -Destination "$tempDir\app\src" -Recurse
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\app\build.gradle.kts' -Destination "$tempDir\app\build.gradle.kts"
if (Test-Path 'd:\Desktop\Pynexia\quiz_app\app\proguard-rules.pro') {
    Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\app\proguard-rules.pro' -Destination "$tempDir\app\proguard-rules.pro"
}
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\gradle' -Destination "$tempDir\gradle" -Recurse
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\build.gradle.kts' -Destination "$tempDir\build.gradle.kts"
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\settings.gradle.kts' -Destination "$tempDir\settings.gradle.kts"
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\gradle.properties' -Destination "$tempDir\gradle.properties"
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\gradlew' -Destination "$tempDir\gradlew"
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\gradlew.bat' -Destination "$tempDir\gradlew.bat"

Compress-Archive -Path "$tempDir\*" -DestinationPath $zipPath -CompressionLevel Optimal
Remove-Item -Recurse -Force $tempDir

Write-Host "ZIP created successfully:"
Get-Item $zipPath | Select-Object FullName, Length

# Test offline functionality
Write-Host "--- Testing Offline Mode ---"
adb shell am force-stop com.indiaquiz.app
adb shell svc wifi disable
adb shell svc data disable
Start-Sleep -Seconds 1
$wifiState = (adb shell dumpsys wifi | Select-String "Wi-Fi is").ToString().Trim()
Write-Host "WiFi State: $wifiState"

adb shell am start -n com.indiaquiz.app/.ui.main.MainActivity
Start-Sleep -Seconds 2

# Tap Quick Quiz at (373, 725)
adb shell input tap 373 725
Start-Sleep -Seconds 2

# Check running activity
$curWindow = (adb shell dumpsys window windows | Select-String "mCurrentFocus").ToString().Trim()
Write-Host "Current Window after offline launch: $curWindow"

# Take screenshot of offline quiz running
adb shell screencap -p /sdcard/14_offline_quiz.png
adb pull /sdcard/14_offline_quiz.png d:\Desktop\Pynexia\quiz_app\screenshots\14_offline_quiz.png
Copy-Item -Path 'd:\Desktop\Pynexia\quiz_app\screenshots\14_offline_quiz.png' -Destination 'C:\Users\A\.gemini\antigravity\brain\95c50b20-cc5b-4a20-a48a-be27f0a2b117\screenshots\' -Force

# Re-enable wifi & mobile data
adb shell svc wifi enable
adb shell svc data enable
Write-Host "Re-enabled WiFi & Mobile Data."
