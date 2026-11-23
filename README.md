# GyanSetu (ज्ञान सेतु) — India's Multi-Category Quiz & Learning App

> **"From School to UPSC, ITI Trades to Daily Household Knowledge — A Learning Bridge for Every Indian."**

A complete, production-grade Android Quiz & Learning Application built with **Kotlin, XML layouts, Room Database, ViewBinding, Material Design 3, Text-to-Speech (TTS), and Lifecycle-aware Architecture**.

---

## 🌟 Key Highlights

### 1. Two Main Quiz Starting Experiences
* **Mode 1: Select Your Own Quiz (Hierarchical Drilldown)**
  * `Category → Subcategory → Exam / Board / Class → Subject → Topic → Difficulty → Question Count`
  * Strict question isolation: Never mixes unrelated questions. Electrician questions never show in GK; Class 12 Physics never shows in Class 10 Math.
  * Shuffled questions and options.
* **Mode 2: Quick Mixed Quiz — Start Immediately (1-Tap Play)**
  * A prominent **"Play Mixed Quiz Now"** / **"Surprise Me"** hero card on the home screen.
  * Starts instantly with zero configuration required.
  * Generates a balanced, randomized mix of General Knowledge, Basic Mathematics, Reasoning, Hindi Lokoktiyan & Muhavare, English Idioms & Proverbs, Science, and Everyday Life puzzles.

---

## 📚 Complete Indian Category System

The app covers the entire spectrum of Indian learners:

1. **All India Competitive Exams**
   * UPSC / Civil Services (IAS, IPS, IFS)
   * SSC (CGL, CHSL, MTS, GD)
   * Railway (RRB NTPC, Group D)
   * Banking (IBPS, SBI, RBI PO/Clerk)
   * Police & Defence (NDA, CDS, AFCAT)
2. **School Education & Boards**
   * **Boards:** CBSE, RBSE (Rajasthan), UP Board, Bihar Board, MP Board, etc.
   * **Classes:** Class 10 & Class 12 Board Preparation
   * **Subjects:** Mathematics, Science, Physics, Chemistry, Biology, Social Science, History, Geography
3. **General Knowledge & Daily GK**
   * Indian History, Geography (Rivers, Mountains), Indian Constitution & Polity, Important Days & Science Discoveries
4. **Reasoning & Mental Ability**
   * Number Series, Alphabet Series, Coding-Decoding, Blood Relations, Analogies, Syllogisms
5. **Mathematics for All Levels**
   * Basic Arithmetic & Tables for beginners, Percentages, Profit & Loss, Ratio & Proportion, Time & Work, Algebra
6. **Hindi Language & Vyakaran (हिंदी भाषा)**
   * प्रचलित मुहावरे, लोकोक्तियाँ (कहावतें), पर्यायवाची शब्द, विलोम शब्द, संधि एवं व्याकरण
7. **English Language & Grammar**
   * Idioms & Phrases, Famous Proverbs, Vocabulary, Tenses, Prepositions, Spotting Errors
8. **ITI & Technical Trades**
   * Electrician & Wireman Trade Theory, Ohm's Law, Circuits, Electrical Safety, MCB, Earthing color codes, Tools (Vernier Caliper)
9. **Everyday Life & Homemaker Quiz (गृहणी एवं दैनिक जीवन ज्ञान)**
   * Kitchen science & food nutrition (Vitamin C, Turmeric), Household safety (LPG leak protocol), Everyday market math, Brain teasers & fun riddles

---

## 🏗️ Architecture & Technical Stack

* **Language:** Kotlin 2.3+
* **Target Android Version:** Android 14+ (compileSdk 36, targetSdk 36, minSdk 24)
* **Architecture Pattern:** MVVM (Model-View-ViewModel) + Repository Pattern + Clean Separation of Concerns
* **Persistence:** Android Jetpack Room Database (`AppDatabase`) with TypeConverters
* **UI & Layouts:** XML Layouts, ViewBinding, ConstraintLayout, CoordinatorLayout, NestedScrollView, Material Design 3 Cards & Buttons
* **Audio Question Reader:** Native Android `TextToSpeech` with auto-detection of Devanagari Hindi (`hi-IN`) and English (`en-IN`)
* **Timer Engine:** Lifecycle-aware CountDownTimer with per-question timer, auto-next, and low-time warning alerts (<10s)
* **Theme Engine:** Dynamic switching between 6 distinct themes:
  1. *Academic Theme* (Navy Blue & Crisp White)
  2. *Technical Theme* (Industrial Slate & Amber)
  3. *General Knowledge Theme* (Teal & Emerald Green)
  4. *Homemaker Theme* (Soft Coral & Saffron)
  5. *Mixed Quiz Theme* (Royal Purple & Gradient Accents)
  6. *Dark Theme* (Midnight AMOLED dark mode)
* **Localization:** English and हिंदी with in-app toggle and persistent locale configuration

---

## 📱 Application Flow & Screens

```
                                  [Splash / Language Setup]
                                             │
                                             ▼
                                      [MainActivity]
                     ┌───────────────────────┼───────────────────────┐
                     ▼                       ▼                       ▼
            [Quick Mixed Quiz]      [Category Explorer]      [Global Search]
                     │                       │                       │
                     │                       ▼                       │
                     │              [Config Dialog]                  │
                     │                       │                       │
                     └───────────────────────┼───────────────────────┘
                                             │
                                             ▼
                                       [QuizActivity]
                        (Question Card + Audio TTS + Timer + Options
                         + Bottom Controls: Prev, Clear, Review, Palette)
                                             │
                                             ▼
                                      [ResultActivity]
                       (Trophy + Score + Accuracy + Time Breakdown)
                         ┌───────────────────┼───────────────────┐
                         ▼                   ▼                   ▼
                  [Review Answers]    [Practice Missed]    [Share Score]
```

---

## 🧪 Testing & Verification

Unit tests in `app/src/test/java/com/indiaquiz/app/engine/QuizEngineTest.kt` verify:
* Initial quiz engine state and total question count
* Option selection, answer clearance, and question status updates
* Mark-for-review toggle persistence
* Navigation bounds (next, previous, direct palette jumping)
* Accurate scoring with negative marking deduction
* Integrity of prepopulated Indian question bank (options count, correct index bounds, explanations)

Run tests locally:
```bash
./gradlew test
```

Build debug APK:
```bash
./gradlew assembleDebug
```
The compiled APK is generated at:
`app/build/outputs/apk/debug/app-debug.apk`

---

## 📄 License
Licensed under Apache 2.0. Built for learners across India.
