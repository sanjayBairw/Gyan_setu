import subprocess
import xml.etree.ElementTree as ET

subprocess.run(["adb", "shell", "uiautomator", "dump", "/sdcard/home_dump.xml"])
subprocess.run(["adb", "pull", "/sdcard/home_dump.xml", r"d:\Desktop\Pynexia\quiz_app\home_dump.xml"])

tree = ET.parse(r"d:\Desktop\Pynexia\quiz_app\home_dump.xml")
print("=== HOME SCREEN NODES ===")
for node in tree.getroot().iter():
    rid = node.attrib.get("resource-id", "")
    if any(k in rid for k in ["toolbar", "tvHeaderTitle", "tvStreakCount", "btnQuickStartNow", "btnSurpriseMe"]):
        print(rid, "bounds=" + node.attrib.get("bounds", ""), "text=" + node.attrib.get("text", ""))

# Launch Daily Quiz and dump
print("\n=== DAILY QUIZ SCREEN NODES ===")
subprocess.run(["adb", "shell", "input", "tap", "880", "1000"])
import time; time.sleep(2)
subprocess.run(["adb", "shell", "uiautomator", "dump", "/sdcard/quiz_dump.xml"])
subprocess.run(["adb", "pull", "/sdcard/quiz_dump.xml", r"d:\Desktop\Pynexia\quiz_app\quiz_dump.xml"])

tree_q = ET.parse(r"d:\Desktop\Pynexia\quiz_app\quiz_dump.xml")
for node in tree_q.getroot().iter():
    rid = node.attrib.get("resource-id", "")
    if any(k in rid for k in ["toolbarQuiz", "tvQuizTitle", "tvQuestionContent", "bottomNavBar", "btnPrevious", "btnNextOrSubmit"]):
        print(rid, "bounds=" + node.attrib.get("bounds", ""), "text=" + node.attrib.get("text", ""))
