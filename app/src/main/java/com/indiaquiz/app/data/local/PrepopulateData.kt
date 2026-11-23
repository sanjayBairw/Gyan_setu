package com.indiaquiz.app.data.local

import com.indiaquiz.app.data.model.CategoryItem
import com.indiaquiz.app.data.model.Question
import com.indiaquiz.app.data.model.SubcategoryItem

object PrepopulateData {

    fun getCategories(): List<CategoryItem> {
        return listOf(
            CategoryItem(
                id = "COMPETITIVE_EXAMS",
                nameEn = "All India Competitive Exams",
                nameHi = "अखिल भारतीय प्रतियोगी परीक्षाएं",
                descriptionEn = "JEE, UPSC, SSC, Railways, Banking, Defence, Police & State Exams",
                descriptionHi = "जेईई, यूपीएससी, एसएससी, रेलवे, बैंकिंग, रक्षा एवं राज्य स्तरीय परीक्षाएं",
                iconResName = "ic_exam",
                colorResName = "cat_competitive",
                subcategories = listOf(
                    SubcategoryItem("JEE_MAIN_ADVANCED", "COMPETITIVE_EXAMS", "JEE Main & Advanced (IIT JEE)", "जेईई मेन एवं एडवांस्ड (आईआईटी)", "Physics, Chemistry & Mathematics for IIT JEE Entrance", "भौतिकी, रसायन विज्ञान एवं उच्च गणित (आईआईटी प्रवेश)", "JEE", emptyList(), listOf("All Subjects", "Physics", "Chemistry", "Mathematics"), listOf("Mechanics", "Electrodynamics", "Thermodynamics", "Organic Chemistry", "Inorganic Chemistry", "Calculus", "Algebra")),
                    SubcategoryItem("UPSC", "COMPETITIVE_EXAMS", "UPSC / Civil Services", "यूपीएससी सिविल सेवा", "IAS, IPS, IFS Preliminary & General Studies", "आईएएस, आईपीएस प्रारंभिक परीक्षा", "UPSC"),
                    SubcategoryItem("SSC", "COMPETITIVE_EXAMS", "SSC (CGL, CHSL, MTS)", "एसएससी (सीजीएल, सीएचएसएल)", "Staff Selection Commission Exams", "कर्मचारी चयन आयोग परीक्षाएं", "SSC"),
                    SubcategoryItem("RAILWAY", "COMPETITIVE_EXAMS", "Railway (RRB NTPC, Group D)", "रेलवे (आरआरबी एनटीपीसी)", "Non-Technical & Technical Posts", "रेलवे भर्ती बोर्ड परीक्षाएं", "Railway"),
                    SubcategoryItem("BANKING", "COMPETITIVE_EXAMS", "Banking (IBPS, SBI, RBI)", "बैंकिंग (आईबीपीएस, एसबीआई)", "PO, Clerk and Specialist Officers", "बैंक पीओ एवं लिपिक भर्ती", "Banking")
                ),
                totalQuestionsCount = 35
            ),
            CategoryItem(
                id = "SCHOOL_EDUCATION",
                nameEn = "School Education & Boards",
                nameHi = "स्कूली शिक्षा एवं बोर्ड परीक्षा",
                descriptionEn = "CBSE, RBSE, State Boards — Class 10 & 12 Science, Math, Social",
                descriptionHi = "सीबीएसई, आरबीएसई, राज्य बोर्ड — कक्षा 10 एवं 12 विषयवार बोर्ड तैयारी",
                iconResName = "ic_school",
                colorResName = "cat_school",
                subcategories = listOf(
                    SubcategoryItem("CBSE", "SCHOOL_EDUCATION", "CBSE Board", "सीबीएसई बोर्ड", "Class 10 & 12 Board Prep — Math, Science, Social, Physics, Chemistry", "कक्षा 10 एवं 12 बोर्ड तैयारी — गणित, विज्ञान, सामाजिक विज्ञान, भौतिकी, रसायन", "CBSE", listOf("Class 10", "Class 12"), listOf("All Subjects", "Mathematics", "Science", "Social Science", "Physics", "Chemistry", "Biology", "English", "Hindi")),
                    SubcategoryItem("RBSE", "SCHOOL_EDUCATION", "RBSE (Rajasthan Board)", "आरबीएसई (राजस्थान बोर्ड)", "Class 10 & 12 Rajasthan Board Prep — गणित, विज्ञान, सामाजिक विज्ञान, भौतिकी", "राजस्थान माध्यमिक शिक्षा बोर्ड — कक्षा 10 एवं 12 विषयवार क्विज़", "RBSE", listOf("Class 10", "Class 12"), listOf("All Subjects", "Mathematics", "Science", "Social Science", "Physics", "Chemistry", "Biology", "Hindi")),
                    SubcategoryItem("BIHAR_BOARD", "SCHOOL_EDUCATION", "Bihar Board (BSEB)", "बिहार बोर्ड (मैट्रिक एवं इंटर)", "BSEB Secondary Examination Prep", "बिहार विद्यालय परीक्षा समिति — कक्षा 10 एवं 12", "Bihar Board", listOf("Class 10", "Class 12"), listOf("All Subjects", "Social Science", "Science", "Mathematics", "Hindi")),
                    SubcategoryItem("UP_BOARD", "SCHOOL_EDUCATION", "UP Board (UPMSP)", "यूपी बोर्ड (हाईस्कूल एवं इंटर)", "UP Madhyamik Shiksha Parishad Prep", "उत्तर प्रदेश माध्यमिक शिक्षा परिषद — कक्षा 10 एवं 12", "UP Board", listOf("Class 10", "Class 12"), listOf("All Subjects", "Hindi", "Social Science", "Science", "Mathematics"))
                ),
                totalQuestionsCount = 35
            ),
            CategoryItem(
                id = "GENERAL_KNOWLEDGE",
                nameEn = "General Knowledge & Daily GK",
                nameHi = "सामान्य ज्ञान एवं दैनिक समसामयिकी",
                descriptionEn = "Indian History, Geography, Polity, Science & Discoveries",
                descriptionHi = "भारतीय इतिहास, भूगोल, संविधान, विज्ञान एवं महत्वपूर्ण दिवस",
                iconResName = "ic_gk",
                colorResName = "cat_gk",
                subcategories = listOf(
                    SubcategoryItem("INDIAN_POLITY", "GENERAL_KNOWLEDGE", "Indian Constitution & Polity", "भारतीय संविधान एवं राजव्यवस्था", "Articles, Amendments, Rights and Parliament", "अनुच्छेद, मौलिक अधिकार एवं संसद"),
                    SubcategoryItem("INDIAN_HISTORY", "GENERAL_KNOWLEDGE", "Indian History & Heritage", "भारतीय इतिहास एवं धरोहर", "Ancient, Medieval & Freedom Movement", "प्राचीन, मध्यकालीन एवं स्वतंत्रता संग्राम"),
                    SubcategoryItem("INDIAN_GEOGRAPHY", "GENERAL_KNOWLEDGE", "Indian Geography", "भारतीय भूगोल", "Rivers, Mountains, Climate & Resources", "नदियाँ, पर्वत, जलवायु एवं कृषि")
                ),
                totalQuestionsCount = 25
            ),
            CategoryItem(
                id = "REASONING",
                nameEn = "Reasoning & Mental Ability",
                nameHi = "तर्कशक्ति एवं मानसिक योग्यता",
                descriptionEn = "Series, Coding-Decoding, Blood Relations, Syllogisms & Puzzles",
                descriptionHi = "श्रृंखला, कोडिंग-डिकोडिंग, रक्त संबंध, न्याय निगमन एवं पहेलियाँ",
                iconResName = "ic_reasoning",
                colorResName = "cat_reasoning",
                subcategories = listOf(
                    SubcategoryItem("SERIES_CODING", "REASONING", "Series & Coding-Decoding", "श्रृंखला एवं कोडिंग", "Letter, number patterns and cipher solving", "वर्ण एवं संख्या पैटर्न"),
                    SubcategoryItem("LOGICAL_RELATIONS", "REASONING", "Relations & Directions", "रक्त संबंध एवं दिशा ज्ञान", "Blood relations, directions, syllogisms", "पारिवारिक संबंध एवं दिशा ज्ञान")
                ),
                totalQuestionsCount = 20
            ),
            CategoryItem(
                id = "MATHEMATICS",
                nameEn = "Mathematics for All Levels",
                nameHi = "गणित — सभी स्तरों के लिए",
                descriptionEn = "Arithmetic, Percentages, Profit & Loss, Work-Time & Formulas",
                descriptionHi = "अंकगणित, प्रतिशत, लाभ-हानि, कार्य-समय एवं सूत्र",
                iconResName = "ic_math",
                colorResName = "cat_math",
                subcategories = listOf(
                    SubcategoryItem("BASIC_ARITHMETIC", "MATHEMATICS", "Basic Arithmetic & Numbers", "बुनियादी अंकगणित", "Addition, Multiplication, Tables, Fractions", "जोड़, गुणा, पहाड़े एवं भिन्न"),
                    SubcategoryItem("COMPETITIVE_MATH", "MATHEMATICS", "Commercial & Competitive Math", "व्यावहारिक एवं प्रतियोगी गणित", "Percentages, Ratio, Profit & Loss, Time-Work", "प्रतिशत, अनुपात, लाभ-हानि, कार्य-समय")
                ),
                totalQuestionsCount = 20
            ),
            CategoryItem(
                id = "HINDI_LANGUAGE",
                nameEn = "Hindi Language & Vyakaran",
                nameHi = "हिंदी भाषा, व्याकरण एवं मुहावरे",
                descriptionEn = "मुहावरे, लोकोक्तियाँ, पर्यायवाची, विलोम, संधि एवं वर्तनी",
                descriptionHi = "मुहावरे, लोकोक्तियाँ, पर्यायवाची, विलोम, संधि एवं व्याकरण शुद्धि",
                iconResName = "ic_hindi",
                colorResName = "cat_hindi",
                subcategories = listOf(
                    SubcategoryItem("MUHAVARE_LOKOKTIYAN", "HINDI_LANGUAGE", "मुहावरे एवं लोकोक्तियाँ", "मुहावरे एवं कहावतें", "Idioms, proverbs & figurative expressions", "प्रचलित मुहावरे और लोकोक्तियाँ"),
                    SubcategoryItem("VYAKARAN_SHABD", "HINDI_LANGUAGE", "व्याकरण एवं शब्द ज्ञान", "व्याकरण एवं शब्द भंडार", "पर्यायवाची, विलोम, संधि, समास एवं वर्तनी", "शुद्ध वर्तनी और संधि नियम")
                ),
                totalQuestionsCount = 20
            ),
            CategoryItem(
                id = "ENGLISH_LANGUAGE",
                nameEn = "English Language & Grammar",
                nameHi = "अंग्रेजी भाषा एवं व्याकरण",
                descriptionEn = "Idioms, Proverbs, Vocabulary, Tenses, Articles & Spotting Errors",
                descriptionHi = "मुहावरे, कहावतें, शब्दावली, काल, उपपद एवं व्याकरण नियम",
                iconResName = "ic_english",
                colorResName = "cat_english",
                subcategories = listOf(
                    SubcategoryItem("IDIOMS_PROVERBS", "ENGLISH_LANGUAGE", "Idioms & Proverbs", "अंग्रेजी मुहावरे एवं कहावतें", "Common English idioms, expressions and sayings", "महत्वपूर्ण अंग्रेजी मुहावरे"),
                    SubcategoryItem("GRAMMAR_VOCAB", "ENGLISH_LANGUAGE", "Grammar & Vocabulary", "व्याकरण एवं शब्दावली", "Synonyms, antonyms, prepositions, tenses", "समानार्थी, विलोम एवं पूर्वसर्ग")
                ),
                totalQuestionsCount = 20
            ),
            CategoryItem(
                id = "ITI_TECHNICAL",
                nameEn = "ITI & Technical Trades",
                nameHi = "आईटीआई एवं तकनीकी ट्रेड्स",
                descriptionEn = "Electrician, Wireman, Circuits, Electrical Safety & Tools",
                descriptionHi = "इलेक्ट्रीशियन, वायरमैन, परिपथ, सुरक्षा उपकरण एवं ट्रेड थ्योरी",
                iconResName = "ic_technical",
                colorResName = "cat_technical",
                subcategories = listOf(
                    SubcategoryItem("ELECTRICIAN_THEORY", "ITI_TECHNICAL", "Electrician Trade Theory", "इलेक्ट्रीशियन थ्योरी", "Circuits, Ohm's law, transformers, machines", "विद्युत परिपथ, ओम का नियम, ट्रांसफार्मर"),
                    SubcategoryItem("WIRING_SAFETY", "ITI_TECHNICAL", "Wiring & Electrical Safety", "वायरिंग एवं सुरक्षा नियम", "MCB, earthing, color codes, fire safety", "अर्थिंग, एमसीबी, रंग कोड एवं सुरक्षा नियम")
                ),
                totalQuestionsCount = 20
            ),
            CategoryItem(
                id = "HOMEMAKER_EVERYDAY",
                nameEn = "Everyday Life & Homemaker Quiz",
                nameHi = "दैनिक जीवन एवं गृहणी ज्ञान क्विज़",
                descriptionEn = "Kitchen Science, Health & Nutrition, Household Safety & Puzzles",
                descriptionHi = "रसोई ज्ञान, पोषण, घरेलू सुरक्षा, सामान्य बुद्धि एवं मजेदार पहेलियाँ",
                iconResName = "ic_homemaker",
                colorResName = "cat_homemaker",
                subcategories = listOf(
                    SubcategoryItem("KITCHEN_NUTRITION", "HOMEMAKER_EVERYDAY", "Kitchen Knowledge & Health", "रसोई ज्ञान एवं स्वास्थ्य", "Food vitamins, nutrition, food preservation", "भोजन में विटामिन, पोषण एवं घरेलू उपाय"),
                    SubcategoryItem("HOUSEHOLD_SAFETY_PUZZLES", "HOMEMAKER_EVERYDAY", "Safety & Common Sense Puzzles", "सुरक्षा एवं मजेदार पहेलियाँ", "Gas safety, home math, brain teasers", "गैस सुरक्षा, घरेलू हिसाब एवं सामान्य बुद्धि")
                ),
                totalQuestionsCount = 20
            )
        )
    }

    fun getQuestions(): List<Question> {
        val list = mutableListOf<Question>()

        // -------------------------------------------------------------
        // CATEGORY: COMPETITIVE_EXAMS (UPSC, SSC, RAILWAY, BANKING)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_UPSC_001",
                questionText = "Who was the Chairman of the Drafting Committee of the Indian Constituent Assembly?",
                questionTextHindi = "भारतीय संविधान सभा की प्रारूप समिति (Drafting Committee) के अध्यक्ष कौन थे?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "Indian Polity",
                chapterOrTopic = "Constituent Assembly",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Dr. B.R. Ambedkar", "Dr. Rajendra Prasad", "Jawaharlal Nehru", "Sardar Vallabhbhai Patel"),
                optionsHindi = listOf("डॉ. भीमराव अंबेडकर", "डॉ. राजेंद्र प्रसाद", "जवाहरलाल नेहरू", "सरदार वल्लभभाई पटेल"),
                correctAnswerIndex = 0,
                explanation = "Dr. B.R. Ambedkar was appointed as the Chairman of the Drafting Committee on August 29, 1947, which drafted the Constitution of India.",
                explanationHindi = "डॉ. भीमराव अंबेडकर को 29 अगस्त 1947 को प्रारूप समिति का अध्यक्ष नियुक्त किया गया था, जिन्होंने भारत के संविधान का मसौदा तैयार किया।",
                negativeMarks = 0.33f,
                tags = listOf("Polity", "UPSC", "Constitution")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_002",
                questionText = "Which Article of the Indian Constitution guarantees the 'Right to Protection of Life and Personal Liberty'?",
                questionTextHindi = "भारतीय संविधान का कौन सा अनुच्छेद 'प्राण और दैहिक स्वतंत्रता का संरक्षण' प्रदान करता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "Indian Polity",
                chapterOrTopic = "Fundamental Rights",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Article 19", "Article 21", "Article 14", "Article 32"),
                optionsHindi = listOf("अनुच्छेद 19", "अनुच्छेद 21", "अनुच्छेद 14", "अनुच्छेद 32"),
                correctAnswerIndex = 1,
                explanation = "Article 21 states that no person shall be deprived of his life or personal liberty except according to procedure established by law.",
                explanationHindi = "अनुच्छेद 21 घोषणा करता है कि किसी व्यक्ति को उसके प्राण या दैहिक स्वतंत्रता से विधि द्वारा स्थापित प्रक्रिया के अनुसार ही वंचित किया जाएगा।",
                negativeMarks = 0.33f,
                tags = listOf("Polity", "UPSC", "Fundamental Rights")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_001",
                questionText = "The famous 'Harappan' site of Lothal, known for its ancient dockyard, is located in which Indian state?",
                questionTextHindi = "प्राचीन गोदीबाड़ा (डॉकयार्ड) के लिए प्रसिद्ध हड़प्पा कालीन स्थल 'लोथल' किस राज्य में स्थित है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "Indian History",
                chapterOrTopic = "Indus Valley Civilization",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Gujarat", "Rajasthan", "Punjab", "Haryana"),
                optionsHindi = listOf("गुजरात", "राजस्थान", "पंजाब", "हरियाणा"),
                correctAnswerIndex = 0,
                explanation = "Lothal was a prominent port city of the Indus Valley Civilization located along the Bhogava river in modern Gujarat.",
                explanationHindi = "लोथल सिंधु घाटी सभ्यता का प्रमुख बंदरगाह शहर था, जो आधुनिक गुजरात में भोगावा नदी के तट पर स्थित है।",
                negativeMarks = 0.25f,
                tags = listOf("History", "SSC", "Indus Valley")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_002",
                questionText = "In the human digestive system, bile juice is produced by which organ?",
                questionTextHindi = "मानव पाचन तंत्र में पित्त रस (Bile Juice) का निर्माण किस अंग द्वारा होता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Science",
                chapterOrTopic = "Human Biology",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Liver", "Pancreas", "Gallbladder", "Stomach"),
                optionsHindi = listOf("यकृत (Liver)", "अग्न्याशय (Pancreas)", "पित्ताशय (Gallbladder)", "आमाशय (Stomach)"),
                correctAnswerIndex = 0,
                explanation = "Bile is produced by the liver and stored in the gallbladder before being released into the small intestine.",
                explanationHindi = "पित्त रस का उत्पादन यकृत (लिवर) द्वारा होता है और यह पित्ताशय में एकत्रित रहता है।",
                negativeMarks = 0.25f,
                tags = listOf("Science", "Biology", "SSC")
            )
        )

        list.add(
            Question(
                id = "Q_RRB_001",
                questionText = "When and between which two stations did the first passenger train run in India?",
                questionTextHindi = "भारत में पहली यात्री रेलगाड़ी कब और किन दो स्टेशनों के बीच चली थी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "Railway GK",
                chapterOrTopic = "Indian Railways History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1853, Bombay to Thane", "1854, Howrah to Hooghly", "1856, Madras to Arcot", "1860, Delhi to Agra"),
                optionsHindi = listOf("1853, बॉम्बे से ठाणे", "1854, हावड़ा से हुगली", "1856, मद्रास से अरकोट", "1860, दिल्ली से आगरा"),
                correctAnswerIndex = 0,
                explanation = "The first passenger train in India ran on 16 April 1853 between Bori Bunder (Bombay) and Thane, covering 34 km.",
                explanationHindi = "भारत की पहली यात्री ट्रेन 16 अप्रैल 1853 को बोरीबंदर (मुंबई) से ठाणे के बीच 34 किमी की दूरी पर चली थी।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "History", "NTPC")
            )
        )

        list.add(
            Question(
                id = "Q_BANK_001",
                questionText = "What is the rate at which the Reserve Bank of India (RBI) lends money to commercial banks for the short term?",
                questionTextHindi = "वह दर क्या कहलाती है जिस पर भारतीय रिज़र्व बैंक (RBI) वाणिज्यिक बैंकों को अल्पकालिक ऋण देता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Monetary Policy",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Repo Rate", "Reverse Repo Rate", "Bank Rate", "CRR"),
                optionsHindi = listOf("रेपो रेट (Repo Rate)", "रिवर्स रेपो रेट", "बैंक दर", "सीआरआर (CRR)"),
                correctAnswerIndex = 0,
                explanation = "Repo Rate (Repurchase Option) is the rate at which the central bank lends funds to commercial banks against government securities.",
                explanationHindi = "रेपो रेट वह दर है जिस पर केंद्रीय बैंक (RBI) प्रतिभूतियों के बदले वाणिज्यिक बैंकों को अल्पकालिक धन उधार देता है।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "Economics", "RBI")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: SCHOOL_EDUCATION (CBSE, RBSE, CLASS 10 & 12)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_CBSE10_M_001",
                questionText = "For any acute angle θ, what is the value of (sin² θ + cos² θ)?",
                questionTextHindi = "किसी न्यूनकोण θ के लिए (sin² θ + cos² θ) का मान क्या होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Trigonometry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1", "0", "2", "-1"),
                optionsHindi = listOf("1", "0", "2", "-1"),
                correctAnswerIndex = 0,
                explanation = "The fundamental trigonometric Pythagorean identity is sin² θ + cos² θ = 1 for all real angles θ.",
                explanationHindi = "त्रिकोणमिति की मूलभूत सर्वसमिका sin² θ + cos² θ = 1 होती है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Trigonometry")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_002",
                questionText = "What are the roots of the quadratic equation x² - 5x + 6 = 0?",
                questionTextHindi = "द्विघात समीकरण x² - 5x + 6 = 0 के मूल क्या हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Quadratic Equations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("2 and 3", "-2 and -3", "1 and 6", "-1 and 6"),
                optionsHindi = listOf("2 और 3", "-2 और -3", "1 और 6", "-1 और 6"),
                correctAnswerIndex = 0,
                explanation = "Factorizing: (x - 2)(x - 3) = 0 gives roots x = 2 and x = 3.",
                explanationHindi = "गुणनखंड करने पर: (x - 2)(x - 3) = 0, अतः x = 2 तथा x = 3 प्राप्त होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Algebra")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_S_001",
                questionText = "What is the chemical formula of Plaster of Paris (POP)?",
                questionTextHindi = "प्लास्टर ऑफ पेरिस (POP) का रासायनिक सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Acids, Bases and Salts",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("CaSO₄·½H₂O", "CaSO₄·2H₂O", "CaCO₃", "CaOCl₂"),
                optionsHindi = listOf("CaSO₄·½H₂O", "CaSO₄·2H₂O (जिप्सम)", "CaCO₃", "CaOCl₂ (विरंजक चूर्ण)"),
                correctAnswerIndex = 0,
                explanation = "Plaster of Paris is calcium sulphate hemihydrate: CaSO₄·½H₂O. On adding water, it turns into Gypsum CaSO₄·2H₂O.",
                explanationHindi = "प्लास्टर ऑफ पेरिस कैल्शियम सल्फेट हेमीहाइड्रेट (CaSO₄·½H₂O) है। इसमें जल मिलाने पर जिप्सम बन जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_P_001",
                questionText = "According to Faraday's Law of Electromagnetic Induction, the induced electromotive force (EMF) is proportional to:",
                questionTextHindi = "फैराडे के विद्युत चुंबकीय प्रेरण के नियमानुसार प्रेरित विद्युत वाहक बल (EMF) किसके समानुपाती होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "Physics",
                chapterOrTopic = "Electromagnetic Induction",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("Rate of change of magnetic flux", "Magnetic flux itself", "Electric field intensity", "Current resistance"),
                optionsHindi = listOf("चुंबकीय फ्लक्स के परिवर्तन की दर", "स्वयं चुंबकीय फ्लक्स", "विद्युत क्षेत्र की तीव्रता", "परिपथ का प्रतिरोध"),
                correctAnswerIndex = 0,
                explanation = "Faraday's Law states: e = - dΦ/dt, meaning the induced EMF is directly proportional to the time rate of change of magnetic flux.",
                explanationHindi = "फैराडे के नियम के अनुसार प्रेरित विद्युत वाहक बल चुंबकीय फ्लक्स में समय के साथ परिवर्तन की दर के समानुपाती होता है (e = -dΦ/dt)।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_SS_001",
                questionText = "Which mountain range is the oldest in India and divides Rajasthan into two parts?",
                questionTextHindi = "भारत की सबसे प्राचीन पर्वत श्रृंखला कौन सी है जो राजस्थान को दो भागों में विभाजित करती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Rajasthan Geography",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Aravalli Range", "Vindhya Range", "Satpura Range", "Himalaya Range"),
                optionsHindi = listOf("अरावली पर्वतमाला", "विंध्याचल पर्वतमाला", "सतपुड़ा पर्वतमाला", "हिमालय पर्वतमाला"),
                correctAnswerIndex = 0,
                explanation = "The Aravalli Range is one of the oldest fold mountain ranges in the world, stretching southwest to northeast across Rajasthan.",
                explanationHindi = "अरावली पर्वतमाला विश्व की सबसे प्राचीन वलित पर्वत श्रृंखलाओं में से एक है, जो राजस्थान को उत्तर-पूर्व से दक्षिण-पश्चिम में विभाजित करती है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Geography")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_M_001",
                questionText = "In RBSE Class 10 Mathematics, if the diameter of a circle is 14 cm, what is its circumference? (Take π = 22/7)",
                questionTextHindi = "आरबीएसई कक्षा 10 गणित: यदि किसी वृत्त का व्यास 14 सेमी है, तो उसकी परिधि क्या होगी? (π = 22/7 लें)",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Circle Mensuration",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("44 cm", "88 cm", "154 cm", "28 cm"),
                optionsHindi = listOf("44 सेमी", "88 सेमी", "154 सेमी", "28 सेमी"),
                correctAnswerIndex = 0,
                explanation = "Radius r = 14 / 2 = 7 cm. Circumference = 2 * π * r = 2 * (22/7) * 7 = 44 cm.",
                explanationHindi = "त्रिज्या r = 14/2 = 7 सेमी। वृत्त की परिधि = 2πr = 2 × (22/7) × 7 = 44 सेमी।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_BIHAR10_SS_001",
                questionText = "In Bihar Board Class 10 Social Science, in which year did the historic Champaran Satyagraha led by Mahatma Gandhi take place?",
                questionTextHindi = "बिहार बोर्ड कक्षा 10 सामाजिक विज्ञान: महात्मा गांधी के नेतृत्व में बिहार के चंपारण में ऐतिहासिक 'चंपारण सत्याग्रह' किस वर्ष हुआ था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Nationalism in India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1917", "1919", "1920", "1930"),
                optionsHindi = listOf("1917", "1919 (रॉलेट एक्ट)", "1920 (असहयोग आंदोलन)", "1930 (सविनय अवज्ञा)"),
                correctAnswerIndex = 0,
                explanation = "The Champaran Satyagraha of 1917 in Bihar was Mahatma Gandhi's first Satyagraha movement in India against the Tinkathia indigo system.",
                explanationHindi = "1917 का चंपारण सत्याग्रह महात्मा गांधी का भारत में पहला सत्याग्रह था, जो किसानों पर जबरन नील की खेती थोपने के विरोध में हुआ था।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "BSEB", "Class 10", "History")
            )
        )

        list.add(
            Question(
                id = "Q_UP10_HIN_001",
                questionText = "In UP Board Class 10 Hindi, who is the author of the celebrated essay collection 'Chintamani' (चिंतामणि)?",
                questionTextHindi = "यूपी बोर्ड कक्षा 10 हिंदी पाठ्यक्रम के अनुसार प्रसिद्ध निबंध संग्रह 'चिंतामणि' के लेखक कौन हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Hindi Literature",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Acharya Ramchandra Shukla", "Jaishankar Prasad", "Munshi Premchand", "Mahadevi Varma"),
                optionsHindi = listOf("आचार्य रामचंद्र शुक्ल", "जयशंकर प्रसाद", "मुंशी प्रेमचंद", "महादेवी वर्मा"),
                correctAnswerIndex = 0,
                explanation = "Acharya Ramchandra Shukla composed the famous critical essay collection 'Chintamani', an important part of the UP Board syllabus.",
                explanationHindi = "'चिंतामणि' हिंदी के मूर्धन्य आलोचक एवं निबंधकार आचार्य रामचंद्र शुक्ल का प्रसिद्ध निबंध संग्रह है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "UPMSP", "Class 10", "Hindi")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: GENERAL_KNOWLEDGE
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_GK_001",
                questionText = "Which is the highest mountain peak situated entirely within the territory of India?",
                questionTextHindi = "भारत की सीमा में स्थित सबसे ऊंची पर्वत चोटी कौन सी है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                subject = "Indian Geography",
                chapterOrTopic = "Mountains of India",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Kangchenjunga", "Nanda Devi", "Kamet", "Anamudi"),
                optionsHindi = listOf("कंचनजंगा (सिक्किम)", "नंदा देवी (उत्तराखंड)", "कामेत", "अनाईमुडी"),
                correctAnswerIndex = 0,
                explanation = "Kangchenjunga (8,586 m) in Sikkim is the highest peak administered by India and the 3rd highest peak in the world.",
                explanationHindi = "सिक्किम में स्थित कंचनजंगा (8,586 मीटर) भारत की सबसे ऊंची और विश्व की तीसरी सबसे ऊंची चोटी है।",
                negativeMarks = 0.25f,
                tags = listOf("GK", "Geography", "India")
            )
        )

        list.add(
            Question(
                id = "Q_GK_002",
                questionText = "National Science Day in India is celebrated on 28th February to commemorate which discovery?",
                questionTextHindi = "भारत में राष्ट्रीय विज्ञान दिवस (28 फरवरी) किस खोज के सम्मान में मनाया जाता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                subject = "General Knowledge",
                chapterOrTopic = "Important Days & Science",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Raman Effect by C.V. Raman", "Aryabhata Satellite launch", "Periodic table synthesis", "Discovery of Zero"),
                optionsHindi = listOf("सर सी.वी. रमन द्वारा 'रमन प्रभाव' की खोज", "आर्यभट्ट उपग्रह का प्रक्षेपण", "परमाणु ऊर्जा आयोग गठन", "शून्य का आविष्कार"),
                correctAnswerIndex = 0,
                explanation = "Sir C.V. Raman discovered the Raman Effect on 28 February 1928, for which he was awarded the Nobel Prize in Physics in 1930.",
                explanationHindi = "सर सी.वी. रमन ने 28 फरवरी 1928 को रमन प्रभाव की खोज की थी, जिसके लिए उन्हें 1930 में भौतिकी का नोबेल पुरस्कार मिला।",
                negativeMarks = 0.25f,
                tags = listOf("GK", "Science", "National Days")
            )
        )

        list.add(
            Question(
                id = "Q_GK_003",
                questionText = "Which Indian river is famously known as the 'Dakshin Ganga' (Ganges of the South)?",
                questionTextHindi = "किस भारतीय नदी को 'दक्षिण गंगा' के नाम से जाना जाता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                subject = "Indian Geography",
                chapterOrTopic = "Rivers of India",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Godavari", "Krishna", "Cauvery", "Mahanadi"),
                optionsHindi = listOf("गोदावरी", "कृष्णा", "कावेरी", "महानदी"),
                correctAnswerIndex = 0,
                explanation = "Godavari is peninsular India's longest river (1,465 km) and is traditionally called Dakshin Ganga due to its length and cultural significance.",
                explanationHindi = "गोदावरी प्रायद्वीपीय भारत की सबसे लंबी नदी (1,465 किमी) है और इसे 'दक्षिण गंगा' कहा जाता है।",
                negativeMarks = 0.25f,
                tags = listOf("GK", "Geography", "Rivers")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: REASONING & MENTAL ABILITY
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_REAS_001",
                questionText = "Find the next number in the given series: 2, 6, 12, 20, 30, ?",
                questionTextHindi = "दी गई श्रृंखला में अगला पद ज्ञात कीजिए: 2, 6, 12, 20, 30, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                subject = "Reasoning",
                chapterOrTopic = "Number Series",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("42", "40", "36", "48"),
                optionsHindi = listOf("42", "40", "36", "48"),
                correctAnswerIndex = 0,
                explanation = "Pattern: Difference increases by 2 each step (+4, +6, +8, +10, +12). 30 + 12 = 42. (Or: 1*2, 2*3, 3*4, 4*5, 5*6, 6*7 = 42).",
                explanationHindi = "पैटर्न: प्रत्येक पद में अंतर क्रमशः +4, +6, +8, +10, +12 बढ़ रहा है। अतः 30 + 12 = 42 (अथवा 1×2, 2×3, 3×4, 4×5, 5×6, 6×7 = 42)।",
                negativeMarks = 0.25f,
                tags = listOf("Reasoning", "Number Series")
            )
        )

        list.add(
            Question(
                id = "Q_REAS_002",
                questionText = "If DELHI is coded as 73541 and CALCUTTA as 82589662, how will CALICUT be coded?",
                questionTextHindi = "यदि DELHI का कूट 73541 है तथा CALCUTTA का 82589662 है, तो CALICUT का कूट क्या होगा?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                subject = "Reasoning",
                chapterOrTopic = "Coding-Decoding",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("8251896", "8251869", "8521896", "8251968"),
                optionsHindi = listOf("8251896", "8251869", "8521896", "8251968"),
                correctAnswerIndex = 0,
                explanation = "Direct letter substitution: C=8, A=2, L=5, I=1, C=8, U=9, T=6 -> 8251896.",
                explanationHindi = "अक्षरों का सीधा कूट प्रतिस्थापन: C=8, A=2, L=5, I=1, C=8, U=9, T=6 = 8251896।",
                negativeMarks = 0.25f,
                tags = listOf("Reasoning", "Coding-Decoding")
            )
        )

        list.add(
            Question(
                id = "Q_REAS_003",
                questionText = "Pointing to a man in a photograph, Anita says, 'His mother is the only daughter of my mother.' How is Anita related to that man?",
                questionTextHindi = "एक तस्वीर में एक पुरुष की ओर इशारा करते हुए अनिता कहती है, 'उसकी माँ मेरी माँ की इकलौती बेटी है।' अनिता उस पुरुष से किस प्रकार संबंधित है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                subject = "Reasoning",
                chapterOrTopic = "Blood Relations",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mother", "Sister", "Aunt", "Grandmother"),
                optionsHindi = listOf("माँ (Mother)", "बहन (Sister)", "मौसी/चाची (Aunt)", "नानी (Grandmother)"),
                correctAnswerIndex = 0,
                explanation = "Anita's mother's only daughter is Anita herself. Therefore, the man's mother is Anita.",
                explanationHindi = "अनिता की माँ की इकलौती बेटी स्वयं अनिता है। अतः वह पुरुष अनिता का बेटा है और अनिता उसकी माँ है।",
                negativeMarks = 0.25f,
                tags = listOf("Reasoning", "Blood Relations")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: MATHEMATICS
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_MATH_001",
                questionText = "What is 25% of 640?",
                questionTextHindi = "640 का 25% कितना होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                subject = "Mathematics",
                chapterOrTopic = "Percentages",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("160", "150", "180", "140"),
                optionsHindi = listOf("160", "150", "180", "140"),
                correctAnswerIndex = 0,
                explanation = "25% = 1/4. So 640 / 4 = 160.",
                explanationHindi = "25% का अर्थ है एक-चौथाई (1/4)। अतः 640 ÷ 4 = 160।",
                negativeMarks = 0.25f,
                tags = listOf("Math", "Percentage", "Basic")
            )
        )

        list.add(
            Question(
                id = "Q_MATH_002",
                questionText = "A shopkeeper buys an article for ₹500 and sells it for ₹600. What is his profit percentage?",
                questionTextHindi = "एक दुकानदार कोई वस्तु ₹500 में खरीदता है और ₹600 में बेचता है। उसका लाभ प्रतिशत क्या है?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                subject = "Mathematics",
                chapterOrTopic = "Profit and Loss",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("20%", "25%", "15%", "10%"),
                optionsHindi = listOf("20%", "25%", "15%", "10%"),
                correctAnswerIndex = 0,
                explanation = "Profit = 600 - 500 = ₹100. Profit % = (100 / 500) * 100 = 20%.",
                explanationHindi = "लाभ = ₹600 - ₹500 = ₹100। लाभ% = (100 ÷ 500) × 100 = 20%।",
                negativeMarks = 0.25f,
                tags = listOf("Math", "Profit and Loss")
            )
        )

        list.add(
            Question(
                id = "Q_MATH_003",
                questionText = "If A can complete a work in 10 days and B can complete the same work in 15 days, in how many days can they complete it working together?",
                questionTextHindi = "यदि A किसी कार्य को 10 दिन में तथा B उसी कार्य को 15 दिन में पूरा कर सकता है, तो दोनों मिलकर उस कार्य को कितने दिन में पूरा करेंगे?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                subject = "Mathematics",
                chapterOrTopic = "Time and Work",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("6 days", "5 days", "7.5 days", "8 days"),
                optionsHindi = listOf("6 दिन", "5 दिन", "7.5 दिन", "8 दिन"),
                correctAnswerIndex = 0,
                explanation = "Together per day work = 1/10 + 1/15 = (3 + 2)/30 = 5/30 = 1/6. Hence, 6 days.",
                explanationHindi = "दोनों का 1 दिन का कार्य = 1/10 + 1/15 = 5/30 = 1/6 कार्य। अतः कुल समय = 6 दिन।",
                negativeMarks = 0.25f,
                tags = listOf("Math", "Time and Work")
            )
        )

        list.add(
            Question(
                id = "Q_MATH_004",
                questionText = "What is the value of 15 × 8 + 35?",
                questionTextHindi = "15 × 8 + 35 का मान क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                subject = "Mathematics",
                chapterOrTopic = "Basic Arithmetic",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("155", "145", "165", "150"),
                optionsHindi = listOf("155", "145", "165", "150"),
                correctAnswerIndex = 0,
                explanation = "15 × 8 = 120. 120 + 35 = 155.",
                explanationHindi = "15 × 8 = 120, और 120 + 35 = 155।",
                negativeMarks = 0.0f,
                tags = listOf("Math", "Arithmetic", "Beginner")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: HINDI_LANGUAGE (मुहावरे, लोकोक्तियाँ, व्याकरण)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_HIN_001",
                questionText = "'अंगूठा दिखाना' मुहावरे का सही अर्थ क्या है?",
                questionTextHindi = "'अंगूठा दिखाना' मुहावरे का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                subject = "Hindi",
                chapterOrTopic = "मुहावरे (Muhavare)",
                difficulty = "EASY",
                language = "HI",
                options = listOf("साफ़ इनकार करना", "मदद करना", "चिढ़ाना", "स्वागत करना"),
                optionsHindi = listOf("साफ़ इनकार करना", "मदद करना", "चिढ़ाना", "स्वागत करना"),
                correctAnswerIndex = 0,
                explanation = "'अंगूठा दिखाना' मुहावरे का अर्थ है समय पर किसी काम के लिए साफ़ मना या इनकार कर देना।",
                explanationHindi = "'अंगूठा दिखाना' मुहावरे का अर्थ है समय पर किसी काम के लिए साफ़ मना या इनकार कर देना।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Muhavare", "Language")
            )
        )

        list.add(
            Question(
                id = "Q_HIN_002",
                questionText = "'नाच न जाने आँगन टेढ़ा' लोकोक्ति का सही भावार्थ क्या है?",
                questionTextHindi = "'नाच न जाने आँगन टेढ़ा' लोकोक्ति का सही भावार्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                subject = "Hindi",
                chapterOrTopic = "लोकोक्तियाँ (Lokoktiyan)",
                difficulty = "EASY",
                language = "HI",
                options = listOf("अपनी कमी छुपाने के लिए साधनों में दोष निकालना", "नृत्य का अच्छा ज्ञान न होना", "आँगन का समतल न होना", "बिना सोचे-समझे कार्य करना"),
                optionsHindi = listOf("अपनी कमी छुपाने के लिए साधनों में दोष निकालना", "नृत्य का अच्छा ज्ञान न होना", "आँगन का समतल न होना", "बिना सोचे-समझे कार्य करना"),
                correctAnswerIndex = 0,
                explanation = "इस लोकोक्ति का अर्थ है कि जब स्वयं को काम करना न आता हो, तो व्यक्ति परिस्थितियों या साधनों पर दोष मढ़ता है।",
                explanationHindi = "इस लोकोक्ति का अर्थ है कि जब स्वयं को काम करना न आता हो, तो व्यक्ति परिस्थितियों या साधनों पर दोष मढ़ता है।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Lokoktiyan", "Language")
            )
        )

        list.add(
            Question(
                id = "Q_HIN_003",
                questionText = "'सूर्योदय' शब्द का सही संधि-विच्छेद क्या होगा?",
                questionTextHindi = "'सूर्योदय' शब्द का सही संधि-विच्छेद क्या होगा?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                subject = "Hindi",
                chapterOrTopic = "संधि (Sandhi)",
                difficulty = "MEDIUM",
                language = "HI",
                options = listOf("सूर्य + उदय", "सूर्यो + दय", "सूर्य + दय", "सूर्या + उदय"),
                optionsHindi = listOf("सूर्य + उदय (गुण संधि)", "सूर्यो + दय", "सूर्य + दय", "सूर्या + उदय"),
                correctAnswerIndex = 0,
                explanation = "सूर्य + उदय = सूर्योदय। यहाँ अ/आ के बाद उ आने से 'ओ' बनता है, यह गुण स्वर संधि का उदाहरण है।",
                explanationHindi = "सूर्य + उदय = सूर्योदय। यहाँ अ/आ के बाद उ आने से 'ओ' बनता है, यह गुण स्वर संधि का उदाहरण है।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Grammar", "Sandhi")
            )
        )

        list.add(
            Question(
                id = "Q_HIN_004",
                questionText = "'उत्थान' शब्द का सही विलोम शब्द क्या है?",
                questionTextHindi = "'उत्थान' शब्द का सही विलोम शब्द क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                subject = "Hindi",
                chapterOrTopic = "विलोम शब्द (Antonyms)",
                difficulty = "EASY",
                language = "HI",
                options = listOf("पतन", "अवनति", "विनाश", "अधोगति"),
                optionsHindi = listOf("पतन", "अवनति", "विनाश", "अधोगति"),
                correctAnswerIndex = 0,
                explanation = "'उत्थान' (ऊपर उठना या प्रगति) का विपरीतार्थक या विलोम शब्द 'पतन' (नीचे गिरना) होता है।",
                explanationHindi = "'उत्थान' (ऊपर उठना या प्रगति) का विपरीतार्थक या विलोम शब्द 'पतन' (नीचे गिरना) होता है।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Antonyms", "Vocabulary")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: ENGLISH_LANGUAGE (Idioms, Proverbs, Grammar)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_ENG_001",
                questionText = "What does the idiom 'Once in a blue moon' mean?",
                questionTextHindi = "अंग्रेजी मुहावरे 'Once in a blue moon' का क्या अर्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                subject = "English",
                chapterOrTopic = "Idioms and Phrases",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Very rarely", "Very frequently", "Every full moon night", "In difficult times"),
                optionsHindi = listOf("बहुत कभी-कभार (ईद का चाँद होना)", "अक्सर / बार-बार", "प्रत्येक पूर्णिमा पर", "कठिन समय में"),
                correctAnswerIndex = 0,
                explanation = "'Once in a blue moon' is an English idiom that refers to an event that happens very seldom or rarely.",
                explanationHindi = "'Once in a blue moon' का अर्थ बहुत दुर्लभ या कभी-कभार होने वाली घटना है।",
                negativeMarks = 0.25f,
                tags = listOf("English", "Idioms", "Language")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_002",
                questionText = "Complete the famous proverb: 'Actions speak louder than ______.'",
                questionTextHindi = "प्रसिद्ध कहावत को पूरा करें: 'Actions speak louder than ______.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                subject = "English",
                chapterOrTopic = "Proverbs",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("words", "thoughts", "promises", "shouts"),
                optionsHindi = listOf("words (शब्द)", "thoughts (विचार)", "promises (वादे)", "shouts (आवाजें)"),
                correctAnswerIndex = 0,
                explanation = "The proverb means that what you do is much more important and reveals your true character more than what you say.",
                explanationHindi = "कहावत का अर्थ है कि कथनी से अधिक करनी का महत्व होता है।",
                negativeMarks = 0.25f,
                tags = listOf("English", "Proverbs")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_003",
                questionText = "Choose the correct preposition: 'She has been living in this city ______ 2018.'",
                questionTextHindi = "सही Preposition चुनें: 'She has been living in this city ______ 2018.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                subject = "English",
                chapterOrTopic = "Prepositions & Tenses",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("since", "for", "from", "by"),
                optionsHindi = listOf("since (निश्चित समय बिंदु के लिए)", "for (समयावधि के लिए)", "from", "by"),
                correctAnswerIndex = 0,
                explanation = "We use 'since' for a specific point in time in the past (like year 2018) with Present Perfect Continuous tense.",
                explanationHindi = "निश्चित समय बिंदु (Point of Time जैसे वर्ष 2018) के लिए 'since' का प्रयोग किया जाता है।",
                negativeMarks = 0.25f,
                tags = listOf("English", "Grammar", "Prepositions")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: ITI_TECHNICAL (Electrician, Wiring, Safety)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_ELEC_001",
                questionText = "What is the SI unit of electrical resistance?",
                questionTextHindi = "विद्युत प्रतिरोध (Electrical Resistance) की SI इकाई क्या है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                subject = "Electrician Trade",
                chapterOrTopic = "Electrical Fundamentals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ohm (Ω)", "Ampere (A)", "Volt (V)", "Watt (W)"),
                optionsHindi = listOf("ओम (Ohm - Ω)", "एम्पीयर (धारा)", "वोल्ट (विभवांतर)", "वाट (शक्ति)"),
                correctAnswerIndex = 0,
                explanation = "Resistance is measured in Ohms (Ω), named after Georg Simon Ohm who formulated Ohm's Law (V = I * R).",
                explanationHindi = "विद्युत प्रतिरोध का SI मात्रक 'ओम' (Ω) होता है। ओम का नियम: V = I × R।",
                negativeMarks = 0.25f,
                tags = listOf("ITI", "Electrician", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_002",
                questionText = "According to Indian standard domestic wiring codes, what is the color of the Earth (ground) wire?",
                questionTextHindi = "भारतीय मानक के अनुसार घरेलू वायरिंग में अर्थिंग (Earth wire) का रंग क्या होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                subject = "Electrician Trade",
                chapterOrTopic = "Wiring Concepts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Green (or Green/Yellow)", "Red", "Black", "Blue"),
                optionsHindi = listOf("हरा (या हरा/पीला)", "लाल (फेज)", "काला (न्यूट्रल)", "नीला"),
                correctAnswerIndex = 0,
                explanation = "In standard wiring: Red/Brown is Live (Phase), Black/Blue is Neutral, and Green (or Green-Yellow stripe) is Earth.",
                explanationHindi = "भारतीय विद्युत नियमों के अनुसार अर्थिंग तार का रंग हरा (या हरा-पीला) होता है, लाल फेज के लिए तथा काला न्यूट्रल के लिए होता है।",
                negativeMarks = 0.25f,
                tags = listOf("ITI", "Wiring", "Safety")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_003",
                questionText = "What does the abbreviation 'MCB' stand for in electrical installation?",
                questionTextHindi = "विद्युत परिपथ में 'MCB' का पूर्ण रूप क्या होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                subject = "Electrician Trade",
                chapterOrTopic = "Safety Procedures",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Miniature Circuit Breaker", "Main Current Board", "Maximum Capacity Box", "Manual Current Bypass"),
                optionsHindi = listOf("Miniature Circuit Breaker (लघु परिपथ विच्छेदक)", "Main Current Board", "Maximum Capacity Box", "Manual Current Bypass"),
                correctAnswerIndex = 0,
                explanation = "MCB stands for Miniature Circuit Breaker, an automatically operated electrical switch designed to protect an electrical circuit from damage caused by excess current/short circuit.",
                explanationHindi = "MCB का पूरा नाम Miniature Circuit Breaker है, जो अतिभार (Overload) या शॉर्ट सर्किट होने पर परिपथ को स्वतः काट देता है।",
                negativeMarks = 0.25f,
                tags = listOf("ITI", "Safety", "MCB")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_004",
                questionText = "Which type of fire extinguisher should be used on an energized electrical equipment fire?",
                questionTextHindi = "बिजली के उपकरणों में लगी आग को बुझाने के लिए किस प्रकार के अग्निशामक (Fire Extinguisher) का उपयोग करना चाहिए?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                subject = "Safety Procedures",
                chapterOrTopic = "Electrical Safety",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Carbon Dioxide (CO₂) / Halon", "Water jet extinguisher", "Foam extinguisher", "Wet chemical"),
                optionsHindi = listOf("कार्बन डाइऑक्साइड (CO₂) या सीटीसी", "पानी की धार", "झाग (Foam)", "गीला रासायनिक"),
                correctAnswerIndex = 0,
                explanation = "Never use water on electrical fires as water conducts electricity. CO2 or dry chemical extinguishers are non-conductive and safe.",
                explanationHindi = "विद्युत आग पर कभी भी पानी का प्रयोग नहीं करना चाहिए क्योंकि पानी विद्युत का सुचालक है। इसके लिए CO₂ या शुष्क रासायनिक चूर्ण का उपयोग किया जाता है।",
                negativeMarks = 0.25f,
                tags = listOf("ITI", "Safety", "Fire Safety")
            )
        )

        // -------------------------------------------------------------
        // CATEGORY: HOMEMAKER_EVERYDAY (Everyday Life, Kitchen, Health)
        // -------------------------------------------------------------
        list.add(
            Question(
                id = "Q_HOME_001",
                questionText = "If 1 kilogram of sugar costs ₹44, what will be the cost of 250 grams of sugar?",
                questionTextHindi = "यदि 1 किलोग्राम चीनी का मूल्य ₹44 है, तो 250 ग्राम चीनी का मूल्य क्या होगा?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                subject = "Everyday Mathematics",
                chapterOrTopic = "Everyday Math",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹11", "₹12", "₹10", "₹14"),
                optionsHindi = listOf("₹11", "₹12", "₹10", "₹14"),
                correctAnswerIndex = 0,
                explanation = "250 grams is 1/4 of a kilogram (1000 g). So ₹44 ÷ 4 = ₹11.",
                explanationHindi = "250 ग्राम 1 किलोग्राम (1000 ग्राम) का एक-चौथाई होता है। अतः ₹44 ÷ 4 = ₹11।",
                negativeMarks = 0.0f,
                tags = listOf("Everyday", "Kitchen", "Math", "Homemaker")
            )
        )

        list.add(
            Question(
                id = "Q_HOME_002",
                questionText = "Which essential water-soluble vitamin is easily destroyed by prolonged boiling and excessive washing of cut vegetables?",
                questionTextHindi = "कटी हुई सब्जियों को बार-बार धोने और बहुत देर तक उबालने से कौन सा विटामिन सबसे जल्दी नष्ट हो जाता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                subject = "Food & Nutrition",
                chapterOrTopic = "Kitchen Knowledge",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Vitamin C", "Vitamin D", "Vitamin A", "Vitamin K"),
                optionsHindi = listOf("विटामिन C", "विटामिन D", "विटामिन A", "विटामिन K"),
                correctAnswerIndex = 0,
                explanation = "Vitamin C (ascorbic acid) is water-soluble and heat-sensitive, so washing chopped vegetables or overcooking easily leaches it out.",
                explanationHindi = "विटामिन सी जल में घुलनशील और ऊष्मा-संवेदनशील होता है, इसलिए कटी सब्जियों को धोने या अधिक पकाने से यह नष्ट हो जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Health", "Nutrition", "Kitchen")
            )
        )

        list.add(
            Question(
                id = "Q_HOME_003",
                questionText = "What is the primary and safest immediate action if you smell an LPG gas leakage in your home?",
                questionTextHindi = "घर में एलपीजी गैस रिसाव (गैस की गंध) महसूस होने पर सबसे पहले क्या सावधानी बरतनी चाहिए?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                subject = "Household Safety",
                chapterOrTopic = "Household Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf(
                    "Open all windows/doors and DO NOT turn on any electrical switch",
                    "Turn on the exhaust fan immediately",
                    "Light a matchstick to find the leak",
                    "Spray room freshener"
                ),
                optionsHindi = listOf(
                    "सभी खिड़कियाँ-दरवाजे खोल दें तथा कोई भी बिजली का स्विच ऑन न करें",
                    "तुरंत एग्जॉस्ट फैन चालू करें",
                    "माचिस जलाकर लीकेज चेक करें",
                    "कमरे में फ्रेशनर छिड़कें"
                ),
                correctAnswerIndex = 0,
                explanation = "Electric switches create a tiny internal spark when turned on, which can ignite accumulated LPG. Open doors/windows to disperse gas and shut cylinder regulator.",
                explanationHindi = "बिजली का स्विच चालू करने पर निकलने वाली छोटी सी चिंगारी से गैस आग पकड़ सकती है। इसलिए तुरंत खिड़कियाँ-दरवाजे खोलें और रेगुलेटर बंद करें।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Safety", "Kitchen")
            )
        )

        list.add(
            Question(
                id = "Q_HOME_004",
                questionText = "Riddle / Puzzle: What has a thumb and four fingers, but is not alive?",
                questionTextHindi = "मजेदार पहेली: जिसके पास एक अंगूठा और चार उँगलियाँ हैं, फिर भी उसमें जान नहीं है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                subject = "Brain Teasers",
                chapterOrTopic = "Fun Puzzles",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("A Glove", "A Mirror", "A Clock", "A Shoe"),
                optionsHindi = listOf("दस्ताना (Glove)", "आईना", "घड़ी", "जूता"),
                correctAnswerIndex = 0,
                explanation = "A glove is made with four fingers and one thumb to fit a hand, but has no life.",
                explanationHindi = "दस्ताने में हाथ की तरह एक अंगूठा और चार उंगलियाँ होती हैं, पर वह निर्जीव होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Puzzle", "Fun", "Brain Teaser", "Beginner")
            )
        )

        // ADDITIONAL COMPREHENSIVE COVERAGE
        list.add(
            Question(
                id = "Q_DEFENCE_001",
                questionText = "Under the Constitution of India, who is the Supreme Commander of the Indian Armed Forces?",
                questionTextHindi = "भारतीय संविधान के अनुसार भारतीय सशस्त्र सेनाओं का सर्वोच्च सेनापति (Supreme Commander) कौन होता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "Defence",
                subject = "Indian Polity",
                chapterOrTopic = "Defence Forces",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("The President of India", "The Prime Minister", "Chief of Defence Staff (CDS)", "Minister of Defence"),
                optionsHindi = listOf("भारत के राष्ट्रपति", "प्रधानमंत्री", "चीफ ऑफ डिफेंस स्टाफ (CDS)", "रक्षा मंत्री"),
                correctAnswerIndex = 0,
                explanation = "Article 53(2) of the Constitution vests the supreme command of the Defence Forces of the Union in the President of India.",
                explanationHindi = "संविधान के अनुच्छेद 53(2) के तहत संघ के रक्षा बलों का सर्वोच्च समादेश राष्ट्रपति में निहित होता है।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "NDA", "CDS", "Polity")
            )
        )

        list.add(
            Question(
                id = "Q_NEET_001",
                questionText = "Which cellular organelle is universally referred to as the 'Powerhouse of the Cell' due to ATP synthesis?",
                questionTextHindi = "कोशिका में एटीपी (ATP) संश्लेषण के कारण किस कोशिकांग को 'कोशिका का शक्तिगृह' (Powerhouse) कहा जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Cell Biology",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mitochondria", "Ribosome", "Golgi apparatus", "Lysosome"),
                optionsHindi = listOf("माइटोकॉन्ड्रिया (Mitochondria)", "राइबोसोम", "गॉल्जी काय", "लाइसोसोम"),
                correctAnswerIndex = 0,
                explanation = "Mitochondria generate most of the chemical energy needed to power the cell's biochemical reactions, stored in adenosine triphosphate (ATP).",
                explanationHindi = "माइटोकॉन्ड्रिया श्वसन द्वारा ऊर्जा का उत्पादन कर उसे एटीपी (ATP) के रूप में संचित करता है, इसलिए इसे कोशिका का पावरहाउस कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Science", "Biology", "NEET", "CBSE")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_001",
                questionText = "The apparent flickering and twinkling of stars at night is primarily caused by which phenomenon?",
                questionTextHindi = "रात में तारों का टिमटिमाता हुआ दिखाई देना मुख्य रूप से किस परिघटना के कारण होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Human Eye and Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Atmospheric refraction of starlight", "Total internal reflection", "Scattering of light", "Dispersion of light"),
                optionsHindi = listOf("तारों के प्रकाश का वायुमंडलीय अपवर्तन", "पूर्ण आंतरिक परावर्तन", "प्रकाश का प्रकीर्णन", "प्रकाश का वर्ण-विक्षेपण"),
                correctAnswerIndex = 0,
                explanation = "Twinkling of stars is due to atmospheric refraction of starlight passing through layers of air of varying refractive indices.",
                explanationHindi = "तारों का टिमटिमाना पृथ्वी के वायुमंडल में लगातार बदलते घनत्व और अपवर्तनांक के कारण होने वाले वायुमंडलीय अपवर्तन से होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Science", "Physics", "Optics", "CBSE")
            )
        )

        list.add(
            Question(
                id = "Q_HIN_005",
                questionText = "'दाल में कुछ काला होना' मुहावरे का सही अर्थ क्या है?",
                questionTextHindi = "'दाल में कुछ काला होना' मुहावरे का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                subject = "Hindi",
                chapterOrTopic = "मुहावरे (Muhavare)",
                difficulty = "EASY",
                language = "HI",
                options = listOf("किसी बात पर गहरा संदेह होना", "दाल का खराब हो जाना", "बिना कारण झगड़ा करना", "अधिक लाभ होना"),
                optionsHindi = listOf("किसी बात पर गहरा संदेह होना", "दाल का खराब हो जाना", "बिना कारण झगड़ा करना", "अधिक लाभ होना"),
                correctAnswerIndex = 0,
                explanation = "'दाल में काला होना' मुहावरे का अर्थ है किसी मामले में कोई गड़बड़, कपट या संदेह की बात होना।",
                explanationHindi = "'दाल में काला होना' मुहावरे का अर्थ है किसी मामले में कोई गड़बड़, कपट या संदेह की बात होना।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Muhavare")
            )
        )

        list.add(
            Question(
                id = "Q_HIN_006",
                questionText = "'अधजल गगरी छलकत जाए' लोकोक्ति का सही अर्थ क्या है?",
                questionTextHindi = "'अधजल गगरी छलकत जाए' लोकोक्ति का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                subject = "Hindi",
                chapterOrTopic = "लोकोक्तियाँ (Lokoktiyan)",
                difficulty = "EASY",
                language = "HI",
                options = listOf("कम ज्ञान या धन वाला व्यक्ति अधिक दिखावा करता है", "मटके से पानी गिरना", "मूर्ख व्यक्ति का चुप रहना", "गहरी सोच में डूबना"),
                optionsHindi = listOf("कम ज्ञान या धन वाला व्यक्ति अधिक दिखावा करता है", "मटके से पानी गिरना", "मूर्ख व्यक्ति का चुप रहना", "गहरी सोच में डूबना"),
                correctAnswerIndex = 0,
                explanation = "इस लोकोक्ति का अर्थ है कि जिस व्यक्ति के पास ज्ञान, योग्यता या धन कम होता है, वह उसका बहुत अधिक दिखावा और डींग हांकता है।",
                explanationHindi = "जिस व्यक्ति के पास अधूरा ज्ञान होता है, वह स्वयं को बहुत बड़ा ज्ञानी दिखाने के लिए बढ़-चढ़कर बातें करता है।",
                negativeMarks = 0.25f,
                tags = listOf("Hindi", "Lokoktiyan")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_004",
                questionText = "What is the meaning of the English idiom 'Bite the bullet'?",
                questionTextHindi = "अंग्रेजी मुहावरे 'Bite the bullet' का क्या अर्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                subject = "English",
                chapterOrTopic = "Idioms and Phrases",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("To face a difficult or unpleasant situation with courage", "To eat quickly", "To stop talking immediately", "To surrender in battle"),
                optionsHindi = listOf("कठिन अथवा अप्रिय परिस्थिति का साहसपूर्वक सामना करना", "जल्दी-जल्दी भोजन करना", "बातचीत तुरंत बंद कर देना", "युद्ध में आत्मसमर्पण करना"),
                correctAnswerIndex = 0,
                explanation = "'Bite the bullet' means to bravely accept and endure a painful, grim, or difficult situation that cannot be avoided.",
                explanationHindi = "किसी अप्रिय और अपरिहार्य स्थिति का साहस के साथ सामना करना 'Bite the bullet' कहलाता है।",
                negativeMarks = 0.25f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_FITTER_001",
                questionText = "Which precision measuring instrument is used in mechanical workshops to measure external, internal dimensions and step depths?",
                questionTextHindi = "मैकेनिकल/फिटर कार्यशाला में आंतरिक, बाहरी माप तथा गहराई की सटीक माप लेने के लिए किस उपकरण का उपयोग किया जाता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                subject = "ITI Trade Theory",
                chapterOrTopic = "Tools and Equipment",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Vernier Caliper", "Steel Rule", "Try Square", "Bench Vise"),
                optionsHindi = listOf("वर्नियर कैलीपर (Vernier Caliper)", "स्टील रूल", "ट्राई स्क्वायर", "बेंच वाइस"),
                correctAnswerIndex = 0,
                explanation = "A Vernier Caliper can measure external dimensions, internal bores, and depths with an accuracy up to 0.02 mm.",
                explanationHindi = "वर्नियर कैलीपर से 0.02 मिमी तक की सूक्ष्मता से बाहरी व्यास, आंतरिक व्यास तथा गहराई तीनों मापी जा सकती हैं।",
                negativeMarks = 0.25f,
                tags = listOf("ITI", "Fitter", "Tools")
            )
        )

        list.add(
            Question(
                id = "Q_HOME_005",
                questionText = "Which traditional Indian spice, containing the bioactive compound 'Curcumin', is widely used as a natural antiseptic for healing wounds?",
                questionTextHindi = "भारतीय रसोई का कौन सा पारंपरिक मसाला, जिसमें 'करक्यूमिन' पाया जाता है, प्राकृतिक एंटीसेप्टिक एवं घाव भरने के लिए प्रसिद्ध है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                subject = "Food & Nutrition",
                chapterOrTopic = "Kitchen Knowledge",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Turmeric (Haldi)", "Black Pepper", "Cumin (Jeera)", "Coriander (Dhaniya)"),
                optionsHindi = listOf("हल्दी (Turmeric / Haldi)", "काली मिर्च", "जीरा", "धनिया"),
                correctAnswerIndex = 0,
                explanation = "Turmeric contains Curcumin, an active substance with proven anti-inflammatory, antioxidant, and wound-healing properties.",
                explanationHindi = "हल्दी में करक्यूमिन नामक तत्व होता है जो शक्तिशाली एंटीसेप्टिक, एंटी-इन्फ्लेमेटरी और रोगाणुरोधक गुण रखता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Health")
            )
        )

        list.add(
            Question(
                id = "Q_HOME_006",
                questionText = "Why do cutting onions cause eyes to sting and water?",
                questionTextHindi = "प्याज काटते समय आँखों में जलन और आँसू आने का वैज्ञानिक कारण क्या है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                subject = "Kitchen Science",
                chapterOrTopic = "Kitchen Knowledge",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf(
                    "Release of sulfur gas (syn-propanethial-S-oxide)",
                    "High concentration of Vitamin C",
                    "Reaction with room air nitrogen",
                    "Presence of natural sugar"
                ),
                optionsHindi = listOf(
                    "सल्फर युक्त वाष्पशील गैस (सिन-प्रोपेनेथियल-एस-ऑक्साइड) का निकलना",
                    "विटामिन सी की अधिकता",
                    "हवा की नाइट्रोजन से क्रिया",
                    "प्राकृतिक शर्करा की उपस्थिति"
                ),
                correctAnswerIndex = 0,
                explanation = "Cutting breaks onion cells, releasing lachrymatory factor synthase which forms syn-propanethial-S-oxide gas that irritates eye tear glands.",
                explanationHindi = "प्याज काटने पर कोशिकाएं टूटने से सल्फर युक्त गैस निकलती है जो आँख की नमी से मिलकर हल्का सल्फ्यूरिक अम्ल बनाती है जिससे आँसू आते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_MATH_005",
                questionText = "If 12 notebooks cost ₹180, what will be the cost of 7 notebooks?",
                questionTextHindi = "यदि 12 कॉपियों (नोटबुक्स) का मूल्य ₹180 है, तो 7 कॉपियों का मूल्य क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                subject = "Everyday Mathematics",
                chapterOrTopic = "Unitary Method",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹105", "₹110", "₹95", "₹120"),
                optionsHindi = listOf("₹105", "₹110", "₹95", "₹120"),
                correctAnswerIndex = 0,
                explanation = "Cost of 1 notebook = 180 / 12 = ₹15. Cost of 7 notebooks = 15 * 7 = ₹105.",
                explanationHindi = "ऐकिक नियम: 1 कॉपी का मूल्य = ₹180 ÷ 12 = ₹15। अतः 7 कॉपियों का मूल्य = 15 × 7 = ₹105।",
                negativeMarks = 0.0f,
                tags = listOf("Math", "Unitary Method", "Everyday")
            )
        )

        list.add(
            Question(
                id = "Q_REAS_004",
                questionText = "Complete the analogy: Doctor : Stethoscope :: Sculptor : ?",
                questionTextHindi = "सादृश्यता पूर्ण करें: चिकित्सक : स्टेथोस्कोप :: मूर्तिकार : ?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                subject = "Reasoning",
                chapterOrTopic = "Analogy",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Chisel", "Pen", "Brush", "Spade"),
                optionsHindi = listOf("छेनी (Chisel)", "कलम", "ब्रश", "फावड़ा"),
                correctAnswerIndex = 0,
                explanation = "A stethoscope is the primary diagnostic tool used by a doctor; similarly, a chisel is the primary sculpting tool used by a sculptor.",
                explanationHindi = "जिस प्रकार चिकित्सक का मुख्य उपकरण स्टेथोस्कोप है, उसी प्रकार मूर्तिकार का मुख्य उपकरण छेनी (Chisel) है।",
                negativeMarks = 0.25f,
                tags = listOf("Reasoning", "Analogy")
            )
        )


        // =============================================================
        // CATEGORY: COMPETITIVE_EXAMS -> JEE MAIN & ADVANCED (IIT JEE)
        // =============================================================
        list.add(
            Question(
                id = "Q_JEE_PHY_001",
                questionText = "What is the moment of inertia of a uniform thin circular disc of mass M and radius R about one of its diameter axes?",
                questionTextHindi = "द्रव्यमान M तथा त्रिज्या R वाली एकसमान वृत्ताकार चकती (disc) का उसके किसी व्यास (diameter) के परितः जड़त्व आघूर्ण क्या होगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Physics",
                chapterOrTopic = "Rotational Motion",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("(1/4) M R²", "(1/2) M R²", "M R²", "(2/5) M R²"),
                optionsHindi = listOf("(1/4) M R²", "(1/2) M R²", "M R²", "(2/5) M R²"),
                correctAnswerIndex = 0,
                explanation = "By perpendicular axis theorem, Iz = Ix + Iy. For a symmetrical disc Ix = Iy = Id. Since Iz = (1/2)MR², Id = (1/4)MR².",
                explanationHindi = "लंबवत अक्ष प्रमेय के अनुसार: Iz = Ix + Iy = 2 Id। चकती के तल के लंबवत अक्ष के परितः Iz = (1/2)MR² होता है, अतः व्यास के परितः Id = (1/4)MR²।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Physics", "Rotational Motion")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_PHY_002",
                questionText = "A reversible Carnot engine operates between source temperature 500 K and sink temperature 300 K. What is its theoretical thermal efficiency?",
                questionTextHindi = "एक उत्क्रमणीय कार्नो इंजन 500 K ताप वाले स्रोत और 300 K ताप वाले सिंक के बीच कार्य करता है। इसकी सैद्धांतिक ऊष्मीय दक्षता क्या है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Physics",
                chapterOrTopic = "Thermodynamics",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("40%", "60%", "20%", "50%"),
                optionsHindi = listOf("40%", "60%", "20%", "50%"),
                correctAnswerIndex = 0,
                explanation = "Carnot efficiency η = 1 - (T_sink / T_source) = 1 - (300 / 500) = 1 - 0.6 = 0.40 (40%).",
                explanationHindi = "कार्नो इंजन की दक्षता η = 1 - (T2/T1) = 1 - (300/500) = 1 - 0.6 = 0.4 अर्थात् 40%।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Physics", "Thermodynamics")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_PHY_003",
                questionText = "In Young's double-slit experiment, if the slit separation d is halved and the screen distance D is doubled, what happens to fringe width β?",
                questionTextHindi = "यंग के द्वि-स्लिट प्रयोग में, यदि स्लिटों के बीच की दूरी d को आधा और पर्दे की दूरी D को दोगुना कर दिया जाए, तो फ्रिंज चौड़ाई β पर क्या प्रभाव पड़ेगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Physics",
                chapterOrTopic = "Wave Optics",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("Increases by 4 times (quadrupled)", "Remains unchanged", "Doubles", "Halved"),
                optionsHindi = listOf("4 गुना हो जाएगी (चौगुनी)", "अपरिवर्तित रहेगी", "दोगुनी हो जाएगी", "आधी रह जाएगी"),
                correctAnswerIndex = 0,
                explanation = "Fringe width β = λD/d. When D becomes 2D and d becomes d/2, new fringe width β' = λ(2D)/(d/2) = 4(λD/d) = 4β.",
                explanationHindi = "फ्रिंज चौड़ाई का सूत्र β = λD/d होता है। D को 2D तथा d को d/2 करने पर नई चौड़ाई β' = 4(λD/d) = 4β अर्थात् चार गुना हो जाएगी।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Physics", "Optics")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_PHY_004",
                questionText = "An ideal LC resonant circuit has inductance L = 10 mH and capacitance C = 1 µF. What is its resonant angular frequency ω₀?",
                questionTextHindi = "एक आदर्श LC दोलनी परिपथ में प्रेरकत्व L = 10 mH तथा धारिता C = 1 µF है। परिपथ की अनुनादी कोणीय आवृत्ति ω₀ क्या होगी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Physics",
                chapterOrTopic = "Alternating Current",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("10,000 rad/s", "1,000 rad/s", "100 rad/s", "100,000 rad/s"),
                optionsHindi = listOf("10,000 rad/s", "1,000 rad/s", "100 rad/s", "100,000 rad/s"),
                correctAnswerIndex = 0,
                explanation = "Resonant angular frequency ω₀ = 1 / √(LC) = 1 / √(10×10⁻³ × 10⁻⁶) = 1 / √(10⁻⁸) = 10⁴ = 10,000 rad/s.",
                explanationHindi = "अनुनादी कोणीय आवृत्ति ω₀ = 1/√(LC) = 1/√(10×10⁻³ × 1×10⁻⁶) = 1/√(10⁻⁸) = 10⁴ = 10,000 rad/s।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Physics", "AC")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_PHY_005",
                questionText = "An electron is accelerated from rest through an electric potential difference of 100 V. What is its de Broglie wavelength?",
                questionTextHindi = "विरामावस्था से एक इलेक्ट्रॉन को 100 वोल्ट के विभवांतर से त्वरित किया जाता है। इसकी डी-ब्रोग्ली तरंगदैर्ध्य लगभग क्या होगी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Physics",
                chapterOrTopic = "Dual Nature of Matter",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("0.123 nm (1.23 Å)", "1.23 nm", "0.0123 nm", "12.3 nm"),
                optionsHindi = listOf("0.123 nm (1.23 Å)", "1.23 nm", "0.0123 nm", "12.3 nm"),
                correctAnswerIndex = 0,
                explanation = "For an electron, λ = 1.227 / √V nm. For V = 100 V, λ = 1.227 / 10 = 0.1227 nm ≈ 1.23 Å.",
                explanationHindi = "इलेक्ट्रॉन के लिए डी-ब्रोग्ली तरंगदैर्ध्य सूत्र: λ = 1.227 / √V nm। V = 100 V रखने पर λ = 1.227 / 10 = 0.123 nm (1.23 Å)।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Physics", "Modern Physics")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_CHEM_001",
                questionText = "What is the hybridization and molecular geometry of Xenon tetrafluoride (XeF₄) according to VSEPR theory?",
                questionTextHindi = "VSEPR सिद्धांत के अनुसार जीनॉन टेट्राफ्लोराइड (XeF₄) की संकरण अवस्था एवं आणविक ज्यामिति क्या है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Chemistry",
                chapterOrTopic = "Chemical Bonding",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("sp³d², Square planar", "sp³d, See-saw", "sp³, Tetrahedral", "sp³d², Octahedral"),
                optionsHindi = listOf("sp³d², वर्ग समतलीय (Square planar)", "sp³d, सी-सॉ (See-saw)", "sp³, चतुष्फलकीय", "sp³d², अष्टफलकीय"),
                correctAnswerIndex = 0,
                explanation = "Xe has 8 valence electrons + 4 from F = 12 electrons (4 bond pairs + 2 lone pairs). Steric number 6 gives sp³d² hybridization with a square planar geometry.",
                explanationHindi = "XeF₄ में जीनॉन के पास 4 बंध युग्म तथा 2 एकाकी युग्म (lone pairs) होते हैं। कुल 6 संकरित कक्षकों के कारण sp³d² संकरण तथा वर्ग समतलीय आकृति बनती है।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Chemistry", "Bonding")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_CHEM_002",
                questionText = "When propene reacts with HBr in the presence of benzoyl peroxide, 1-bromopropane is formed as the major product. This effect is known as:",
                questionTextHindi = "जब प्रोपीन की अभिक्रिया बेंजॉयल परॉक्साइड की उपस्थिति में HBr के साथ कराई जाती है, तो 1-ब्रोमोप्रोपेन मुख्य उत्पाद बनता है। इस प्रभाव को क्या कहते हैं?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Chemistry",
                chapterOrTopic = "Hydrocarbons",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Kharasch effect (Peroxide / Anti-Markovnikov effect)", "Markovnikov addition", "Saytzeff elimination", "Hofmann rearrangement"),
                optionsHindi = listOf("खराश प्रभाव (परॉक्साइड / प्रति-मारकोनीकॉफ प्रभाव)", "मारकोनीकॉफ योग", "सैटजेफ विलोपन", "हॉफमैन पुनर्विन्यास"),
                correctAnswerIndex = 0,
                explanation = "In the presence of peroxides, HBr adds to unsymmetrical alkenes via a free radical mechanism yielding anti-Markovnikov product, known as Kharasch effect.",
                explanationHindi = "परॉक्साइड की उपस्थिति में HBr का असममित एल्कीन पर योग मुक्त मूलक क्रियाविधि द्वारा होता है, जिसे खराश प्रभाव (Kharasch effect) या एंटी-मारकोनीकॉफ प्रभाव कहते हैं।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Chemistry", "Organic")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_CHEM_003",
                questionText = "For a first-order reaction with rate constant k = 2.31 × 10⁻³ s⁻¹, what is the half-life period (t₁/₂) of the reaction?",
                questionTextHindi = "एक प्रथम कोटि की अभिक्रिया के लिए यदि वेग स्थिरांक k = 2.31 × 10⁻³ s⁻¹ है, तो अभिक्रिया की अर्ध-आयु (t₁/₂) क्या होगी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Chemistry",
                chapterOrTopic = "Chemical Kinetics",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("300 seconds", "150 seconds", "600 seconds", "100 seconds"),
                optionsHindi = listOf("300 सेकंड", "150 सेकंड", "600 सेकंड", "100 सेकंड"),
                correctAnswerIndex = 0,
                explanation = "For a first order reaction, t₁/₂ = 0.693 / k = 0.693 / (2.31 × 10⁻³) = 300 seconds.",
                explanationHindi = "प्रथम कोटि अभिक्रिया की अर्ध-आयु t₁/₂ = 0.693 / k = 0.693 / (2.31 × 10⁻³) = 300 सेकंड।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Chemistry", "Kinetics")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_CHEM_004",
                questionText = "Which of the following complex ions is diamagnetic and exhibits maximum crystal field stabilization energy (CFSE)?",
                questionTextHindi = "निम्नलिखित में से कौन सा संकुल आयन प्रतिचुंबकीय (diamagnetic) है और अधिकतम क्रिस्टल क्षेत्र स्थायीकरण ऊर्जा (CFSE) रखता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Chemistry",
                chapterOrTopic = "Coordination Compounds",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("[Co(CN)₆]³⁻", "[CoF₆]³⁻", "[Fe(H₂O)₆]²⁺", "[MnCl₄]²⁻"),
                optionsHindi = listOf("[Co(CN)₆]³⁻", "[CoF₆]³⁻", "[Fe(H₂O)₆]²⁺", "[MnCl₄]²⁻"),
                correctAnswerIndex = 0,
                explanation = "Co³⁺ has d⁶ configuration. CN⁻ is a strong field ligand, forcing pairing to t₂g⁶ eg⁰, giving diamagnetic state and max CFSE = -2.4 Δ₀ + 2P.",
                explanationHindi = "Co³⁺ का d⁶ विन्यास है। CN⁻ प्रबल लिगैंड होने के कारण सभी 6 इलेक्ट्रॉन t₂g में युग्मित हो जाते हैं (t₂g⁶ eg⁰), जिससे यह प्रतिचुंबकीय और अधिकतम CFSE रखता है।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Chemistry", "Coordination")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_CHEM_005",
                questionText = "Given standard electrode potentials E°(Zn²⁺/Zn) = -0.76 V and E°(Cu²⁺/Cu) = +0.34 V, what is the standard EMF of the Daniell cell?",
                questionTextHindi = "मानक इलेक्ट्रोड विभव E°(Zn²⁺/Zn) = -0.76 V और E°(Cu²⁺/Cu) = +0.34 V दिए जाने पर डेनियल सेल का मानक विद्युत वाहक बल क्या होगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Chemistry",
                chapterOrTopic = "Electrochemistry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("+1.10 V", "+0.42 V", "-1.10 V", "+0.90 V"),
                optionsHindi = listOf("+1.10 V", "+0.42 V", "-1.10 V", "+0.90 V"),
                correctAnswerIndex = 0,
                explanation = "E°cell = E°cathode - E°anode = +0.34 V - (-0.76 V) = +1.10 V.",
                explanationHindi = "मानक सेल विभव E°cell = E°कैथोड - E°एनोड = +0.34 V - (-0.76 V) = +1.10 V।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Chemistry", "Electrochemistry")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_MATH_001",
                questionText = "What is the value of the definite integral ∫₀^(π/2) [√(sin x) / (√(sin x) + √(cos x))] dx?",
                questionTextHindi = "निश्चित समाकलन ∫₀^(π/2) [√(sin x) / (√(sin x) + √(cos x))] dx का मान क्या है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Mathematics",
                chapterOrTopic = "Definite Integrals",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("π/4", "π/2", "1", "0"),
                optionsHindi = listOf("π/4", "π/2", "1", "0"),
                correctAnswerIndex = 0,
                explanation = "Using King's property ∫₀^a f(x)dx = ∫₀^a f(a-x)dx, 2I = ∫₀^(π/2) 1 dx = π/2, so I = π/4.",
                explanationHindi = "निश्चित समाकलन के गुणधर्म ∫₀^a f(x)dx = ∫₀^a f(a-x)dx का प्रयोग करने पर: 2I = ∫₀^(π/2) 1 dx = π/2, अतः I = π/4।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Mathematics", "Calculus")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_MATH_002",
                questionText = "If A is a 3 × 3 non-singular matrix such that |A| = 4, what is the value of the determinant of its adjoint, |adj(A)|?",
                questionTextHindi = "यदि A एक 3 × 3 कोटि का व्युत्क्रमणीय आव्यूह है जहाँ |A| = 4 है, तो इसके सहखंडज आव्यूह का सारणिक |adj(A)| क्या होगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Mathematics",
                chapterOrTopic = "Matrices & Determinants",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("16", "64", "4", "12"),
                optionsHindi = listOf("16", "64", "4", "12"),
                correctAnswerIndex = 0,
                explanation = "For an n × n square matrix, |adj(A)| = |A|^(n-1). Here n = 3, so |adj(A)| = |A|² = 4² = 16.",
                explanationHindi = "कोटि n के आव्यूह के लिए सूत्र: |adj(A)| = |A|^(n-1)। यहाँ n = 3 होने से |adj(A)| = 4^(3-1) = 4² = 16।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Mathematics", "Matrices")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_MATH_003",
                questionText = "Evaluate the limit: lim(x→0) [ (eˣ - 1 - x) / x² ].",
                questionTextHindi = "सीमा का मान ज्ञात कीजिए: lim(x→0) [ (eˣ - 1 - x) / x² ]।",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Mathematics",
                chapterOrTopic = "Limits & Continuity",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("1/2", "1", "0", "1/6"),
                optionsHindi = listOf("1/2", "1", "0", "1/6"),
                correctAnswerIndex = 0,
                explanation = "Using expansion eˣ = 1 + x + x²/2! + ...: (eˣ - 1 - x)/x² = (x²/2)/x² = 1/2 as x→0.",
                explanationHindi = "टेलर श्रेणी eˣ = 1 + x + x²/2! + ... रखने पर: सीमा lim(x→0) (x²/2)/x² = 1/2 प्राप्त होती है।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Mathematics", "Limits")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_MATH_004",
                questionText = "If a and b are unit vectors and |a + b| = √3, what is the angle θ between the two vectors?",
                questionTextHindi = "यदि a और b एकांक सदिश (unit vectors) हैं तथा |a + b| = √3 है, तो दोनों सदिशों के बीच का कोण θ क्या होगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Mathematics",
                chapterOrTopic = "Vector Algebra",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("π/3 (60°)", "π/6 (30°)", "π/2 (90°)", "2π/3 (120°)"),
                optionsHindi = listOf("π/3 (60°)", "π/6 (30°)", "π/2 (90°)", "2π/3 (120°)"),
                correctAnswerIndex = 0,
                explanation = "|a + b|² = |a|² + |b|² + 2|a||b|cos θ. 3 = 1 + 1 + 2cos θ => 2cos θ = 1 => cos θ = 1/2 => θ = π/3 (60°).",
                explanationHindi = "|a + b|² = 1 + 1 + 2cos θ = 3 => 2cos θ = 1 => cos θ = 1/2 => θ = 60° (π/3)।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Mathematics", "Vectors")
            )
        )

        list.add(
            Question(
                id = "Q_JEE_MATH_005",
                questionText = "If ω is a non-real complex cube root of unity, what is the value of (1 + ω - ω²)⁷ + (1 - ω + ω²)⁷?",
                questionTextHindi = "यदि ω इकाई का एक अवास्तविक घनमूल है, तो (1 + ω - ω²)⁷ + (1 - ω + ω²)⁷ का मान क्या होगा?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "JEE_MAIN_ADVANCED",
                examOrBoard = "JEE",
                targetClass = "Class 11-12",
                subject = "Mathematics",
                chapterOrTopic = "Complex Numbers",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("128", "-128", "0", "64"),
                optionsHindi = listOf("128", "-128", "0", "64"),
                correctAnswerIndex = 0,
                explanation = "Since 1 + ω + ω² = 0, 1 + ω = -ω² and 1 + ω² = -ω. Expression becomes (-2ω²)⁷ + (-2ω)⁷ = -128(ω¹⁴ + ω⁷) = -128(ω² + ω) = -128(-1) = 128.",
                explanationHindi = "चूँकि 1 + ω + ω² = 0 होता है, अतः 1+ω = -ω² तथा 1+ω² = -ω। मान रखने पर (-2ω²)⁷ + (-2ω)⁷ = -128(ω² + ω) = -128(-1) = 128।",
                negativeMarks = 1.0f,
                tags = listOf("JEE", "Mathematics", "Complex Numbers")
            )
        )

        // =============================================================
        // CATEGORY: SCHOOL_EDUCATION -> CBSE (CLASS 10 & 12 SUBJECT-WISE)
        // =============================================================
        list.add(
            Question(
                id = "Q_CBSE10_M_003",
                questionText = "In an Arithmetic Progression (AP), the first term a = 3 and common difference d = 4. What is the 10th term (a₁₀)?",
                questionTextHindi = "समान्तर श्रेढ़ी (AP) में प्रथम पद a = 3 तथा सार्व अंतर d = 4 है। इसका 10वाँ पद (a₁₀) क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Arithmetic Progressions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("39", "43", "36", "40"),
                optionsHindi = listOf("39", "43", "36", "40"),
                correctAnswerIndex = 0,
                explanation = "In an AP, an = a + (n - 1)d. For n = 10: a₁₀ = 3 + (10 - 1)*4 = 3 + 36 = 39.",
                explanationHindi = "समांतर श्रेढ़ी में an = a + (n - 1)d सूत्र से: a₁₀ = 3 + (10 - 1)×4 = 3 + 36 = 39।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics", "AP")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_004",
                questionText = "What is the HCF of 96 and 404 by prime factorisation method?",
                questionTextHindi = "अभाज्य गुणनखंड विधि द्वारा 96 और 404 का म.स.प. (HCF) क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Real Numbers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("4", "8", "2", "12"),
                optionsHindi = listOf("4", "8", "2", "12"),
                correctAnswerIndex = 0,
                explanation = "96 = 2⁵ × 3, 404 = 2² × 101. The common factor with lowest power is 2² = 4.",
                explanationHindi = "96 = 2⁵ × 3 तथा 404 = 2² × 101। उभयनिष्ठ गुणनखंड की न्यूनतम घात 2² = 4 है, अतः HCF = 4।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics", "Real Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_S_002",
                questionText = "The electrical resistance R of a uniform conductor of length L, cross-sectional area A and material resistivity ρ is given by:",
                questionTextHindi = "लम्बाई L, अनुप्रस्थ काट क्षेत्रफल A तथा पदार्थ की प्रतिरोधकता ρ वाले एकसमान चालक का विद्युत प्रतिरोध R किसके बराबर होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("R = ρ (L / A)", "R = ρ (A / L)", "R = ρ (L × A)", "R = ρ / (L × A)"),
                optionsHindi = listOf("R = ρ (L / A)", "R = ρ (A / L)", "R = ρ (L × A)", "R = ρ / (L × A)"),
                correctAnswerIndex = 0,
                explanation = "Resistance is directly proportional to conductor length L and inversely proportional to area A: R = ρ(L/A).",
                explanationHindi = "चालक का प्रतिरोध उसकी लम्बाई L के समानुपाती और क्षेत्रफल A के व्युत्क्रमानुपाती होता है: R = ρ(L/A)।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Science", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_S_003",
                questionText = "During aerobic cellular respiration in human cells, the complete breakdown of pyruvate occurs in which cellular organelle?",
                questionTextHindi = "मानव कोशिकाओं में वायवीय श्वसन के दौरान पाइरूवेट का विखंडन किस कोशिकांग में होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Life Processes",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Mitochondria", "Cytoplasm", "Chloroplast", "Golgi Body"),
                optionsHindi = listOf("माइटोकॉन्ड्रिया (Mitochondria)", "कोशिकाद्रव्य (Cytoplasm)", "हरितलवक", "गॉल्जीकाय"),
                correctAnswerIndex = 0,
                explanation = "Breakdown of pyruvate using oxygen to produce CO2, water and ATP energy occurs inside mitochondria.",
                explanationHindi = "ऑक्सीजन की उपस्थिति में पाइरूवेट का विखंडन माइटोकॉन्ड्रिया में होता है जिससे कार्बन डाइऑक्साइड, जल और अत्यधिक एटीपी ऊर्जा बनती है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Science", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_SS_001",
                questionText = "In CBSE Class 10 Social Science, which multipurpose river valley project is built on the Sutlej-Beas river basin?",
                questionTextHindi = "सीबीएसई कक्षा 10 सामाजिक विज्ञान: सतलुज-व्यास नदी बेसिन पर कौन सी बहुउद्देशीय नदी घाटी परियोजना बनी है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Water Resources",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Bhakra-Nangal Project", "Hirakud Project", "Damodar Valley Project", "Nagarjuna Sagar Project"),
                optionsHindi = listOf("भाखड़ा-नांगल परियोजना", "हीराकुंड परियोजना", "दामोदर घाटी परियोजना", "नागार्जुन सागर परियोजना"),
                correctAnswerIndex = 0,
                explanation = "The Bhakra-Nangal project is constructed on the Sutlej river basin for both hydel power production and irrigation in Punjab, Haryana and Rajasthan.",
                explanationHindi = "भाखड़ा-नांगल बांध सतलुज नदी पर बना है जो जल विद्युत उत्पादन और सिंचाई दोनों के लिए उपयोग में लाया जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Social Science", "Geography")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_HIN_001",
                questionText = "In CBSE Class 10 Hindi (Kshitij Part-2), in 'Surdas ke Pad', with what do the Gopis compare Uddhav's yoga message?",
                questionTextHindi = "सीबीएसई कक्षा 10 हिंदी (क्षितिज भाग-2): 'सूरदास के पद' में गोपियाँ उद्धव के ज्ञान और योग संदेश की तुलना किससे करती हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Surdas ke Pad",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("A bitter cucumber (कड़वी ककड़ी)", "A sweet mango", "A poisonous snake", "Cool nectar"),
                optionsHindi = listOf("कड़वी ककड़ी से", "मीठे आम से", "विषैले सर्प से", "शीतल अमृत से"),
                correctAnswerIndex = 0,
                explanation = "In Surdas ke Pad, Gopis state: 'सुनत जोग लागत है ऐसो, ज्यों करुई ककरी' (Hearing yoga sounds like eating a bitter cucumber).",
                explanationHindi = "गोपियाँ कहती हैं कि 'सुनत जोग लागत है ऐसो, ज्यों करुई ककरी' अर्थात् कृष्ण-प्रेम के समक्ष योग का संदेश उन्हें कड़वी ककड़ी के समान अरुचिकर लगता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Hindi", "Literature")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_ENG_001",
                questionText = "In CBSE Class 10 English First Flight, why did Lencho write a letter to God requesting 100 pesos?",
                questionTextHindi = "सीबीएसई कक्षा 10 अंग्रेजी पाठ 'A Letter to God' में लेंचो ने ईश्वर को 100 पेसो की मांग करते हुए पत्र क्यों लिखा था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "English",
                chapterOrTopic = "A Letter to God",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("His ripe corn fields were completely destroyed by a hailstorm", "He wanted to purchase a new tractor", "He had to pay land taxes", "He needed funds to build a brick house"),
                optionsHindi = listOf("ओलावृष्टि के कारण उसकी पकी हुई मक्के की फसल पूर्णतया नष्ट हो गई थी", "वह नया ट्रैक्टर खरीदना चाहता था", "उसे भूमि कर चुकाना था", "उसे पक्का मकान बनवाना था"),
                correctAnswerIndex = 0,
                explanation = "Lencho's entire harvest was destroyed by heavy hailstones, leaving his family with nothing to eat unless God helped him with 100 pesos to sow again.",
                explanationHindi = "लेंचो के खेत भारी ओलावृष्टि से तबाह हो गए थे। परिवार को भुखमरी से बचाने और दोबारा बुआई करने के लिए उसने ईश्वर से 100 पेसो मांगे।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "English")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_P_002",
                questionText = "What is the SI unit of electric flux (Φ_E) in CBSE Class 12 Physics?",
                questionTextHindi = "सीबीएसई कक्षा 12 भौतिकी: विद्युत फ्लक्स (Φ_E) का SI मात्रक क्या होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "Physics",
                chapterOrTopic = "Electrostatics",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Volt-metre (V·m) or N·m²/C", "Volt / metre", "Newton / Coulomb", "Tesla·m²"),
                optionsHindi = listOf("वोल्ट-मीटर (V·m) अथवा N·m²/C", "वोल्ट / मीटर", "न्यूटन / कूलॉम", "टेस्ला·m²"),
                correctAnswerIndex = 0,
                explanation = "Electric flux Φ_E = E * A. Unit of E is N/C or V/m, so flux unit is (V/m) * m² = V·m or N·m²/C.",
                explanationHindi = "विद्युत फ्लक्स Φ = E·A होता है। E का मात्रक V/m होने से फ्लक्स का SI मात्रक V·m (वोल्ट-मीटर) या N·m²/C होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_C_001",
                questionText = "According to Raoult's law, the relative lowering of vapour pressure of a dilute solution containing non-volatile solute is equal to:",
                questionTextHindi = "राउल्ट के नियमानुसार, अवाष्पशील विलेय युक्त तनु विलयन के वाष्प दाब का आपेक्षिक अवनमन किसके बराबर होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "Chemistry",
                chapterOrTopic = "Solutions",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Mole fraction of the solute", "Mole fraction of the solvent", "Molarity of the solution", "Molality of the solution"),
                optionsHindi = listOf("विलेय के मोल प्रभाज (Mole fraction)", "विलायक के मोल प्रभाज", "विलयन की मोलरता", "विलयन की मोललता"),
                correctAnswerIndex = 0,
                explanation = "Raoult's law states that (P° - P) / P° = x_solute, i.e., relative lowering of vapour pressure equals the mole fraction of the solute.",
                explanationHindi = "राउल्ट के नियमानुसार: (P° - P)/P° = x_विलेय, अर्थात् वाष्प दाब का आपेक्षिक अवनमन विलेय के मोल अंश के बराबर होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_B_001",
                questionText = "Which enzyme is primarily responsible for unwinding and unzipping the DNA double helix during replication?",
                questionTextHindi = "डीएनए प्रतिकृति (replication) के दौरान द्विकुंडलिनी के दोनों रज्जुकों को खोलने और अलग करने का कार्य मुख्य रूप से कौन सा एंजाइम करता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "Biology",
                chapterOrTopic = "Molecular Basis of Inheritance",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("DNA Helicase", "DNA Polymerase", "DNA Ligase", "RNA Primase"),
                optionsHindi = listOf("डीएनए हेलिकेज (Helicase)", "डीएनए पॉलीमरेज", "डीएनए लाइगेज", "आरएनए प्राइमेज"),
                correctAnswerIndex = 0,
                explanation = "Helicase unwinds the double-stranded DNA by breaking the hydrogen bonds between complementary base pairs.",
                explanationHindi = "हेलिकेज एंजाइम पूरक क्षारकों के बीच हाइड्रोजन बंधों को तोड़कर डीएनए द्विकुंडलिनी को खोलता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_M_001",
                questionText = "If A is a square matrix such that its transpose A' = -A, then matrix A is formally classified as a:",
                questionTextHindi = "यदि A एक वर्ग आव्यूह है जहाँ इसका परिवर्त A' = -A है, तो आव्यूह A को क्या कहा जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "Mathematics",
                chapterOrTopic = "Matrices",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Skew-symmetric matrix", "Symmetric matrix", "Orthogonal matrix", "Idempotent matrix"),
                optionsHindi = listOf("विषम सममित आव्यूह (Skew-symmetric)", "सममित आव्यूह (Symmetric)", "लांबिक आव्यूह", "वर्गसम आव्यूह"),
                correctAnswerIndex = 0,
                explanation = "A square matrix A is skew-symmetric if A' = -A. The diagonal elements of a skew-symmetric matrix are always all zero.",
                explanationHindi = "यदि A' = -A हो तो आव्यूह विषम सममित (Skew-symmetric) कहलाता है। इसके मुख्य विकर्ण के सभी अवयव शून्य होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE12_ENG_001",
                questionText = "In CBSE Class 12 Flamingo, in 'The Last Lesson' by Alphonse Daudet, which language teacher was M. Hamel?",
                questionTextHindi = "सीबीएसई कक्षा 12 अंग्रेजी 'The Last Lesson' में एम. हैमेल किस भाषा के समर्पित अध्यापक थे?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 12",
                subject = "English",
                chapterOrTopic = "The Last Lesson",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("French", "German", "English", "Spanish"),
                optionsHindi = listOf("फ्रेंच (French)", "जर्मन", "अंग्रेजी", "स्पेनिश"),
                correctAnswerIndex = 0,
                explanation = "M. Hamel had taught French in the school for 40 years before an order from Berlin imposed German in the schools of Alsace and Lorraine.",
                explanationHindi = "एम. हैमेल 40 वर्षों से फ्रेंच भाषा पढ़ा रहे थे। बर्लिन के आदेशानुसार अलसास और लॉरेन के विद्यालयों में जर्मन भाषा लागू की गई थी।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 12", "English")
            )
        )

        // =============================================================
        // CATEGORY: SCHOOL_EDUCATION -> RBSE (CLASS 10 & 12 SUBJECT-WISE)
        // =============================================================
        list.add(
            Question(
                id = "Q_RBSE10_M_002",
                questionText = "In RBSE Class 10 Mathematics, what is the distance between origin (0, 0) and point (6, 8) on the Cartesian coordinate plane?",
                questionTextHindi = "आरबीएसई कक्षा 10 गणित: निर्देशांक ज्यामिति में मूल बिंदु (0, 0) और बिंदु (6, 8) के बीच की दूरी क्या होगी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Coordinate Geometry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("10 units", "14 units", "8 units", "12 units"),
                optionsHindi = listOf("10 मात्रक", "14 मात्रक", "8 मात्रक", "12 मात्रक"),
                correctAnswerIndex = 0,
                explanation = "Distance from origin d = √(x² + y²) = √(6² + 8²) = √(36 + 64) = √100 = 10 units.",
                explanationHindi = "दूरी सूत्र: d = √(x² + y²) = √(36 + 64) = √100 = 10 मात्रक।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_S_001",
                questionText = "What is the chemical name and formula of Baking Soda widely studied in RBSE Class 10 Science?",
                questionTextHindi = "आरबीएसई कक्षा 10 विज्ञान के अनुसार बेकिंग सोडा (मीठा सोडा) का रासायनिक नाम एवं सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Acids, Bases & Salts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Sodium hydrogen carbonate (NaHCO₃)", "Sodium carbonate decahydrate (Na₂CO₃·10H₂O)", "Calcium oxychloride (CaOCl₂)", "Sodium hydroxide (NaOH)"),
                optionsHindi = listOf("सोडियम हाइड्रोजन कार्बोनेट (NaHCO₃)", "सोडियम कार्बोनेट (Na₂CO₃·10H₂O)", "कैल्शियम ऑक्सीक्लोराइड (CaOCl₂)", "सोडियम हाइड्रॉक्साइड (NaOH)"),
                correctAnswerIndex = 0,
                explanation = "Baking soda is sodium hydrogen carbonate (NaHCO₃). On heating during baking, it releases CO₂ gas which makes bread fluffy.",
                explanationHindi = "बेकिंग सोडा का रासायनिक नाम सोडियम हाइड्रोजन कार्बोनेट (NaHCO₃) है। गर्म करने पर यह CO₂ गैस मुक्त करता है जिससे केक व ब्रेड स्पंजी बनते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Science", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_S_002",
                questionText = "Which endocrine gland in the human body secretes insulin hormone to regulate blood glucose levels?",
                questionTextHindi = "मानव शरीर की कौन सी ग्रंथि रक्त शर्करा को नियंत्रित करने वाले इंसुलिन हार्मोन का स्राव करती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Control and Coordination",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Pancreas (Islets of Langerhans)", "Thyroid Gland", "Pituitary Gland", "Adrenal Gland"),
                optionsHindi = listOf("अग्न्याशय (Pancreas)", "थायरॉयड ग्रंथि", "पीयूष ग्रंथि", "अधिवृक्क ग्रंथि"),
                correctAnswerIndex = 0,
                explanation = "The beta cells of the Islets of Langerhans in the pancreas secrete insulin, deficiency of which leads to diabetes mellitus.",
                explanationHindi = "अग्न्याशय के लैंगरहैंस द्वीपसमूह की बीटा कोशिकाएं इंसुलिन हार्मोन बनाती हैं, जिसकी कमी से मधुमेह (डायबिटीज) रोग हो जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Science", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_SS_002",
                questionText = "In Rajasthan History, the famous Battle of Haldighati took place in which year between Maharana Pratap and the Mughal forces?",
                questionTextHindi = "राजस्थान इतिहास में महाराणा प्रताप और मुगलों के बीच प्रसिद्ध 'हल्दीघाटी का ऐतिहासिक युद्ध' किस वर्ष लड़ा गया था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Rajasthan History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1576 AD", "1527 AD", "1544 AD", "1582 AD"),
                optionsHindi = listOf("1576 ई.", "1527 ई. (खानवा)", "1544 ई. (गिरी सुमेल)", "1582 ई. (दिवेर)"),
                correctAnswerIndex = 0,
                explanation = "The Battle of Haldighati was fought on 18 June 1576 between Maharana Pratap of Mewar and the Mughal army commanded by Man Singh I of Amber.",
                explanationHindi = "हल्दीघाटी का युद्ध 18 जून 1576 को मेवाड़ के वीर शिरोमणि महाराणा प्रताप और आमेर के मानसिंह के नेतृत्व वाली मुगल सेना के मध्य लड़ा गया था।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Social Science", "History")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_HIN_001",
                questionText = "In RBSE Class 10 Hindi (Kshitij Part-2), 'Ram-Lakshman-Parashuram Samvad' composed by Tulsidas is part of which epic kanda?",
                questionTextHindi = "आरबीएसई कक्षा 10 हिंदी (क्षितिज भाग-2): महाकवि तुलसीदास द्वारा रचित 'राम-लक्ष्मण-परशुराम संवाद' किस कांड से उद्धृत है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Ram-Lakshman-Parashuram Samvad",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Balkanda (बालकांड)", "Ayodhyakanda", "Aranyakanda", "Sundarkanda"),
                optionsHindi = listOf("बालकांड (रामचरितमानस)", "अयोध्याकांड", "अरण्यकांड", "सुंदरकांड"),
                correctAnswerIndex = 0,
                explanation = "The dialogue between Parashuram, Lakshman and Ram after the breaking of Shiva's bow in Janakpuri is from Balkanda of Ramcharitmanas.",
                explanationHindi = "शिव धनुष टूटने पर परशुराम के क्रोध और लक्ष्मण के साथ संवाद का वर्णन रामचरितमानस के बालकांड में किया गया है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Hindi")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_P_001",
                questionText = "Kirchhoff's First Rule (Junction Rule / Current Law) in RBSE Class 12 Physics is based on the conservation of which quantity?",
                questionTextHindi = "आरबीएसई कक्षा 12 भौतिकी: किरचॉफ का प्रथम नियम (संधि नियम / धारा नियम) किस भौतिक राशि के संरक्षण पर आधारित है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Physics",
                chapterOrTopic = "Current Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Electric Charge", "Energy", "Linear Momentum", "Angular Momentum"),
                optionsHindi = listOf("विद्युत आवेश (Charge)", "ऊर्जा (Energy)", "रेखीय संवेग", "कोणीय संवेग"),
                correctAnswerIndex = 0,
                explanation = "Kirchhoff's junction rule states that total current entering a junction equals total current leaving it, conserving electric charge.",
                explanationHindi = "किरचॉफ का संधि नियम (ΣI = 0) आवेश संरक्षण के नियम पर आधारित है क्योंकि संधि पर आवेश संचित नहीं हो सकता।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_P_002",
                questionText = "What is the SI unit of permittivity of free space (ε₀) in RBSE Class 12 Physics?",
                questionTextHindi = "आरबीएसई कक्षा 12 भौतिकी: निर्वात की विद्युतशीलता (ε₀) का SI मात्रक क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Physics",
                chapterOrTopic = "Electrostatics",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("C² N⁻¹ m⁻² (or Farad/metre)", "N m² C⁻²", "Farad / metre²", "Volt metre"),
                optionsHindi = listOf("C² N⁻¹ m⁻² (या Farad/metre)", "N m² C⁻²", "Farad / metre²", "Volt metre"),
                correctAnswerIndex = 0,
                explanation = "From Coulomb's Law F = (1 / 4πε₀) * (q₁q₂ / r²), ε₀ = q₁q₂ / (4π F r²), hence unit is C²/(N·m²) or Farad/m.",
                explanationHindi = "कूलॉम के नियम से: ε₀ = q₁q₂ / (4π F r²)। अतः इसका SI मात्रक C² N⁻¹ m⁻² या फैरड/मीटर (F/m) होता है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_C_001",
                questionText = "In solid-state chemistry, a solid possessing long-range order of constituent particles and a sharp melting point is called:",
                questionTextHindi = "आरबीएसई कक्षा 12 रसायन: अवयवी कणों की दीर्घ परासी व्यवस्था तथा निश्चित गलनांक वाला ठोस क्या कहलाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Chemistry",
                chapterOrTopic = "Solid State",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Crystalline Solid", "Amorphous Solid", "Polymeric Solid", "Colloidal Solid"),
                optionsHindi = listOf("क्रिस्टलीय ठोस (Crystalline)", "अक्रिस्टलीय ठोस (Amorphous)", "बहुलकीय ठोस", "कोलॉइडी ठोस"),
                correctAnswerIndex = 0,
                explanation = "Crystalline solids have a regular three-dimensional geometric arrangement of constituent particles with long-range order and sharp melting points.",
                explanationHindi = "क्रिस्टलीय ठोसों में घटक कणों (परमाणु, अणु या आयन) की एक निश्चित एवं नियमित दीर्घ परासी व्यवस्था पाई जाती है तथा इनका गलनांक तीक्ष्ण होता है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_C_002",
                questionText = "How many chiral (asymmetric) carbon atoms are present in an open chain D-(+)-glucose molecule?",
                questionTextHindi = "D-(+)-ग्लूकोज के विवृत श्रृंखला (open chain) अणु में कितने असममित (किरल) कार्बन परमाणु उपस्थित होते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Chemistry",
                chapterOrTopic = "Biomolecules",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("4", "3", "5", "6"),
                optionsHindi = listOf("4 (C-2, C-3, C-4, C-5)", "3", "5", "6"),
                correctAnswerIndex = 0,
                explanation = "In open-chain glucose CHO-(CHOH)₄-CH₂OH, carbons at positions 2, 3, 4, and 5 are each bonded to 4 different groups, making 4 chiral carbons.",
                explanationHindi = "ग्लूकोज की खुली श्रृंखला में कार्बन संख्या 2, 3, 4 और 5 चार भिन्न समूहों से जुड़े होते हैं, अतः इसमें 4 किरल (असममित) कार्बन परमाणु होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_B_001",
                questionText = "According to the Watson-Crick B-DNA double helix model, what is the length of one complete helical turn (pitch)?",
                questionTextHindi = "आरबीएसई कक्षा 12 जीव विज्ञान: वाटसन एवं क्रिक के B-DNA मॉडल के अनुसार डीएनए के एक पूर्ण घुमाव (pitch) की लम्बाई कितनी होती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Biology",
                chapterOrTopic = "Molecular Genetics",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("3.4 nm (34 Å)", "2.0 nm (20 Å)", "0.34 nm (3.4 Å)", "34 nm"),
                optionsHindi = listOf("3.4 nm (34 Å)", "2.0 nm (20 Å)", "0.34 nm (3.4 Å)", "34 nm"),
                correctAnswerIndex = 0,
                explanation = "In B-DNA, one complete turn of the helix contains 10 base pairs, spanning a pitch distance of 3.4 nm (34 Å).",
                explanationHindi = "B-DNA की कुंडली के एक पूर्ण घुमाव में 10 क्षारक युग्म होते हैं तथा इसकी लम्बाई 3.4 nm (34 Å) होती है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_M_001",
                questionText = "In RBSE Class 12 Mathematics, what is the integral: ∫ eˣ (sin x + cos x) dx?",
                questionTextHindi = "आरबीएसई कक्षा 12 गणित: समाकलन ∫ eˣ (sin x + cos x) dx का मान क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Mathematics",
                chapterOrTopic = "Integrals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("eˣ sin x + C", "eˣ cos x + C", "eˣ (sin x - cos x) + C", "-eˣ cos x + C"),
                optionsHindi = listOf("eˣ sin x + C", "eˣ cos x + C", "eˣ (sin x - cos x) + C", "-eˣ cos x + C"),
                correctAnswerIndex = 0,
                explanation = "Using the standard formula ∫ eˣ [f(x) + f'(x)] dx = eˣ f(x) + C. Here f(x) = sin x and f'(x) = cos x, so result is eˣ sin x + C.",
                explanationHindi = "मानक सूत्र ∫ eˣ [f(x) + f'(x)] dx = eˣ f(x) + C का प्रयोग करने पर: यहाँ f(x) = sin x तथा f'(x) = cos x है, अतः उत्तर eˣ sin x + C है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE12_HIN_001",
                questionText = "In RBSE Class 12 Hindi (Aroh Part-2), who is the celebrated poet of 'Aatma-Parichay' and 'Din Jaldi-Jaldi Dhalta Hai'?",
                questionTextHindi = "आरबीएसई कक्षा 12 अनिवार्य हिंदी (आरोह भाग-2): प्रसिद्ध कविता 'आत्मपरिचय' एवं गीत 'दिन जल्दी-जल्दी ढलता है' के कवि कौन हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 12",
                subject = "Hindi",
                chapterOrTopic = "Aatma-Parichay",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Harivansh Rai Bachchan", "Alok Dhanwa", "Kunwar Narayan", "Raghuvir Sahay"),
                optionsHindi = listOf("हरिवंश राय बच्चन", "आलोक धन्वा", "कुंवर नारायण", "रघुवीर सहाय"),
                correctAnswerIndex = 0,
                explanation = "Dr. Harivansh Rai Bachchan penned 'Aatma-Parichay' expressing personal philosophy and romance in his distinct Halaawad style.",
                explanationHindi = "छायावादोत्तर काल में हालावाद के प्रवर्तक कवि डॉ. हरिवंश राय बच्चन ने 'आत्मपरिचय' तथा 'दिन जल्दी-जल्दी ढलता है' की रचना की है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 12", "Hindi")
            )
        )


        // =============================================================
        // CATEGORY: SCHOOL_EDUCATION -> CBSE (CLASS 1 TO 9 STUDENTS)
        // =============================================================
        list.add(
            Question(
                id = "Q_CBSE_C1_M_001",
                questionText = "What is the sum of 5 and 7? (5 + 7 = ?)",
                questionTextHindi = "संख्या 5 और 7 का योग क्या होगा? (5 + 7 = ?)",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 1",
                subject = "Mathematics",
                chapterOrTopic = "Addition",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("12", "11", "13", "10"),
                optionsHindi = listOf("12", "11", "13", "10"),
                correctAnswerIndex = 0,
                explanation = "Adding 5 and 7: 5 + 7 = 12.",
                explanationHindi = "5 में 7 जोड़ने पर: 5 + 7 = 12 प्राप्त होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 1", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C2_M_001",
                questionText = "How many straight sides and corners does a triangle have?",
                questionTextHindi = "एक त्रिभुज (Triangle) में कितनी सीधी भुजाएँ और कोने होते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 2",
                subject = "Mathematics",
                chapterOrTopic = "Shapes & Geometry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("3 sides and 3 corners", "4 sides and 4 corners", "2 sides and 2 corners", "5 sides and 5 corners"),
                optionsHindi = listOf("3 भुजाएं और 3 कोने", "4 भुजाएं और 4 कोने", "2 भुजाएं और 2 कोने", "5 भुजाएं और 5 कोने"),
                correctAnswerIndex = 0,
                explanation = "A triangle is a 3-sided polygon with exactly 3 straight edges and 3 vertices (corners).",
                explanationHindi = "त्रिभुज तीन सीधी भुजाओं से घिरी आकृति होती है जिसमें 3 शीर्ष (कोने) होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 2", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C3_S_001",
                questionText = "Which essential part of a plant grows under the soil and absorbs water and minerals?",
                questionTextHindi = "पौधे का कौन सा भाग मिट्टी के नीचे बढ़ता है तथा जल और पोषक तत्वों को अवशोषित करता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 3",
                subject = "Science",
                chapterOrTopic = "Plant Parts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Roots (जड़ें)", "Leaves (पत्तियां)", "Flowers (फूल)", "Stem (तना)"),
                optionsHindi = listOf("जड़ें (Roots)", "पत्तियां (Leaves)", "फूल (Flowers)", "तना (Stem)"),
                correctAnswerIndex = 0,
                explanation = "Roots anchor the plant firmly in the soil and absorb water and minerals required for growth.",
                explanationHindi = "जड़ें पौधे को मिट्टी में स्थिरता प्रदान करती हैं और भूमि से जल तथा खनिज लवणों का अवशोषण करती हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 3", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C3_M_001",
                questionText = "In the three-digit number 458, what is the place value of the digit 5?",
                questionTextHindi = "तीन अंकों की संख्या 458 में अंक 5 का स्थानीय मान (Place Value) क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 3",
                subject = "Mathematics",
                chapterOrTopic = "Place Value",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("50 (Tens place)", "5 (Ones place)", "500 (Hundreds place)", "58"),
                optionsHindi = listOf("50 (दहाई का अंक)", "5 (इकाई का अंक)", "500 (सैकड़ा)", "58"),
                correctAnswerIndex = 0,
                explanation = "The digit 5 is at the tens position, so its place value is 5 × 10 = 50.",
                explanationHindi = "अंक 5 दहाई के स्थान पर है, अतः इसका स्थानीय मान 5 × 10 = 50 है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 3", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C4_M_001",
                questionText = "What fraction represents 'three quarters' of a whole circle?",
                questionTextHindi = "किसी संपूर्ण वृत्त के 'तीन-चौथाई' भाग को कौन सी भिन्न दर्शाती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 4",
                subject = "Mathematics",
                chapterOrTopic = "Fractions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("3/4", "1/4", "1/2", "2/3"),
                optionsHindi = listOf("3/4 (तीन चौथाई)", "1/4 (एक चौथाई)", "1/2 (आधा)", "2/3"),
                correctAnswerIndex = 0,
                explanation = "Three quarters means 3 parts out of 4 equal parts, written as 3/4.",
                explanationHindi = "चार बराबर भागों में से तीन भाग लेने पर उसे तीन-चौथाई अर्थात् 3/4 लिखा जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 4", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C4_S_001",
                questionText = "Which type of sharp, pointed teeth in humans are primarily used for tearing food?",
                questionTextHindi = "मानव मुख में भोजन को चीरने-फाड़ने के लिए कौन से नुकीले दांत होते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 4",
                subject = "Science",
                chapterOrTopic = "Teeth and Digestion",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Canines (रदनक)", "Incisors (कृंतक)", "Molars (चर्वणक)", "Premolars (अग्रचर्वणक)"),
                optionsHindi = listOf("रदनक (Canines)", "कृंतक (Incisors - काटने वाले)", "चर्वणक (Molars - चबाने वाले)", "अग्रचर्वणक (Premolars)"),
                correctAnswerIndex = 0,
                explanation = "Canines are sharp, pointed teeth positioned beside incisors, designed for tearing tough food items.",
                explanationHindi = "रदनक (Canines) नुकीले दांत होते हैं जिनका मुख्य कार्य भोजन को चीरना-फाड़ना होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 4", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C5_M_001",
                questionText = "What is the perimeter of a rectangular playground having length 15 metres and breadth 10 metres?",
                questionTextHindi = "15 मीटर लम्बाई और 10 मीटर चौड़ाई वाले आयताकार खेल के मैदान का परिमाप क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 5",
                subject = "Mathematics",
                chapterOrTopic = "Perimeter and Area",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("50 metres", "150 sq metres", "25 metres", "60 metres"),
                optionsHindi = listOf("50 मीटर", "150 वर्ग मीटर (क्षेत्रफल)", "25 मीटर", "60 मीटर"),
                correctAnswerIndex = 0,
                explanation = "Perimeter of rectangle = 2 × (Length + Breadth) = 2 × (15 + 10) = 2 × 25 = 50 metres.",
                explanationHindi = "आयत का परिमाप = 2 × (लम्बाई + चौड़ाई) = 2 × (15 + 10) = 2 × 25 = 50 मीटर।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 5", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C5_S_001",
                questionText = "Which vital gas do green plants absorb from the atmosphere to prepare food during photosynthesis?",
                questionTextHindi = "प्रकाश संश्लेषण के दौरान हरे पौधे भोजन बनाने के लिए वायुमंडल से कौन सी गैस ग्रहण करते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 5",
                subject = "Science",
                chapterOrTopic = "Plant Food",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Carbon Dioxide (CO₂)", "Oxygen (O₂)", "Nitrogen (N₂)", "Hydrogen (H₂)"),
                optionsHindi = listOf("कार्बन डाइऑक्साइड (CO₂)", "ऑक्सीजन (O₂)", "नाइट्रोजन (N₂)", "हाइड्रोजन"),
                correctAnswerIndex = 0,
                explanation = "Green plants absorb carbon dioxide gas through stomata and release oxygen during photosynthesis.",
                explanationHindi = "पौधे पत्तियों के रंध्रों द्वारा कार्बन डाइऑक्साइड लेते हैं और बदले में प्राणवायु ऑक्सीजन छोड़ते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 5", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C6_M_001",
                questionText = "Which number is both the smallest prime number and the only even prime number?",
                questionTextHindi = "सबसे छोटी अभाज्य संख्या तथा एकमात्र सम अभाज्य संख्या कौन सी है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 6",
                subject = "Mathematics",
                chapterOrTopic = "Playing with Numbers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("2", "1", "3", "4"),
                optionsHindi = listOf("2", "1 (न भाज्य न अभाज्य)", "3 (विषम अभाज्य)", "4 (सबसे छोटी भाज्य)"),
                correctAnswerIndex = 0,
                explanation = "2 has exactly two factors (1 and 2), making it the smallest and only even prime number.",
                explanationHindi = "2 के केवल दो गुणनखंड (1 और 2) होते हैं, अतः यह सबसे छोटी तथा एकमात्र सम अभाज्य संख्या है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 6", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C6_S_001",
                questionText = "Objects that do not allow any light to pass through them and cast dark shadows are classified as:",
                questionTextHindi = "वे वस्तुएं जो अपने में से प्रकाश को बिल्कुल आर-पार नहीं जाने देतीं और गहरी छाया बनाती हैं, क्या कहलाती हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 6",
                subject = "Science",
                chapterOrTopic = "Light, Shadows and Reflections",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Opaque objects (अपारदर्शी)", "Transparent objects (पारदर्शी)", "Translucent objects (पारभासी)", "Luminous objects (दीप्त)"),
                optionsHindi = listOf("अपारदर्शी वस्तुएं (Opaque)", "पारदर्शी वस्तुएं (Transparent)", "पारभासी वस्तुएं (Translucent)", "दीप्त वस्तुएं"),
                correctAnswerIndex = 0,
                explanation = "Opaque materials completely block light rays, creating a dark region called shadow behind them.",
                explanationHindi = "अपारदर्शी वस्तुएं प्रकाश को रोक लेती हैं जिससे उनके पीछे स्पष्ट छाया का निर्माण होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 6", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C7_S_001",
                questionText = "Which green pigment present in chloroplasts captures sunlight energy during photosynthesis in plants?",
                questionTextHindi = "पौधों में प्रकाश संश्लेषण हेतु सूर्य के प्रकाश को अवशोषित करने वाला हरा वर्णक क्या कहलाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 7",
                subject = "Science",
                chapterOrTopic = "Nutrition in Plants",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Chlorophyll (क्लोरोफिल)", "Carotene", "Xanthophyll", "Hemoglobin"),
                optionsHindi = listOf("क्लोरोफिल (पर्णहरित)", "कैरोटीन", "जैंथोफिल", "हीमोग्लोबिन"),
                correctAnswerIndex = 0,
                explanation = "Chlorophyll in plant leaves traps solar energy to convert water and carbon dioxide into glucose.",
                explanationHindi = "क्लोरोफिल (पर्णहरित) सूर्य के प्रकाश की ऊर्जा को अवशोषित करके प्रकाश संश्लेषण की क्रिया संपन्न करता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 7", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C7_M_001",
                questionText = "What is the product of two negative integers: (-6) × (-8)?",
                questionTextHindi = "दो ऋणात्मक पूर्णांकों (-6) × (-8) का गुणनफल क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 7",
                subject = "Mathematics",
                chapterOrTopic = "Integers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("+48", "-48", "+14", "-14"),
                optionsHindi = listOf("+48", "-48", "+14", "-14"),
                correctAnswerIndex = 0,
                explanation = "Multiplying two negative numbers always yields a positive number: (-6) × (-8) = +48.",
                explanationHindi = "समान चिन्ह वाले दो ऋणात्मक पूर्णांकों का गुणनफल सदैव धनात्मक होता है: (-6) × (-8) = +48।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 7", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C8_S_001",
                questionText = "Which is the only non-metal element that exists in liquid state at normal room temperature?",
                questionTextHindi = "कमरे के सामान्य ताप पर द्रव (liquid) अवस्था में पाई जाने वाली एकमात्र अधातु कौन सी है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 8",
                subject = "Science",
                chapterOrTopic = "Materials: Metals and Non-Metals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Bromine (ब्रोमीन)", "Mercury (पारा)", "Iodine (आयोडीन)", "Chlorine (क्लोरीन)"),
                optionsHindi = listOf("ब्रोमीन (Bromine - अधातु)", "पारा (Mercury - द्रव धातु)", "आयोडीन (चमकीली ठोस अधातु)", "क्लोरीन (गैस)"),
                correctAnswerIndex = 0,
                explanation = "Bromine (Br) is the only non-metal that is liquid at room temperature (Mercury is a metal).",
                explanationHindi = "ब्रोमीन एकमात्र ऐसी अधातु है जो कमरे के सामान्य ताप पर लाल-भूरे रंग के द्रव के रूप में पाई जाती है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 8", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C8_M_001",
                questionText = "Solve the linear equation for x: 3x - 7 = 14. What is the value of x?",
                questionTextHindi = "एक चर वाले रैखिक समीकरण को हल कीजिए: 3x - 7 = 14। x का मान क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 8",
                subject = "Mathematics",
                chapterOrTopic = "Linear Equations in One Variable",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("x = 7", "x = 6", "x = 8", "x = 21"),
                optionsHindi = listOf("x = 7", "x = 6", "x = 8", "x = 21"),
                correctAnswerIndex = 0,
                explanation = "3x - 7 = 14 => 3x = 14 + 7 = 21 => x = 21 / 3 = 7.",
                explanationHindi = "3x - 7 = 14 => 3x = 14 + 7 = 21 => x = 21/3 = 7।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 8", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C9_M_001",
                questionText = "According to standard algebraic identities in CBSE Class 9, what is the expansion of (a + b)²?",
                questionTextHindi = "कक्षा 9 बीजगणित की मानक सर्वसमिका के अनुसार (a + b)² का सही विस्तार क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 9",
                subject = "Mathematics",
                chapterOrTopic = "Polynomials",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("a² + 2ab + b²", "a² + b²", "a² - 2ab + b²", "a² + ab + b²"),
                optionsHindi = listOf("a² + 2ab + b²", "a² + b²", "a² - 2ab + b²", "a² + ab + b²"),
                correctAnswerIndex = 0,
                explanation = "(a + b)² = (a + b)(a + b) = a² + ab + ba + b² = a² + 2ab + b².",
                explanationHindi = "(a + b)² = a² + 2ab + b² एक प्रसिद्ध मूलभूत बीजगणितीय सर्वसमिका है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 9", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C9_S_001",
                questionText = "According to Newton's Second Law of Motion in Class 9 Physics, Force (F) acting on an object equals:",
                questionTextHindi = "कक्षा 9 भौतिकी: न्यूटन के गति के द्वितीय नियमानुसार किसी वस्तु पर लगने वाला बल (F) किसके बराबर होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 9",
                subject = "Science",
                chapterOrTopic = "Force and Laws of Motion",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mass × Acceleration (F = m × a)", "Mass / Acceleration", "Velocity / Time", "Mass × Velocity"),
                optionsHindi = listOf("द्रव्यमान × त्वरण (F = m × a)", "द्रव्यमान ÷ त्वरण", "वेग ÷ समय", "द्रव्यमान × वेग (संवेग)"),
                correctAnswerIndex = 0,
                explanation = "Newton's Second Law states that force equals mass times acceleration: F = ma.",
                explanationHindi = "न्यूटन के गति के द्वितीय नियमानुसार बल = द्रव्यमान × त्वरण (F = ma) होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 9", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE_C9_SS_001",
                questionText = "In Class 9 Social Science, the historic French Revolution began in which year with the storming of the Bastille prison?",
                questionTextHindi = "कक्षा 9 सामाजिक विज्ञान: बास्तील दुर्ग के पतन के साथ प्रसिद्ध फ्रांसीसी क्रांति किस वर्ष आरंभ हुई थी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 9",
                subject = "Social Science",
                chapterOrTopic = "The French Revolution",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1789 AD", "1776 AD", "1799 AD", "1815 AD"),
                optionsHindi = listOf("1789 ई.", "1776 ई. (अमेरिकी स्वतंत्रता)", "1799 ई.", "1815 ई. (वाटरलू)"),
                correctAnswerIndex = 0,
                explanation = "The French Revolution broke out on July 14, 1789 when citizens stormed the royal fortress prison of the Bastille.",
                explanationHindi = "14 जुलाई 1789 को बास्तील दुर्ग पर जनता के आक्रमण के साथ फ्रांसीसी क्रांति का सूत्रपात हुआ था।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 9", "Social Science")
            )
        )

        // =============================================================
        // CATEGORY: SCHOOL_EDUCATION -> RBSE (CLASS 1 TO 9 STUDENTS)
        // =============================================================
        list.add(
            Question(
                id = "Q_RBSE_C3_EVS_001",
                questionText = "Which animal is officially designated as the State Animal of Rajasthan (domestic/livestock category)?",
                questionTextHindi = "राजस्थान का राज्य पशु (पशुधन / घरेलू श्रेणी) किसे घोषित किया गया है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 3",
                subject = "Science",
                chapterOrTopic = "Our Environment",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Camel (ऊंट)", "Elephant (हाथी)", "Horse (घोड़ा)", "Cow (गाय)"),
                optionsHindi = listOf("ऊंट (Camel - 2014 में घोषित)", "हाथी", "घोड़ा", "गाय"),
                correctAnswerIndex = 0,
                explanation = "The Camel was declared the state livestock animal of Rajasthan in 2014, while Chinkara is the wildlife state animal.",
                explanationHindi = "वर्ष 2014 में ऊंट को राजस्थान का राज्य पशु (पशुधन श्रेणी) घोषित किया गया। वन्यजीव श्रेणी में चिंकारा राज्य पशु है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 3", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C4_EVS_001",
                questionText = "Which tree, celebrated as the 'Kalpavriksha of the Desert', is the official State Tree of Rajasthan?",
                questionTextHindi = "राजस्थान का कल्पवृक्ष कहे जाने वाले 'राज्य वृक्ष' का नाम क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 4",
                subject = "Science",
                chapterOrTopic = "Trees of Rajasthan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Khejri (खेजड़ी - Prosopis cineraria)", "Rohida (रोहिड़ा - राज्य पुष्प)", "Banyan (बरगद)", "Peepal (पीपल)"),
                optionsHindi = listOf("खेजड़ी (Khejri - शमी वृक्ष)", "रोहिड़ा (राज्य पुष्प)", "बरगद (राष्ट्रीय वृक्ष)", "पीपल"),
                correctAnswerIndex = 0,
                explanation = "Khejri (Prosopis cineraria) is the state tree of Rajasthan, revered for its drought resistance and medicinal value.",
                explanationHindi = "खेजड़ी (जांटी / शमी) को 1983 में राजस्थान का राज्य वृक्ष घोषित किया गया, इसे थार का कल्पवृक्ष कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 4", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C5_EVS_001",
                questionText = "In 1730 AD, Amrita Devi Bishnoi led 363 people to sacrifice their lives to protect Khejri trees in which Rajasthan district?",
                questionTextHindi = "पर्यावरण व खेजड़ी वृक्षों की रक्षा के लिए अमृता देवी के नेतृत्व में 363 लोगों का अमर बलिदान किस जिले के गांव में हुआ था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 5",
                subject = "Social Science",
                chapterOrTopic = "Conservation History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Jodhpur (Khejarli village)", "Jaipur", "Bikaner", "Udaipur"),
                optionsHindi = listOf("जोधपुर (खेजड़ली गांव)", "जयपुर", "बीकानेर", "उदयपुर"),
                correctAnswerIndex = 0,
                explanation = "In 1730 AD, 363 Bishnois sacrificed their lives at Khejarli near Jodhpur under the motto 'सिर साठे रूंख रहे तो भी सस्तो जाण'.",
                explanationHindi = "सन् 1730 में जोधपुर के खेजड़ली गांव में अमृता देवी विश्नोई के नेतृत्व में 363 लोगों ने पेड़ों से चिपककर प्राणों का बलिदान दिया था।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 5", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C6_SS_001",
                questionText = "Which picturesque historic city of Rajasthan is universally celebrated as the 'City of Lakes'?",
                questionTextHindi = "आरबीएसई कक्षा 6 सामाजिक विज्ञान: राजस्थान के किस ऐतिहासिक शहर को 'झीलों की नगरी' (City of Lakes) कहा जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 6",
                subject = "Social Science",
                chapterOrTopic = "Rajasthan Heritage",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Udaipur (उदयपुर)", "Jodhpur (सूर्य नगरी)", "Jaipur (गुलाबी नगरी)", "Jaisalmer (स्वर्ण नगरी)"),
                optionsHindi = listOf("उदयपुर (झीलों की नगरी)", "जोधपुर (सूर्य नगरी)", "जयपुर (गुलाबी नगरी)", "जैसलमेर (स्वर्ण नगरी)"),
                correctAnswerIndex = 0,
                explanation = "Udaipur, founded by Maharana Udai Singh II, is known as the City of Lakes due to Lake Pichola, Fateh Sagar and others.",
                explanationHindi = "पिछोला, फतहसागर आदि खूबसूरत झीलों के कारण उदयपुर को 'झीलों की नगरी' तथा 'पूर्व का वेनिस' कहा जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 6", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C7_SS_001",
                questionText = "In 1799 AD, who built the celebrated five-storey crown-shaped palace 'Hawa Mahal' in Jaipur?",
                questionTextHindi = "आरबीएसई कक्षा 7 सामाजिक विज्ञान: जयपुर के प्रसिद्ध पांच मंजिला 'हवामहल' का निर्माण 1799 ई. में किस महाराजा ने करवाया था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 7",
                subject = "Social Science",
                chapterOrTopic = "Rajasthan Architecture",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Maharaja Sawai Pratap Singh", "Maharaja Sawai Jai Singh II", "Maharaja Man Singh I", "Maharaja Madho Singh"),
                optionsHindi = listOf("सवाई प्रताप सिंह (1799 ई.)", "सवाई जयसिंह द्वितीय (जयपुर संस्थापक)", "मानसिंह प्रथम", "माधोसिंह"),
                correctAnswerIndex = 0,
                explanation = "Hawa Mahal was constructed by Maharaja Sawai Pratap Singh in 1799, designed with 953 jharokhas by architect Lal Chand Usta.",
                explanationHindi = "हवामहल का निर्माण 1799 ई. में सवाई प्रताप सिंह ने करवाया था। इसके वास्तुकार लालचंद उस्ता थे तथा इसमें 953 झरोखे हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 7", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C8_SS_001",
                questionText = "In how many historical stages was the integration of modern Rajasthan completed, finishing on November 1, 1956?",
                questionTextHindi = "आरबीएसई कक्षा 8 सामाजिक विज्ञान: वर्तमान राजस्थान का एकीकरण कुल कितने चरणों में संपन्न हुआ जो 1 नवंबर 1956 को पूर्ण हुआ?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 8",
                subject = "Social Science",
                chapterOrTopic = "Integration of Rajasthan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("7 stages (7 चरणों में)", "5 stages", "8 stages", "6 stages"),
                optionsHindi = listOf("7 चरणों में (1948 से 1 नवंबर 1956)", "5 चरणों में", "8 चरणों में", "6 चरणों में"),
                correctAnswerIndex = 0,
                explanation = "The unification of 19 princely states and 3 thikanas of Rajasthan occurred across 7 phases from March 18, 1948 to November 1, 1956.",
                explanationHindi = "राजस्थान का एकीकरण 18 मार्च 1948 (मत्स्य संघ) से आरंभ होकर 1 नवंबर 1956 को 7 चरणों में पूरा हुआ।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 8", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C8_S_001",
                questionText = "Sound waves require a material medium to propagate. Through which medium can sound waves NOT travel at all?",
                questionTextHindi = "ध्वनि तरंगों के संचरण हेतु माध्यम की आवश्यकता होती है। ध्वनि तरंगें किस माध्यम में संचरण नहीं कर सकती हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 8",
                subject = "Science",
                chapterOrTopic = "Sound",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Vacuum (निर्वात में)", "Solids (ठोस में)", "Liquids (द्रव में)", "Gases (गैस में)"),
                optionsHindi = listOf("निर्वात में (Vacuum - कोई कण नहीं)", "ठोस में (सर्वाधिक वेग)", "द्रव में", "गैस में"),
                correctAnswerIndex = 0,
                explanation = "Sound is a mechanical wave that requires particle vibrations; hence it cannot travel through a vacuum.",
                explanationHindi = "ध्वनि एक यांत्रिक तरंग है जिसे गति हेतु माध्यम के कणों की आवश्यकता होती है, अतः निर्वात में ध्वनि गमन नहीं कर सकती।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 8", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C9_SS_001",
                questionText = "Which renowned revolutionary of Rajasthan composed 'Chetavani ra Chungtya' (13 sorathas) preventing Maharana Fateh Singh from attending the 1903 Delhi Durbar?",
                questionTextHindi = "आरबीएसई कक्षा 9: मेवाड़ के महाराणा फतह सिंह को 1903 के दिल्ली दरबार में जाने से रोकने हेतु 'चेतावनी रा चूंगट्या' सोरठे किसने लिखे थे?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 9",
                subject = "Social Science",
                chapterOrTopic = "Freedom Movement in Rajasthan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kesari Singh Barhath (केसरी सिंह बारहठ)", "Pratap Singh Barhath", "Zorawar Singh Barhath", "Vijay Singh Pathik"),
                optionsHindi = listOf("केसरी सिंह बारहठ", "प्रताप सिंह बारहठ", "जोरावर सिंह बारहठ", "विजय सिंह पथिक"),
                correctAnswerIndex = 0,
                explanation = "Kesari Singh Barhath composed 13 patriotic Dingal couplets 'Chetavani ra Chungtya' awakening the Maharana's Rajput pride.",
                explanationHindi = "केसरी सिंह बारहठ ने डिंगल भाषा में 13 सोरठे 'चेतावनी रा चूंगट्या' लिखे जिन्हें पढ़कर महाराणा फतह सिंह का स्वाभिमान जाग उठा और वे दिल्ली दरबार में शामिल नहीं हुए।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 9", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE_C9_M_001",
                questionText = "In Heron's formula for finding area of triangle = √[s(s-a)(s-b)(s-c)], semi-perimeter s equals:",
                questionTextHindi = "हीरोन के त्रिभुज क्षेत्रफल सूत्र √[s(s-a)(s-b)(s-c)] में अर्ध-परिमाप (s) का मान किसके बराबर होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 9",
                subject = "Mathematics",
                chapterOrTopic = "Heron's Formula",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("s = (a + b + c) / 2", "s = a + b + c", "s = (a + b + c) / 3", "s = 2(a + b + c)"),
                optionsHindi = listOf("s = (a + b + c) / 2", "s = a + b + c (पूर्ण परिमाप)", "s = (a + b + c) / 3", "s = 2(a + b + c)"),
                correctAnswerIndex = 0,
                explanation = "Semi-perimeter s is half of the total perimeter of triangle with sides a, b, and c: s = (a + b + c)/2.",
                explanationHindi = "त्रिभुज का अर्ध-परिमाप उसकी तीनों भुजाओं के योग का आधा होता है: s = (a + b + c)/2।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 9", "Mathematics")
            )
        )


        // ==========================================
        // RAILWAY RRB NTPC / GROUP D / ALP QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_RLY_002",
                questionText = "The first passenger train in India ran on 16th April 1853 between which two stations?",
                questionTextHindi = "भारत में पहली यात्री रेलगाड़ी 16 अप्रैल 1853 को किन दो स्टेशनों के मध्य चलाई गई थी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Knowledge",
                chapterOrTopic = "Indian Railways History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Bombay (Bori Bunder) to Thane (34 km)", "Calcutta to Raniganj", "Madras to Arkonam", "Delhi to Agra"),
                optionsHindi = listOf("बोरी बंदर (मुंबई) से ठाणे (34 किमी)", "कलकत्ता से रानीगंज", "मद्रास से अरकोणम", "दिल्ली से आगरा"),
                correctAnswerIndex = 0,
                explanation = "India's first passenger train ran on April 16, 1853, covering 34 km from Bori Bunder (Mumbai) to Thane with 3 steam locomotives: Sahib, Sindh, and Sultan.",
                explanationHindi = "भारत की पहली यात्री ट्रेन 16 अप्रैल 1853 को बोरी बंदर (वर्तमान CSMT मुंबई) से ठाणे के बीच 34 किमी की दूरी पर 3 भाप इंजनों (साहिब, सिंध और सुल्तान) द्वारा चलाई गई थी।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "RRB NTPC", "History")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_003",
                questionText = "Which railway station currently holds the Guinness World Record for having the longest railway platform in the world (1,507 meters)?",
                questionTextHindi = "विश्व के सबसे लंबे रेलवे प्लेटफॉर्म (1,507 मीटर) का गिनीज वर्ल्ड रिकॉर्ड वर्तमान में किस स्टेशन के नाम है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Awareness",
                chapterOrTopic = "Railway Infrastructure",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Shri Siddharoodha Swamiji Hubballi (Karnataka)", "Gorakhpur Junction (UP)", "Kollam Junction (Kerala)", "Kharagpur Junction (WB)"),
                optionsHindi = listOf("श्री सिद्धारूढ़ स्वामीजी हुबली स्टेशन (कर्नाटक - 1507 मी)", "गोरखपुर जंक्शन (उत्तर प्रदेश - 1366 मी)", "कोल्लम जंक्शन (केरल)", "खड़गपुर जंक्शन (पश्चिम बंगाल)"),
                correctAnswerIndex = 0,
                explanation = "Platform No. 8 of Hubballi Junction in Karnataka is 1,507 meters long, making it the longest railway platform globally.",
                explanationHindi = "कर्नाटक के हुबली रेलवे स्टेशन का प्लेटफॉर्म नंबर 8 (1,507 मीटर लंबा) विश्व का सबसे लंबा रेलवे प्लेटफॉर्म है, जिसने गोरखपुर का रिकॉर्ड तोड़ा।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "RRB", "Platform")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_004",
                questionText = "What is the standard track gauge (distance between rails) for Indian Railways Broad Gauge network?",
                questionTextHindi = "भारतीय रेलवे के ब्रॉड गेज (बड़ी लाइन) ट्रैक के दोनों पटरियों के बीच की मानक चौड़ाई कितनी होती है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "Technical Science",
                chapterOrTopic = "Track Fundamentals",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("1,676 mm (5 ft 6 in)", "1,435 mm (Standard Gauge)", "1,000 mm (Metre Gauge)", "762 mm (Narrow Gauge)"),
                optionsHindi = listOf("1,676 मिलीमीटर (5 फीट 6 इंच)", "1,435 मिलीमीटर (मानक गेज)", "1,000 मिलीमीटर (मीटर गेज)", "762 मिलीमीटर (नैरो गेज)"),
                correctAnswerIndex = 0,
                explanation = "Indian Railways Broad Gauge track has an inner rail-to-rail distance of exactly 1,676 mm (5 feet 6 inches).",
                explanationHindi = "भारतीय रेल में ब्रॉड गेज की पटरियों के आंतरिक किनारों के बीच की मानक दूरी 1,676 मिमी (5 फीट 6 इंच) होती है।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Broad Gauge", "Engineering")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_005",
                questionText = "What is the name of the official mascot of Indian Railways introduced during its 150th anniversary in 2002?",
                questionTextHindi = "भारतीय रेल का आधिकारिक शुभंकर (Mascot) कौन सा है जिसे 2002 में 150वीं वर्षगांठ पर अपनाया गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Knowledge",
                chapterOrTopic = "Railway Identity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Bholu, the Guard Elephant", "Shera", "Appu", "Gajraj"),
                optionsHindi = listOf("भोलू - गार्ड हाथी (हरी बत्ती वाली लालटेन लिए)", "शेरा", "अप्पू", "गजराज"),
                correctAnswerIndex = 0,
                explanation = "Bholu the elephant, holding a green signal lantern in his hand dressed as a railway guard, is the official mascot of Indian Railways.",
                explanationHindi = "'भोलू' नाम का हाथी जो हाथ में हरी बत्ती वाली लालटेन लिए गार्ड की वर्दी पहने है, भारतीय रेलवे का शुभंकर है।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Mascot", "Bholu")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_006",
                questionText = "India's first semi-high-speed train 'Vande Bharat Express' (Train 18) was flagged off on its inaugural commercial run on which route in February 2019?",
                questionTextHindi = "भारत की पहली सेमी-हाई-स्पीड 'वंदे भारत एक्सप्रेस' (ट्रेन 18) का उद्घाटन फरवरी 2019 में किस रूट पर हुआ था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "Current & General GK",
                chapterOrTopic = "Modern Trains",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("New Delhi to Varanasi Junction", "New Delhi to Katra", "Mumbai to Ahmedabad", "Chennai to Mysuru"),
                optionsHindi = listOf("नई दिल्ली से वाराणसी जंक्शन", "नई दिल्ली से श्री माता वैष्णो देवी कटरा", "मुंबई सेंट्रल से अहमदाबाद", "चेन्नई से मैसूरु"),
                correctAnswerIndex = 0,
                explanation = "The first Vande Bharat Express was launched on February 15, 2019, connecting New Delhi and Varanasi, manufactured by ICF Chennai.",
                explanationHindi = "पहली वंदे भारत एक्सप्रेस 15 फरवरी 2019 को नई दिल्ली से वाराणसी के बीच शुरू की गई थी, जिसे ICF चेन्नई द्वारा मेक इन इंडिया के तहत निर्मित किया गया।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Vande Bharat", "NTPC")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_007",
                questionText = "The world's highest single-arch railway bridge has been built across which river in Jammu and Kashmir (359 meters above riverbed)?",
                questionTextHindi = "विश्व का सबसे ऊंचा सिंगल-आर्च रेलवे ब्रिज (नदी तल से 359 मीटर ऊंचा) जम्मू-कश्मीर में किस नदी पर बनाया गया है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Awareness",
                chapterOrTopic = "Engineering Marvels",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Chenab River", "Jhelum River", "Ravi River", "Indus River"),
                optionsHindi = listOf("चिनाब नदी (Chenab Bridge - एफिल टॉवर से भी 35 मीटर ऊंचा)", "झेलम नदी", "रावी नदी", "सिंधु नदी"),
                correctAnswerIndex = 0,
                explanation = "The Chenab Rail Bridge in Reasi district of J&K stands 359 m above the river bed, making it the highest railway arch bridge in the world.",
                explanationHindi = "रियासी (जम्मू-कश्मीर) में चिनाब नदी पर बना रेलवे आर्च ब्रिज नदी के तल से 359 मीटर ऊपर है, जो पेरिस के एफिल टॉवर से भी ऊंचा है।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Chenab Bridge", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_008",
                questionText = "Chittaranjan Locomotive Works (CLW), the premier electric locomotive manufacturing unit of Indian Railways, is situated in which state?",
                questionTextHindi = "भारतीय रेल का प्रसिद्ध विद्युत रेल इंजन कारखाना 'चित्तरंजन लोकोमोटिव वर्क्स' (CLW) किस राज्य में स्थित है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Awareness",
                chapterOrTopic = "Railway Production Units",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("West Bengal (Paschim Bardhaman)", "Jharkhand", "Bihar", "Uttar Pradesh"),
                optionsHindi = listOf("पश्चिम बंगाल (आसनसोल, पश्चिम बर्धमान)", "झारखंड", "बिहार", "उत्तर प्रदेश"),
                correctAnswerIndex = 0,
                explanation = "Chittaranjan Locomotive Works (CLW) was established in 1950 in Chittaranjan, Asansol, West Bengal.",
                explanationHindi = "चित्तरंजन लोकोमोटिव वर्क्स (CLW) की स्थापना 1950 में पश्चिम बंगाल के आसनसोल स्थित चित्तरंजन में की गई थी।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "CLW", "Production")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_009",
                questionText = "Where is the headquarters of Northern Railway Zone located?",
                questionTextHindi = "उत्तर रेलवे (Northern Railway) ज़ोन का मुख्यालय कहाँ स्थित है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Knowledge",
                chapterOrTopic = "Railway Zones",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("New Delhi (Baroda House)", "Gorakhpur", "Allahabad (Prayagraj)", "Jaipur"),
                optionsHindi = listOf("नई दिल्ली (बड़ौदा हाउस)", "गोरखपुर (पूर्वोत्तर रेलवे)", "प्रयागराज (उत्तर मध्य रेलवे)", "जयपुर (उत्तर पश्चिम रेलवे)"),
                correctAnswerIndex = 0,
                explanation = "Northern Railway headquarters is located at Baroda House, New Delhi. It is the largest railway zone in India by route kilometers.",
                explanationHindi = "उत्तर रेलवे का मुख्यालय बड़ौदा हाउस, नई दिल्ली में स्थित है। यह मार्ग किलोमीटर के हिसाब से भारत का सबसे बड़ा रेलवे ज़ोन है।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Zones", "HQ")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_010",
                questionText = "Which national institute in Vadodara (Gujarat) was upgraded into India's first Central University dedicated to transport and logistics (Gati Shakti Vishwavidyalaya)?",
                questionTextHindi = "वडोदरा (गुजरात) स्थित किस संस्थान को भारत के पहले परिवहन एवं लॉजिस्टिक्स केंद्रीय विश्वविद्यालय (गति शक्ति विश्वविद्यालय) में क्रमोन्नत किया गया?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "Current Affairs",
                chapterOrTopic = "Institutes",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("National Rail and Transportation Institute (NRTI)", "RDSO Lucknow", "IRICEN Pune", "IRISET Secunderabad"),
                optionsHindi = listOf("राष्ट्रीय रेल एवं परिवहन संस्थान (NRTI - अब गति शक्ति विश्वविद्यालय)", "आरडीएसओ लखनऊ", "इरीसेन पुणे", "इरिसेट सिकंदराबाद"),
                correctAnswerIndex = 0,
                explanation = "The National Rail and Transportation Institute (NRTI) in Vadodara was converted by Parliament Act into Gati Shakti Vishwavidyalaya (GSV) in 2022.",
                explanationHindi = "वडोदरा स्थित राष्ट्रीय रेल एवं परिवहन संस्थान को 2022 में संसद द्वारा केंद्रीय 'गति शक्ति विश्वविद्यालय' में तब्दील किया गया।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "University", "Vadodara")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_011",
                questionText = "The famous Konkan Railway (KRCL) connects which two terminal points along India's magnificent western coastline?",
                questionTextHindi = "प्रसिद्ध कोंकण रेलवे (KRCL) भारत के पश्चिमी समुद्र तट के साथ किन दो अंतिम स्टेशनों को जोड़ती है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "Geography & GK",
                chapterOrTopic = "Konkan Railway",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("Roha (Maharashtra) to Thokur / Mangaluru (Karnataka)", "Mumbai to Goa", "Ratnagiri to Karwar", "Panvel to Kochi"),
                optionsHindi = listOf("रोहा (महाराष्ट्र) से थोकुर / मंगलुरु (कर्नाटक)", "मुंबई से गोवा", "रत्नागिरी से कारवार", "पनवेल से कोच्चि"),
                correctAnswerIndex = 0,
                explanation = "The 741-km Konkan Railway runs between Roha in Maharashtra and Thokur near Mangaluru in Karnataka through 91 tunnels and 2000+ bridges.",
                explanationHindi = "741 किमी लंबी कोंकण रेलवे महाराष्ट्र के रोहा से शुरू होकर कर्नाटक के मंगलुरु स्थित थोकुर तक जाती है जिसमें 91 सुरंगें और 2000 से अधिक पुल हैं।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "Konkan", "Engineering")
            )
        )

        list.add(
            Question(
                id = "Q_RLY_012",
                questionText = "In railway terminology, what does the abbreviation 'WL' / 'RAC' stand for on an Indian Railways ticket?",
                questionTextHindi = "भारतीय रेलवे टिकट में 'RAC' और 'WL' संक्षिप्ताक्षरों का सही पूर्ण रूप क्या है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "RAILWAY",
                examOrBoard = "Railway",
                subject = "General Awareness",
                chapterOrTopic = "Ticketing Rules",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Reservation Against Cancellation / Waiting List", "Reserved Auto Coach / Wait Line", "Railway Active Check / Wait List", "Route Allocation Category / Waiting List"),
                optionsHindi = listOf("Reservation Against Cancellation (आरएसी) / Waiting List (प्रतीक्षा सूची)", "Reserved Auto Coach", "Railway Active Check", "Route Allocation Category"),
                correctAnswerIndex = 0,
                explanation = "RAC stands for Reservation Against Cancellation (guaranteeing travel with a shared seat/berth) and WL stands for Waiting List.",
                explanationHindi = "RAC का अर्थ 'Reservation Against Cancellation' (सवारी की अनुमति सहित आधा बर्थ) तथा WL का अर्थ 'Waiting List' (प्रतीक्षा सूची) होता है।",
                negativeMarks = 0.33f,
                tags = listOf("Railway", "RAC", "Tickets")
            )
        )

        // ==========================================
        // BANKING (IBPS, SBI, RBI) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_BNK_002",
                questionText = "The Reserve Bank of India (RBI) was established on 1st April 1935 based on the recommendations of which commission?",
                questionTextHindi = "भारतीय रिज़र्व बैंक (RBI) की स्थापना 1 अप्रैल 1935 को किस आयोग की सिफारिशों के आधार पर की गई थी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "RBI History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Hilton Young Commission (Royal Commission on Indian Currency & Finance)", "Hunter Commission", "Kothari Commission", "Sarkaria Commission"),
                optionsHindi = listOf("हिल्टन यंग कमीशन (रॉयल कमीशन ऑन इंडियन करेंसी एंड फाइनेंस)", "हंटर कमीशन", "कोठारी आयोग", "सरकारिया आयोग"),
                correctAnswerIndex = 0,
                explanation = "The Hilton Young Commission submitted its report in 1926 recommending the creation of a central bank, leading to the RBI Act of 1934.",
                explanationHindi = "हिल्टन यंग आयोग (1926) की सिफारिशों पर भारतीय रिज़र्व बैंक अधिनियम, 1934 पारित हुआ और 1 अप्रैल 1935 को RBI की स्थापना हुई।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "RBI", "Hilton Young")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_003",
                questionText = "What is 'Repo Rate' in the context of RBI's monetary policy operations?",
                questionTextHindi = "आरबीआई की मौद्रिक नीति में 'रेपो दर' (Repo Rate) का क्या अर्थ है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Monetary Policy",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Rate at which RBI lends short-term funds to commercial banks against government securities", "Rate at which banks lend to corporate borrowers", "Rate at which RBI borrows money from commercial banks", "Rate offered to public on savings deposits"),
                optionsHindi = listOf("वह ब्याज दर जिस पर RBI वाणिज्यिक बैंकों को सरकारी प्रतिभूतियों के बदले अल्पकालिक ऋण देता है", "वह दर जिस पर बैंक आम जनता को ऋण देते हैं", "वह दर जिस पर RBI बैंकों से धन उधार लेता है (रिवर्स रेपो)", "बचत खातों पर मिलने वाली ब्याज दर"),
                correctAnswerIndex = 0,
                explanation = "Repo Rate (Repurchase Option Rate) is the benchmark interest rate at which the central bank lends money to commercial banks against approved securities.",
                explanationHindi = "रेपो रेट वह ब्याज दर है जिस पर केंद्रीय बैंक (RBI) तरलता की कमी होने पर वाणिज्यिक बैंकों को सरकारी प्रतिभूतियों के बदले अल्पकालिक ऋण प्रदान करता है।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "Repo Rate", "Monetary")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_004",
                questionText = "Under DICGC (Deposit Insurance and Credit Guarantee Corporation), what is the maximum insurance protection provided per depositor per bank in India?",
                questionTextHindi = "डीआईसीजीसी (DICGC) के तहत भारत में प्रत्येक जमाकर्ता को प्रति बैंक अधिकतम कितनी बीमा सुरक्षा राशि प्रदान की जाती है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Deposit Insurance",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹5,00,000 (Rupees Five Lakh)", "₹1,00,000", "₹2,50,000", "₹10,00,000"),
                optionsHindi = listOf("₹5,00,000 (पाँच लाख रुपये - मूलधन + ब्याज मिलाकर)", "₹1,00,000", "₹2,50,000", "₹10,00,000"),
                correctAnswerIndex = 0,
                explanation = "In 2020, DICGC increased the deposit insurance limit from ₹1 Lakh to ₹5 Lakh covering savings, fixed, current, and recurring deposits.",
                explanationHindi = "बजट 2020 में जमा बीमा सीमा को ₹1 लाख से बढ़ाकर ₹5 लाख प्रति जमाकर्ता प्रति बैंक (मूलधन और ब्याज सहित) कर दिया गया।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "DICGC", "Insurance")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_005",
                questionText = "Which organization developed and operates UPI (Unified Payments Interface) and RuPay card network in India?",
                questionTextHindi = "भारत में यूनिफाइड पेमेंट्स इंटरफेस (UPI) और रुपे (RuPay) कार्ड नेटवर्क का विकास एवं संचालन किस संस्था द्वारा किया जाता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Financial Awareness",
                chapterOrTopic = "Digital Banking",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("National Payments Corporation of India (NPCI)", "Reserve Bank of India (RBI)", "NITI Aayog", "State Bank of India (SBI)"),
                optionsHindi = listOf("भारतीय राष्ट्रीय भुगतान निगम (NPCI - नेशनल पेमेंट्स कॉरपोरेशन ऑफ इंडिया)", "भारतीय रिज़र्व बैंक (RBI)", "नीति आयोग", "भारतीय स्टेट बैंक"),
                correctAnswerIndex = 0,
                explanation = "NPCI is an umbrella organization for operating retail payments and settlement systems in India, established by RBI and IBA in 2008.",
                explanationHindi = "भारतीय राष्ट्रीय भुगतान निगम (NPCI) भारत में खुदरा भुगतान और निपटान प्रणालियों के संचालन हेतु RBI तथा IBA की संयुक्त पहल है।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "UPI", "NPCI")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_006",
                questionText = "What is the minimum transaction amount required to transfer funds through RTGS (Real Time Gross Settlement) in India?",
                questionTextHindi = "भारत में आरटीजीएस (RTGS) के माध्यम से धन हस्तांतरण हेतु न्यूनतम लेन-देन राशि कितनी निर्धारित है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Operations",
                chapterOrTopic = "Payment Systems",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("₹2,00,000 (Two Lakh Rupees)", "₹1,00,000", "₹50,000", "No minimum limit"),
                optionsHindi = listOf("₹2,00,000 (दो लाख रुपये)", "₹1,00,000", "₹50,000", "कोई न्यूनतम सीमा नहीं (यह NEFT में है)"),
                correctAnswerIndex = 0,
                explanation = "RTGS is meant for high-value transactions; the minimum amount transferrable through RTGS is ₹2 Lakh with no upper limit.",
                explanationHindi = "RTGS उच्च मूल्य वाले लेन-देन हेतु प्रयुक्त होता है, इसमें न्यूनतम हस्तांतरण राशि ₹2 लाख है जबकि कोई अधिकतम सीमा नहीं है।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "RTGS", "Payments")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_007",
                questionText = "How many major private commercial banks were nationalized by the Government of India in the first round of bank nationalization in July 1969?",
                questionTextHindi = "जुलाई 1969 में भारत सरकार द्वारा प्रथम चरण में कितने प्रमुख वाणिज्यिक बैंकों का राष्ट्रीयकरण किया गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Bank Nationalization",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("14 Banks", "6 Banks", "12 Banks", "20 Banks"),
                optionsHindi = listOf("14 प्रमुख बैंक (जमा राशि ₹50 करोड़ से अधिक)", "6 बैंक (1980 के दूसरे चरण में)", "12 बैंक", "20 बैंक"),
                correctAnswerIndex = 0,
                explanation = "14 major commercial banks having deposits of over ₹50 crore each were nationalized on July 19, 1969, by Prime Minister Indira Gandhi.",
                explanationHindi = "19 जुलाई 1969 को तत्कालीन प्रधानमंत्री इंदिरा गांधी ने ₹50 करोड़ से अधिक जमा पूंजी वाले 14 बड़े निजी बैंकों का राष्ट्रीयकरण किया था।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "Nationalization", "History")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_008",
                questionText = "What does 'CRR' (Cash Reserve Ratio) mean in banking operations?",
                questionTextHindi = "बैंकिंग परिचालन में 'नकद आरक्षित अनुपात' (CRR) का क्या अर्थ है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Reserve Ratios",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("The percentage of Net Demand and Time Liabilities (NDTL) that commercial banks must keep as cash balance with the RBI", "The cash kept in ATM vaults", "The gold reserve of commercial banks", "The reserve fund for bad loans"),
                optionsHindi = listOf("वाणिज्यिक बैंकों द्वारा अपने कुल NDTL का वह निश्चित प्रतिशत जो उन्हें अनिवार्यतः RBI के पास नकद रूप में रखना होता है", "एटीएम में रखा जाने वाला नकद", "बैंकों का स्वर्ण भंडार", "एनपीए से निपटने का आरक्षित कोष"),
                correctAnswerIndex = 0,
                explanation = "CRR is the share of Net Demand and Time Liabilities (NDTL) that banks must maintain as liquid cash balance with the Reserve Bank of India.",
                explanationHindi = "सीआरआर (CRR) बैंक की कुल जमा देनदारियों (NDTL) का वह हिस्सा है जिसे वाणिज्यिक बैंकों को नकद रूप में आरबीआई के पास सुरक्षित रखना अनिवार्य होता है।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "CRR", "Monetary")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_009",
                questionText = "Which was the very first bank established in India (in 1770 at Calcutta)?",
                questionTextHindi = "भारत में स्थापित होने वाला सबसे पहला बैंक कौन सा था (1770 में कलकत्ता में)?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking History",
                chapterOrTopic = "Early Banking",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Bank of Hindostan (बैंक ऑफ हिंदुस्तान)", "General Bank of India", "Imperial Bank of India", "Oudh Commercial Bank"),
                optionsHindi = listOf("बैंक ऑफ हिंदुस्तान (1770, कलकत्ता)", "जनरल बैंक ऑफ इंडिया", "इंपीरियल बैंक ऑफ इंडिया", "अवध कमर्शियल बैंक (1881)"),
                correctAnswerIndex = 0,
                explanation = "Bank of Hindostan was founded in 1770 in Calcutta by Alexander and Company, marking the dawn of modern banking in India.",
                explanationHindi = "भारत का सबसे पहला बैंक 'बैंक ऑफ हिंदुस्तान' था, जिसकी स्थापना 1770 में कलकत्ता में अलेक्जेंडर एंड कंपनी द्वारा की गई थी।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "First Bank", "History")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_010",
                questionText = "In the Indian Financial System, what is the length of an IFSC (Indian Financial System Code) code used for electronic fund transfers?",
                questionTextHindi = "भारतीय वित्तीय प्रणाली में इलेक्ट्रॉनिक फंड ट्रांसफर हेतु प्रयुक्त IFSC कोड में कुल कितने अक्षर/अंक (कैरेक्टर) होते हैं?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Operations",
                chapterOrTopic = "IFSC Code",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("11 characters (First 4 letters bank, 5th zero, last 6 branch code)", "12 characters", "10 characters", "16 characters"),
                optionsHindi = listOf("11 कैरेक्टर (प्रथम 4 बैंक कोड, 5वां शून्य, अंतिम 6 शाखा कोड)", "12 कैरेक्टर", "10 कैरेक्टर", "16 कैरेक्टर"),
                correctAnswerIndex = 0,
                explanation = "IFSC is an 11-character alphanumeric code: 4 letters for bank name, 5th character is '0' (reserved for future), and last 6 characters represent the specific branch.",
                explanationHindi = "IFSC एक 11-अक्षरीय कोड है: पहले 4 अक्षर बैंक का नाम, 5वां अक्षर सदैव '0', और अंतिम 6 वर्ण संबंधित शाखा का कोड होते हैं।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "IFSC", "NEFT")
            )
        )

        list.add(
            Question(
                id = "Q_BNK_011",
                questionText = "What does 'NPA' stand for in banking, signifying a loan or advance for which the principal or interest payment remained overdue for a period of 90 days?",
                questionTextHindi = "बैंकिंग शब्दावली में 'NPA' का पूर्ण रूप क्या है, जिसका तात्पर्य उस ऋण से है जिसका मूलधन या ब्याज 90 दिनों से अधिक समय तक बकाया रहता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "BANKING",
                examOrBoard = "Banking",
                subject = "Banking Awareness",
                chapterOrTopic = "Credit Risk",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Non-Performing Asset", "Net Profit Allocation", "National Pension Account", "Non-Payment Agreement"),
                optionsHindi = listOf("नॉन-परफॉर्मिंग एसेट (गैर-निष्पादित परिसंपत्ति - फंसा हुआ कर्ज)", "नेट प्रॉफिट एलोकेशन", "नेशनल पेंशन अकाउंट", "नॉन-पेमेंट एग्रीमेंट"),
                correctAnswerIndex = 0,
                explanation = "Non-Performing Asset (NPA) is a classification for loans or advances that are in default or in arrears on scheduled payments of principal or interest for over 90 days.",
                explanationHindi = "NPA (Non-Performing Asset) वह संपत्ति/ऋण है जिससे बैंक को 90 दिनों तक ब्याज अथवा मूलधन की वसूली नहीं हो पाती।",
                negativeMarks = 0.25f,
                tags = listOf("Banking", "NPA", "Finance")
            )
        )

        // ==========================================
        // SSC (CGL, CHSL, MTS) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_SSC_003",
                questionText = "The historic Battle of Plassey was fought on 23rd June 1757 between the British East India Company and which Nawab of Bengal?",
                questionTextHindi = "23 जून 1757 को प्लासी का ऐतिहासिक युद्ध ब्रिटिश ईस्ट इंडिया कंपनी और बंगाल के किस नवाब के मध्य लड़ा गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Awareness",
                chapterOrTopic = "Modern Indian History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Nawab Siraj-ud-Daulah (नवाब सिराजुद्दौला)", "Mir Jafar", "Mir Qasim", "Alivardi Khan"),
                optionsHindi = listOf("नवाब सिराजुद्दौला", "मीर जाफ़र (जिसने धोखा दिया)", "मीर कासिम", "अलीवर्दी खान"),
                correctAnswerIndex = 0,
                explanation = "Robert Clive led the British forces against Siraj-ud-Daulah at Plassey; Mir Jafar's betrayal secured British dominance over Bengal.",
                explanationHindi = "प्लासी का युद्ध 1757 में रॉबर्ट क्लाइव के नेतृत्व में अंग्रेजों और बंगाल के नवाब सिराजुद्दौला के बीच हुआ, जिसमें मीर जाफर के विश्वासघात के कारण नवाब पराजित हुए।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "CGL", "History")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_004",
                questionText = "Which Article of the Indian Constitution gives citizens the 'Right to Constitutional Remedies' to approach the Supreme Court directly for enforcement of Fundamental Rights?",
                questionTextHindi = "भारतीय संविधान का कौन सा अनुच्छेद नागरिकों को मौलिक अधिकारों के प्रवर्तन हेतु सीधे सर्वोच्च न्यायालय जाने का 'संवैधानिक उपचारों का अधिकार' प्रदान करता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Awareness",
                chapterOrTopic = "Indian Polity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Article 32 (अनुच्छेद 32)", "Article 21", "Article 19", "Article 14"),
                optionsHindi = listOf("अनुच्छेद 32 (डॉ. आंबेडकर द्वारा 'संविधान की आत्मा' कहा गया)", "अनुच्छेद 21 (जीवन का अधिकार)", "अनुच्छेद 19 (स्वतंत्रता का अधिकार)", "अनुच्छेद 14 (समानता का अधिकार)"),
                correctAnswerIndex = 0,
                explanation = "Article 32 provides the right to constitutional remedies through writs (Habeas Corpus, Mandamus, Prohibition, Certiorari, Quo-Warranto), termed by Dr. Ambedkar as the 'heart and soul' of the Constitution.",
                explanationHindi = "अनुच्छेद 32 के तहत सर्वोच्च न्यायालय मौलिक अधिकारों के उल्लंघन पर 5 प्रकार की रिट जारी कर सकता है, जिसे डॉ. आंबेडकर ने संविधान का हृदय एवं आत्मा कहा था।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Polity", "Article 32")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_005",
                questionText = "Which Indus Valley Civilization site in Gujarat is world-famous for its ancient tidal dockyard and maritime trade?",
                questionTextHindi = "गुजरात में स्थित कौन सा सिंधु घाटी सभ्यता का स्थल अपने प्राचीन जहाजी गोदी (डॉकयार्ड) एवं समुद्री व्यापार हेतु विश्व प्रसिद्ध है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Awareness",
                chapterOrTopic = "Ancient History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Lothal (लोथल - भोगवा नदी तट)", "Dholavira", "Kalibangan", "Rakhigarhi"),
                optionsHindi = listOf("लोथल (अहमदाबाद, गुजरात - भोगवा नदी तट)", "धोलावीरा (कच्छ - जल प्रबंधन प्रणाली)", "कालीबंगा (राजस्थान - जुते हुए खेत)", "राखीगढ़ी (हरियाणा)"),
                correctAnswerIndex = 0,
                explanation = "Lothal had the world's earliest known tidal dock, connecting the city to an ancient course of the Sabarmati/Bhogava river for trade with Mesopotamia.",
                explanationHindi = "लोथल (गुजरात) में विश्व का प्राचीनतम मानव निर्मित गोदीबाड़ा (डॉकयार्ड) खोजा गया, जो मेसोपोटामिया आदि से समुद्री व्यापार का प्रमुख केंद्र था।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Lothal", "Indus Valley")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_006",
                questionText = "In human biology, who is credited with discovering the systemic circulation of blood pumped by the heart (in 1628)?",
                questionTextHindi = "मानव शरीर विज्ञान में 1628 ईस्वी में हृदय द्वारा रक्त के व्यवस्थित परिसंचरण (Blood Circulation) की खोज का श्रेय किसे दिया जाता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Science",
                chapterOrTopic = "Human Biology",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("William Harvey (विलियम हार्वे)", "Karl Landsteiner", "Edward Jenner", "Alexander Fleming"),
                optionsHindi = listOf("विलियम हार्वे (William Harvey)", "कार्ल लैंडस्टीनर (रक्त समूह की खोज)", "एडवर्ड जेनर (चेचक टीका)", "अलेक्जेंडर फ्लेमिंग (पेनिसिलिन)"),
                correctAnswerIndex = 0,
                explanation = "English physician William Harvey was the first recognized to describe completely and in detail the systemic circulation and properties of blood being pumped to the brain and body by the heart.",
                explanationHindi = "विलियम हार्वे ने 1628 में रक्त परिसंचरण तंत्र की विस्तृत व्याख्या की और बताया कि हृदय एक पंप की भांति पूरे शरीर में रक्त भेजता है।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Science", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_007",
                questionText = "What is the SI unit of electrical resistance?",
                questionTextHindi = "विद्युत प्रतिरोध (Electrical Resistance) का अंतर्राष्ट्रीय मानक (SI) मात्रक क्या है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Science",
                chapterOrTopic = "Physics Fundamentals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ohm (Ω - ओम)", "Ampere (विद्युत धारा)", "Volt (विभवांतर)", "Watt (शक्ति)"),
                optionsHindi = listOf("ओम (Ohm - प्रतीक Ω)", "एम्पीयर (विद्युत धारा का मात्रक)", "वोल्ट (विद्युत विभव)", "वाट (विद्युत शक्ति)"),
                correctAnswerIndex = 0,
                explanation = "The SI unit of electrical resistance is the ohm (symbol: Ω), named after German physicist Georg Simon Ohm.",
                explanationHindi = "विद्युत प्रतिरोध का SI मात्रक 'ओम' (Ω) है, जिसे जॉर्ज साइमन ओम के नाम पर रखा गया है (V = IR)।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Physics", "Units")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_008",
                questionText = "Dr. C.V. Raman was awarded the Nobel Prize in Physics in 1930 for his pioneering discovery regarding which optical phenomenon?",
                questionTextHindi = "डॉ. सी.वी. रमन को 1930 में भौतिकी का नोबेल पुरस्कार प्रकाश की किस परिघटना की ऐतिहासिक खोज हेतु प्रदान किया गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Awareness",
                chapterOrTopic = "Science & Inventions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Scattering of light (Raman Effect - रमन प्रभाव)", "Total Internal Reflection", "Photoelectric Effect", "Diffraction of X-rays"),
                optionsHindi = listOf("प्रकाश का प्रकीर्णन (रमन प्रभाव - Raman Effect)", "पूर्ण आंतरिक परावर्तन", "प्रकाश वैद्युत प्रभाव", "एक्स-रे विवर्तन"),
                correctAnswerIndex = 0,
                explanation = "Sir C.V. Raman discovered that when light traverses a transparent material, some of the deflected light changes wavelength (Raman Scattering) on 28 Feb 1928 (National Science Day).",
                explanationHindi = "डॉ. सी.वी. रमन ने 28 फरवरी 1928 को 'रमन प्रभाव' (प्रकाश प्रकीर्णन में तरंगदैर्घ्य परिवर्तन) की खोज की थी, जिसके उपलक्ष्य में हर वर्ष 'राष्ट्रीय विज्ञान दिवस' मनाया जाता है।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Raman Effect", "Nobel")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_009",
                questionText = "Deficiency of Vitamin C (Ascorbic acid) in human diet leads to which bleeding condition?",
                questionTextHindi = "मानव आहार में विटामिन C (एस्कॉर्बिक अम्ल) की कमी से मसूड़ों से रक्त आना तथा जोड़ों में दर्द वाला कौन सा रोग हो जाता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Science",
                chapterOrTopic = "Vitamins & Diseases",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Scurvy (स्कर्वी रोग)", "Rickets (विटामिन D की कमी)", "Beriberi (विटामिन B1 की कमी)", "Night Blindness (विटामिन A की कमी)"),
                optionsHindi = listOf("स्कर्वी (Scurvy - मसूड़ों से खून आना)", "रिकेट्स (हड्डियों की कमजोरी - Vit D)", "बेरीबेरी (Vit B1)", "रतौंधी (Vit A)"),
                correctAnswerIndex = 0,
                explanation = "Vitamin C is essential for collagen synthesis; its deficiency leads to scurvy, characterized by spongy bleeding gums and impaired wound healing.",
                explanationHindi = "विटामिन सी की कमी से स्कर्वी रोग होता है जिसमें मसूड़ों में सूजन, रक्तस्राव और घाव भरने में देरी जैसी समस्याएं होती हैं। खट्टे फलों में विटामिन सी प्रचुर होता है।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Vitamin C", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_SSC_010",
                questionText = "Who acts as the ex-officio Chairman of the Rajya Sabha (Council of States) under the Indian Constitution?",
                questionTextHindi = "भारतीय संविधान के अनुसार राज्य सभा (उच्च सदन) का पदेन सभापति कौन होता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "SSC",
                examOrBoard = "SSC",
                subject = "General Awareness",
                chapterOrTopic = "Indian Parliament",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("The Vice-President of India (भारत के उपराष्ट्रपति)", "The President of India", "The Prime Minister", "Speaker of Lok Sabha"),
                optionsHindi = listOf("भारत के उपराष्ट्रपति (अनुच्छेद 64)", "भारत के राष्ट्रपति", "भारत के प्रधानमंत्री", "लोकसभा अध्यक्ष"),
                correctAnswerIndex = 0,
                explanation = "Article 64 states that the Vice-President of India is ex-officio Chairman of the Council of States (Rajya Sabha).",
                explanationHindi = "संविधान के अनुच्छेद 64 और 89 के अनुसार भारत का उपराष्ट्रपति राज्य सभा का पदेन सभापति होता है।",
                negativeMarks = 0.5f,
                tags = listOf("SSC", "Polity", "Rajya Sabha")
            )
        )

        // ==========================================
        // DEFENCE (NDA, CDS, AFCAT) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_DEF_002",
                questionText = "The prestigious National Defence Academy (NDA), the joint training institution for all three Armed Forces of India, is situated at which location?",
                questionTextHindi = "तीनों सेनाओं का संयुक्त प्रशिक्षण संस्थान 'राष्ट्रीय रक्षा अकादमी' (NDA) कहाँ स्थित है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Knowledge",
                chapterOrTopic = "Military Academies",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Khadakwasla, Pune (Maharashtra)", "Dehradun (IMA)", "Dundigal, Hyderabad (AFA)", "Ezhimala (INA)"),
                optionsHindi = listOf("खडकवासला, पुणे (महाराष्ट्र)", "देहरादून (उत्तराखंड - IMA)", "डुंडीगल, हैदराबाद (वायु सेना अकादमी)", "एझिमाला (नौसेना अकादमी)"),
                correctAnswerIndex = 0,
                explanation = "The National Defence Academy (NDA) is located at Khadakwasla near Pune, Maharashtra, established in 1954.",
                explanationHindi = "राष्ट्रीय रक्षा अकादमी (NDA) खडकवासला (पुणे, महाराष्ट्र) में स्थित है, जहाँ थल सेना, नौसेना और वायु सेना के कैडेट्स को एक साथ प्रशिक्षित किया जाता है।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "NDA", "Khadakwasla")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_003",
                questionText = "Under Article 53(2) of the Constitution of India, who is the Supreme Commander of the Indian Armed Forces?",
                questionTextHindi = "भारतीय संविधान के अनुच्छेद 53(2) के अनुसार भारत के सशस्त्र बलों का सर्वोच्च सेनापति (Supreme Commander) कौन होता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence & Polity",
                chapterOrTopic = "Constitutional Command",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("The President of India (भारत के राष्ट्रपति)", "The Prime Minister", "Chief of Defence Staff (CDS)", "Minister of Defence"),
                optionsHindi = listOf("भारत के राष्ट्रपति (Supreme Commander)", "भारत के प्रधानमंत्री", "चीफ ऑफ डिफेंस स्टाफ (CDS)", "रक्षा मंत्री"),
                correctAnswerIndex = 0,
                explanation = "Article 53(2) of the Indian Constitution states that the supreme command of the Defence Forces of the Union shall be vested in the President.",
                explanationHindi = "संविधान के अनुच्छेद 53(2) के तहत संघ के रक्षा बलों का सर्वोच्च समादेश राष्ट्रपति में निहित होता है।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "President", "Constitution")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_004",
                questionText = "Who was the first recipient of India's highest wartime gallantry decoration, the Param Vir Chakra (PVC)?",
                questionTextHindi = "भारत के सर्वोच्च युद्धकालीन वीरता पदक 'परमवीर चक्र' (PVC) के प्रथम प्राप्तकर्ता कौन थे?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Military History",
                chapterOrTopic = "Gallantry Awards",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Major Somnath Sharma (4 Kumaon, 1947 Battle of Badgam)", "Captain Vikram Batra", "Subedar Major Bana Singh", "Company Havildar Major Piru Singh"),
                optionsHindi = listOf("मेजर सोमनाथ शर्मा (4 कुमाऊं रेजिमेंट, 1947 बड़गाम का युद्ध)", "कैप्टन विक्रम बत्रा (कारगिल 1999)", "सूबेदार मेजर बाना सिंह (सियाचिन 1987)", "सीएचएम पीरू सिंह (1948)"),
                correctAnswerIndex = 0,
                explanation = "Major Somnath Sharma was posthumously awarded the first Param Vir Chakra for supreme bravery during the Battle of Badgam in Kashmir in November 1947.",
                explanationHindi = "मेजर सोमनाथ शर्मा को नवंबर 1947 में बड़गाम (कश्मीर) में श्रीनगर हवाई अड्डे की रक्षा करते हुए अदम्य साहस और सर्वोच्च बलिदान हेतु मरणोपरांत प्रथम परमवीर चक्र से सम्मानित किया गया था।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "PVC", "Somnath Sharma")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_005",
                questionText = "In 1984, under which code-named military operation did the Indian Armed Forces gain control over the highest battlefield in the world, the Siachen Glacier?",
                questionTextHindi = "1984 में किस सैन्य अभियान (ऑपरेशन) के तहत भारतीय सेना ने विश्व के सबसे ऊंचे युद्धक्षेत्र 'सियाचिन ग्लेशियर' पर तिरंगा फहराया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Knowledge",
                chapterOrTopic = "Military Operations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Operation Meghdoot (ऑपरेशन मेघदूत)", "Operation Vijay", "Operation Safed Sagar", "Operation Cactus"),
                optionsHindi = listOf("ऑपरेशन मेघदूत (13 अप्रैल 1984)", "ऑपरेशन विजय (कारगिल 1999 एवं गोवा 1961)", "ऑपरेशन सफेद सागर (वायु सेना कारगिल)", "ऑपरेशन कैक्टस (मालदीव 1988)"),
                correctAnswerIndex = 0,
                explanation = "Operation Meghdoot was launched on 13 April 1984 under which Indian troops preempted Pakistan to establish complete control over the Siachen Glacier and Saltoro Ridge.",
                explanationHindi = "13 अप्रैल 1984 को शुरू किए गए 'ऑपरेशन मेघदूत' के तहत भारतीय सेना ने साल्टोरो रिज और पूरे सियाचिन ग्लेशियर पर पूर्ण सामरिक नियंत्रण स्थापित किया।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "Siachen", "Meghdoot")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_006",
                questionText = "Which Indian supersonic cruise missile has been developed through a successful joint venture between India's DRDO and Russia's NPOM?",
                questionTextHindi = "भारत के DRDO और रूस के NPOM के संयुक्त उपक्रम द्वारा विकसित विश्व प्रसिद्ध सुपरसोनिक क्रूज मिसाइल कौन सी है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Technology",
                chapterOrTopic = "Missile Systems",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("BrahMos (ब्रह्मोस - ब्रह्मपुत्र + मोस्कवा)", "Agni-V", "Prithvi-II", "Akash"),
                optionsHindi = listOf("ब्रह्मोस (BrahMos - ब्रह्मपुत्र एवं मोस्कवा नदियों के नाम पर)", "अग्नि-V (बैलिस्टिक मिसाइल)", "पृथ्वी-II", "आकाश (सतह से हवा में मार करने वाली)"),
                correctAnswerIndex = 0,
                explanation = "BrahMos is named after India's Brahmaputra and Russia's Moskva rivers; it is the world's fastest operational supersonic cruise missile (Mach ~3).",
                explanationHindi = "ब्रह्मोस मिसाइल का नाम भारत की ब्रह्मपुत्र और रूस की मोस्कवा नदी के नाम पर रखा गया है। यह ध्वनि से 3 गुना तेज गति (मैक 3) से चलने वाली घातक क्रूज मिसाइल है।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "BrahMos", "Missiles")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_007",
                questionText = "Indian Navy Day is celebrated every year on 4th December to commemorate which daring naval missile attack during the 1971 Indo-Pak war?",
                questionTextHindi = "भारतीय नौसेना दिवस हर वर्ष 4 दिसंबर को 1971 के भारत-पाक युद्ध के किस साहसिक नौसैनिक हमले की स्मृति में मनाया जाता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Knowledge",
                chapterOrTopic = "Naval Traditions",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Operation Trident (कराची बंदरगाह पर मिसाइल नौकाओं द्वारा हमला)", "Operation Python", "Operation Talwar", "Operation Sukoon"),
                optionsHindi = listOf("ऑपरेशन ट्राइडेंट (Operation Trident - 4 दिसंबर 1971 कराची हमला)", "ऑपरेशन पायथन", "ऑपरेशन तलवार (1999 कारगिल)", "ऑपरेशन सुकून"),
                correctAnswerIndex = 0,
                explanation = "On the night of 4-5 Dec 1971, Indian Navy missile boats sank Pakistani vessels PNS Khaibar and PNS Muhafiz in Operation Trident at Karachi harbor.",
                explanationHindi = "4 दिसंबर 1971 को भारतीय नौसेना ने 'ऑपरेशन ट्राइडेंट' के तहत विद्युत-श्रेणी की मिसाइल बोट्स से कराची बंदरगाह पर हमला कर पाकिस्तानी नौसैनिक जहाजों को डुबो दिया था।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "Navy Day", "1971")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_008",
                questionText = "What is the name of India's first indigenous aircraft carrier (IAC-1) commissioned into the Indian Navy at Kochi in September 2022?",
                questionTextHindi = "सितंबर 2022 में कोच्चि में भारतीय नौसेना में शामिल किए गए भारत के पहले स्वदेशी विमानवाहक पोत (IAC-1) का क्या नाम है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Technology",
                chapterOrTopic = "Aircraft Carriers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("INS Vikrant (आईएनएस विक्रांत)", "INS Vikramaditya", "INS Viraat", "INS Arihant"),
                optionsHindi = listOf("आईएनएस विक्रांत (INS Vikrant - कोचीन शिपयार्ड निर्मित)", "आईएनएस विक्रमादित्य (रूसी मूल का)", "आईएनएस विराट", "आईएनएस अरिहंत (परमाणु पनडुब्बी)"),
                correctAnswerIndex = 0,
                explanation = "INS Vikrant is India's first indigenous aircraft carrier, built by Cochin Shipyard Limited and commissioned by Prime Minister Narendra Modi in Sept 2022.",
                explanationHindi = "आईएनएस विक्रांत (IAC-1) भारत का पहला स्वदेशी विमानवाहक पोत है, जिसे कोचीन शिपयार्ड लिमिटेड ने मेक इन इंडिया के तहत निर्मित किया।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "INS Vikrant", "Navy")
            )
        )

        // ==========================================
        // BIHAR BOARD (BSEB) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_BSEB_002",
                questionText = "Mahatma Gandhi launched his first historic Satyagraha in India in 1917 at which place in Bihar to protest against the oppressive Tinkathia system?",
                questionTextHindi = "बिहार बोर्ड: महात्मा गांधी ने 1917 में तीनकठिया नील व्यवस्था के विरोध में भारत में अपना पहला ऐतिहासिक 'सत्याग्रह' बिहार के किस स्थान से प्रारंभ किया था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Nationalism in India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Champaran (चंपारण - पंडित राजकुमार शुक्ल के आग्रह पर)", "Patna", "Gaya", "Muzaffarpur"),
                optionsHindi = listOf("चंपारण (Champaran)", "पटना", "गया", "मुजफ्फरपुर"),
                correctAnswerIndex = 0,
                explanation = "Gandhiji was invited by Raj Kumar Shukla to Champaran in 1917 where European planters forced farmers to cultivate indigo on 3/20th of their land (Tinkathia).",
                explanationHindi = "पंडित राजकुमार शुक्ल के निमंत्रण पर गांधीजी 1917 में चंपारण आए और किसानों पर थोपी गई तीनकठिया प्रणाली के विरुद्ध सफल सत्याग्रह किया।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Social Science")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_003",
                questionText = "Which river is historically referred to as the 'Sorrow of Bihar' (बिहार का शोक) due to its recurrent devastating seasonal floods?",
                questionTextHindi = "बिहार बोर्ड: अपनी विनाशकारी मौसमी बाढ़ और मार्ग बदलने की प्रवृत्ति के कारण किस नदी को 'बिहार का शोक' कहा जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Disaster Management & Rivers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kosi River (कोसी नदी)", "Gandak River", "Son River", "Bagmati River"),
                optionsHindi = listOf("कोसी नदी (Kosi River)", "गंडक नदी", "सोन नदी", "बागमती नदी"),
                correctAnswerIndex = 0,
                explanation = "Kosi river carries heavy silt loads from the Himalayas, causing extensive flooding in north Bihar, earning the epithet 'Sorrow of Bihar'.",
                explanationHindi = "कोसी नदी हिमालय से भारी गाद लेकर आती है और बार-बार अपना रास्ता बदलती है जिससे उत्तर बिहार में भयंकर बाढ़ आती है, अतः इसे 'बिहार का शोक' कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Geography")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_004",
                questionText = "BSEB Class 10 Science: Which mirror is used in motor vehicles as rear-view mirrors because it always gives an erect, diminished image and a wider field of view?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक विज्ञान: वाहनों में पीछे का दृश्य देखने (Rear-view mirror) हेतु किस दर्पण का उपयोग किया जाता है क्योंकि यह सदैव सीधा, छोटा प्रतिबिंब और विस्तृत दृष्टि-क्षेत्र देता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Light - Reflection & Refraction",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Convex mirror (उत्तल दर्पण)", "Concave mirror (अवतल दर्पण)", "Plane mirror (समतल दर्पण)", "Cylindrical mirror"),
                optionsHindi = listOf("उत्तल दर्पण (Convex Mirror)", "अवतल दर्पण (दाढ़ी बनाने व हेडलाइट में)", "समतल दर्पण", "बेलनाकार दर्पण"),
                correctAnswerIndex = 0,
                explanation = "Convex mirrors are used as rear-view mirrors because they always produce an erect though diminished image and offer a broad field of view.",
                explanationHindi = "उत्तल दर्पण सदैव सीधा व आभासी प्रतिबिंब बनाता है और बाहर की ओर वक्रित होने से ड्राइवर को पीछे का बहुत बड़ा क्षेत्र दिखाई देता है।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_005",
                questionText = "BSEB Class 10 Mathematics: If the roots of quadratic equation ax² + bx + c = 0 are real and equal, then the value of discriminant (D = b² - 4ac) must be:",
                questionTextHindi = "बिहार बोर्ड मैट्रिक गणित: यदि द्विघात समीकरण ax² + bx + c = 0 के मूल वास्तविक एवं समान हों, तो विविक्तकर (Discriminant D = b² - 4ac) का मान क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Quadratic Equations",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("D = 0 (b² - 4ac = 0)", "D > 0", "D < 0", "D = 1"),
                optionsHindi = listOf("D = 0 (शून्य के बराबर)", "D > 0 (वास्तविक और भिन्न मूल)", "D < 0 (काल्पनिक/अवास्तविक मूल)", "D = 1"),
                correctAnswerIndex = 0,
                explanation = "When D = b² - 4ac = 0, both roots of the quadratic equation are real and equal to -b/(2a).",
                explanationHindi = "जब विविक्तकर D = 0 होता है, तो द्विघात समीकरण के दोनों मूल वास्तविक और आपस में समान (-b/2a) होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_006",
                questionText = "BSEB Class 10 Science: What is the chemical formula of Baking Soda (Sodium Hydrogen Carbonate)?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक विज्ञान: बेकिंग सोडा (खाने का सोडा / सोडियम हाइड्रोजन कार्बोनेट) का सही रासायनिक सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Acids, Bases & Salts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("NaHCO₃ (सोडियम बाइकार्बोनेट)", "Na₂CO₃·10H₂O (धोने का सोडा)", "Ca(OH)₂ (बुझा चूना)", "CaOCl₂ (ब्लीचिंग पाउडर)"),
                optionsHindi = listOf("NaHCO₃ (सोडियम हाइड्रोजन कार्बोनेट)", "Na₂CO₃·10H₂O (धावन सोडा)", "Ca(OH)₂ (कैल्शियम हाइड्रॉक्साइड)", "CaOCl₂ (विरंजक चूर्ण)"),
                correctAnswerIndex = 0,
                explanation = "Baking soda is sodium hydrogen carbonate, with chemical formula NaHCO3, widely used in baking and antacid formulations.",
                explanationHindi = "बेकिंग सोडा का रासायनिक नाम सोडियम हाइड्रोजन कार्बोनेट और सूत्र NaHCO₃ है। यह उदर की अम्लता कम करने वाला एंटासिड भी है।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_007",
                questionText = "BSEB Class 10 Hindi: The legendary novel 'Godan' (गोदान), depicting the agrarian struggle of Indian peasantry through character Hori, was written by:",
                questionTextHindi = "बिहार बोर्ड मैट्रिक हिंदी: भारतीय ग्रामीण जीवन एवं किसान होरी की व्यथा को दर्शाने वाले कालजयी उपन्यास 'गोदान' के रचयिता कौन हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Hindi Literature",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Munshi Premchand (मुंशी प्रेमचंद)", "Ramdhari Singh Dinkar", "Phanishwar Nath Renu", "Acharya Ramchandra Shukla"),
                optionsHindi = listOf("मुंशी प्रेमचंद (उपन्यास सम्राट)", "रामधारी सिंह 'दिनकर'", "फणीश्वर नाथ 'रेणु'", "आचार्य रामचंद्र शुक्ल"),
                correctAnswerIndex = 0,
                explanation = "Munshi Premchand (1880-1936), hailed as Upanyas Samrat, authored Godan in 1936.",
                explanationHindi = "'उपन्यास सम्राट' मुंशी प्रेमचंद द्वारा 1936 में रचित 'गोदान' हिंदी साहित्य का सर्वश्रेष्ठ यथार्थवादी उपन्यास माना जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Hindi")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_008",
                questionText = "BSEB Class 10 Science: On which part of the human eye is a real and inverted image of an object formed?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक विज्ञान: मानव नेत्र के किस भाग पर किसी वस्तु का वास्तविक एवं उल्टा प्रतिबिंब बनता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Human Eye & Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Retina / Drishtipatal (दृष्टिपटल / रेटिना)", "Cornea (कॉर्निया)", "Pupil (पुतली)", "Iris (परितारिका)"),
                optionsHindi = listOf("रेटिना / दृष्टिपटल (प्रकाश सुग्राही पर्दा)", "कॉर्निया (स्वच्छ मंडल)", "पुतली (Pupil)", "परितारिका (Iris)"),
                correctAnswerIndex = 0,
                explanation = "Light rays focusing through the eye lens form a real and inverted image on the light-sensitive retina.",
                explanationHindi = "नेत्र लेंस द्वारा प्रकाश की किरणें दृष्टिपटल (रेटिना) पर केंद्रित होती हैं जहाँ वस्तु का वास्तविक तथा उल्टा प्रतिबिंब बनता है, जिसे तंत्रिकाएं मस्तिष्क तक भेजती हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Biology")
            )
        )

        // ==========================================
        // UP BOARD (UPMSP) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_UP_002",
                questionText = "The historic Indian Rebellion of 1857 was formally ignited on 10th May 1857 from which garrison town in Uttar Pradesh?",
                questionTextHindi = "यूपी बोर्ड: 1857 के प्रथम भारतीय स्वतंत्रता संग्राम का औपचारिक शंखनाद 10 मई 1857 को उत्तर प्रदेश की किस सैनिक छावनी से हुआ था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "First War of Independence 1857",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Meerut Cantt (मेरठ छावनी)", "Kanpur", "Lucknow", "Jhansi"),
                optionsHindi = listOf("मेरठ (Meerut Cantt)", "कानपुर (नाना साहब)", "लखनऊ (बेगम हज़रत महल)", "झांसी (रानी लक्ष्मीबाई)"),
                correctAnswerIndex = 0,
                explanation = "On 10 May 1857, Indian sepoys at Meerut rebelled against British officers and marched towards Delhi proclaiming Bahadur Shah Zafar as Emperor.",
                explanationHindi = "10 मई 1857 को मेरठ छावनी के भारतीय सैनिकों ने चर्बी वाले कारतूसों के विरोध में खुला विद्रोह किया और 'दिल्ली चलो' का नारा दिया।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "History")
            )
        )

        list.add(
            Question(
                id = "Q_UP_003",
                questionText = "UP Board Class 10 Hindi: Who composed the celebrated Chhayavadi epic poem 'Kamayani' (कामायनी)?",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल हिंदी: छायावादी युग के अमर महाकाव्य 'कामायनी' (मनु, श्रद्धा और इड़ा का आख्यान) के रचयिता कौन हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Hindi Poetry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Jaishankar Prasad (जयशंकर प्रसाद)", "Suryakant Tripathi Nirala", "Mahadevi Varma", "Sumitranandan Pant"),
                optionsHindi = listOf("जयशंकर प्रसाद", "सूर्यकांत त्रिपाठी 'निराला'", "महादेवी वर्मा", "सुमित्रानंदन पंत"),
                correctAnswerIndex = 0,
                explanation = "Kamayani was published in 1936 by Jaishankar Prasad, representing the pinnacle of Chhayavadi Hindi literature.",
                explanationHindi = "'कामायनी' जयशंकर प्रसाद (1889-1937) द्वारा रचित छायावाद का सर्वश्रेष्ठ महाकाव्य है जिसमें 15 सर्ग हैं।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Hindi")
            )
        )

        list.add(
            Question(
                id = "Q_UP_004",
                questionText = "UP Board Class 10 Science: What is the chemical formula of Washing Soda (Sodium Carbonate Decahydrate)?",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल विज्ञान: धावन सोडा (धोने का सोडा) का सही रासायनिक सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Acids, Bases and Salts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Na₂CO₃·10H₂O (सोडियम कार्बोनेट डेकाहाइड्रेट)", "NaHCO₃ (बेकिंग सोडा)", "CaSO₄·½H₂O (प्लास्टर ऑफ पेरिस)", "CuSO₄·5H₂O (नीला थोथा)"),
                optionsHindi = listOf("Na₂CO₃·10H₂O (सोडियम कार्बोनेट डेकाहाइड्रेट)", "NaHCO₃ (खाने का सोडा)", "CaSO₄·½H₂O (POP)", "CuSO₄·5H₂O"),
                correctAnswerIndex = 0,
                explanation = "Washing soda is sodium carbonate with 10 water molecules of crystallization: Na2CO3·10H2O.",
                explanationHindi = "धावन सोडे का रासायनिक नाम सोडियम कार्बोनेट डेकाहाइड्रेट है तथा इसमें क्रिस्टलन जल के 10 अणु (Na₂CO₃·10H₂O) होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Chemistry")
            )
        )

        list.add(
            Question(
                id = "Q_UP_005",
                questionText = "UP Board Class 10 Mathematics: What is the trigonometric value of (sin²θ + cos²θ) for any real angle θ?",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल गणित: किसी भी वास्तविक कोण θ के लिए त्रिकोणमितीय सर्वसमिका (sin²θ + cos²θ) का मान क्या होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Trigonometric Identities",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1", "0", "-1", "2"),
                optionsHindi = listOf("1 (सदैव एक के बराबर)", "0", "-1", "2"),
                correctAnswerIndex = 0,
                explanation = "By Pythagorean trigonometric identity, sin²θ + cos²θ = 1 for any angle θ.",
                explanationHindi = "पाइथागोरस प्रमेय पर आधारित मौलिक त्रिकोणमितीय सर्वसमिका sin²θ + cos²θ = 1 होती है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_UP_006",
                questionText = "UP Board Class 10 Social Science: At which sacred place near Varanasi in Uttar Pradesh did Gautam Buddha deliver his first sermon (Dharmachakra Pravartana)?",
                questionTextHindi = "यूपी बोर्ड: उत्तर प्रदेश के वाराणसी के निकट किस पवित्र स्थल पर महात्मा बुद्ध ने अपना पहला धर्मोपदेश (धर्मचक्रप्रवर्तन) दिया था?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Ancient Indian Heritage",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Sarnath (सारनाथ - धमेख स्तूप)", "Kushinagar (महापरिनिर्वाण)", "Bodh Gaya (ज्ञान प्राप्ति)", "Lumbini (जन्म स्थल)"),
                optionsHindi = listOf("सारनाथ (वाराणसी, उत्तर प्रदेश)", "कुशीनगर (महापरिनिर्वाण स्थल)", "बोधगया (बिहार)", "लुंबिनी (नेपाल)"),
                correctAnswerIndex = 0,
                explanation = "Lord Buddha preached his first sermon to five ascetics at Deer Park in Sarnath near Varanasi, known as Dharmachakra Pravartana.",
                explanationHindi = "ज्ञान प्राप्ति के पश्चात भगवान बुद्ध ने वाराणसी के निकट सारनाथ (ऋषिपत्तन) के मृगदाव में 5 संन्यासियों को अपना पहला उपदेश दिया जिसे 'धर्मचक्रप्रवर्तन' कहा जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Sarnath")
            )
        )

        list.add(
            Question(
                id = "Q_UP_007",
                questionText = "UP Board Class 10 Science: In plants, which specialized vascular tissue transports water and dissolved mineral nutrients upward from roots to leaves?",
                questionTextHindi = "यूपी बोर्ड मैट्रिक विज्ञान: पौधों में जड़ों से पत्तियों तक जल तथा घुले हुए खनिज लवणों का संवहन किस संवहनी ऊतक द्वारा होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Life Processes - Transportation",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Xylem (जाइलम ऊतक)", "Phloem (फ्लोएम - भोजन संवहन)", "Collenchyma", "Parenchyma"),
                optionsHindi = listOf("जाइलम (Xylem - जल व खनिज संवहन)", "फ्लोएम (Phloem - पत्तियों से भोजन संवहन)", "स्थूलकोण ऊतक", "मृदूतक"),
                correctAnswerIndex = 0,
                explanation = "Xylem vessels and tracheids transport water and minerals unidirectionally from roots to all aerial parts of the plant.",
                explanationHindi = "जाइलम (Xylem) ऊतक पौधों में जल और खनिज लवणों का ऊर्ध्वमुखी संवहन करता है, जबकि फ्लोएम भोजन का परिवहन करता है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Biology")
            )
        )


        // ==========================================
        // UPSC / CIVIL SERVICES QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_UPSC_004",
                questionText = "Which Constitutional Amendment Act of 1976 added the terms 'Socialist', 'Secular', and 'Integrity' to the Preamble of the Indian Constitution?",
                questionTextHindi = "यूपीएससी: 1976 के किस ऐतिहासिक संविधान संशोधन अधिनियम द्वारा भारतीय संविधान की प्रस्तावना में 'समाजवादी', 'पंथनिरपेक्ष' और 'अखंडता' शब्द जोड़े गए थे?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Indian Polity & Preamble",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("42nd Constitutional Amendment Act, 1976", "44th Constitutional Amendment Act, 1978", "73rd Constitutional Amendment Act", "86th Constitutional Amendment Act"),
                optionsHindi = listOf("42वां संविधान संशोधन अधिनियम, 1976 (मिनी संविधान)", "44वां संविधान संशोधन अधिनियम, 1978", "73वां संविधान संशोधन (पंचायती राज)", "86वां संविधान संशोधन (शिक्षा का अधिकार)"),
                correctAnswerIndex = 0,
                explanation = "The 42nd Amendment Act of 1976, enacted during the Emergency, added 'Socialist', 'Secular', and 'Integrity' to the Preamble, and inserted Fundamental Duties (Part IVA).",
                explanationHindi = "42वें संविधान संशोधन (1976) जिसे 'लघु संविधान' भी कहा जाता है, द्वारा प्रस्तावना में 'समाजवादी', 'पंथनिरपेक्ष' और 'अखंडता' शब्द जोड़े गए।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "Polity", "Preamble")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_005",
                questionText = "The meeting point of the Western Ghats and the Eastern Ghats mountain ranges in peninsular India is:",
                questionTextHindi = "प्रायद्वीपीय भारत में पश्चिमी घाट और पूर्वी घाट पर्वत श्रेणियों का मिलन स्थल कौन सी पहाड़ियां हैं?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Indian Geography",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Nilgiri Hills (नीलगिरि पहाड़ियां - डोड्डाबेट्टा)", "Anaimalai Hills", "Cardamom Hills", "Javadi Hills"),
                optionsHindi = listOf("नीलगिरि पहाड़ियां (Nilgiri Hills - सर्वोच्च शिखर डोड्डाबेट्टा)", "अन्नामलाई पहाड़ियां (अनाइमुडी)", "इलायची (कार्डमम) पहाड़ियां", "जावादी पहाड़ियां"),
                correctAnswerIndex = 0,
                explanation = "The Western Ghats and Eastern Ghats converge at the Nilgiri Hills on the borders of Tamil Nadu, Kerala, and Karnataka.",
                explanationHindi = "तमिलनाडु, केरल और कर्नाटक की सीमा पर स्थित नीलगिरि पहाड़ियां (ब्लू माउंटेन) पश्चिमी घाट और पूर्वी घाट का मिलन बिंदु हैं।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "Geography", "Nilgiri")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_006",
                questionText = "The Directive Principles of State Policy (DPSP) enshrined in Part IV of the Indian Constitution were borrowed from which country's constitution?",
                questionTextHindi = "भारतीय संविधान के भाग IV में वर्णित राज्य के नीति निर्देशक तत्व (DPSP) किस देश के संविधान से प्रेरित होकर ग्रहण किए गए हैं?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Constitutional Sources",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Constitution of Ireland (आयरलैंड का संविधान)", "United States Constitution", "British Constitution", "Australian Constitution"),
                optionsHindi = listOf("आयरलैंड का संविधान (Irish Constitution)", "संयुक्त राज्य अमेरिका (मौलिक अधिकार)", "ब्रिटेन का संविधान (संसदीय प्रणाली)", "ऑस्ट्रेलिया का संविधान (समवर्ती सूची)"),
                correctAnswerIndex = 0,
                explanation = "The framers of the Indian Constitution borrowed the concept of Directive Principles of State Policy (Articles 36-51) from the Irish Constitution of 1937.",
                explanationHindi = "संविधान सभा ने राज्य के नीति निर्देशक तत्व (अनुच्छेद 36 से 51) आयरलैंड के संविधान से ग्रहण किए, जो एक कल्याणकारी राज्य की स्थापना का मार्ग प्रशस्त करते हैं।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "DPSP", "Constitution")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_007",
                questionText = "Which Comptroller and Auditor General (CAG) Article of the Indian Constitution mandates the CAG as the guardian of the public purse?",
                questionTextHindi = "भारतीय संविधान का कौन सा अनुच्छेद भारत के नियंत्रक एवं महालेखापरीक्षक (CAG) के स्वतंत्र पद की स्थापना करता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Constitutional Bodies",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Article 148 (अनुच्छेद 148)", "Article 76 (महान्यायवादी)", "Article 280 (वित्त आयोग)", "Article 324 (चुनाव आयोग)"),
                optionsHindi = listOf("अनुच्छेद 148 (नियंत्रक एवं महालेखापरीक्षक)", "अनुच्छेद 76 (भारत का महान्यायवादी)", "अनुच्छेद 280 (वित्त आयोग)", "अनुच्छेद 324 (निर्वाचन आयोग)"),
                correctAnswerIndex = 0,
                explanation = "Article 148 provides for an independent Comptroller and Auditor General of India, appointed by the President by warrant under his hand and seal.",
                explanationHindi = "अनुच्छेद 148 के तहत राष्ट्रपति द्वारा भारत के नियंत्रक एवं महालेखापरीक्षक की नियुक्ति की जाती है, जो सार्वजनिक धन का संरक्षक होता है।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "CAG", "Polity")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_008",
                questionText = "The Monetary Policy Committee (MPC) responsible for fixing the benchmark policy interest rate in India consists of how many members?",
                questionTextHindi = "भारत में बेंचमार्क नीतिगत ब्याज दर (रेपो रेट) निर्धारित करने वाली मौद्रिक नीति समिति (MPC) में कुल कितने सदस्य होते हैं?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Indian Economy & RBI",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("6 Members (3 from RBI and 3 appointed by Central Government)", "5 Members", "8 Members", "10 Members"),
                optionsHindi = listOf("6 सदस्य (3 आरबीआई से और 3 केंद्र सरकार द्वारा नियुक्त)", "5 सदस्य", "8 सदस्य", "10 सदस्य"),
                correctAnswerIndex = 0,
                explanation = "The MPC has 6 members: the RBI Governor (Chairperson ex-officio), Deputy Governor in charge of monetary policy, one RBI officer, and three external members appointed by the Govt.",
                explanationHindi = "मौद्रिक नीति समिति में 6 सदस्य होते हैं (आरबीआई गवर्नर सहित 3 आंतरिक सदस्य तथा केंद्र सरकार द्वारा नियुक्त 3 प्रख्यात अर्थशास्त्री)।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "Economy", "MPC")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_009",
                questionText = "India's first National Park was established in 1936 as Hailey National Park in Uttarakhand. What is its current world-famous name?",
                questionTextHindi = "1936 में उत्तराखंड में 'हैली नेशनल पार्क' के रूप में स्थापित भारत का पहला राष्ट्रीय उद्यान वर्तमान में किस नाम से प्रसिद्ध है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Environment & Ecology",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Jim Corbett National Park (जिम कॉर्बेट राष्ट्रीय उद्यान)", "Kaziranga National Park", "Ranthambore National Park", "Kanha National Park"),
                optionsHindi = listOf("जिम कॉर्बेट राष्ट्रीय उद्यान (उत्तराखंड - 1936 में हैली पार्क)", "काजीरंगा (असम - एक सींग वाला गैंडा)", "रणथंभौर (राजस्थान)", "कान्हा राष्ट्रीय उद्यान (मध्य प्रदेश)"),
                correctAnswerIndex = 0,
                explanation = "Established in 1936 as Hailey National Park to protect the endangered Bengal tiger, it was renamed Ramganga in 1954 and Jim Corbett in 1957.",
                explanationHindi = "1936 में स्थापित हैली राष्ट्रीय उद्यान भारत का सबसे पहला राष्ट्रीय उद्यान था जिसे 1957 में प्रसिद्ध प्रकृतिवादी जिम कॉर्बेट के नाम पर रखा गया।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "Ecology", "Corbett")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_010",
                questionText = "The historic Champaran, Kheda, and Ahmedabad Mill Strike (1917-18) were the earliest mass movements in India led by Mahatma Gandhi. Which of these involved his first hunger strike?",
                questionTextHindi = "गांधीजी के शुरुआती सत्याग्रहों में से किस आंदोलन में उन्होंने पहली बार 'भूख हड़ताल' (आमरण अनशन) का प्रयोग किया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Modern History",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("Ahmedabad Mill Strike (1918 - प्लेग बोनस विवाद)", "Champaran Satyagraha (1917)", "Kheda Satyagraha (1918)", "Rowlatt Satyagraha (1919)"),
                optionsHindi = listOf("अहमदाबाद मिल मजदूर हड़ताल (1918 - पहली भूख हड़ताल)", "चंपारण सत्याग्रह (1917 - पहला सविनय अवज्ञा)", "खेड़ा सत्याग्रह (1918 - पहला असहयोग)", "रॉलेट सत्याग्रह (1919)"),
                correctAnswerIndex = 0,
                explanation = "Gandhiji undertook his first hunger strike during the Ahmedabad Cotton Mill strike in March 1918 demanding a 35% wage hike for textile laborers.",
                explanationHindi = "अहमदाबाद मिल मजदूरों के 35% प्लेग बोनस/वेतन वृद्धि के समर्थन में गांधीजी ने मार्च 1918 में भारत में अपनी पहली भूख हड़ताल की थी।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "History", "Gandhiji")
            )
        )

        list.add(
            Question(
                id = "Q_UPSC_011",
                questionText = "Which landmark Supreme Court judgment of 1973 propounded the 'Basic Structure Doctrine' limiting Parliament's amending power under Article 368?",
                questionTextHindi = "1973 के किस ऐतिहासिक सर्वोच्च न्यायालय के निर्णय में 'संविधान के मूल ढांचे का सिद्धांत' (Basic Structure Doctrine) प्रतिपादित किया गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "UPSC",
                examOrBoard = "UPSC",
                subject = "General Studies",
                chapterOrTopic = "Landmark Judgments",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("Kesavananda Bharati v. State of Kerala (1973)", "Golaknath v. State of Punjab", "Minerva Mills v. Union of India", "Maneka Gandhi v. Union of India"),
                optionsHindi = listOf("केशवानंद भारती बनाम केरल राज्य (1973 - 13 जजों की संविधान पीठ)", "गोलकनाथ बनाम पंजाब राज्य (1967)", "मिनर्वा मिल्स बनाम भारत संघ (1980)", "मेनका गांधी बनाम भारत संघ (1978)"),
                correctAnswerIndex = 0,
                explanation = "In Kesavananda Bharati (1973), a 13-judge constitutional bench ruled by 7-6 that Parliament cannot alter the basic structure or essential framework of the Constitution.",
                explanationHindi = "केशवानंद भारती केस (1973) में सर्वोच्च न्यायालय की सबसे बड़ी 13-सदस्यीय पीठ ने ऐतिहासिक फैसला सुनाया कि संसद संविधान के मूल ढांचे को नहीं बदल सकती।",
                negativeMarks = 0.66f,
                tags = listOf("UPSC", "Basic Structure", "Judiciary")
            )
        )

        // ==========================================
        // MORE DEFENCE QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_DEF_009",
                questionText = "The Indian Military Academy (IMA), which trains officers for the Indian Army, was established in 1932 at which location?",
                questionTextHindi = "भारतीय थल सेना के सैन्य अधिकारियों को प्रशिक्षित करने वाली 'भारतीय सैन्य अकादमी' (IMA) 1932 में कहाँ स्थापित की गई थी?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Knowledge",
                chapterOrTopic = "Officer Training",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Dehradun (Uttarakhand)", "Gwalior", "Mhow", "Chennai (OTA)"),
                optionsHindi = listOf("देहरादून (उत्तराखंड - चेतवूड हॉल)", "ग्वालियर", "महू (मध्य प्रदेश)", "चेन्नई (ऑफिसर्स ट्रेनिंग एकेडमी)"),
                correctAnswerIndex = 0,
                explanation = "The Indian Military Academy (IMA) was inaugurated on 10 December 1932 in Dehradun under Field Marshal Sir Philip Chetwode.",
                explanationHindi = "भारतीय सैन्य अकादमी (IMA) 10 दिसंबर 1932 को देहरादून में स्थापित की गई थी, जिसके मुख्य हॉल को चेतवूड भवन कहा जाता है।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "IMA", "Dehradun")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_010",
                questionText = "Kargil Vijay Diwas is celebrated every year on which date in honor of the heroes of the 1999 Kargil War?",
                questionTextHindi = "1999 के कारगिल युद्ध (ऑपरेशन विजय) में भारतीय सेना के अदम्य पराक्रम के उपलक्ष्य में हर वर्ष 'कारगिल विजय दिवस' किस तारीख को मनाया जाता है?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Knowledge",
                chapterOrTopic = "Military Days",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("26th July (26 जुलाई)", "15th August", "16th December (विजय दिवस 1971)", "15th January (सेना दिवस)"),
                optionsHindi = listOf("26 जुलाई (Kargil Vijay Diwas)", "15 अगस्त", "16 दिसंबर (1971 मुक्ति युद्ध विजय दिवस)", "15 जनवरी (थल सेना दिवस)"),
                correctAnswerIndex = 0,
                explanation = "On 26 July 1999, the Indian Armed Forces successfully recaptured all occupied Indian posts on Tiger Hill, Tololing, and Point 4875 in Operation Vijay.",
                explanationHindi = "26 जुलाई 1999 को भारतीय सेना ने 'ऑपरेशन विजय' के तहत टाइगर हिल और तोलोलिंग सहित सभी चोटियों से घुसपैठियों को खदेड़कर कारगिल युद्ध में ऐतिहासिक विजय हासिल की थी।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "Kargil", "Vijay Diwas")
            )
        )

        list.add(
            Question(
                id = "Q_DEF_011",
                questionText = "Who was appointed as the first Chief of Defence Staff (CDS) of the Indian Armed Forces in December 2019?",
                questionTextHindi = "दिसंबर 2019 में भारतीय सशस्त्र बलों के प्रथम चीफ ऑफ डिफेंस स्टाफ (CDS) के रूप में किन्हें नियुक्त किया गया था?",
                category = "COMPETITIVE_EXAMS",
                subcategory = "DEFENCE",
                examOrBoard = "Defence",
                subject = "Defence Appointments",
                chapterOrTopic = "Armed Forces Command",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("General Bipin Rawat (जनरल बिपिन रावत)", "General Anil Chauhan", "General Manoj Mukund Naravane", "General Dalbir Singh Suhag"),
                optionsHindi = listOf("जनरल बिपिन रावत (प्रथम CDS)", "जनरल अनिल चौहान (वर्तमान CDS)", "जनरल एम.एम. नरवणे", "जनरल दलबीर सिंह सुहाग"),
                correctAnswerIndex = 0,
                explanation = "General Bipin Rawat was appointed India's first Chief of Defence Staff on 30 December 2019 to head the Department of Military Affairs.",
                explanationHindi = "जनरल बिपिन रावत 30 दिसंबर 2019 को भारत के पहले चीफ ऑफ डिफेंस स्टाफ (CDS) बने, जिन्होंने तीनों सेनाओं के संयुक्त समन्वय की नींव रखी।",
                negativeMarks = 0.33f,
                tags = listOf("Defence", "CDS", "Bipin Rawat")
            )
        )

        // ==========================================
        // MORE BIHAR BOARD (BSEB) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_BSEB_009",
                questionText = "BSEB Class 10 Hindi: Which celebrated national poet, known as 'Rashtrakavi' and born in Simariya (Begusarai, Bihar), authored 'Urvashi' and 'Rashmirathi'?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक हिंदी: सिमरिया (बेगूसराय, बिहार) में जन्मे किस राष्ट्रकवि ने 'उर्वशी' और 'रश्मिरथी' जैसे अमर काव्यों की रचना की थी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Hindi Sahitya",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ramdhari Singh 'Dinkar' (रामधारी सिंह 'दिनकर')", "Ramvriksh Benipuri", "Phanishwar Nath 'Renu'", "Vidhyapati"),
                optionsHindi = listOf("रामधारी सिंह 'दिनकर' (राष्ट्रकवि)", "रामवृक्ष बेनीपुरी", "फणीश्वर नाथ 'रेणु'", "मैथिल कोकिल विद्यापति"),
                correctAnswerIndex = 0,
                explanation = "Ramdhari Singh 'Dinkar' (1908-1974) was born in Begusarai, Bihar. He was awarded the Jnanpith Award in 1972 for his poetic work 'Urvashi'.",
                explanationHindi = "राष्ट्रकवि रामधारी सिंह 'दिनकर' का जन्म बेगूसराय के सिमरिया गांव में हुआ था। उन्हें 'उर्वशी' के लिए 1972 में ज्ञानपीठ पुरस्कार से सम्मानित किया गया था।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Dinkar")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_010",
                questionText = "BSEB Class 10 Science: In human circulatory system, which blood vessels carry oxygenated blood from lungs to the left atrium of heart?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक विज्ञान: मानव परिसंचरण तंत्र में फेफड़ों से शुद्ध (ऑक्सीजन युक्त) रक्त को हृदय के बाएं आलिंद तक कौन सी रक्त वाहिका लाती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Life Processes - Circulation",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Pulmonary Vein (फुफ्फुस शिरा)", "Pulmonary Artery", "Aorta (महाधमनी)", "Vena Cava"),
                optionsHindi = listOf("फुफ्फुस शिरा (Pulmonary Vein - अपवाद स्वरूप शुद्ध रक्त ले जाती है)", "फुफ्फुस धमनी (अशुद्ध रक्त फेफड़ों तक ले जाती है)", "महाधमनी (Aorta)", "महाशिरा (Vena Cava)"),
                correctAnswerIndex = 0,
                explanation = "Pulmonary veins are the only veins in the human body that carry oxygenated blood from the lungs into the left atrium of the heart.",
                explanationHindi = "फुफ्फुस शिराएं मानव शरीर की एकमात्र ऐसी शिराएं हैं जो फेफड़ों से ऑक्सीजनित (शुद्ध) रक्त को हृदय के बाएं आलिंद में पहुंचाती हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Biology")
            )
        )

        list.add(
            Question(
                id = "Q_BSEB_011",
                questionText = "BSEB Class 10 History: The ancient university of Nalanda, one of the foremost Buddhist centres of learning in the world, was founded during the reign of which Gupta emperor?",
                questionTextHindi = "बिहार बोर्ड मैट्रिक इतिहास: प्राचीन काल में विश्व प्रसिद्ध नालंदा विश्वविद्यालय की स्थापना किस गुप्त सम्राट के शासनकाल में हुई थी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "BIHAR_BOARD",
                examOrBoard = "Bihar Board",
                targetClass = "Class 10",
                subject = "Social Science",
                chapterOrTopic = "Ancient Bihar Heritage",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kumaragupta I (शक्रादित्य / कुमारगुप्त प्रथम)", "Chandragupta Maurya", "Samudragupta", "Harshavardhana"),
                optionsHindi = listOf("कुमारगुप्त प्रथम (5वीं शताब्दी ईस्वी)", "चंद्रगुप्त मौर्य", "समुद्रगुप्त (भारत का नेपोलियन)", "हर्षवर्धन"),
                correctAnswerIndex = 0,
                explanation = "Nalanda Mahavihara was founded by Gupta Emperor Kumaragupta I in the 5th century CE near modern Rajgir/Bihar Sharif.",
                explanationHindi = "नालंदा महाविहार की स्थापना 5वीं सदी में गुप्त शासक कुमारगुप्त प्रथम ने की थी, जहाँ ह्वेनसांग सहित विश्वभर से छात्र अध्ययन करने आते थे।",
                negativeMarks = 0.0f,
                tags = listOf("Bihar Board", "Class 10", "Nalanda")
            )
        )

        // ==========================================
        // MORE UP BOARD (UPMSP) QUESTIONS
        // ==========================================
        list.add(
            Question(
                id = "Q_UP_008",
                questionText = "UP Board Class 10 Hindi: The famous essay collection 'Chintamani' (चिंतामणि), a masterwork of literary criticism, was authored by:",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल हिंदी: हिंदी आलोचना और निबंधों का शिखर ग्रंथ 'चिंतामणि' (भाग 1 और 2) किसके द्वारा लिखा गया है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Hindi",
                chapterOrTopic = "Hindi Gadya",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Acharya Ramchandra Shukla (आचार्य रामचंद्र शुक्ल)", "Dr. Rajendra Prasad", "Padamlal Punnalal Bakshi", "Jayprakash Bharati"),
                optionsHindi = listOf("आचार्य रामचंद्र शुक्ल (हिंदी साहित्य के मूर्धन्य आलोचक)", "डॉ. राजेंद्र प्रसाद", "पदुमलाल पुन्नालाल बख्शी", "जयप्रकाश भारती"),
                correctAnswerIndex = 0,
                explanation = "Acharya Ramchandra Shukla (1884-1941) was born in Basti, Uttar Pradesh. His essay collection 'Chintamani' is a cornerstone of Hindi critical prose.",
                explanationHindi = "बस्ती (उत्तर प्रदेश) में जन्मे आचार्य रामचंद्र शुक्ल द्वारा रचित 'चिंतामणि' मनोविकार एवं साहित्य समीक्षा पर आधारित कालजयी निबंध संग्रह है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Hindi")
            )
        )

        list.add(
            Question(
                id = "Q_UP_009",
                questionText = "UP Board Class 10 Science: What is the SI unit of electric current?",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल विज्ञान: विद्युत धारा (Electric Current, I = Q/t) का अंतर्राष्ट्रीय मानक (SI) मात्रक क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ampere (A - एम्पीयर)", "Volt (V)", "Joule (J)", "Coulomb (C)"),
                optionsHindi = listOf("एम्पीयर (Ampere - प्रतीक A)", "वोल्ट (विभवांतर)", "जूल (ऊर्जा/कार्य)", "कूलॉम (विद्युत आवेश)"),
                correctAnswerIndex = 0,
                explanation = "Electric current is the rate of flow of electric charge (I = Q/t). Its SI unit is Ampere (A = Coulomb/second).",
                explanationHindi = "विद्युत धारा आवेश प्रवाह की दर (I = Q/t) होती है तथा इसका SI मात्रक एम्पीयर (कूलॉम प्रति सेकंड) है।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Physics")
            )
        )

        list.add(
            Question(
                id = "Q_UP_010",
                questionText = "UP Board Class 10 Science: In a neutralization reaction, what two products are formed when an acid reacts with a base?",
                questionTextHindi = "यूपी बोर्ड हाईस्कूल विज्ञान: उदासीनीकरण अभिक्रिया में जब कोई अम्ल किसी क्षारक के साथ क्रिया करता है, तो कौन से दो उत्पाद बनते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "UP_BOARD",
                examOrBoard = "UP Board",
                targetClass = "Class 10",
                subject = "Science",
                chapterOrTopic = "Acids, Bases & Salts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Salt and Water (लवण तथा जल)", "Hydrogen gas and Salt", "Carbon dioxide and Salt", "Oxygen and Acid"),
                optionsHindi = listOf("लवण और जल (Acid + Base → Salt + Water)", "हाइड्रोजन गैस और लवण", "कार्बन डाइऑक्साइड और लवण", "ऑक्सीजन और अम्ल"),
                correctAnswerIndex = 0,
                explanation = "Acid + Base → Salt + Water (e.g., HCl + NaOH → NaCl + H2O), known as a neutralization reaction.",
                explanationHindi = "अम्ल एवं क्षारक की परस्पर अभिक्रिया से लवण तथा जल का निर्माण होता है (उदा. HCl + NaOH → NaCl + H₂O), इसे उदासीनीकरण कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("UP Board", "Class 10", "Chemistry")
            )
        )


        // --- CLASS 10 CBSE PHYSICS (10 QUESTIONS) ---
        list.add(
            Question(
                id = "Q_CBSE10_PHY_001",
                questionText = "CBSE Class 10 Physics: Which type of spherical mirror is used as a rear-view (wing) mirror in vehicles?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: वाहनों में पीछे का ट्रैफिक देखने के लिए पश्च-दृश्य (रियर-व्यू) दर्पण के रूप में किस प्रकार के गोलीय दर्पण का उपयोग किया जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Light - Reflection and Refraction",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Convex mirror (उत्तल दर्पण)", "Concave mirror (अवतल दर्पण)", "Plane mirror (समतल दर्पण)", "Cylindrical mirror (बेलनाकार दर्पण)"),
                optionsHindi = listOf("उत्तल दर्पण (Convex Mirror)", "अवतल दर्पण (Concave Mirror)", "समतल दर्पण (Plane Mirror)", "बेलनाकार दर्पण"),
                correctAnswerIndex = 0,
                explanation = "Convex mirrors always give an erect, diminished virtual image and have a wide field of view, enabling drivers to see large traffic areas behind.",
                explanationHindi = "उत्तल दर्पण सदैव सीधा, आभासी तथा छोटा प्रतिबिंब बनाता है एवं इसका दृष्टि क्षेत्र बहुत विस्तृत होता है जिससे चालक पीछे का बड़ा क्षेत्र देख सकता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Light")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_002",
                questionText = "CBSE Class 10 Physics: What is the relationship between the focal length (f) and radius of curvature (R) of a spherical mirror with small aperture?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: छोटे द्वारक वाले किसी गोलीय दर्पण की फोकस दूरी (f) और वक्रता त्रिज्या (R) के बीच क्या संबंध होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Light - Reflection and Refraction",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("f = R / 2", "f = 2R", "f = R", "f = 1 / (2R)"),
                optionsHindi = listOf("f = R / 2 (फोकस दूरी वक्रता त्रिज्या की आधी होती है)", "f = 2R", "f = R", "f = 1 / (2R)"),
                correctAnswerIndex = 0,
                explanation = "The principal focus of a spherical mirror with small aperture lies exactly midway between the pole and center of curvature, so f = R/2.",
                explanationHindi = "छोटे द्वारक के गोलीय दर्पण का मुख्य फोकस ध्रुव और वक्रता केंद्र के ठीक मध्य में स्थित होता है, अतः f = R/2।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Optics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_003",
                questionText = "CBSE Class 10 Physics: According to the New Cartesian Sign Convention, the mirror formula relating object distance (u), image distance (v), and focal length (f) is:",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: नई कार्तीय चिन्ह परिपाटी के अनुसार, बिंब दूरी (u), प्रतिबिंब दूरी (v) और फोकस दूरी (f) के बीच सही दर्पण सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Light - Reflection and Refraction",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("1/f = 1/v + 1/u", "1/f = 1/v - 1/u", "f = v + u", "1/f = (v * u)/(v + u)"),
                optionsHindi = listOf("1/f = 1/v + 1/u (दर्पण सूत्र)", "1/f = 1/v - 1/u (लेंस सूत्र)", "f = v + u", "1/f = (v * u)/(v + u)"),
                correctAnswerIndex = 0,
                explanation = "The mirror formula is 1/f = 1/v + 1/u, valid for all spherical mirrors for all positions of the object.",
                explanationHindi = "दर्पण सूत्र 1/f = 1/v + 1/u होता है, जो सभी प्रकार के गोलीय दर्पणों और सभी स्थितियों के लिए मान्य है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Mirror Formula")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_004",
                questionText = "CBSE Class 10 Physics: What is the SI unit of power of a lens (P)?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: लेंस की क्षमता (Power of a Lens, P) का SI मात्रक क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Light - Reflection and Refraction",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Dioptre (डायोप्टर, D)", "Watt (वाट)", "Joule (जूल)", "Centimeter (सेमी)"),
                optionsHindi = listOf("डायोप्टर (Dioptre - प्रतीक D)", "वाट (Watt)", "जूल (Joule)", "सेंटीमीटर (cm)"),
                correctAnswerIndex = 0,
                explanation = "Power of lens is reciprocal of focal length in metres (P = 1/f(m)). Its SI unit is Dioptre (1 D = 1 m⁻¹).",
                explanationHindi = "लेंस की क्षमता मीटर में व्यक्त फोकस दूरी का व्युत्क्रम (P = 1/f(m)) होती है तथा इसका SI मात्रक डायोप्टर (D = m⁻¹) है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Lens")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_005",
                questionText = "CBSE Class 10 Physics: A convex lens has a focal length of +50 cm. What is its optical power in dioptres?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: एक उत्तल लेंस की फोकस दूरी +50 सेमी है। इसकी प्रकाशिक क्षमता डायोप्टर में कितनी होगी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Light - Reflection and Refraction",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("+2.0 D", "-2.0 D", "+0.02 D", "+5.0 D"),
                optionsHindi = listOf("+2.0 D (उत्तल लेंस की क्षमता धनात्मक)", "-2.0 D", "+0.02 D", "+5.0 D"),
                correctAnswerIndex = 0,
                explanation = "Focal length f = +50 cm = +0.5 m. Power P = 1 / f = 1 / 0.5 = +2.0 Dioptres.",
                explanationHindi = "फोकस दूरी f = +50 cm = +0.5 मीटर। क्षमता P = 1 / f = 1 / 0.5 = +2.0 डायोप्टर।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Optics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_006",
                questionText = "CBSE Class 10 Physics: What is the least distance of distinct vision (near point) for a normal human eye?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: एक सामान्य स्वस्थ मानव नेत्र के लिए स्पष्ट दृष्टि की न्यूनतम दूरी (निकट-बिंदु) कितनी होती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Human Eye and Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("25 cm", "2.5 cm", "25 m", "Infinity (अनंत)"),
                optionsHindi = listOf("25 सेमी (25 cm)", "2.5 सेमी", "25 मीटर", "अनंत (Infinity)"),
                correctAnswerIndex = 0,
                explanation = "The minimum distance at which objects can be seen most distinctly without muscular strain on the ciliary muscles is 25 cm.",
                explanationHindi = "नेत्र के सिलीयरी पेशियों पर बिना किसी खिंचाव के स्पष्ट रूप से देखने की न्यूनतम दूरी 25 सेमी होती है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Human Eye")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_007",
                questionText = "CBSE Class 10 Physics: Myopia (near-sightedness) is an eye defect that can be corrected by using a lens of suitable power:",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: निकट-दृष्टि दोष (मायोपिया) को किस प्रकार के लेंस का उपयोग करके ठीक किया जा सकता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Human Eye and Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Concave lens (अवतल लेंस)", "Convex lens (उत्तल लेंस)", "Bifocal lens (द्विफोकसी लेंस)", "Cylindrical lens"),
                optionsHindi = listOf("अवतल लेंस (Concave Lens)", "उत्तल लेंस (Convex Lens)", "द्विफोकसी लेंस (Bifocal Lens)", "बेलनाकार लेंस"),
                correctAnswerIndex = 0,
                explanation = "In myopia, light rays from a distant object focus in front of retina. A diverging (concave) lens diverges rays back onto the retina.",
                explanationHindi = "मायोपिया में दूर की वस्तु का प्रतिबिंब रेटिना के आगे बन जाता है। अपसारी (अवतल) लेंस किरणों को फैलाकर रेटिना पर केंद्रित करता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Eye Defects")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_008",
                questionText = "CBSE Class 10 Physics: The twinkling of stars in the clear night sky is caused by which optical phenomenon?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: स्वच्छ रात्रि में तारों का टिमटिमाना किस प्रकाशिक परिघटना के कारण होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Human Eye and Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Atmospheric refraction (वायुमंडलीय अपवर्तन)", "Dispersion of light", "Total internal reflection", "Tyndall effect"),
                optionsHindi = listOf("वायुमंडलीय अपवर्तन (Atmospheric Refraction)", "प्रकाश का विक्षेपण", "पूर्ण आंतरिक परावर्तन", "टिंडल प्रभाव"),
                correctAnswerIndex = 0,
                explanation = "Atmospheric refraction occurs due to gradual change in refractive index of air layers with varying temperatures, making starlight twinkle.",
                explanationHindi = "वायुमंडल की विभिन्न परतों के घनत्व व तापमान में निरंतर परिवर्तन से अपवर्तनांक बदलता रहता है, जिससे प्रकाश का वायुमंडलीय अपवर्तन होता है और तारे टिमटिमाते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Atmospheric Refraction")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_009",
                questionText = "CBSE Class 10 Physics: Why does the clear sky appear blue during daytime?",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: दिन के समय स्वच्छ आकाश का रंग नीला क्यों दिखाई देता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Human Eye and Colourful World",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Rayleigh scattering of shorter blue wavelengths by atmospheric gas molecules", "Refraction through water droplets", "Absorption of red color by ozone", "Reflection from oceans"),
                optionsHindi = listOf("वायुमंडलीय अणुओं द्वारा नीले रंग की छोटी तरंगदैर्घ्य का तीव्र प्रकीर्णन (Rayleigh Scattering)", "जल की बूंदों द्वारा अपवर्तन", "ओजोन द्वारा लाल रंग का अवशोषण", "समुद्र के जल का परावर्तन"),
                correctAnswerIndex = 0,
                explanation = "According to Rayleigh scattering, scattering intensity is inversely proportional to λ⁴. Shorter blue wavelengths scatter much more than longer red wavelengths.",
                explanationHindi = "रैले प्रकीर्णन नियमानुसार प्रकीर्णन तीव्रता (1/λ⁴) के समानुपाती होती है, अतः छोटी तरंगदैर्घ्य वाला नीला प्रकाश वायुमंडल में सबसे अधिक प्रकीर्णित होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Scattering")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_PHY_010",
                questionText = "CBSE Class 10 Physics: According to Ohm's law, at constant temperature, the current (I) flowing through a metallic conductor is:",
                questionTextHindi = "सीबीएसई कक्षा 10 भौतिकी: ओम के नियम के अनुसार, स्थिर ताप पर किसी चालक तार में प्रवाहित विद्युत धारा (I):",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Directly proportional to potential difference (V ∝ I)", "Inversely proportional to potential difference", "Independent of voltage", "Directly proportional to square of voltage"),
                optionsHindi = listOf("चालक के सिरों के बीच विभवांतर के अनुक्रमानुपाती होती है (V ∝ I)", "विभवांतर के व्युत्क्रमानुपाती होती है", "विभवांतर से पूर्णतः स्वतंत्र होती है", "विभवांतर के वर्ग के समानुपाती होती है"),
                correctAnswerIndex = 0,
                explanation = "Ohm's Law: V = IR, meaning potential difference V is directly proportional to current I across constant resistance R.",
                explanationHindi = "ओम का नियम: V = IR, अर्थात एकसमान तापमान और भौतिक परिस्थितियों में विभवांतर प्रवाहित धारा के समानुपाती होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Physics", "Science", "Ohm's Law")
            )
        )

        // --- CLASS 10 RBSE & GENERAL NCERT PHYSICS (10 QUESTIONS) ---
        list.add(
            Question(
                id = "Q_RBSE10_PHY_001",
                questionText = "RBSE Class 10 Physics: If a wire of resistance R is stretched uniformly to double its original length, its new electrical resistance will be:",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: यदि R प्रतिरोध वाले किसी एकसमान तार को खींचकर उसकी मूल लंबाई का दोगुना कर दिया जाए, तो उसका नया प्रतिरोध क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Electricity",
                difficulty = "HARD",
                language = "BOTH",
                options = listOf("4R", "2R", "R/2", "R/4"),
                optionsHindi = listOf("4R (प्रतिरोध चार गुना हो जाएगा)", "2R", "R/2", "R/4"),
                correctAnswerIndex = 0,
                explanation = "When length doubles (l' = 2l), cross-sectional area halves (A' = A/2) keeping volume constant. New R' = ρ(2l)/(A/2) = 4ρ(l/A) = 4R.",
                explanationHindi = "तार खींचने पर आयतन स्थिर रहने से लंबाई दोगुनी (2l) होने पर अनुप्रस्थ काट क्षेत्रफल आधा (A/2) हो जाता है। अतः नया प्रतिरोध R' = 4R होता है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Electricity")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_002",
                questionText = "RBSE Class 10 Physics: What is the equivalent resistance when two resistors of 4 Ω and 12 Ω are connected in parallel combination?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: जब 4 Ω और 12 Ω के दो प्रतिरोधकों को समानांतर (पार्श्वक्रम) में जोड़ा जाता है, तो तुल्य प्रतिरोध क्या होगा?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Electricity",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("3 Ω", "16 Ω", "8 Ω", "1.5 Ω"),
                optionsHindi = listOf("3 Ω", "16 Ω", "8 Ω", "1.5 Ω"),
                correctAnswerIndex = 0,
                explanation = "In parallel: 1/Req = 1/4 + 1/12 = (3+1)/12 = 4/12 = 1/3. Therefore Req = 3 Ω.",
                explanationHindi = "पार्श्वक्रम सूत्र: 1/Req = 1/4 + 1/12 = 4/12 = 1/3, अतः तुल्य प्रतिरोध Req = 3 Ω।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Resistors")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_003",
                questionText = "RBSE Class 10 Physics: According to Joule's law of heating, the heat produced (H) in a conductor of resistance R with current I for time t is:",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: जूल के तापन नियम के अनुसार, प्रतिरोध R वाले चालक में समय t के लिए धारा I प्रवाहित होने पर उत्पन्न ऊष्मा (H) का सही सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("H = I² * R * t", "H = I * R² * t", "H = I² * t / R", "H = I * R * t"),
                optionsHindi = listOf("H = I² * R * t (जूल का तापन नियम)", "H = I * R² * t", "H = I² * t / R", "H = I * R * t"),
                correctAnswerIndex = 0,
                explanation = "Joule's law: Heat produced in a resistor is directly proportional to square of current, resistance, and time: H = I²Rt Joules.",
                explanationHindi = "जूल का तापन नियम: उत्पन्न ऊष्मा धारा के वर्ग, प्रतिरोध तथा समय के अनुक्रमानुपाती होती है: H = I²Rt जूल।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Heating Effect")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_004",
                questionText = "RBSE Class 10 Physics: How many Joules of energy are equivalent to 1 kilowatt-hour (1 kWh), the commercial unit of electricity?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: विद्युत ऊर्जा के व्यावसायिक मात्रक 1 किलोवाट-घंटा (1 kWh / 1 यूनिट) में कितने जूल होते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Electricity",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("3.6 × 10⁶ J", "3.6 × 10⁵ J", "1.0 × 10³ J", "3.6 × 10⁴ J"),
                optionsHindi = listOf("3.6 × 10⁶ जूल (3,600,000 J)", "3.6 × 10⁵ जूल", "1.0 × 10³ जूल", "3.6 × 10⁴ जूल"),
                correctAnswerIndex = 0,
                explanation = "1 kWh = 1000 W × 3600 seconds = 3,600,000 J = 3.6 × 10⁶ Joules.",
                explanationHindi = "1 kWh = 1000 वाट × 3600 सेकंड = 36,00,000 जूल = 3.6 × 10⁶ जूल।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Units")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_005",
                questionText = "RBSE Class 10 Physics: In Fleming's Left-Hand Rule, what physical quantity does the forefinger point towards?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: फ्लेमिंग के वामहस्त (बाएं हाथ) के नियम में तर्जनी (forefinger) किस भौतिक राशि की दिशा दर्शाती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Magnetic Effects of Electric Current",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Direction of magnetic field", "Direction of electric current", "Direction of motion or magnetic force", "Direction of induced EMF"),
                optionsHindi = listOf("चुंबकीय क्षेत्र की दिशा (Magnetic Field)", "विद्युत धारा की दिशा (Current)", "गति या यांत्रिक बल की दिशा (Motion/Force)", "प्रेरित धारा की दिशा"),
                correctAnswerIndex = 0,
                explanation = "In Fleming's Left-Hand Rule: Forefinger = Magnetic Field (B), Center finger = Current (I), Thumb = Force/Motion (F).",
                explanationHindi = "फ्लेमिंग के बाएं हाथ के नियम में: तर्जनी = चुंबकीय क्षेत्र, मध्यमा = विद्युत धारा, और अंगूठा = चालक पर आरोपित बल/गति।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Magnetism")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_006",
                questionText = "RBSE Class 10 Physics: Which rule is used to determine the direction of concentric magnetic field lines around a straight current-carrying wire?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: किसी सीधे धारावाही चालक तार के चारों ओर संकेन्द्री चुंबकीय क्षेत्र रेखाओं की दिशा ज्ञात करने के लिए किस नियम का उपयोग किया जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Magnetic Effects of Electric Current",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Right-Hand Thumb Rule (दक्षिण-हस्त अंगुष्ठ नियम)", "Fleming's Left-Hand Rule", "Snell's Law of Refraction", "Faraday's Law"),
                optionsHindi = listOf("दक्षिण-हस्त अंगुष्ठ नियम (Right-Hand Thumb Rule)", "फ्लेमिंग का वामहस्त नियम", "स्नेल का नियम", "फैराडे का नियम"),
                correctAnswerIndex = 0,
                explanation = "Maxwell's Right-Hand Thumb Rule: Point thumb along electric current; the curled fingers wrap in direction of circular magnetic field lines.",
                explanationHindi = "दाहिने हाथ के अंगूठे को धारा की दिशा में रखने पर मुड़ी हुई अंगुलियां चुंबकीय क्षेत्र रेखाओं की दिशा को प्रदर्शित करती हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Electromagnetism")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_007",
                questionText = "RBSE Class 10 Physics: The magnetic field lines inside a long current-carrying cylindrical solenoid are:",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: एक लंबी धारावाही परिनालिका (Solenoid) के भीतर चुंबकीय क्षेत्र रेखाएं कैसी होती हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Magnetic Effects of Electric Current",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Uniform and parallel straight lines", "Concentric circular loops", "Zero everywhere inside", "Perpendicular to the axis"),
                optionsHindi = listOf("एकसमान तथा समानांतर सीधी रेखाएं", "संकेन्द्री वृत्ताकार लूप", "भीतर सभी जगह शून्य", "अक्ष के लंबवत"),
                correctAnswerIndex = 0,
                explanation = "Inside a long solenoid, the magnetic field lines are straight and parallel, meaning magnetic field is uniform and constant at all interior points.",
                explanationHindi = "परिनालिका के भीतर चुंबकीय क्षेत्र रेखाएं समानांतर सरल रेखाओं की भांति होती हैं, जो दर्शाती हैं कि इसके भीतर सभी बिंदुओं पर चुंबकीय क्षेत्र एकसमान है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Solenoid")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_008",
                questionText = "RBSE Class 10 Physics: In domestic electric power circuits in India, what are the potential difference and frequency of the AC supply?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: भारत में घरेलू विद्युत परिपथों में आपूर्ति की जाने वाली प्रत्यावर्ती धारा (AC) का विभवांतर और आवृत्ति कितनी होती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Magnetic Effects of Electric Current",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("220 V at 50 Hz", "110 V at 60 Hz", "440 V at 50 Hz", "220 V at 60 Hz"),
                optionsHindi = listOf("220 V और 50 Hz (220 वोल्ट, 50 हर्ट्ज)", "110 V और 60 Hz", "440 V और 50 Hz", "220 V और 60 Hz"),
                correctAnswerIndex = 0,
                explanation = "Standard domestic electricity in India is supplied at an alternating voltage of 220 V and an AC frequency of 50 Hz.",
                explanationHindi = "भारत में घरों में प्रयुक्त प्रत्यावर्ती विद्युत आपूर्ति का मानक विभवांतर 220 वोल्ट और आवृत्ति 50 हर्ट्ज होती है।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Domestic Circuits")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_009",
                questionText = "RBSE Class 10 Physics: An electric safety fuse is always connected in which wire of a domestic electric supply?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: घरेलू विद्युत परिपथ में सुरक्षात्मक विद्युत फ्यूज को सदैव किस तार के साथ श्रेणीक्रम में जोड़ा जाता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Magnetic Effects of Electric Current",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Live wire (विद्युन्मय तार)", "Neutral wire (उदासीन तार)", "Earth wire (भू-संपर्क तार)", "In parallel across appliance"),
                optionsHindi = listOf("विद्युन्मय / फेज़ तार (Live Wire) के साथ श्रेणीक्रम में", "उदासीन तार (Neutral Wire)", "भू-संपर्क तार (Earth Wire)", "उपकरण के समानांतर"),
                correctAnswerIndex = 0,
                explanation = "The fuse is connected in series with the live wire so that during excessive current or short circuit, it breaks the high voltage live path completely.",
                explanationHindi = "विद्युत फ्यूज को हमेशा विद्युन्मय (लाइव) तार के श्रेणीक्रम में जोड़ा जाता है ताकि शॉर्ट सर्किट होने पर यह पिघलकर तुरंत उच्च विभव का संपर्क तोड़ दे।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Safety Fuse")
            )
        )

        list.add(
            Question(
                id = "Q_RBSE10_PHY_010",
                questionText = "RBSE Class 10 Physics: Which of the following is a clean, renewable, and environmentally sustainable source of energy?",
                questionTextHindi = "आरबीएसई कक्षा 10 भौतिकी: निम्नलिखित में से कौन सा ऊर्जा का स्वच्छ, नवीकरणीय और पर्यावरण-अनुकूल स्रोत है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "RBSE",
                examOrBoard = "RBSE",
                targetClass = "Class 10",
                subject = "Physics",
                chapterOrTopic = "Sources of Energy",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Solar energy (सौर ऊर्जा)", "Coal (कोयला)", "Petroleum (पेट्रोलियम)", "Natural gas (प्राकृतिक गैस)"),
                optionsHindi = listOf("सौर ऊर्जा (Solar Energy - नवीकरणीय स्रोत)", "कोयला (Coal)", "पेट्रोलियम (Petroleum)", "प्राकृतिक गैस"),
                correctAnswerIndex = 0,
                explanation = "Solar radiation is inexhaustible and emits no greenhouse gases, making it a sustainable renewable source, unlike fossil fuels.",
                explanationHindi = "सौर ऊर्जा एक असीमित व गैर-प्रदूषणकारी नवीकरणीय ऊर्जा स्रोत है, जबकि कोयला और पेट्रोलियम सीमित जीवाश्म ईंधन हैं।",
                negativeMarks = 0.0f,
                tags = listOf("RBSE", "Class 10", "Physics", "Science", "Energy")
            )
        )

        // --- CLASS 10 CHEMISTRY & BIOLOGY EXPANSIONS (10 QUESTIONS) ---
        list.add(
            Question(
                id = "Q_CBSE10_CHM_001",
                questionText = "CBSE Class 10 Chemistry: Why must every chemical equation be balanced in accordance with fundamental laws?",
                questionTextHindi = "सीबीएसई कक्षा 10 रसायन विज्ञान: किसी भी रासायनिक समीकरण को किस मूलभूत नियम के अनुपालन में संतुलित करना आवश्यक होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Chemistry",
                chapterOrTopic = "Chemical Reactions and Equations",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Law of Conservation of Mass", "Law of Constant Proportions", "Avogadro's Hypothesis", "Boyle's Law"),
                optionsHindi = listOf("द्रव्यमान संरक्षण का नियम (Law of Conservation of Mass)", "स्थिर अनुपात का नियम", "आवोगाद्रो की परिकल्पना", "बॉयल का नियम"),
                correctAnswerIndex = 0,
                explanation = "Matter can neither be created nor destroyed in a chemical reaction; hence total mass and atom counts of reactants must equal products.",
                explanationHindi = "द्रव्यमान संरक्षण के नियम के अनुसार किसी रासायनिक अभिक्रिया में न तो द्रव्यमान का निर्माण हो सकता है और न ही विनाश, अतः दोनों ओर परमाणुओं की संख्या समान होनी चाहिए।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Chemistry", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_CHM_002",
                questionText = "CBSE Class 10 Chemistry: What is the chemical formula of Plaster of Paris (POP)?",
                questionTextHindi = "सीबीएसई कक्षा 10 रसायन विज्ञान: प्लास्टर ऑफ पेरिस (POP) का सही रासायनिक सूत्र क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Chemistry",
                chapterOrTopic = "Acids, Bases and Salts",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("CaSO4 · 1/2 H2O", "CaSO4 · 2 H2O", "CaCO3", "CaOCl2"),
                optionsHindi = listOf("CaSO4 · 1/2 H2O (कैल्शियम सल्फेट हेमीहाइड्रेट)", "CaSO4 · 2 H2O (जिप्सम)", "CaCO3 (चूना पत्थर)", "CaOCl2 (विरंजक चूर्ण)"),
                correctAnswerIndex = 0,
                explanation = "Plaster of Paris is Calcium Sulphate Hemihydrate (CaSO4 · 1/2 H2O), obtained by heating gypsum (CaSO4 · 2 H2O) at 373 K.",
                explanationHindi = "जिप्सम को 373 K पर गर्म करने पर यह जल के अणुओं का त्याग कर कैल्शियम सल्फेट हेमीहाइड्रेट (CaSO₄·½H₂O) बनाता है जिसे प्लास्टर ऑफ पेरिस कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Chemistry", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_CHM_003",
                questionText = "CBSE Class 10 Chemistry: Oxides of metals that react with both acids and bases to produce salt and water are called:",
                questionTextHindi = "सीबीएसई कक्षा 10 रसायन विज्ञान: वे धातु ऑक्साइड जो अम्ल और क्षारक दोनों के साथ अभिक्रिया करके लवण तथा जल बनाते हैं, क्या कहलाते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Chemistry",
                chapterOrTopic = "Metals and Non-metals",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Amphoteric oxides (उभयधर्मी ऑक्साइड)", "Basic oxides", "Acidic oxides", "Neutral oxides"),
                optionsHindi = listOf("उभयधर्मी ऑक्साइड (Amphoteric Oxides - जैसे Al2O3, ZnO)", "क्षारकीय ऑक्साइड", "अम्लीय ऑक्साइड", "उदासीन ऑक्साइड"),
                correctAnswerIndex = 0,
                explanation = "Amphoteric oxides (e.g., Al2O3, ZnO) exhibit dual character by reacting with both acids and bases to form salt and water.",
                explanationHindi = "एल्युमिनियम ऑक्साइड (Al₂O₃) तथा जिंक ऑक्साइड (ZnO) जैसे ऑक्साइड अम्ल तथा क्षारक दोनों से क्रिया करते हैं, इन्हें उभयधर्मी ऑक्साइड कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Chemistry", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_BIO_001",
                questionText = "CBSE Class 10 Biology: What is the basic microscopic filtration unit of the human kidney?",
                questionTextHindi = "सीबीएसई कक्षा 10 जीव विज्ञान: मानव वृक्क (किडनी) की मूलभूत सूक्ष्म संरचनात्मक एवं क्रियात्मक निस्यंदन इकाई क्या है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Biology",
                chapterOrTopic = "Life Processes",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Nephron (नेफ्रॉन / वृक्काणु)", "Neuron (न्यूरॉन)", "Alveoli (कूपिका)", "Villi"),
                optionsHindi = listOf("नेफ्रॉन (Nephron / वृक्काणु)", "न्यूरॉन (तंत्रिका कोशिका)", "कूपिका (Alveoli - फेफड़े)", "दीर्घरोम (Villi)"),
                correctAnswerIndex = 0,
                explanation = "Each kidney contains approximately one million filtration units called nephrons, consisting of Bowman's capsule and renal tubules.",
                explanationHindi = "प्रत्येक वृक्क में लगभग 10 लाख सूक्ष्म निस्यंदन इकाइयां पाई जाती हैं जिन्हें वृक्काणु (नेफ्रॉन) कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Biology", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_BIO_002",
                questionText = "CBSE Class 10 Biology: In human digestive system, where does the complete digestion of carbohydrates, proteins, and fats occur?",
                questionTextHindi = "सीबीएसई कक्षा 10 जीव विज्ञान: मानव पाचन तंत्र में कार्बोहाइड्रेट, प्रोटीन तथा वसा का पूर्ण पाचन किस अंग में होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Biology",
                chapterOrTopic = "Life Processes",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Small intestine (क्षुद्रांत्र / छोटी आंत)", "Stomach (आमाशय)", "Large intestine", "Esophagus"),
                optionsHindi = listOf("छोटी आंत / क्षुद्रांत्र (Small Intestine)", "आमाशय (Stomach)", "बड़ी आंत (Large Intestine)", "ग्रासनली"),
                correctAnswerIndex = 0,
                explanation = "Small intestine receives bile juice, pancreatic enzymes, and intestinal juices to accomplish complete digestion of all macromolecules.",
                explanationHindi = "क्षुद्रांत्र में पित्तरस, अग्न्याशयी रस तथा आंत्र रस द्वारा कार्बोहाइड्रेट, प्रोटीन और वसा का पूर्ण पाचन संपन्न होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Biology", "Science")
            )
        )


        // --- CLASS 10 MATHEMATICS EXPANSION (5 QUESTIONS) ---
        list.add(
            Question(
                id = "Q_CBSE10_M_005",
                questionText = "CBSE Class 10 Mathematics: What is the discriminant (D) of the quadratic equation 2x² - 4x + 3 = 0, and what is the nature of its roots?",
                questionTextHindi = "सीबीएसई कक्षा 10 गणित: द्विघात समीकरण 2x² - 4x + 3 = 0 का विविक्तकर (D) क्या होगा और मूलों की प्रकृति कैसी होगी?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Quadratic Equations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("-8 (No real roots)", "8 (Two real roots)", "0 (Equal roots)", "-16 (No real roots)"),
                optionsHindi = listOf("D = -8 (कोई वास्तविक मूल नहीं)", "D = 8 (दो वास्तविक मूल)", "D = 0 (समान मूल)", "D = -16"),
                correctAnswerIndex = 0,
                explanation = "Discriminant D = b² - 4ac = (-4)² - 4(2)(3) = 16 - 24 = -8. Since D < 0, there are no real roots.",
                explanationHindi = "विविक्तकर D = b² - 4ac = (-4)² - 4(2)(3) = 16 - 24 = -8। चूंकि D < 0 है, अतः कोई वास्तविक मूल अस्तित्व में नहीं है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_006",
                questionText = "CBSE Class 10 Mathematics: Which trigonometric identity is universally true for all acute angles θ?",
                questionTextHindi = "सीबीएसई कक्षा 10 गणित: सभी न्यून कोणों θ के लिए कौन सी त्रिकोणमितीय सर्वसमिका सार्वभौमिक रूप से सत्य है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Trigonometry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("sin²θ + cos²θ = 1", "1 + tan²θ = cot²θ", "sec²θ - tan²θ = 0", "sinθ · cosθ = 1"),
                optionsHindi = listOf("sin²θ + cos²θ = 1 (मूलभूत त्रिकोणमितीय सर्वसमिका)", "1 + tan²θ = cot²θ", "sec²θ - tan²θ = 0", "sinθ · cosθ = 1"),
                correctAnswerIndex = 0,
                explanation = "The fundamental trigonometric identity derived from the Pythagorean theorem is sin²θ + cos²θ = 1.",
                explanationHindi = "पाइथागोरस प्रमेय से प्राप्त सर्वसमिका sin²θ + cos²θ = 1 प्रत्येक कोण θ (0° ≤ θ ≤ 90°) के लिए सत्य है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_007",
                questionText = "CBSE Class 10 Mathematics: What is the probability of an impossible event?",
                questionTextHindi = "सीबीएसई कक्षा 10 गणित: किसी असंभव घटना के घटित होने की प्रायिकता (Probability) कितनी होती है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Probability",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("0", "1", "0.5", "-1"),
                optionsHindi = listOf("0 (असंभव घटना की प्रायिकता शून्य होती है)", "1 (निश्चित घटना)", "0.5", "-1"),
                correctAnswerIndex = 0,
                explanation = "The probability of an impossible event is always 0. The probability of a certain (sure) event is 1.",
                explanationHindi = "असंभव घटना के अनुकूल परिणामों की संख्या 0 होती है, अतः इसकी प्रायिकता P(E) = 0/n = 0 होती है। निश्चित घटना की प्रायिकता 1 होती है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_008",
                questionText = "CBSE Class 10 Mathematics: In coordinate geometry, the coordinates of the midpoint of the line segment joining points (x₁, y₁) and (x₂, y₂) are:",
                questionTextHindi = "सीबीएसई कक्षा 10 गणित: निर्देशांक ज्यामिति में बिंदुओं (x₁, y₁) तथा (x₂, y₂) को मिलाने वाले रेखाखंड के मध्य-बिंदु के निर्देशांक क्या होते हैं?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Coordinate Geometry",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("((x₁ + x₂)/2, (y₁ + y₂)/2)", "((x₁ - x₂)/2, (y₁ - y₂)/2)", "((x₁ * x₂)/2, (y₁ * y₂)/2)", "(x₁ + x₂, y₁ + y₂)"),
                optionsHindi = listOf("((x₁ + x₂)/2, (y₁ + y₂)/2) (मध्य-बिंदु सूत्र)", "((x₁ - x₂)/2, (y₁ - y₂)/2)", "((x₁ * x₂)/2, (y₁ * y₂)/2)", "(x₁ + x₂, y₁ + y₂)"),
                correctAnswerIndex = 0,
                explanation = "The midpoint formula is M = ((x₁ + x₂)/2, (y₁ + y₂)/2), which is the section formula for ratio 1:1.",
                explanationHindi = "अनुपात 1:1 में विभाजन करने वाले मध्य-बिंदु के निर्देशांक M = ((x₁ + x₂)/2, (y₁ + y₂)/2) होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_CBSE10_M_009",
                questionText = "CBSE Class 10 Mathematics: What is the nth term (aₙ) of an Arithmetic Progression (AP) with first term a and common difference d?",
                questionTextHindi = "सीबीएसई कक्षा 10 गणित: प्रथम पद a और सार्व अंतर d वाली किसी समांतर श्रेढ़ी (AP) का nवाँ पद (aₙ) क्या होता है?",
                category = "SCHOOL_EDUCATION",
                subcategory = "CBSE",
                examOrBoard = "CBSE",
                targetClass = "Class 10",
                subject = "Mathematics",
                chapterOrTopic = "Arithmetic Progressions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("aₙ = a + (n - 1)d", "aₙ = a + nd", "aₙ = a - (n - 1)d", "aₙ = a * dⁿ⁻¹"),
                optionsHindi = listOf("aₙ = a + (n - 1)d (nवाँ पद सूत्र)", "aₙ = a + nd", "aₙ = a - (n - 1)d", "aₙ = a * dⁿ⁻¹"),
                correctAnswerIndex = 0,
                explanation = "The nth term of an AP is given by aₙ = a + (n - 1)d, where a is the first term and d is the common difference.",
                explanationHindi = "समांतर श्रेढ़ी का व्यापक nवाँ पद aₙ = a + (n - 1)d होता है।",
                negativeMarks = 0.0f,
                tags = listOf("CBSE", "Class 10", "Mathematics")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_001",
                questionText = "What is the value of 245 + 378 - 123?",
                questionTextHindi = "245 + 378 - 123 का मान क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Addition and Subtraction",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("500", "490", "510", "480"),
                optionsHindi = listOf("500", "490", "510", "480"),
                correctAnswerIndex = 0,
                explanation = "245 + 378 = 623; 623 - 123 = 500.",
                explanationHindi = "245 + 378 = 623; 623 - 123 = 500।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Arithmetic", "Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_002",
                questionText = "What is the product of 17 × 9?",
                questionTextHindi = "17 × 9 का गुणनफल क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Multiplication Tables",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("153", "163", "143", "173"),
                optionsHindi = listOf("153", "163", "143", "173"),
                correctAnswerIndex = 0,
                explanation = "17 × 9 = 153.",
                explanationHindi = "17 × 9 = 153 होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Multiplication", "Tables")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_003",
                questionText = "When 156 is divided by 12, what is the quotient?",
                questionTextHindi = "जब 156 को 12 से भाग दिया जाता है, तो भागफल क्या प्राप्त होता है?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Division",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("13", "12", "14", "15"),
                optionsHindi = listOf("13", "12", "14", "15"),
                correctAnswerIndex = 0,
                explanation = "156 ÷ 12 = 13 with remainder 0.",
                explanationHindi = "156 को 12 से विभाजित करने पर भागफल 13 आता है।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Division", "Arithmetic")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_004",
                questionText = "What is the sum of the fractions: 3/4 + 1/2?",
                questionTextHindi = "भिन्न 3/4 + 1/2 का योग क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Fractions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("5/4 (or 1 1/4)", "4/6", "3/8", "1"),
                optionsHindi = listOf("5/4 (या 1 सही 1/4)", "4/6", "3/8", "1"),
                correctAnswerIndex = 0,
                explanation = "Common denominator is 4: 3/4 + 2/4 = 5/4 = 1.25.",
                explanationHindi = "ल.स.प. 4: 3/4 + 2/4 = 5/4 = 1.25।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Fractions", "Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_005",
                questionText = "According to BODMAS, what is: 8 + 4 × 3 - 6 ÷ 2?",
                questionTextHindi = "BODMAS नियम के अनुसार, 8 + 4 × 3 - 6 ÷ 2 का मान क्या है?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Order of Operations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("17", "15", "18", "21"),
                optionsHindi = listOf("17", "15", "18", "21"),
                correctAnswerIndex = 0,
                explanation = "6 ÷ 2 = 3. 4 × 3 = 12. 8 + 12 - 3 = 17.",
                explanationHindi = "पहले भाग: 6÷2=3, गुणा: 4×3=12, फिर 8+12-3 = 17।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "BODMAS", "Arithmetic")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_006",
                questionText = "What is the Least Common Multiple (LCM) of 12 and 18?",
                questionTextHindi = "12 और 18 का लघुत्तम समापवर्त्य (LCM / ल.स.) क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "LCM and HCF",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("36", "72", "6", "24"),
                optionsHindi = listOf("36", "72", "6", "24"),
                correctAnswerIndex = 0,
                explanation = "LCM of 12 and 18 = 36.",
                explanationHindi = "12 और 18 का ल.स. 36 है।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "LCM", "Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_007",
                questionText = "What is the Highest Common Factor (HCF) of 24 and 36?",
                questionTextHindi = "24 और 36 का महत्तम समापवर्तक (HCF / म.स.) क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "LCM and HCF",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("12", "6", "8", "4"),
                optionsHindi = listOf("12", "6", "8", "4"),
                correctAnswerIndex = 0,
                explanation = "Highest common factor of 24 and 36 is 12.",
                explanationHindi = "24 और 36 का म.स. 12 है।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "HCF", "Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_008",
                questionText = "Which of the following numbers is a Prime Number?",
                questionTextHindi = "निम्नलिखित में से कौन सी एक अभाज्य संख्या (Prime Number) है?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Prime Numbers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("29", "27", "33", "35"),
                optionsHindi = listOf("29", "27", "33", "35"),
                correctAnswerIndex = 0,
                explanation = "29 has only two factors: 1 and 29.",
                explanationHindi = "29 केवल 1 और स्वयं से विभाज्य है।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Prime Numbers", "Numbers")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_009",
                questionText = "What is the place value of digit 7 in the number 45,782?",
                questionTextHindi = "संख्या 45,782 में अंक 7 का स्थानीय मान क्या है?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Place Value",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("700", "70", "7000", "7"),
                optionsHindi = listOf("700", "70", "7000", "7"),
                correctAnswerIndex = 0,
                explanation = "7 is at hundreds place: 7 × 100 = 700.",
                explanationHindi = "7 सैकड़े के स्थान पर है: 7 × 100 = 700।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Place Value", "Arithmetic")
            )
        )

        list.add(
            Question(
                id = "Q_ARITH_010",
                questionText = "What is 3.45 + 2.8?",
                questionTextHindi = "3.45 + 2.8 का मान क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "BASIC_ARITHMETIC",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Decimals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("6.25", "5.53", "6.15", "5.25"),
                optionsHindi = listOf("6.25", "5.53", "6.15", "5.25"),
                correctAnswerIndex = 0,
                explanation = "3.45 + 2.80 = 6.25.",
                explanationHindi = "3.45 + 2.80 = 6.25।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Decimals", "Arithmetic")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_001",
                questionText = "A person buys a watch for ₹800 and sells it for ₹1000. What is the profit percentage?",
                questionTextHindi = "एक व्यक्ति ₹800 में एक घड़ी खरीदकर उसे ₹1000 में बेचता है। लाभ प्रतिशत क्या है?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Profit and Loss",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("25%", "20%", "15%", "30%"),
                optionsHindi = listOf("25%", "20%", "15%", "30%"),
                correctAnswerIndex = 0,
                explanation = "Profit = ₹200. Profit % = (200 / 800) × 100 = 25%.",
                explanationHindi = "लाभ = ₹200। लाभ % = (200/800) × 100 = 25%।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Profit & Loss", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_002",
                questionText = "What is the Simple Interest on a principal of ₹5,000 at 6% per annum for 2 years?",
                questionTextHindi = "₹5,000 के मूलधन पर 6% वार्षिक दर से 2 वर्ष का साधारण ब्याज कितना होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Simple Interest",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹600", "₹500", "₹700", "₹800"),
                optionsHindi = listOf("₹600", "₹500", "₹700", "₹800"),
                correctAnswerIndex = 0,
                explanation = "SI = (5000 × 6 × 2) / 100 = ₹600.",
                explanationHindi = "साधारण ब्याज = (5000 × 6 × 2) / 100 = ₹600।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Simple Interest", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_003",
                questionText = "If ratio of two numbers A and B is 3 : 5 and their sum is 64, what is the value of B?",
                questionTextHindi = "यदि दो संख्याओं A और B का अनुपात 3 : 5 है और उनका योग 64 है, तो B का मान क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Ratio and Proportion",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("40", "24", "32", "48"),
                optionsHindi = listOf("40", "24", "32", "48"),
                correctAnswerIndex = 0,
                explanation = "1 part = 64 / 8 = 8. B = 5 × 8 = 40.",
                explanationHindi = "1 भाग = 64/8 = 8। B = 5 × 8 = 40।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Ratio", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_004",
                questionText = "A train traveling at 72 km/h covers what distance in meters in 10 seconds?",
                questionTextHindi = "72 किमी/घंटा की गति से चल रही एक ट्रेन 10 सेकंड में कितने मीटर की दूरी तय करेगी?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Speed and Distance",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("200 meters", "180 meters", "250 meters", "150 meters"),
                optionsHindi = listOf("200 मीटर", "180 मीटर", "250 मीटर", "150 मीटर"),
                correctAnswerIndex = 0,
                explanation = "72 × (5/18) = 20 m/s. Distance = 20 × 10 = 200 m.",
                explanationHindi = "चाल = 20 मी/से। दूरी = 20 × 10 = 200 मीटर।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Speed and Distance", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_005",
                questionText = "What is the average of 12, 16, 20, 24, and 28?",
                questionTextHindi = "12, 16, 20, 24 और 28 का औसत क्या होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Averages",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("20", "22", "18", "24"),
                optionsHindi = listOf("20", "22", "18", "24"),
                correctAnswerIndex = 0,
                explanation = "Sum = 100. Average = 100 / 5 = 20.",
                explanationHindi = "योग = 100। औसत = 100 / 5 = 20।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Average", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_006",
                questionText = "A shirt marked at ₹1200 is sold with a 15% discount. What is the selling price?",
                questionTextHindi = "₹1200 अंकित मूल्य वाली कमीज 15% छूट पर बेची जाती है। विक्रय मूल्य क्या है?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Discount",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹1020", "₹1080", "₹1050", "₹1100"),
                optionsHindi = listOf("₹1020", "₹1080", "₹1050", "₹1100"),
                correctAnswerIndex = 0,
                explanation = "Discount = 15% of 1200 = ₹180. SP = 1200 - 180 = ₹1020.",
                explanationHindi = "छूट = ₹180। विक्रय मूल्य = ₹1020।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Discount", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_007",
                questionText = "If 15 workers build a wall in 6 days, how many days will 10 workers take?",
                questionTextHindi = "यदि 15 मजदूर एक दीवार 6 दिन में बना सकते हैं, तो 10 मजदूरों को कितने दिन लगेंगे?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Time and Work",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("9 days", "8 days", "10 days", "12 days"),
                optionsHindi = listOf("9 दिन", "8 दिन", "10 दिन", "12 दिन"),
                correctAnswerIndex = 0,
                explanation = "M1 × D1 = M2 × D2 => 15 × 6 = 10 × D2 => D2 = 9 days.",
                explanationHindi = "15 × 6 = 10 × D₂ => D₂ = 9 दिन।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Time and Work", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_008",
                questionText = "What is 35% of 400?",
                questionTextHindi = "400 का 35% कितना होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Percentages",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("140", "130", "150", "160"),
                optionsHindi = listOf("140", "130", "150", "160"),
                correctAnswerIndex = 0,
                explanation = "35% of 400 = 35 × 4 = 140.",
                explanationHindi = "400 का 35% = 35 × 4 = 140।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Percentages", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_CMATH_009",
                questionText = "Compound interest on ₹10,000 for 2 years at 10% per annum compounded annually is:",
                questionTextHindi = "₹10,000 पर 10% वार्षिक दर से 2 वर्ष का वार्षिक चक्रवृद्धि ब्याज कितना होगा?",
                category = "MATHEMATICS",
                subcategory = "COMPETITIVE_MATH",
                examOrBoard = null,
                targetClass = null,
                subject = "Mathematics",
                chapterOrTopic = "Compound Interest",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("₹2,100", "₹2,000", "₹2,200", "₹2,050"),
                optionsHindi = listOf("₹2,100", "₹2,000", "₹2,200", "₹2,050"),
                correctAnswerIndex = 0,
                explanation = "Amount = 10000(1.1)² = ₹12,100. CI = ₹2,100.",
                explanationHindi = "मिश्रधन = ₹12,100। चक्रवृद्धि ब्याज = ₹2,100।",
                negativeMarks = 0.0f,
                tags = listOf("Mathematics", "Compound Interest", "Commercial Math")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_001",
                questionText = "On which date was the Constitution of India formally adopted by the Constituent Assembly?",
                questionTextHindi = "संविधान सभा द्वारा भारत के संविधान को औपचारिक रूप से किस तिथि को अंगीकृत किया गया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Constitution Formation",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("26 November 1949", "26 January 1950", "15 August 1947", "9 December 1946"),
                optionsHindi = listOf("26 नवंबर 1949 (संविधान दिवस)", "26 जनवरी 1950 (लागू हुआ)", "15 अगस्त 1947", "9 दिसंबर 1946"),
                correctAnswerIndex = 0,
                explanation = "The Constitution was adopted on 26 November 1949 and came into full effect on 26 January 1950.",
                explanationHindi = "संविधान 26 नवंबर 1949 को अंगीकृत किया गया तथा 26 जनवरी 1950 को पूर्णतः लागू हुआ।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Constitution", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_002",
                questionText = "Which Part of the Indian Constitution contains the Fundamental Rights of citizens?",
                questionTextHindi = "भारतीय संविधान के किस भाग में नागरिकों के मौलिक अधिकारों का वर्णन है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Fundamental Rights",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Part III (Articles 12-35)", "Part IV (DPSP)", "Part II (Citizenship)", "Part IV-A (Duties)"),
                optionsHindi = listOf("भाग III (अनुच्छेद 12-35)", "भाग IV", "भाग II", "भाग IV-A"),
                correctAnswerIndex = 0,
                explanation = "Part III (Articles 12 to 35) guarantees Fundamental Rights to all citizens.",
                explanationHindi = "भाग III में अनुच्छेद 12 से 35 तक मौलिक अधिकार वर्णित हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Fundamental Rights", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_003",
                questionText = "What is the minimum age required to become the President of India?",
                questionTextHindi = "भारत का राष्ट्रपति बनने के लिए न्यूनतम आयु सीमा क्या है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "President of India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("35 years", "30 years", "25 years", "21 years"),
                optionsHindi = listOf("35 वर्ष (अनुच्छेद 58)", "30 वर्ष (राज्यसभा)", "25 वर्ष (लोकसभा)", "21 वर्ष (पंचायत)"),
                correctAnswerIndex = 0,
                explanation = "Under Article 58, a candidate for President must have completed 35 years of age.",
                explanationHindi = "अनुच्छेद 58 के अनुसार राष्ट्रपति पद हेतु न्यूनतम आयु 35 वर्ष होनी चाहिए।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "President", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_004",
                questionText = "Who acts as the ex-officio Chairman of the Rajya Sabha (Council of States)?",
                questionTextHindi = "राज्यसभा का पदेन सभापति कौन होता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Parliament",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Vice-President of India", "Prime Minister", "Speaker of Lok Sabha", "Chief Justice of India"),
                optionsHindi = listOf("भारत के उपराष्ट्रपति (अनुच्छेद 64)", "प्रधानमंत्री", "लोकसभा अध्यक्ष", "मुख्य न्यायाधीश"),
                correctAnswerIndex = 0,
                explanation = "Under Article 64, the Vice-President of India is the ex-officio Chairman of Rajya Sabha.",
                explanationHindi = "अनुच्छेद 64 के अनुसार उपराष्ट्रपति राज्यसभा के पदेन सभापति होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Rajya Sabha", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_005",
                questionText = "Which Article of the Constitution of India provides for the 'Right to Equality before Law'?",
                questionTextHindi = "भारतीय संविधान का कौन सा अनुच्छेद 'विधि के समक्ष समता' का अधिकार प्रदान करता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Fundamental Rights",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Article 14", "Article 19", "Article 21", "Article 32"),
                optionsHindi = listOf("अनुच्छेद 14 (विधि के समक्ष समता)", "अनुच्छेद 19", "अनुच्छेद 21", "अनुच्छेद 32"),
                correctAnswerIndex = 0,
                explanation = "Article 14 guarantees equality before the law and equal protection of the laws.",
                explanationHindi = "अनुच्छेद 14 विधि के समक्ष समता और विधियों का समान संरक्षण प्रदान करता है।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Article 14", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_006",
                questionText = "Which Constitutional Amendment Act gave constitutional status to Panchayati Raj institutions in India?",
                questionTextHindi = "किस संविधान संशोधन अधिनियम द्वारा भारत में पंचायती राज संस्थाओं को संवैधानिक दर्जा दिया गया?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Constitutional Amendments",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("73rd Amendment Act 1992", "74th Amendment Act", "42nd Amendment Act", "44th Amendment Act"),
                optionsHindi = listOf("73वाँ संविधान संशोधन (1992)", "74वाँ संशोधन (नगरपालिका)", "42वाँ संशोधन", "44वाँ संशोधन"),
                correctAnswerIndex = 0,
                explanation = "The 73rd Constitutional Amendment Act of 1992 added Part IX and the 11th Schedule.",
                explanationHindi = "73वें संशोधन अधिनियम 1992 द्वारा संविधान में भाग IX और 11वीं अनुसूची जोड़ी गई।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Panchayati Raj", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_007",
                questionText = "Fundamental Duties were incorporated into the Indian Constitution on the recommendation of which committee?",
                questionTextHindi = "भारतीय संविधान में मौलिक कर्तव्यों को किस समिति की सिफारिश पर जोड़ा गया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Fundamental Duties",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Swaran Singh Committee", "Sarkaria Commission", "Verma Committee", "Kothari Commission"),
                optionsHindi = listOf("स्वर्ण सिंह समिति (42वाँ संशोधन 1976)", "सरकारिया आयोग", "वर्मा समिति", "कोठारी आयोग"),
                correctAnswerIndex = 0,
                explanation = "The 42nd Amendment 1976 added Article 51A (Part IV-A) based on the Swaran Singh Committee.",
                explanationHindi = "स्वर्ण सिंह समिति की सिफारिश पर 42वें संशोधन 1976 द्वारा अनुच्छेद 51A जोड़ा गया।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Duties", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_008",
                questionText = "What is the normal term of the Lok Sabha from the date of its first meeting?",
                questionTextHindi = "लोकसभा का सामान्य कार्यकाल अपनी प्रथम बैठक की तिथि से कितने वर्ष का होता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Parliament",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("5 years", "6 years", "4 years", "Permanent body"),
                optionsHindi = listOf("5 वर्ष", "6 वर्ष (राज्यसभा सदस्य)", "4 वर्ष", "स्थाई सदन"),
                correctAnswerIndex = 0,
                explanation = "Under Article 83(2), the Lok Sabha continues for 5 years unless dissolved earlier.",
                explanationHindi = "अनुच्छेद 83(2) के अनुसार लोकसभा का कार्यकाल 5 वर्ष होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Lok Sabha", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_009",
                questionText = "Which Article of the Constitution gives the Supreme Court the power to issue writs for the enforcement of Fundamental Rights?",
                questionTextHindi = "संविधान का कौन सा अनुच्छेद मौलिक अधिकारों के प्रवर्तन हेतु सर्वोच्च न्यायालय को रिट जारी करने की शक्ति देता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Judiciary",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Article 32", "Article 226", "Article 136", "Article 143"),
                optionsHindi = listOf("अनुच्छेद 32 (संवैधानिक उपचारों का अधिकार)", "अनुच्छेद 226 (उच्च न्यायालय)", "अनुच्छेद 136", "अनुच्छेद 143"),
                correctAnswerIndex = 0,
                explanation = "Article 32 allows citizens to move Supreme Court. Dr. Ambedkar called it the 'Heart and Soul of the Constitution'.",
                explanationHindi = "डॉ. आंबेडकर ने अनुच्छेद 32 को 'संविधान की आत्मा और हृदय' कहा था।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Article 32", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_POLITY_010",
                questionText = "Under Article 324, which authority conducts elections to Parliament, State Legislatures, and the offices of President and Vice-President?",
                questionTextHindi = "अनुच्छेद 324 के अंतर्गत संसद, राज्य विधानसभाओं तथा राष्ट्रपति-उपराष्ट्रपति के चुनाव कराने का दायित्व किसका है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_POLITY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Election Commission",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Election Commission of India", "Union Public Service Commission", "Ministry of Law and Justice", "Supreme Court of India"),
                optionsHindi = listOf("भारत निर्वाचन आयोग (Election Commission of India)", "संघ लोक सेवा आयोग", "विधि मंत्रालय", "सर्वोच्च न्यायालय"),
                correctAnswerIndex = 0,
                explanation = "The Election Commission of India (Article 324) superintends, directs and controls these elections.",
                explanationHindi = "अनुच्छेद 324 के तहत भारत का चुनाव आयोग इन सभी चुनावों का संचालन करता है।",
                negativeMarks = 0.0f,
                tags = listOf("Polity", "Election Commission", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_001",
                questionText = "The famous 'Great Bath' of the Indus Valley Civilization was discovered at which ancient site?",
                questionTextHindi = "सिंधु घाटी सभ्यता का प्रसिद्ध 'विशाल स्नानागार' (Great Bath) किस स्थल पर खोजा गया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Ancient History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mohenjo-daro", "Harappa", "Lothal", "Kalibangan"),
                optionsHindi = listOf("मोहनजोदड़ो (Mohenjo-daro)", "हड़प्पा", "लोथल", "कालीबंगा"),
                correctAnswerIndex = 0,
                explanation = "The Great Bath was discovered in the citadel of Mohenjo-daro in Sindh (now Pakistan).",
                explanationHindi = "विशाल स्नानागार मोहनजोदड़ो के दुर्ग क्षेत्र में स्थित है।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Indus Valley", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_002",
                questionText = "Which ancient Indian ruler embraced Buddhism after witnessing the devastation of the Kalinga War?",
                questionTextHindi = "कलिंग युद्ध के नरसंहार को देखकर किस प्राचीन भारतीय शासक ने बौद्ध धर्म अपनाया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Maurya Empire",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Emperor Ashoka", "Chandragupta Maurya", "Bindusara", "Kanishka"),
                optionsHindi = listOf("सम्राट अशोक (Emperor Ashoka)", "चंद्रगुप्त मौर्य", "बिंदुसार", "कनिष्क"),
                correctAnswerIndex = 0,
                explanation = "Emperor Ashoka fought the Kalinga War in 261 BCE and renounced war, embracing Dhamma.",
                explanationHindi = "261 ई.पू. में कलिंग युद्ध के उपरांत सम्राट अशोक ने धम्म की दीक्षा ली।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Ashoka", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_003",
                questionText = "Aryabhata and Kalidasa flourished during the reign of which historic dynasty, known as India's 'Golden Age'?",
                questionTextHindi = "आर्यभट्ट तथा कालिदास किस राजवंश के काल में प्रसिद्ध हुए, जिसे भारत का 'स्वर्ण युग' कहा जाता है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Gupta Empire",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Gupta Empire", "Kushan Dynasty", "Chola Dynasty", "Maurya Empire"),
                optionsHindi = listOf("गुप्त साम्राज्य (Gupta Empire)", "कुषाण वंश", "चोल वंश", "मौर्य साम्राज्य"),
                correctAnswerIndex = 0,
                explanation = "The Gupta period (c. 4th-6th century CE) is regarded as the Classical Golden Age of India.",
                explanationHindi = "गुप्त काल को भारतीय इतिहास का स्वर्ण युग माना जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Gupta Empire", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_004",
                questionText = "In which year was the historic Battle of Plassey fought between the British East India Company and the Nawab of Bengal?",
                questionTextHindi = "ब्रिटिश ईस्ट इंडिया कंपनी और बंगाल के नवाब के बीच प्लासी का प्रसिद्ध युद्ध किस वर्ष लड़ा गया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Modern Indian History",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1757", "1764", "1857", "1761"),
                optionsHindi = listOf("1757 (23 जून 1757)", "1764 (बक्सर का युद्ध)", "1857 (प्रथम स्वतंत्रता संग्राम)", "1761 (पानीपत III)"),
                correctAnswerIndex = 0,
                explanation = "Battle of Plassey took place on 23 June 1757, where Robert Clive defeated Siraj-ud-Daulah.",
                explanationHindi = "प्लासी का युद्ध 23 जून 1757 को हुआ जिसमें रॉबर्ट क्लाइव ने सिराजुद्दौला को पराजित किया।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Plassey", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_005",
                questionText = "Who fired the first shot of resistance on 29 March 1857 at Barrackpore, sparking the 1857 Revolt?",
                questionTextHindi = "29 मार्च 1857 को बैरकपुर छावनी में चर्बी वाले कारतूसों के विरोध में पहला विद्रोह किसने किया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "1857 Revolt",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mangal Pandey", "Tatya Tope", "Nana Saheb", "Kunwar Singh"),
                optionsHindi = listOf("मंगल पांडे (Mangal Pandey)", "तात्या टोपे", "नाना साहेब", "कुंवर सिंह"),
                correctAnswerIndex = 0,
                explanation = "Sepoy Mangal Pandey of the 34th Bengal Native Infantry revolted at Barrackpore.",
                explanationHindi = "34वीं बंगाल नेटिव इन्फैंट्री के सिपाही मंगल पांडे ने बैरकपुर में विद्रोह किया।",
                negativeMarks = 0.0f,
                tags = listOf("History", "1857", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_006",
                questionText = "The Indian National Congress (INC) was established in December 1885 in Bombay under the initiative of:",
                questionTextHindi = "भारतीय राष्ट्रीय कांग्रेस (INC) की स्थापना दिसंबर 1885 में बॉम्बे में किसकी पहल पर हुई थी?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "National Movement",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Allan Octavian Hume (A.O. Hume)", "Dadabhai Naoroji", "Womesh Chandra Bonnerjee", "Bal Gangadhar Tilak"),
                optionsHindi = listOf("ए.ओ. ह्यूम (A.O. Hume)", "दादाभाई नौरोजी", "व्योमेश चंद्र बनर्जी", "बाल गंगाधर तिलक"),
                correctAnswerIndex = 0,
                explanation = "A.O. Hume founded INC in 1885; W.C. Bonnerjee was its first President.",
                explanationHindi = "ए.ओ. ह्यूम ने 1885 में कांग्रेस की स्थापना की; प्रथम अध्यक्ष व्योमेश चंद्र बनर्जी थे।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Congress", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_007",
                questionText = "Mahatma Gandhi launched the historic Salt March (Dandi March) from Sabarmati Ashram in which year?",
                questionTextHindi = "महात्मा गांधी ने साबरमती आश्रम से ऐतिहासिक नमक सत्याग्रह (दांडी मार्च) किस वर्ष प्रारंभ किया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Civil Disobedience",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("1930", "1920", "1942", "1919"),
                optionsHindi = listOf("1930 (12 मार्च 1930)", "1920 (असहयोग आंदोलन)", "1942 (भारत छोड़ो)", "1919 (रौलट एक्ट)"),
                correctAnswerIndex = 0,
                explanation = "Gandhi started the Dandi March on 12 March 1930 and reached Dandi on 6 April 1930.",
                explanationHindi = "दांडी मार्च 12 मार्च 1930 से 6 अप्रैल 1930 तक चला।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Dandi March", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_008",
                questionText = "The slogan 'Do or Die' (करो या मरो) was given by Mahatma Gandhi during which major national movement?",
                questionTextHindi = "महात्मा गांधी ने 'करो या मरो' का नारा किस ऐतिहासिक आंदोलन के दौरान दिया था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Quit India Movement",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Quit India Movement (1942)", "Non-Cooperation Movement (1920)", "Civil Disobedience Movement (1930)", "Champaran Satyagraha (1917)"),
                optionsHindi = listOf("भारत छोड़ो आंदोलन (1942)", "असहयोग आंदोलन", "सविनय अवज्ञा आंदोलन", "चंपारण सत्याग्रह"),
                correctAnswerIndex = 0,
                explanation = "Gandhi called for 'Do or Die' on 8 August 1942 at Gowalia Tank Maidan in Bombay.",
                explanationHindi = "गांधीजी ने 8 अगस्त 1942 को भारत छोड़ो आंदोलन के समय 'करो या मरो' का आह्वान किया।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Quit India", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_009",
                questionText = "Who was known as the 'Grand Old Man of India' and authored 'Poverty and Un-British Rule in India'?",
                questionTextHindi = "भारत के 'ग्रैंड ओल्ड मैन' के नाम से किन्हें जाना जाता है जिन्होंने ड्रेन ऑफ वेल्थ का सिद्धांत दिया?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "National Leaders",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Dadabhai Naoroji", "Gopal Krishna Gokhale", "Surendranath Banerjee", "M.G. Ranade"),
                optionsHindi = listOf("दादाभाई नौरोजी (Dadabhai Naoroji)", "गोपाल कृष्ण गोखले", "सुरेंद्रनाथ बनर्जी", "एम.जी. रानाडे"),
                correctAnswerIndex = 0,
                explanation = "Dadabhai Naoroji formulated the Drain of Wealth theory and was the first Indian elected to the British House of Commons.",
                explanationHindi = "दादाभाई नौरोजी ने ब्रिटिश संसद में निर्वाचित होने वाले प्रथम भारतीय का गौरव प्राप्त किया।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Naoroji", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_010",
                questionText = "Which Mughal Emperor founded the secular syncretic spiritual movement called 'Din-i Ilahi'?",
                questionTextHindi = "किस मुगल बादशाह ने 'दीन-ए-इलाही' नामक धार्मिक समन्वयवादी विचार की स्थापना की थी?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Medieval India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Akbar", "Babur", "Shah Jahan", "Aurangzeb"),
                optionsHindi = listOf("अकबर (Akbar)", "बाबर", "शाहजहाँ", "औरंगजेब"),
                correctAnswerIndex = 0,
                explanation = "Akbar introduced Din-i Ilahi in 1582 to combine positive elements of various faiths.",
                explanationHindi = "अकबर ने 1582 में सभी धर्मों के सद्गुणों को मिलाकर दीन-ए-इलाही शुरू किया।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Akbar", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_HIST_011",
                questionText = "Chhatrapati Shivaji Maharaj was crowned as Chhatrapati in 1674 at which majestic hill fort?",
                questionTextHindi = "छत्रपति शिवाजी महाराज का 1674 में राज्याभिषेक किस प्रसिद्ध दुर्ग में हुआ था?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_HISTORY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Maratha Empire",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Raigad Fort", "Shivneri Fort", "Pratapgad Fort", "Sinhagad Fort"),
                optionsHindi = listOf("रायगढ़ दुर्ग (Raigad Fort)", "शिवनेरी दुर्ग (जन्म स्थान)", "प्रतापगढ़ दुर्ग", "सिंहगढ़ दुर्ग"),
                correctAnswerIndex = 0,
                explanation = "Shivaji Maharaj was crowned at Raigad Fort on 6 June 1674 by Gaga Bhatt.",
                explanationHindi = "6 जून 1674 को रायगढ़ दुर्ग में गागाभट्ट द्वारा शिवाजी महाराज का राज्याभिषेक हुआ।",
                negativeMarks = 0.0f,
                tags = listOf("History", "Shivaji Maharaj", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_001",
                questionText = "Which is the longest river flowing entirely within India?",
                questionTextHindi = "भारत में प्रवाहित होने वाली सबसे लंबी नदी कौन सी है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Rivers of India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ganga (2525 km)", "Godavari", "Yamuna", "Narmada"),
                optionsHindi = listOf("गंगा (2525 किमी)", "गोदावरी (दक्षिण गंगा)", "यमुना", "नर्मदा"),
                correctAnswerIndex = 0,
                explanation = "Ganga originates at Gangotri Glacier and flows 2,525 km to the Bay of Bengal.",
                explanationHindi = "गंगा नदी की कुल लंबाई 2,525 किमी है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Rivers", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_002",
                questionText = "Which is the highest mountain peak located entirely within the territory of India?",
                questionTextHindi = "भारत की सीमा के भीतर स्थित सबसे ऊंची पर्वत चोटी कौन सी है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Mountains",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kangchenjunga (8,586 m)", "Nanda Devi", "K2 (Godwin Austen)", "Kamet"),
                optionsHindi = listOf("कंचनजंगा (8,586 मी - सिक्किम)", "नंदा देवी", "K2 (पीओके में स्थित)", "कामेत"),
                correctAnswerIndex = 0,
                explanation = "Kangchenjunga in Sikkim is the highest peak in undisputed Indian territory (3rd highest in world).",
                explanationHindi = "सिक्किम में स्थित कंचनजंगा भारत की सबसे ऊंची पर्वत चोटी है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Mountains", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_003",
                questionText = "The Tropic of Cancer (23.5° N latitude) passes through how many Indian States?",
                questionTextHindi = "कर्क रेखा (23.5° उत्तरी अक्षांश) भारत के कितने राज्यों से होकर गुजरती है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Location & Boundaries",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("8 States", "7 States", "9 States", "6 States"),
                optionsHindi = listOf("8 राज्यों से (गुजरात, राजस्थान, म.प्र., छत्तीसगढ़, झारखंड, प. बंगाल, त्रिपुरा, मिजोरम)", "7 राज्यों से", "9 राज्यों से", "6 राज्यों से"),
                correctAnswerIndex = 0,
                explanation = "Tropic of Cancer passes through 8 states: Gujarat, Rajasthan, MP, Chhattisgarh, Jharkhand, West Bengal, Tripura, Mizoram.",
                explanationHindi = "कर्क रेखा भारत के 8 राज्यों से होकर गुजरती है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Tropic of Cancer", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_004",
                questionText = "Which Indian water body is the largest coastal brackish water lagoon in India?",
                questionTextHindi = "भारत की सबसे बड़ी तटीय खारे पानी की लैगून झील कौन सी है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Lakes of India",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Chilika Lake (Odisha)", "Vembanad Lake (Kerala)", "Pulicat Lake", "Sambhar Lake (Rajasthan)"),
                optionsHindi = listOf("चिल्का झील (ओडिशा)", "वेम्बनाड झील", "पुलिकट झील", "सांभर झील (अंतःस्थलीय)"),
                correctAnswerIndex = 0,
                explanation = "Chilika Lake in Odisha is the largest brackish water lagoon in Asia.",
                explanationHindi = "ओडिशा की चिल्का झील एशिया की सबसे बड़ी खारे पानी की लैगून है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Lakes", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_005",
                questionText = "Which pass connects the Kashmir Valley with the Ladakh region?",
                questionTextHindi = "कश्मीर घाटी को लद्दाख क्षेत्र से जोड़ने वाला प्रसिद्ध दर्रा कौन सा है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Mountain Passes",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Zoji La Pass", "Rohtang Pass", "Nathu La Pass", "Shipki La Pass"),
                optionsHindi = listOf("ज़ोजिला दर्रा (Zoji La)", "रोहतांग दर्रा", "नाथू ला दर्रा", "शिपकी ला दर्रा"),
                correctAnswerIndex = 0,
                explanation = "Zoji La pass on NH-1 connects Srinagar and Leh.",
                explanationHindi = "ज़ोजिला दर्रा श्रीनगर को लेह से जोड़ता है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Passes", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_006",
                questionText = "Kaziranga National Park in Assam is world-famous for the conservation of:",
                questionTextHindi = "असम का काजीरंगा राष्ट्रीय उद्यान किसके संरक्षण के लिए विश्व-प्रसिद्ध है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "National Parks",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Great Indian One-Horned Rhinoceros", "Royal Bengal Tiger", "Asiatic Lion", "Snow Leopard"),
                optionsHindi = listOf("एक सींग वाला भारतीय गैंडा (One-Horned Rhino)", "रॉयल बंगाल टाइगर", "एशियाई शेर (गिर)", "हिम तेंदुआ"),
                correctAnswerIndex = 0,
                explanation = "Kaziranga hosts two-thirds of the world's great one-horned rhinoceroses.",
                explanationHindi = "काजीरंगा में विश्व के दो-तिहाई एक सींग वाले गैंडे पाए जाते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Wildlife", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_007",
                questionText = "Which plateau is the oldest and largest geological landmass of India?",
                questionTextHindi = "भारत का सबसे प्राचीन और विशाल भू-भाग कौन सा पठार है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Physiography",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Peninsular Plateau (Deccan Plateau)", "Tibetan Plateau", "Chota Nagpur Plateau", "Malwa Plateau"),
                optionsHindi = listOf("प्रायद्वीपीय पठार (दक्कन का पठार)", "तिब्बत का पठार", "छोटा नागपुर पठार", "मालवा पठार"),
                correctAnswerIndex = 0,
                explanation = "The Peninsular Plateau of India is part of the ancient Gondwanaland.",
                explanationHindi = "प्रायद्वीपीय पठार प्राचीन गोंडवाना लैंड का भाग है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Plateau", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_008",
                questionText = "What is the name of the southernmost point of the Indian Union territory?",
                questionTextHindi = "भारतीय संघ राज्य क्षेत्र का सबसे दक्षिणी बिंदु कौन सा है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Location",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Indira Point (Great Nicobar)", "Kanyakumari (Cape Comorin)", "Indira Col (Ladakh)", "Kibithu"),
                optionsHindi = listOf("इंदिरा पॉइंट (ग्रेट निकोबार)", "कन्याकुमारी (मुख्य भूमि का दक्षिण)", "इंदिरा कोल (उत्तरी बिंदु)", "किबिथू"),
                correctAnswerIndex = 0,
                explanation = "Indira Point at 6°45' N on Great Nicobar Island is the southernmost point of India.",
                explanationHindi = "ग्रेट निकोबार में स्थित इंदिरा पॉइंट भारत का सबसे दक्षिणी बिंदु है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Boundaries", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_GEOG_009",
                questionText = "Which major river of India flows westward through a rift valley between the Vindhya and Satpura ranges?",
                questionTextHindi = "विंध्य और सतपुड़ा पर्वत श्रेणियों के बीच भ्रंश घाटी से होकर पश्चिम की ओर बहने वाली प्रमुख नदी कौन सी है?",
                category = "GENERAL_KNOWLEDGE",
                subcategory = "INDIAN_GEOGRAPHY",
                examOrBoard = null,
                targetClass = null,
                subject = "General Knowledge",
                chapterOrTopic = "Rivers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Narmada", "Godavari", "Mahanadi", "Krishna"),
                optionsHindi = listOf("नर्मदा (Narmada)", "गोदावरी", "महानदी", "कृष्णा"),
                correctAnswerIndex = 0,
                explanation = "Narmada flows westward in a rift valley between Vindhya and Satpura into the Arabian Sea.",
                explanationHindi = "नर्मदा नदी भ्रंश घाटी में बहकर खंभात की खाड़ी (अरब सागर) में गिरती है।",
                negativeMarks = 0.0f,
                tags = listOf("Geography", "Narmada", "General Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_001",
                questionText = "What is the meaning of the Hindi idiom 'अंगूठा दिखाना' (Angootha Dikhana)?",
                questionTextHindi = "हिंदी मुहावरे 'अंगूठा दिखाना' का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Muhavare",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To refuse flatly (साफ इनकार करना)", "To praise someone", "To tease someone", "To bless someone"),
                optionsHindi = listOf("साफ इनकार करना (मना कर देना)", "प्रशंसा करना", "चिढ़ाना", "आशीर्वाद देना"),
                correctAnswerIndex = 0,
                explanation = "'अंगूठा दिखाना' means to refuse to help or cooperate at the last moment.",
                explanationHindi = "'अंगूठा दिखाना' का अर्थ ठीक समय पर किसी कार्य के लिए साफ इनकार कर देना होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Muhavare")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_002",
                questionText = "What is the meaning of the proverb 'नाच न जाने आँगन टेढ़ा' (Naach Na Jaane Aangan Tedha)?",
                questionTextHindi = "कहावत 'नाच न जाने आँगन टेढ़ा' का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Lokoktiyan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Blaming external factors for one's own shortcomings (अपनी कमी छिपाने के लिए दूसरों में दोष निकालना)", "Good dancing skills", "Bad courtyard", "Working hard without reward"),
                optionsHindi = listOf("अपनी कमी छिपाने के लिए दूसरों पर दोष मढ़ना", "अच्छा नृत्य करना", "कठिन परिश्रम करना", "आँगन की मरम्मत करना"),
                correctAnswerIndex = 0,
                explanation = "It means making excuses and blaming tools or environment when one lacks personal competence.",
                explanationHindi = "स्वयं कार्य न कर पाने पर परिस्थितियों या दूसरों में खोट निकालना।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Lokoktiyan")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_003",
                questionText = "What is the meaning of the idiom 'नौ दो ग्यारह होना' (Nau Do Gyarah Hona)?",
                questionTextHindi = "मुहावरे 'नौ दो ग्यारह होना' का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Muhavare",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To flee or run away quickly (रफूचक्कर होना / भाग जाना)", "To solve a math problem", "To fight", "To count numbers"),
                optionsHindi = listOf("भाग जाना / रफूचक्कर होना", "गणित हल करना", "लड़ाई करना", "गिनती गिनना"),
                correctAnswerIndex = 0,
                explanation = "'नौ दो ग्यारह होना' signifies rapidly fleeing the scene.",
                explanationHindi = "'नौ दो ग्यारह होना' का अर्थ पुलिस या संकट को देखकर तुरंत भाग जाना होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Muhavare")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_004",
                questionText = "What is the meaning of the lokokti 'अधजल गगरी छलकत जाए' (Adhjal Gagri Chhalkat Jaaye)?",
                questionTextHindi = "लोकोक्ति 'अधजल गगरी छलकत जाए' का क्या भावार्थ है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Lokoktiyan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("A person with little knowledge shows off excessively (अल्पज्ञानी व्यक्ति अधिक दिखावा करता है)", "Carrying an empty pot", "Wasting water", "Humility of great scholars"),
                optionsHindi = listOf("कम ज्ञान वाला व्यक्ति अत्यधिक दिखावा करता है", "घड़े में पानी भरना", "जल की बर्बादी", "विद्वता का प्रदर्शन न करना"),
                correctAnswerIndex = 0,
                explanation = "Just as a half-filled pitcher spills, a person with shallow knowledge boasts loudly.",
                explanationHindi = "जैसे आधा भरा घड़ा अधिक छलक कर आवाज करता है, वैसे ही अल्पज्ञानी बहुत डिंगें हांकता है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Lokoktiyan")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_005",
                questionText = "What is the meaning of the idiom 'आँखों का तारा' (Aankhon ka Tara)?",
                questionTextHindi = "मुहावरा 'आँखों का तारा' का क्या अर्थ है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Muhavare",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Extremely beloved and dear (अत्यधिक प्यारा होना)", "Looking at stars", "Having poor vision", "Being angry"),
                optionsHindi = listOf("बहुत प्यारा होना (अत्यधिक दुलारा)", "तारे देखना", "कम दिखाई देना", "गुस्सा होना"),
                correctAnswerIndex = 0,
                explanation = "'आँखों का तारा' means someone very precious or beloved, like an only child.",
                explanationHindi = "माता-पिता के लिए उनकी संतान उनकी आँखों का तारा होती है (अति प्रिय)।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Muhavare")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_006",
                questionText = "What is the meaning of the idiom 'ईद का चाँद होना' (Eid ka Chand Hona)?",
                questionTextHindi = "मुहावरे 'ईद का चाँद होना' का सही अर्थ क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Muhavare",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Rarely seen after a long time (बहुत दिनों बाद दिखाई देना)", "Looking beautiful", "Visiting monthly", "Moon on Eid day"),
                optionsHindi = listOf("बहुत दिनों बाद दिखाई देना (दुर्लभ होना)", "सुंदर दिखना", "हर माह मिलना", "त्योहार मनाना"),
                correctAnswerIndex = 0,
                explanation = "'ईद का चाँद होना' denotes meeting or seeing someone after a very long absence.",
                explanationHindi = "जो व्यक्ति बहुत लंबे समय बाद मिले, उसे कहते हैं 'तुम तो ईद का चाँद हो गए'।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Muhavare")
            )
        )

        list.add(
            Question(
                id = "Q_MUH_007",
                questionText = "What is the meaning of the lokokti 'ऊँट के मुँह में जीरा' (Oont ke Munh mein Jeera)?",
                questionTextHindi = "लोकोक्ति 'ऊँट के मुँह में जीरा' का क्या अर्थ है?",
                category = "HINDI_LANGUAGE",
                subcategory = "MUHAVARE_LOKOKTIYAN",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Lokoktiyan",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Much less than what is needed (आवश्यकता से बहुत कम मिलना)", "Feeding animals spice", "Large requirement", "Healthy food for camels"),
                optionsHindi = listOf("बहुत बड़ी आवश्यकता के सामने नगण्य वस्तु (बहुत कम मिलना)", "ऊँट को मसाला खिलाना", "अति संतुष्ट होना", "कम खाना खाना"),
                correctAnswerIndex = 0,
                explanation = "It represents an insignificantly small quantity provided to someone with a massive need.",
                explanationHindi = "विशाल आवश्यकता की तुलना में बहुत थोड़ी वस्तु देना।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Lokoktiyan")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_001",
                questionText = "What is the correct Sandhi-Vichhed (संधि-विच्छेद) of 'सूर्योदय' (Suryodaya)?",
                questionTextHindi = "'सूर्योदय' शब्द का सही संधि-विच्छेद क्या होगा?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Sandhi",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("सूर्य + उदय (गुण स्वर संधि)", "सूर्यो + दय", "सूर्य + दय", "सूर्या + उदय"),
                optionsHindi = listOf("सूर्य + उदय (अ + उ = ओ, गुण संधि)", "सूर्यो + दय", "सूर्य + दय", "सूर्या + उदय"),
                correctAnswerIndex = 0,
                explanation = "सूर्य + उदय = सूर्योदय (Rule of Guna Sandhi: a/aa + u = o).",
                explanationHindi = "अ + उ के मेल से 'ओ' बनता है, यह गुण स्वर संधि है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_002",
                questionText = "Which Samas (समास) is present in the compound word 'राजपुत्र' (Rajputra = राजा का पुत्र)?",
                questionTextHindi = "'राजपुत्र' (राजा का पुत्र) में कौन सा समास है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Samas",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("तत्पुरुष समास (संबंध तत्पुरुष)", "द्विगु समास", "द्वंद्व समास", "कर्मधारय समास"),
                optionsHindi = listOf("तत्पुरुष समास (संबंध कारक 'का' का लोप)", "द्विगु समास", "द्वंद्व समास", "कर्मधारय समास"),
                correctAnswerIndex = 0,
                explanation = "राजपुत्र = राजा का पुत्र (Tatpurusha Samas with relation case marker 'का').",
                explanationHindi = "संबंध कारक विभक्ति 'का' के लोप से बना तत्पुरुष समास है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_003",
                questionText = "Which of the following is a correct synonym (पर्यायवाची शब्द) of 'अग्नि' (Agni / Fire)?",
                questionTextHindi = "निम्नलिखित में से कौन सा शब्द 'अग्नि' का सही पर्यायवाची है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Paryayvachi",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("पावक (अनल, हुताशन)", "तोय", "वारि", "समीर"),
                optionsHindi = listOf("पावक (अनल, वह्नि, ज्वाला)", "तोय (जल)", "वारि (जल)", "समीर (वायु)"),
                correctAnswerIndex = 0,
                explanation = "Synonyms of Agni include: Paavak, Anal, Vahni, Hutaashan. Toy/Vaari mean water; Sameer means wind.",
                explanationHindi = "अग्नि के पर्यायवाची: पावक, अनल, हुताशन हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_004",
                questionText = "What is the antonym (विलोम शब्द) of 'अमृत' (Amrit / Nectar)?",
                questionTextHindi = "'अमृत' शब्द का सही विलोम शब्द क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Vilom",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("विष (गरल)", "पीयूष", "सुधा", "अमी"),
                optionsHindi = listOf("विष (या गरल)", "पीयूष (पर्यायवाची)", "सुधा (पर्यायवाची)", "अमी"),
                correctAnswerIndex = 0,
                explanation = "Amrit (nectar) opposes Vish (poison). Piyush and Sudha are synonyms of Amrit.",
                explanationHindi = "अमृत का विलोम 'विष' या 'गरल' होता है।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_005",
                questionText = "Which of the following spellings is grammatically correct in Hindi (शुद्ध वर्तनी)?",
                questionTextHindi = "निम्नलिखित में से शुद्ध वर्तनी वाला शब्द कौन सा है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Vartani",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("उज्ज्वल", "उज्वल", "उज्जवल", "उज्वल"),
                optionsHindi = listOf("उज्ज्वल (दो बार आधा 'ज्')", "उज्वल", "उज्जवल", "ऊज्वल"),
                correctAnswerIndex = 0,
                explanation = "उत् + ज्वल = उज्ज्वल (both 'j' letters are half/halant).",
                explanationHindi = "संधि नियम अनुसार 'उज्ज्वल' में दोनों 'ज' अर्ध वर्ण होते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_006",
                questionText = "What is the one-word substitution (अनेक शब्दों के लिए एक शब्द) for 'जो सब कुछ जानता हो'?",
                questionTextHindi = "'जो सब कुछ जानता हो' वाक्यांश के लिए एक उपयुक्त शब्द क्या है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "One Word Substitution",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("सर्वज्ञ (Sarvajna)", "अल्पज्ञ", "विद्वान", "सर्वव्यापी"),
                optionsHindi = listOf("सर्वज्ञ (सब कुछ जानने वाला)", "अल्पज्ञ (कम जानने वाला)", "विद्वान", "सर्वव्यापी"),
                correctAnswerIndex = 0,
                explanation = "One who knows everything is called 'Sarvajna'.",
                explanationHindi = "जो सब कुछ जानता हो उसे 'सर्वज्ञ' कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_007",
                questionText = "Which prefix (उपसर्ग) is present in the word 'अनुशासन' (Anushasan)?",
                questionTextHindi = "'अनुशासन' शब्द में कौन सा उपसर्ग जुड़ा है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Upsarg",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("अनु", "अन", "अ", "शासन"),
                optionsHindi = listOf("अनु (अनु + शासन = अनुशासन)", "अन", "अ", "शासन (मूल शब्द)"),
                correctAnswerIndex = 0,
                explanation = "Prefix 'अनु' is joined to the root word 'शासन'.",
                explanationHindi = "'अनु' उपसर्ग का अर्थ पीछे या समान होता है: अनु + शासन = अनुशासन।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_008",
                questionText = "Which of the following is a Tatsam (तत्सम) word?",
                questionTextHindi = "निम्नलिखित में से कौन सा तत्सम शब्द है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Tatsam Tadbhav",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("अग्नि", "आग", "सूरज", "खेत"),
                optionsHindi = listOf("अग्नि (संस्कृत का मूल शब्द)", "आग (तद्भव)", "सूरज (तद्भव - सूर्य)", "खेत (तद्भव - क्षेत्र)"),
                correctAnswerIndex = 0,
                explanation = "Tatsam words are direct Sanskrit words used in Hindi without change (e.g., Agni).",
                explanationHindi = "संस्कृत के जो शब्द बिना किसी परिवर्तन के प्रयुक्त होते हैं, उन्हें तत्सम कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_VYAK_009",
                questionText = "Which type of noun (संज्ञा) is the word 'मिठास' (Mithaas / Sweetness)?",
                questionTextHindi = "'मिठास' शब्द किस प्रकार की संज्ञा का उदाहरण है?",
                category = "HINDI_LANGUAGE",
                subcategory = "VYAKARAN_SHABD",
                examOrBoard = null,
                targetClass = null,
                subject = "Hindi",
                chapterOrTopic = "Sangya",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("भाववाचक संज्ञा (Abstract Noun)", "जातिवाचक संज्ञा", "व्यक्तिवाचक संज्ञा", "द्रव्यवाचक संज्ञा"),
                optionsHindi = listOf("भाववाचक संज्ञा (गुण/भाव का बोध)", "जातिवाचक संज्ञा", "व्यक्तिवाचक संज्ञा", "द्रव्यवाचक संज्ञा"),
                correctAnswerIndex = 0,
                explanation = "'मिठास' is an abstract quality noun derived from adjective 'मीठा'.",
                explanationHindi = "जो शब्द किसी गुण, दोष या भाव का बोध कराते हैं, उन्हें भाववाचक संज्ञा कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Hindi", "Vyakaran")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_001",
                questionText = "What is the meaning of the idiom 'a piece of cake'?",
                questionTextHindi = "अंग्रेजी मुहावरे 'a piece of cake' का सही अर्थ क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Something that is very easy to do", "A slice of sweet pastry", "A difficult task", "A birthday celebration"),
                optionsHindi = listOf("कोई कार्य जो बहुत आसान हो (Something very easy)", "केक का टुकड़ा", "कठिन चुनौती", "उत्सव मनाना"),
                correctAnswerIndex = 0,
                explanation = "'A piece of cake' means a task that is exceptionally simple and effortless.",
                explanationHindi = "इसका अर्थ है कोई ऐसा काम जो बहुत सरल और आसानी से हो जाए।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_002",
                questionText = "What does the idiom 'bite the bullet' mean?",
                questionTextHindi = "मुहावरे 'bite the bullet' का क्या अर्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To face a painful or difficult situation with courage", "To get shot in battle", "To be extremely angry", "To eat quickly"),
                optionsHindi = listOf("किसी कठिन या अप्रिय परिस्थिति का साहसपूर्वक सामना करना", "गोली लगना", "क्रोधित होना", "जल्दी खाना"),
                correctAnswerIndex = 0,
                explanation = "'Bite the bullet' comes from soldiers enduring painful medical treatment without anaesthetic by biting on a lead bullet.",
                explanationHindi = "साहस जुटाकर किसी अपरिहार्य कठिन परिस्थिति का सामना करना।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_003",
                questionText = "What is the meaning of the idiom 'break the ice'?",
                questionTextHindi = "'break the ice' मुहावरे का सही अर्थ क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To initiate conversation and relieve social awkwardness", "To crack winter ice", "To give a cold look", "To end a relationship"),
                optionsHindi = listOf("बातचीत शुरू करके झिझक या औपचारिकता को दूर करना", "बर्फ तोड़ना", "ठंडी प्रतिक्रिया देना", "संबंध तोड़ना"),
                correctAnswerIndex = 0,
                explanation = "To break the ice is to overcome formality and make people comfortable in a gathering.",
                explanationHindi = "अजनबियों के बीच बातचीत की शुरुआत करके संकोच समाप्त करना।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_004",
                questionText = "What does the expression 'burn the midnight oil' signify?",
                questionTextHindi = "'burn the midnight oil' का क्या भावार्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To work or study late into the night", "To waste kerosene", "To burn candles", "To wake up early morning"),
                optionsHindi = listOf("देर रात तक जागकर मेहनत या पढ़ाई करना", "तेल बर्बाद करना", "मोमबत्ती जलाना", "सुबह जल्दी उठना"),
                correctAnswerIndex = 0,
                explanation = "Before electricity, people burned oil lamps to work late at night.",
                explanationHindi = "परीक्षा या काम के लिए देर रात तक अध्ययन अथवा परिश्रम करना।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_005",
                questionText = "What is the meaning of the proverb 'Actions speak louder than words'?",
                questionTextHindi = "कहावत 'Actions speak louder than words' का क्या अर्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Proverbs",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("What you do is more important and genuine than what you say", "Talking loudly is better", "Silent people are smart", "Never speak in public"),
                optionsHindi = listOf("कथनी से अधिक महत्वपूर्ण करनी होती है (काम करके दिखाना)", "जोर से बोलना", "मौन रहना", "भाषण देना"),
                correctAnswerIndex = 0,
                explanation = "Real character and intention are demonstrated through deeds rather than promises.",
                explanationHindi = "व्यक्ति की पहचान उसके वचनों से नहीं बल्कि उसके आचरण से होती है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Proverbs")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_006",
                questionText = "What is meant by the idiom 'once in a blue moon'?",
                questionTextHindi = "मुहावरे 'once in a blue moon' का अर्थ क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Very rarely or almost never", "Every full moon", "When the sky is blue", "Frequently"),
                optionsHindi = listOf("बहुत ही दुर्लभ रूप से (कभी-कभार ही)", "हर पूर्णिमा को", "नियमित रूप से", "प्रतिदिन"),
                correctAnswerIndex = 0,
                explanation = "A blue moon (second full moon in a month) happens only once every 2 to 3 years, denoting rarity.",
                explanationHindi = "जो घटना अत्यंत दुर्लभ रूप से कभी-कभार ही घटित हो।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_007",
                questionText = "What does the proverb 'Every cloud has a silver lining' mean?",
                questionTextHindi = "'Every cloud has a silver lining' कहावत का क्या तात्पर्य है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Proverbs",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Every difficult or negative situation has some comforting or hopeful aspect", "Clouds look silver in moonlight", "Rain always brings wealth", "Be prepared for storms"),
                optionsHindi = listOf("प्रत्येक संकट या निराशा में भी आशा की कोई न कोई किरण अवश्य होती है", "चांदी की परत वाले बादल", "वर्षा से धन लाभ", "तूफान से सावधान"),
                correctAnswerIndex = 0,
                explanation = "Even in dark situations, optimism and positive opportunities can always be found.",
                explanationHindi = "हर बुरी स्थिति में भी कोई न कोई सकारात्मक पहलू छिपा होता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Proverbs")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_IDM_008",
                questionText = "What does 'barking up the wrong tree' mean?",
                questionTextHindi = "'barking up the wrong tree' मुहावरे का क्या अर्थ है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "IDIOMS_PROVERBS",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Idioms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Pursuing a mistaken line of thought or accusing the wrong person", "A dog chasing a cat up a tree", "Losing your voice", "Cutting down trees"),
                optionsHindi = listOf("गलत दिशा में प्रयास करना या किसी निर्दोष पर गलत आरोप लगाना", "पेड़ पर भौंकना", "आवाज खोना", "पेड़ काटना"),
                correctAnswerIndex = 0,
                explanation = "Derived from hunting dogs barking at a tree after the prey has escaped to another.",
                explanationHindi = "गलत अनुमान लगाकर व्यर्थ दिशा में प्रयास करना।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Idioms")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_001",
                questionText = "Choose the grammatically correct sentence regarding subject-verb agreement:",
                questionTextHindi = "Subject-Verb Agreement के नियम अनुसार सही वाक्य चुनिए:",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Subject-Verb Agreement",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Neither of the boys was present.", "Neither of the boys were present.", "Neither of the boys are present.", "Neither of the boys have present."),
                optionsHindi = listOf("Neither of the boys was present. ('Neither' एकवचन क्रिया लेता है)", "Neither of the boys were present.", "Neither of the boys are present.", "Neither of the boys have present."),
                correctAnswerIndex = 0,
                explanation = "'Neither' takes a singular verb: 'Neither of the boys was present'.",
                explanationHindi = "'Neither' या 'Either' के बाद संज्ञा बहुवचन होने पर भी क्रिया एकवचन (was) ही आती है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Grammar")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_002",
                questionText = "Fill in the blank with the correct preposition: 'She is very proficient _____ speaking French.'",
                questionTextHindi = "उचित Preposition से रिक्त स्थान भरिए: 'She is very proficient _____ speaking French.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Prepositions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("in", "at", "with", "on"),
                optionsHindi = listOf("in (proficient in something)", "at", "with", "on"),
                correctAnswerIndex = 0,
                explanation = "The adjective 'proficient' is followed by the preposition 'in'.",
                explanationHindi = "'Proficient' (कुशल) के साथ 'in' का प्रयोग किया जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Prepositions")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_003",
                questionText = "What is the synonym of the word 'BENEVOLENT'?",
                questionTextHindi = "'BENEVOLENT' शब्द का सही समानार्थी (Synonym) क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Synonyms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kind and generous", "Cruel and hostile", "Greedy", "Lazy"),
                optionsHindi = listOf("दयालु और परोपकारी (Kind and Generous)", "क्रूर", "लालची", "आलसी"),
                correctAnswerIndex = 0,
                explanation = "Benevolent means well-meaning and charitable.",
                explanationHindi = "Benevolent का अर्थ दयालु, कृपालु अथवा परोपकारी होता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Vocabulary")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_004",
                questionText = "What is the antonym of the word 'FRUGAL'?",
                questionTextHindi = "'FRUGAL' शब्द का सही विलोम (Antonym) क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Antonyms",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Extravagant (खर्चीला)", "Economical (मितव्ययी)", "Simple", "Prudent"),
                optionsHindi = listOf("Extravagant (फिजूलखर्च करने वाला)", "Economical (समानार्थी)", "Simple", "Prudent"),
                correctAnswerIndex = 0,
                explanation = "Frugal means economical with money; its opposite is extravagant (wasteful).",
                explanationHindi = "Frugal (मितव्ययी/किफायती) का विलोम Extravagant (अपव्ययी/फिजूलखर्च) होता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Vocabulary")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_005",
                questionText = "Convert to Passive Voice: 'The teacher explained the lesson.'",
                questionTextHindi = "दिए गए वाक्य का सही Passive Voice क्या होगा: 'The teacher explained the lesson.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Voice",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("The lesson was explained by the teacher.", "The lesson is explained by the teacher.", "The lesson has been explained by the teacher.", "The lesson had explained by the teacher."),
                optionsHindi = listOf("The lesson was explained by the teacher.", "The lesson is explained by the teacher.", "The lesson has been explained by the teacher.", "The lesson had explained by the teacher."),
                correctAnswerIndex = 0,
                explanation = "Simple past active 'V2' converts to 'was/were + V3' in passive voice.",
                explanationHindi = "भूतकाल (Past Simple) का पैसिव रूप 'was + explained' बनता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Voice")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_006",
                questionText = "What is the one-word substitution for: 'A person who collects or studies stamps'?",
                questionTextHindi = "वाक्यांश 'A person who collects or studies stamps' के लिए एक शब्द क्या है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "One Word Substitution",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Philatelist", "Numismatist (coins)", "Bibliophile (books)", "Ornithologist (birds)"),
                optionsHindi = listOf("Philatelist (डाक टिकट संग्रहकर्ता)", "Numismatist (सिक्के)", "Bibliophile (पुस्तकें)", "Ornithologist (पक्षी)"),
                correctAnswerIndex = 0,
                explanation = "Philatelist collects stamps; Numismatist collects coins.",
                explanationHindi = "डाक टिकटों का अध्ययन व संग्रह करने वाले को Philatelist कहते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Vocabulary")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_007",
                questionText = "Identify the part of speech of the underlined word: 'She ran *quickly* to catch the bus.'",
                questionTextHindi = "वाक्य में रेखांकित शब्द 'quickly' का Part of Speech क्या है: 'She ran quickly to catch the bus.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Parts of Speech",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Adverb", "Adjective", "Verb", "Noun"),
                optionsHindi = listOf("Adverb (क्रियाविशेषण - दौड़ने के ढंग को दर्शाता है)", "Adjective (विशेषण)", "Verb (क्रिया)", "Noun (संज्ञा)"),
                correctAnswerIndex = 0,
                explanation = "'Quickly' modifies the verb 'ran', answering how she ran; hence it is an adverb of manner.",
                explanationHindi = "Quickly क्रिया 'ran' की विशेषता बता रहा है, अतः यह Adverb है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Grammar")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_008",
                questionText = "Fill in the blank with the correct tense form: 'By next year, she _____ from the university.'",
                questionTextHindi = "उचित Tense से रिक्त स्थान भरिए: 'By next year, she _____ from the university.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Tenses",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("will have graduated", "graduated", "will graduate", "has graduated"),
                optionsHindi = listOf("will have graduated (Future Perfect Tense)", "graduated", "will graduate", "has graduated"),
                correctAnswerIndex = 0,
                explanation = "'By + future time expression' requires Future Perfect Tense (will have + V3).",
                explanationHindi = "'By next year' भविष्य में कार्य पूर्ण होने का सूचक है, अतः Future Perfect प्रयुक्त होगा।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Tenses")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_009",
                questionText = "Which of the following sentences uses the conditional mood correctly?",
                questionTextHindi = "सशर्त वाक्य (Conditional sentence) का सही रूप कौन सा है?",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Conditionals",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("If I were you, I would accept the offer.", "If I was you, I will accept the offer.", "If I am you, I would accepted the offer.", "If I had been you, I will accept the offer."),
                optionsHindi = listOf("If I were you, I would accept the offer. (काल्पनिक स्थिति हेतु 'were')", "If I was you, I will accept the offer.", "If I am you...", "If I had been..."),
                correctAnswerIndex = 0,
                explanation = "Subjunctive mood for hypothetical conditions uses 'were' with all persons.",
                explanationHindi = "काल्पनिक या असंभव परिस्थिति के लिए 'If I were...' का प्रयोग किया जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Grammar")
            )
        )

        list.add(
            Question(
                id = "Q_ENG_GRM_010",
                questionText = "Fill in the blank with the correct modal verb: 'You _____ wear a helmet while riding a two-wheeler; it is mandatory by law.'",
                questionTextHindi = "रिक्त स्थान भरिए: 'You _____ wear a helmet while riding a two-wheeler; it is mandatory by law.'",
                category = "ENGLISH_LANGUAGE",
                subcategory = "GRAMMAR_VOCAB",
                examOrBoard = null,
                targetClass = null,
                subject = "English",
                chapterOrTopic = "Modals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("must", "might", "could", "should"),
                optionsHindi = listOf("must (कानूनी अनिवार्यता हेतु)", "might", "could", "should"),
                correctAnswerIndex = 0,
                explanation = "'Must' expresses strong obligation and legal compulsion.",
                explanationHindi = "कानूनी बाध्यता और अनिवार्यता व्यक्त करने के लिए 'must' का प्रयोग होता है।",
                negativeMarks = 0.0f,
                tags = listOf("English", "Modals")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_005",
                questionText = "What is the unit of electrical capacitance in the SI system?",
                questionTextHindi = "SI पद्धति में विद्युत धारिता (Capacitance) का मात्रक क्या है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Capacitance",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Farad (F)", "Henry (H)", "Ohm (Ω)", "Weber (Wb)"),
                optionsHindi = listOf("फैराड (Farad - प्रतीक F)", "हेनरी (प्रेरकत्व)", "ओम (प्रतिरोध)", "वेबर (चुंबकीय फ्लक्स)"),
                correctAnswerIndex = 0,
                explanation = "Capacitance is measured in Farad (1 F = 1 Coulomb / Volt).",
                explanationHindi = "संधारित्र की धारिता का SI मात्रक फैराड (F) होता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Electrician", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_006",
                questionText = "Which law states that the algebraic sum of currents entering a node is equal to the sum of currents leaving that node?",
                questionTextHindi = "किस नियम के अनुसार किसी संधि (नोड) पर प्रवेश करने वाली धाराओं का बीजगणितीय योग बाहर जाने वाली धाराओं के बराबर होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Circuit Laws",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Kirchhoff's Current Law (KCL)", "Kirchhoff's Voltage Law (KVL)", "Faraday's Law", "Lenz's Law"),
                optionsHindi = listOf("किरचॉफ का धारा नियम (KCL / जंक्शन नियम)", "किरचॉफ का वोल्टेज नियम (KVL)", "फैराडे का नियम", "लेंज का नियम"),
                correctAnswerIndex = 0,
                explanation = "KCL is based on the law of conservation of electric charge: Σ I_in = Σ I_out.",
                explanationHindi = "किरचॉफ का धारा नियम (KCL) आवेश संरक्षण के नियम पर आधारित है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "KCL", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_007",
                questionText = "On which fundamental electromagnetic phenomenon does an electrical transformer work?",
                questionTextHindi = "विद्युत ट्रांसफार्मर किस मूलभूत विद्युत-चुंबकीय सिद्धांत पर कार्य करता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Transformers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Mutual Induction between two coils", "Self induction only", "Electrochemical reaction", "Eddy current heating"),
                optionsHindi = listOf("पारस्परिक प्रेरण (Mutual Induction)", "केवल स्व-प्रेरण", "विद्युत-रासायनिक प्रभाव", "भंवर धाराएं"),
                correctAnswerIndex = 0,
                explanation = "Transformers transfer alternating electrical energy between circuits via mutual induction without changing frequency.",
                explanationHindi = "ट्रांसफार्मर पारस्परिक प्रेरण के सिद्धांत पर बिना आवृत्ति बदले विभव परिवर्तन करता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Transformers", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_008",
                questionText = "What electrolyte is used in a fully charged lead-acid battery?",
                questionTextHindi = "पूर्णतः आवेशित लेड-एसिड बैटरी में किस विद्युत-अपघट्य (Electrolyte) का उपयोग होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Batteries",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Dilute Sulphuric Acid (H2SO4)", "Potassium Hydroxide (KOH)", "Hydrochloric Acid (HCl)", "Nitric Acid (HNO3)"),
                optionsHindi = listOf("तनु सल्फ्यूरिक अम्ल (H₂SO₄)", "पोटेशियम हाइड्रॉक्साइड", "हाइड्रोक्लोरिक अम्ल", "नाइट्रिक अम्ल"),
                correctAnswerIndex = 0,
                explanation = "Lead-acid storage batteries use dilute sulphuric acid (H2SO4) with specific gravity ~1.28.",
                explanationHindi = "लेड-एसिड बैटरी में तनु सल्फ्यूरिक एसिड और डिस्टिल्ड वाटर का मिश्रण प्रयुक्त होता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Batteries", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_009",
                questionText = "What device is used to measure unknown insulation resistance of electrical cables and machines?",
                questionTextHindi = "विद्युत केबलों और मोटरों के इंसुलेशन प्रतिरोध को मापने के लिए किस उपकरण का उपयोग किया जाता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Instruments",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Megger (Insulation Tester)", "Multimeter", "Ammeter", "Energy Meter"),
                optionsHindi = listOf("मेगर (Megger - इंसुलेशन टेस्टर)", "मल्टीमीटर", "एमीटर", "एनर्जी मीटर"),
                correctAnswerIndex = 0,
                explanation = "A Megger generates high test voltage (500V/1000V DC) to measure Mega-ohms of insulation resistance.",
                explanationHindi = "उच्च इंसुलेशन प्रतिरोध (मेगा-ओम में) मापने के लिए मेगर का उपयोग करते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Megger", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_010",
                questionText = "The direction of rotation of a DC motor can be reversed by reversing:",
                questionTextHindi = "डीसी मोटर के घूमने की दिशा को किसके संयोजन को बदलकर उलटा जा सकता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "DC Motors",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Either field winding or armature winding terminals (but not both)", "Both field and armature simultaneously", "Supply terminal polarity only", "Starter position"),
                optionsHindi = listOf("या तो आर्मेचर या फील्ड वाइंडिंग के टर्मिनल (दोनों एक साथ नहीं)", "दोनों एक साथ बदलकर", "सप्लाई पोलैरिटी बदलकर", "स्टार्टर"),
                correctAnswerIndex = 0,
                explanation = "Reversing either armature current OR field flux reverses the torque direction (Fleming's Left-Hand Rule).",
                explanationHindi = "आर्मेचर या फील्ड में से किसी एक के कनेक्शन बदलने पर मोटर के घूर्णन की दिशा बदल जाती है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "DC Motor", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_011",
                questionText = "What is the function of a split-phase capacitor in a single-phase domestic ceiling fan motor?",
                questionTextHindi = "घरेलू छत के पंखे की सिंगल-फेज मोटर में कैपेसिटर (कंडेनसर) का क्या मुख्य कार्य होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Single Phase Motors",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To create a phase difference and produce starting torque", "To convert AC into DC", "To regulate speed only", "To step up voltage"),
                optionsHindi = listOf("फेज अंतर उत्पन्न कर प्रारंभिक स्टार्टिंग टॉर्क पैदा करना", "AC को DC में बदलना", "वोल्टेज बढ़ाना", "केवल गति नियंत्रित करना"),
                correctAnswerIndex = 0,
                explanation = "Single-phase motors have no self-starting rotating magnetic field; the capacitor splits the phase to produce starting torque.",
                explanationHindi = "सिंगल फेज मोटर को सेल्फ-स्टार्ट बनाने हेतु कैपेसिटर 90° फेज शिफ्ट कर घूर्णी चुंबकीय क्षेत्र बनाता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Capacitor", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_012",
                questionText = "What is the power factor (cos φ) of a purely resistive AC circuit?",
                questionTextHindi = "पूर्णतः प्रतिरोधी (Purely Resistive) AC परिपथ का पावर फैक्टर (cos φ) कितना होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "AC Theory",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Unity (1.0)", "Zero lagging", "Zero leading", "0.5"),
                optionsHindi = listOf("इकाई (1.0 - वोल्टेज और करंट समान कला में)", "शून्य पश्चगामी", "शून्य अग्रगामी", "0.5"),
                correctAnswerIndex = 0,
                explanation = "In a purely resistive circuit, voltage and current are in phase (phase angle φ = 0°), so cos 0° = 1.0.",
                explanationHindi = "शुद्ध प्रतिरोधी परिपथ में विभव तथा धारा समान कला में होते हैं, अतः पावर फैक्टर 1 होता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Power Factor", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_ELEC_013",
                questionText = "Which instrument measures electrical energy consumed by a consumer over time in kilowatt-hours (kWh)?",
                questionTextHindi = "उपभोक्ता द्वारा खपत की गई विद्युत ऊर्जा को किलोवाट-घंटा (kWh) में मापने वाला मीटर कौन सा है?",
                category = "ITI_TECHNICAL",
                subcategory = "ELECTRICIAN_THEORY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Energy Meter",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Energy Meter (kWh Meter)", "Wattmeter", "Frequency Meter", "Voltmeter"),
                optionsHindi = listOf("एनर्जी मीटर (kWh मीटर / ऊर्जा मापी)", "वाटमीटर", "आवृत्ति मापी", "वोल्टमीटर"),
                correctAnswerIndex = 0,
                explanation = "An integrating energy meter records power consumed multiplied by hours (kWh).",
                explanationHindi = "ऊर्जा मापी (Energy meter) एक समाकलक उपकरण है जो विद्युत ऊर्जा यूनिट में दर्ज करता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Energy Meter", "Trade Theory")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_001",
                questionText = "What does the abbreviation 'MCB' stand for in electrical installations?",
                questionTextHindi = "विद्युत संस्थापनों में 'MCB' का पूरा नाम क्या होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Circuit Breakers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Miniature Circuit Breaker", "Main Current Breaker", "Maximum Capacity Breaker", "Motor Control Board"),
                optionsHindi = listOf("मिनिएचर सर्किट ब्रेकर (Miniature Circuit Breaker)", "मेन करंट ब्रेकर", "मैक्सिमम कैपेसिटी ब्रेकर", "मोटर कंट्रोल बोर्ड"),
                correctAnswerIndex = 0,
                explanation = "MCB automatically switches off electrical circuits during abnormal conditions like overload and short circuit.",
                explanationHindi = "MCB ओवरलोड और शॉर्ट-सर्किट होने पर स्वतः ट्रिप होकर परिपथ की सुरक्षा करती है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Safety", "Wiring")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_002",
                questionText = "According to Indian Electricity (IE) standards, what is the standard color of the Earth wire in domestic wiring?",
                questionTextHindi = "भारतीय विद्युत मानकों के अनुसार घरेलू वायरिंग में अर्थिंग (भू-संपर्क) तार का मानक रंग क्या होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Color Codes",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Green or Green with Yellow stripes", "Red", "Black", "Blue"),
                optionsHindi = listOf("हरा अथवा हरा-पीला (Green / Yellow)", "लाल (फेज़ तार)", "काला (न्यूट्रल तार)", "नीला"),
                correctAnswerIndex = 0,
                explanation = "Standard color code in India: Phase = Red/Yellow/Blue; Neutral = Black; Earth = Green (or Green-Yellow).",
                explanationHindi = "भारतीय मानक: फेज़ = लाल, न्यूट्रल = काला, और अर्थिंग = हरा।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Color Codes", "Wiring")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_003",
                questionText = "Which type of fire extinguisher should NEVER be used on electrical equipment fires?",
                questionTextHindi = "विद्युत उपकरणों में लगी आग पर किस प्रकार के अग्निशामक का उपयोग कभी नहीं करना चाहिए?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Fire Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Water extinguisher (जल अग्निशामक)", "CO2 extinguisher", "Dry chemical powder (DCP)", "Halon extinguisher"),
                optionsHindi = listOf("पानी / जल अग्निशामक (विद्युत का सुचालक होने से घातक झटका लग सकता है)", "कार्बन डाइऑक्साइड (CO₂)", "ड्राई केमिकल पाउडर (DCP)", "हैलोन"),
                correctAnswerIndex = 0,
                explanation = "Water conducts electricity and can deliver a fatal electric shock to the user. Use CO2 or Dry Chemical Powder.",
                explanationHindi = "पानी विद्युत का सुचालक है, अतः विद्युत आग पर पानी डालने से गंभीर करंट लग सकता है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Safety", "Fire Extinguisher")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_004",
                questionText = "What is the primary function of electrical Earthing in a domestic building?",
                questionTextHindi = "घरेलू भवनों में विद्युत अर्थिंग (भू-संपर्कन) का मुख्य उद्देश्य क्या होता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Earthing",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To protect human life from dangerous electric shocks during leakage faults", "To reduce electricity bills", "To increase voltage supply", "To protect against thunder without lightning rod"),
                optionsHindi = listOf("लीकेज करंट होने पर मानव जीवन को जानलेवा बिजली के झटके से बचाना", "बिजली बिल कम करना", "वोल्टेज बढ़ाना", "पंखा तेज चलाना"),
                correctAnswerIndex = 0,
                explanation = "Earthing provides a low resistance path for fault leakage current straight into the ground, tripping the breaker.",
                explanationHindi = "अर्थिंग मेटैलिक बॉडी से लीकेज करंट को जमीन में भेजकर उपयोगकर्ता को करंट से सुरक्षित रखती है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Earthing", "Safety")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_005",
                questionText = "What alloy is typically used to manufacture an electrical fuse wire?",
                questionTextHindi = "विद्युत फ्यूज तार बनाने के लिए सामान्यतः किस मिश्र धातु का उपयोग किया जाता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Fuse",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Tin and Lead alloy (63% Tin, 37% Lead)", "Copper and Zinc", "Nichrome (Nickel-Chromium)", "Tungsten"),
                optionsHindi = listOf("टिन एवं लेड मिश्र धातु (कम गलनांक हेतु)", "तांबा और जस्ता", "नाइक्रोम (हीटर हेतु)", "टंगस्टन (फिलामेंट हेतु)"),
                correctAnswerIndex = 0,
                explanation = "Fuse wire requires low melting point and high resistivity, made of 63% Tin and 37% Lead.",
                explanationHindi = "फ्यूज तार टिन और सीसा (लेड) की मिश्र धातु से बनता है ताकि यह अधिक करंट पर तुरंत पिघल जाए।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Fuse", "Safety")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_006",
                questionText = "What safety device trips when there is a current imbalance between Phase and Neutral due to human contact or earth leakage?",
                questionTextHindi = "फेज़ और न्यूट्रल के बीच लीकेज करंट होने पर कौन सा सुरक्षात्मक उपकरण मिलीसेकंड में सप्लाई काट देता है?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "RCCB",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("RCCB (Residual Current Circuit Breaker / ELCB)", "Simple Switch", "Voltmeter", "Step-up Transformer"),
                optionsHindi = listOf("RCCB / ELCB (रेजिडुअल करंट सर्किट ब्रेकर)", "साधारण स्विच", "वोल्टमीटर", "ट्रांसफार्मर"),
                correctAnswerIndex = 0,
                explanation = "An RCCB detects residual leakage current (e.g., 30 mA) to ground and trips immediately to prevent electrocution.",
                explanationHindi = "RCCB अर्थ लीकेज होने पर 30 मिली-एम्पीयर पर ही परिपथ तोड़कर बिजली के झटके से जान बचाती है।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "RCCB", "Safety")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_007",
                questionText = "What is the recommended maximum earth resistance for a domestic electrical installation?",
                questionTextHindi = "घरेलू विद्युत संस्थापनों में अर्थिंग का प्रतिरोध अधिकतम कितना होना चाहिए?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "Earthing Standards",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Less than 5 Ohms (5 Ω से कम)", "100 Ohms", "50 Ohms", "1000 Ohms"),
                optionsHindi = listOf("5 ओम से कम (कम प्रतिरोध से त्वरित डिस्चार्ज)", "100 ओम", "50 ओम", "1000 ओम"),
                correctAnswerIndex = 0,
                explanation = "Earth resistance in domestic premises should not exceed 5 Ohms, while in large substations it is under 1 Ohm.",
                explanationHindi = "घरेलू वायरिंग में भू-प्रतिरोध 5 Ω से कम होना आवश्यक है ताकि लीकेज करंट आसानी से जमीन में जाए।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Earthing", "Standards")
            )
        )

        list.add(
            Question(
                id = "Q_WIRE_008",
                questionText = "What should be the first immediate action taken when a person is seen in contact with a live electrical wire?",
                questionTextHindi = "यदि कोई व्यक्ति जीवित विद्युत तार के संपर्क में आकर करंट से चिपक गया हो, तो सबसे पहला कदम क्या उठाना चाहिए?",
                category = "ITI_TECHNICAL",
                subcategory = "WIRING_SAFETY",
                examOrBoard = null,
                targetClass = null,
                subject = "Electrician Trade",
                chapterOrTopic = "First Aid",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Immediately switch off the main power supply or use a dry wooden stick to separate them", "Pull them with bare hands", "Pour water to cool the victim", "Call an ambulance while watching"),
                optionsHindi = listOf("तुरंत मुख्य स्विच बंद करें या सूखी लकड़ी की छड़ी से अलग करें (नंगे हाथ से न छुएं)", "नंगे हाथों से खींचें", "पानी डालें", "खड़े होकर देखें"),
                correctAnswerIndex = 0,
                explanation = "Never touch the victim with bare hands. Immediately switch off the main switch or use non-conductive dry wood or rubber.",
                explanationHindi = "तुरंत मेन स्विच बंद करें या किसी कुचालक वस्तु (सूखी लकड़ी/प्लास्टिक) से पीड़ित को अलग करें।",
                negativeMarks = 0.0f,
                tags = listOf("ITI", "Safety", "First Aid")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_001",
                questionText = "Deficiency of Vitamin C in daily diet causes which deficiency disease?",
                questionTextHindi = "दैनिक आहार में विटामिन सी (Vitamin C) की कमी से कौन सा रोग हो जाता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Vitamins",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Scurvy (bleeding gums)", "Rickets", "Beriberi", "Night blindness"),
                optionsHindi = listOf("स्कर्वी (मसूड़ों से खून आना)", "रिकेट्स (हड्डी की कमजोरी)", "बेरी-बेरी", "रतौंधी (विटामिन A)"),
                correctAnswerIndex = 0,
                explanation = "Vitamin C deficiency leads to Scurvy. Citrus fruits like lemon, amla, and oranges are rich sources.",
                explanationHindi = "विटामिन C की कमी से स्कर्वी रोग होता है। आंवला और नींबू इसके प्रमुख प्राकृतिक स्रोत हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Health", "Nutrition")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_002",
                questionText = "Which beneficial bacteria is responsible for converting milk into nutritious curd (yogurt)?",
                questionTextHindi = "दूध को पौष्टिक दही में परिवर्तित करने के लिए कौन सा लाभकारी जीवाणु (बैक्टीरिया) उत्तरदायी है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Curd Formation",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Lactobacillus acidophilus", "Salmonella", "Streptococcus", "E. coli"),
                optionsHindi = listOf("लैक्टोबैसिलस (Lactobacillus)", "साल्मोनेला", "स्ट्रेप्टोकोकस", "ई. कोलाई"),
                correctAnswerIndex = 0,
                explanation = "Lactobacillus ferments lactose sugar in milk into lactic acid, coagulating the milk protein into curd.",
                explanationHindi = "लैक्टोबैसिलस बैक्टीरिया दूध की लैक्टोज शर्करा को लैक्टिक एसिड में बदलकर दही जमाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Science")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_003",
                questionText = "Why is common table salt fortified with Iodine across households?",
                questionTextHindi = "घरों में प्रयुक्त साधारण नमक में आयोडीन क्यों मिलाया जाता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Minerals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("To prevent Goitre and support healthy thyroid function", "To improve salt taste", "To prevent tooth decay", "To make salt look white"),
                optionsHindi = listOf("घेंघा (गलगंड / Goitre) रोग से बचाव तथा थायरॉयड स्वास्थ्य हेतु", "स्वाद बढ़ाने के लिए", "दांतों की सुरक्षा", "सफेदी के लिए"),
                correctAnswerIndex = 0,
                explanation = "Iodine is essential for thyroid hormone production; deficiency causes Goitre (swelling in the neck).",
                explanationHindi = "आयोडीन थायरॉयड ग्रंथि के सुचारू कार्य और घेंघा रोग की रोकथाम हेतु अत्यंत आवश्यक है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Health", "Nutrition")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_004",
                questionText = "Which mineral, abundantly found in spinach, jaggery, and pomegranate, helps prevent Anemia?",
                questionTextHindi = "पालक, गुड़ और अनार में प्रचुर मात्रा में पाया जाने वाला कौन सा खनिज एनीमिया (खून की कमी) को रोकता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Minerals",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Iron (लोहा)", "Calcium", "Zinc", "Potassium"),
                optionsHindi = listOf("आयरन / लोहा (हीमोग्लोबिन निर्माण हेतु)", "कैल्शियम (हड्डियों हेतु)", "जिंक", "पोटेशियम"),
                correctAnswerIndex = 0,
                explanation = "Iron is the central component of hemoglobin, which carries oxygen in blood. Its deficiency causes anemia.",
                explanationHindi = "आयरन रक्त में हीमोग्लोबिन के निर्माण के लिए आवश्यक है, जिससे एनीमिया की रोकथाम होती है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Nutrition", "Health")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_005",
                questionText = "Which natural ingredients act as traditional preservatives in Indian homemade pickles (अचार)?",
                questionTextHindi = "भारतीय पारंपरिक अचार में कौन से प्राकृतिक घटक संरक्षक (Preservatives) का कार्य करते हैं?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Food Preservation",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Salt, Mustard Oil, and Turmeric", "Artificial MSG", "Food colorings", "Cold water"),
                optionsHindi = listOf("नमक, सरसों का तेल एवं हल्दी", "कृत्रिम रसायन", "फूड कलर", "ठंडा पानी"),
                correctAnswerIndex = 0,
                explanation = "Salt draws out moisture through osmosis; oil creates an airtight protective layer inhibiting bacterial growth.",
                explanationHindi = "नमक नमी सोखता है और तेल हवा के संपर्क को रोककर फफूंद व जीवाणुओं को पनपने नहीं देता।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Food Preservation")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_006",
                questionText = "Which vitamin is synthesized in the human skin upon exposure to morning sunlight?",
                questionTextHindi = "सुबह की धूप में त्वचा द्वारा किस महत्वपूर्ण विटामिन का प्राकृतिक संश्लेषण होता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Vitamins",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Vitamin D", "Vitamin A", "Vitamin B12", "Vitamin K"),
                optionsHindi = listOf("विटामिन डी (Vitamin D - हड्डियों के लिए जरूरी)", "विटामिन ए", "विटामिन बी12", "विटामिन के"),
                correctAnswerIndex = 0,
                explanation = "Exposure to morning ultraviolet-B rays allows skin cells to synthesize Vitamin D for calcium absorption.",
                explanationHindi = "सूर्य के प्रकाश से शरीर में विटामिन D बनता है जो हड्डियों को मजबूत रखने में सहायक है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Health", "Vitamins")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_007",
                questionText = "Cooking vegetables in excessive boiling water and then discarding the water results in loss of which vitamins?",
                questionTextHindi = "सब्जियों को अधिक पानी में उबालकर पानी फेंक देने से कौन से घुलनशील विटामिन नष्ट हो जाते हैं?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Cooking Science",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Water-soluble Vitamins B and C", "Fat-soluble Vitamin A and D", "Proteins only", "Minerals like iron"),
                optionsHindi = listOf("जल में घुलनशील विटामिन B और C", "वसा में घुलनशील विटामिन A और D", "केवल प्रोटीन", "फाइबर"),
                correctAnswerIndex = 0,
                explanation = "Vitamins B and C dissolve in water and are easily drained away and destroyed by heat.",
                explanationHindi = "विटामिन B और C जल में घुलनशील होते हैं, अतः अतिरिक्त पानी फेंकने से वे नष्ट हो जाते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Nutrition")
            )
        )

        list.add(
            Question(
                id = "Q_KITCH_008",
                questionText = "What natural home remedy drink made from water, salt, and sugar is given to prevent dehydration during diarrhea or heat stroke?",
                questionTextHindi = "दस्त या लू लगने पर निर्जलीकरण (Dehydration) से बचाव हेतु नमक, चीनी और पानी का कौन सा घोल दिया जाता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "KITCHEN_NUTRITION",
                examOrBoard = null,
                targetClass = null,
                subject = "Everyday Science",
                chapterOrTopic = "Home Health",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("ORS (Oral Rehydration Solution) / Shikanji", "Cold carbonated soda", "Strong coffee", "Pure vinegar"),
                optionsHindi = listOf("ओआरएस (ORS - जीवन रक्षक घोल) / शिकंजी", "कोल्ड ड्रिंक", "गाढ़ी कॉफी", "सिरका"),
                correctAnswerIndex = 0,
                explanation = "ORS (6 level tsp sugar + 1/2 tsp salt in 1 litre boiled water) replenishes vital electrolytes.",
                explanationHindi = "ओआरएस का घोल शरीर में जल और आवश्यक लवणों की कमी को तुरंत पूरा करता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Health", "First Aid")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_001",
                questionText = "What chemical substance is deliberately added to domestic LPG gas to give it a strong warning odor during leakage?",
                questionTextHindi = "घरेलू एलपीजी गैस सिलेंडर में रिसाव की पहचान हेतु कौन सा तीक्ष्ण गंध वाला रसायन मिलाया जाता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Household Safety",
                chapterOrTopic = "Gas Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Ethyl Mercaptan", "Methane", "Propane", "Carbon monoxide"),
                optionsHindi = listOf("एथिल मरकैप्टन (Ethyl Mercaptan)", "मीथेन", "प्रोपेन", "कार्बन मोनोऑक्साइड"),
                correctAnswerIndex = 0,
                explanation = "LPG (liquefied petroleum gas) is naturally odorless; Ethyl Mercaptan is added so leaks can be detected instantly.",
                explanationHindi = "एलपीजी गंधहीन होती है; रिसाव का तुरंत पता लगाने के लिए इसमें एथिल मरकैप्टन मिलाया जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Gas Safety", "Everyday Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_002",
                questionText = "If you smell LPG gas leaking in your kitchen, what is the most CRITICAL action you must NEVER take?",
                questionTextHindi = "यदि रसोई में एलपीजी गैस रिसाव की गंध आए, तो कौन सा कार्य भूलकर भी कभी नहीं करना चाहिए?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Household Safety",
                chapterOrTopic = "Gas Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Do NOT switch on/off any electrical switches or light matches", "Open all doors and windows", "Turn off cylinder regulator knob", "Evacuate children outside"),
                optionsHindi = listOf("कोई भी बिजली का स्विच ऑन/ऑफ न करें और माचिस न जलाएं (स्पार्क से विस्फोट हो सकता है)", "दरवाजे-खिड़कियां खोलना", "सिलेंडर का रेगुलेटर बंद करना", "बच्चों को बाहर निकालना"),
                correctAnswerIndex = 0,
                explanation = "Flipping an electrical switch generates a tiny internal spark that can ignite accumulated LPG gas.",
                explanationHindi = "बिजली का स्विच चलाने से उत्पन्न छोटी सी चिंगारी गैस में आग लगाकर विस्फोट कर सकती है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Safety", "Gas Safety")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_003",
                questionText = "Which type of cookware or utensils should NEVER be placed inside a microwave oven?",
                questionTextHindi = "माइक्रोवेव ओवन में किस प्रकार के बर्तनों का उपयोग कभी नहीं करना चाहिए?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Household Safety",
                chapterOrTopic = "Appliance Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Metallic utensils (steel, aluminum, gold-rimmed plates)", "Microwave-safe glass (Pyrex)", "Microwave-safe ceramic", "BPA-free microwave plastic"),
                optionsHindi = listOf("धातु के बर्तन (स्टील, एल्युमिनियम या सुनहरी किनारी वाले बर्तन)", "माइक्रोवेव-सुरक्षित कांच", "सिरेमिक बर्तन", "सुरक्षित प्लास्टिक"),
                correctAnswerIndex = 0,
                explanation = "Microwaves reflect off metal surfaces, causing sparks (arcing) and severe damage or fire.",
                explanationHindi = "धातु पर माइक्रोवेव परावर्तित होकर चिंगारी और आग उत्पन्न कर सकती है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Kitchen", "Appliance Safety")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_004",
                questionText = "In household fire safety, what does the 'PASS' acronym stand for when operating a fire extinguisher?",
                questionTextHindi = "अग्निशामक यंत्र (Fire Extinguisher) चलाने के लिए 'PASS' नियम का क्या अर्थ होता है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Household Safety",
                chapterOrTopic = "Fire Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Pull the pin, Aim at base, Squeeze trigger, Sweep side to side", "Push, Alert, Spray, Stop", "Protect, Alarm, Safety, Seek help", "Pick up, Aim high, Spray, Store"),
                optionsHindi = listOf("पिन खींचे (Pull), आधार पर निशाना लगाएं (Aim), दबाएं (Squeeze), घुमाएं (Sweep)", "पुश, अलर्ट, स्प्रे, स्टॉप", "प्रोटेक्ट, अलार्म", "पिक अप"),
                correctAnswerIndex = 0,
                explanation = "PASS: Pull the safety pin, Aim at base of fire, Squeeze lever, Sweep nozzle from side to side.",
                explanationHindi = "PASS नियम: पिन निकालें, आग के निचले हिस्से पर निशाना साधें, हैंडल दबाएं और दोनों तरफ घुमाएं।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Fire Safety", "Everyday Knowledge")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_005",
                questionText = "Solve this common sense riddle: 'I have keys, but no locks. I have space, but no room. You can enter, but you cannot go outside. What am I?'",
                questionTextHindi = "पहेली हल कीजिए: 'मेरे पास कुंजियाँ (keys) हैं पर ताला नहीं। स्पेस है पर कमरा नहीं। आप एंटर कर सकते हैं पर बाहर नहीं जा सकते। मैं क्या हूँ?'",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Brain Teasers",
                chapterOrTopic = "Riddles",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("A Computer Keyboard", "A Piano", "A Prison cell", "A Treasure chest"),
                optionsHindi = listOf("कंप्यूटर कीबोर्ड (Computer Keyboard)", "पियानो", "जेल की कोठरी", "खजाने का संदूक"),
                correctAnswerIndex = 0,
                explanation = "A keyboard has typing keys, a space bar, and an Enter key.",
                explanationHindi = "कंप्यूटर कीबोर्ड में keys, spacebar और enter कुंजी होती है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Riddle", "Brain Teaser")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_006",
                questionText = "A family earns ₹40,000 monthly. If they spend 60% on living expenses and 15% on children's education, how much do they save monthly?",
                questionTextHindi = "एक परिवार की मासिक आय ₹40,000 है। यदि 60% घरेलू खर्च और 15% बच्चों की पढ़ाई पर खर्च होता है, तो उनकी मासिक बचत कितनी है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Home Math",
                chapterOrTopic = "Household Budget",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("₹10,000", "₹8,000", "₹12,000", "₹6,000"),
                optionsHindi = listOf("₹10,000 (बचत = 25%; 40,000 का 25% = ₹10,000)", "₹8,000", "₹12,000", "₹6,000"),
                correctAnswerIndex = 0,
                explanation = "Total expenditure = 60% + 15% = 75%. Savings = 100% - 75% = 25%. Savings = 25% of ₹40,000 = ₹10,000.",
                explanationHindi = "कुल खर्च = 75%। बचत = 25%। 40,000 × 25/100 = ₹10,000।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Budget", "Home Math")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_007",
                questionText = "Solve this riddle: 'What comes once in a minute, twice in a moment, but never in a thousand years?'",
                questionTextHindi = "पहेली हल कीजिए: 'वह क्या है जो minute में एक बार आता है, moment में दो बार आता है, लेकिन thousand years में कभी नहीं आता?'",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Brain Teasers",
                chapterOrTopic = "Word Puzzles",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("The letter 'M'", "The second hand", "Silence", "A breath"),
                optionsHindi = listOf("अंग्रेजी का अक्षर 'M' (Minute में 1 M, Moment में 2 M)", "सेकंड की सुई", "मौन", "सांस"),
                correctAnswerIndex = 0,
                explanation = "The letter 'M' appears once in 'Minute', twice in 'MoMent', and zero times in 'Thousand years'.",
                explanationHindi = "अक्षर 'M' minute में एक बार, moment में दो बार आता है।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Riddle", "Puzzles")
            )
        )

        list.add(
            Question(
                id = "Q_SAFE_008",
                questionText = "Which simple and effective household method is recommended to kill disease-causing microorganisms in drinking water?",
                questionTextHindi = "पीने के पानी में रोगजनक सूक्ष्मजीवों और बैक्टीरिया को मारने के लिए सबसे सरल घरेलू उपाय क्या है?",
                category = "HOMEMAKER_EVERYDAY",
                subcategory = "HOUSEHOLD_SAFETY_PUZZLES",
                examOrBoard = null,
                targetClass = null,
                subject = "Household Safety",
                chapterOrTopic = "Water Safety",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Boiling water vigorously for at least 1-3 minutes", "Adding sugar", "Freezing into ice", "Storing in plastic bottles"),
                optionsHindi = listOf("पानी को 1 से 3 मिनट तक अच्छी तरह उबालना (Boiling)", "चीनी मिलाना", "बर्फ जमाना", "प्लास्टिक बोतल में रखना"),
                correctAnswerIndex = 0,
                explanation = "Boiling water at 100°C effectively destroys bacteria, viruses, and parasites causing waterborne diseases.",
                explanationHindi = "पानी को उबालने से उसमें मौजूद हैजा, टाइफाइड और पेचिश फैलाने वाले रोगाणु नष्ट हो जाते हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Homemaker", "Water Safety", "Health")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_001",
                questionText = "Find the next number in the series: 3, 7, 15, 31, 63, ?",
                questionTextHindi = "श्रृंखला में अगली संख्या ज्ञात कीजिए: 3, 7, 15, 31, 63, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Number Series",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("127", "125", "126", "128"),
                optionsHindi = listOf("127 (प्रत्येक पद = पिछला पद × 2 + 1)", "125", "126", "128"),
                correctAnswerIndex = 0,
                explanation = "Pattern: ×2 + 1. 63 × 2 + 1 = 126 + 1 = 127.",
                explanationHindi = "पैटर्न: ×2 + 1। 63 × 2 + 1 = 127।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Series")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_002",
                questionText = "Find the missing number in the sequence: 4, 9, 16, 25, 36, ?",
                questionTextHindi = "अनुक्रम में लुप्त संख्या ज्ञात कीजिए: 4, 9, 16, 25, 36, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Square Numbers",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("49", "45", "50", "64"),
                optionsHindi = listOf("49 (7² = 49)", "45", "50", "64 (8²)"),
                correctAnswerIndex = 0,
                explanation = "Square series: 2², 3², 4², 5², 6², 7² = 49.",
                explanationHindi = "वर्ग संख्या श्रृंखला: 2², 3², 4², 5², 6², 7² = 49।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Series")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_003",
                questionText = "Find the next letters in the pattern: B, D, G, K, P, ?",
                questionTextHindi = "अक्षर श्रृंखला में अगला अक्षर क्या होगा: B, D, G, K, P, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Alphabet Series",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("V", "U", "W", "T"),
                optionsHindi = listOf("V (स्थान मान: 2, 4, 7, 11, 16 + 6 = 22 = V)", "U", "W", "T"),
                correctAnswerIndex = 0,
                explanation = "Pattern of letter gaps: +2, +3, +4, +5, +6. P(16) + 6 = 22 = V.",
                explanationHindi = "अक्षरों का अंतर: +2, +3, +4, +5, +6 = V।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Alphabet")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_004",
                questionText = "If in a certain code 'CAT' is coded as 'ECV', how will 'DOG' be coded?",
                questionTextHindi = "यदि किसी सांकेतिक भाषा में 'CAT' को 'ECV' लिखा जाता है, तो 'DOG' को क्या लिखा जाएगा?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Coding-Decoding",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("FQI", "FPH", "ERH", "EPI"),
                optionsHindi = listOf("FQI (प्रत्येक अक्षर में +2 का जोड़)", "FPH", "ERH", "EPI"),
                correctAnswerIndex = 0,
                explanation = "Pattern is +2 forward: D+2=F, O+2=Q, G+2=I => FQI.",
                explanationHindi = "पैटर्न +2: D(+2)=F, O(+2)=Q, G(+2)=I => FQI।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Coding")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_005",
                questionText = "Complete the analogy: Book : Author :: Painting : ?",
                questionTextHindi = "सादृश्यता पूर्ण कीजिए: पुस्तक : लेखक :: चित्रकला (Painting) : ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Analogy",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Painter", "Brush", "Canvas", "Gallery"),
                optionsHindi = listOf("चित्रकार (Painter)", "ब्रश", "कैनवास", "गैलरी"),
                correctAnswerIndex = 0,
                explanation = "An author creates a book; a painter creates a painting.",
                explanationHindi = "जैसे लेखक पुस्तक बनाता है, वैसे ही चित्रकार चित्र बनाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Analogy")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_006",
                questionText = "Find the odd one out from the given group: 11, 13, 15, 17, 19",
                questionTextHindi = "दिए गए समूह में से विषम संख्या चुनिए: 11, 13, 15, 17, 19",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Classification",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("15", "11", "13", "17"),
                optionsHindi = listOf("15 (भाज्य संख्या है, बाकी सब अभाज्य हैं)", "11", "13", "17"),
                correctAnswerIndex = 0,
                explanation = "15 is a composite number (3 × 5 = 15). All other numbers are prime numbers.",
                explanationHindi = "15 भाज्य संख्या है, अन्य सभी अभाज्य संख्याएं हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Odd One Out")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_007",
                questionText = "If 'A' = 1, 'AND' = 19 (1+14+4), what is the value of 'BAT'?",
                questionTextHindi = "यदि 'A' = 1, 'AND' = 19 (1+14+4), तो 'BAT' का मान क्या होगा?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Letter Value Sum",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("23", "21", "25", "22"),
                optionsHindi = listOf("23 (B=2, A=1, T=20; 2+1+20 = 23)", "21", "25", "22"),
                correctAnswerIndex = 0,
                explanation = "Alphabet positions: B=2, A=1, T=20. Sum = 2 + 1 + 20 = 23.",
                explanationHindi = "B(2) + A(1) + T(20) = 23।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Coding")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_008",
                questionText = "What comes next: AZ, BY, CX, DW, ?",
                questionTextHindi = "श्रृंखला में आगे क्या आएगा: AZ, BY, CX, DW, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Opposite Letters",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("EV", "FU", "EU", "EW"),
                optionsHindi = listOf("EV (विपरीत अक्षरों का जोड़ा: E का विपरीत V)", "FU", "EU", "EW"),
                correctAnswerIndex = 0,
                explanation = "First letters increase A, B, C, D, E. Second letters decrease Z, Y, X, W, V. Result: EV.",
                explanationHindi = "पहला अक्षर +1 (E), दूसरा अक्षर -1 (V) => EV।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Series")
            )
        )

        list.add(
            Question(
                id = "Q_SERIES_009",
                questionText = "Find the missing term: 1, 8, 27, 64, ?",
                questionTextHindi = "लुप्त पद ज्ञात कीजिए: 1, 8, 27, 64, ?",
                category = "REASONING",
                subcategory = "SERIES_CODING",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Cubes",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("125", "100", "216", "150"),
                optionsHindi = listOf("125 (5³ = 125)", "100", "216 (6³)", "150"),
                correctAnswerIndex = 0,
                explanation = "Cube sequence: 1³, 2³, 3³, 4³, 5³ = 125.",
                explanationHindi = "घन संख्याएं: 1, 8, 27, 64, 125।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Cubes")
            )
        )

        list.add(
            Question(
                id = "Q_REL_001",
                questionText = "Pointing to a man, a woman says: 'He is the only son of my mother\'s father.' How is the man related to the woman?",
                questionTextHindi = "एक पुरुष की ओर इशारा करते हुए एक महिला कहती है: 'वह मेरी माँ के पिता का इकलौता पुत्र है।' वह पुरुष उस महिला से किस प्रकार संबंधित है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Blood Relations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Maternal Uncle (मामा)", "Brother", "Father", "Grandfather"),
                optionsHindi = listOf("मामा (Maternal Uncle)", "भाई", "पिता", "नाना"),
                correctAnswerIndex = 0,
                explanation = "Woman's mother's father is her maternal grandfather. Maternal grandfather's only son is her maternal uncle (मामा).",
                explanationHindi = "महिला की माँ के पिता = नाना। नाना का इकलौता पुत्र = मामा।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Blood Relations")
            )
        )

        list.add(
            Question(
                id = "Q_REL_002",
                questionText = "A person walks 5 km North, then turns right and walks 3 km, then turns right and walks 5 km. In which direction is he from the starting point?",
                questionTextHindi = "एक व्यक्ति 5 किमी उत्तर की ओर चलता है, फिर दाएं मुड़कर 3 किमी चलता है, फिर दाएं मुड़कर 5 किमी चलता है। वह प्रारंभिक बिंदु से किस दिशा में है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Directions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("East", "West", "North", "South"),
                optionsHindi = listOf("पूर्व (East - 3 किमी दूर)", "पश्चिम", "उत्तर", "दक्षिण"),
                correctAnswerIndex = 0,
                explanation = "Going 5 km North and then 5 km South cancels the vertical displacement. Horizontal shift is 3 km East.",
                explanationHindi = "उत्तर 5 किमी और दक्षिण 5 किमी से शून्य विस्थापन; 3 किमी पूर्व दिशा में स्थित है।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Directions")
            )
        )

        list.add(
            Question(
                id = "Q_REL_003",
                questionText = "In a row of 30 students, Rahul is 12th from the left end. What is his position from the right end?",
                questionTextHindi = "30 विद्यार्थियों की एक पंक्ति में राहुल बाएं छोर से 12वें स्थान पर है। दाएं छोर से उसका स्थान क्या होगा?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Ranking",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("19th", "18th", "20th", "17th"),
                optionsHindi = listOf("19वाँ (कुल + 1 - बायाँ = 30 + 1 - 12 = 19)", "18वाँ", "20वाँ", "17वाँ"),
                correctAnswerIndex = 0,
                explanation = "Position from right = Total + 1 - Position from left = 30 + 1 - 12 = 19th.",
                explanationHindi = "दाएं से स्थान = 30 + 1 - 12 = 19वाँ स्थान।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Ranking")
            )
        )

        list.add(
            Question(
                id = "Q_REL_004",
                questionText = "If South-East becomes North, and North-East becomes West, what will West become?",
                questionTextHindi = "यदि दक्षिण-पूर्व उत्तर बन जाए और उत्तर-पूर्व पश्चिम बन जाए, तो पश्चिम क्या बन जाएगा?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Directions",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("South-East", "North-East", "South-West", "North-West"),
                optionsHindi = listOf("दक्षिण-पूर्व (South-East)", "उत्तर-पूर्व", "दक्षिण-पश्चिम", "उत्तर-पश्चिम"),
                correctAnswerIndex = 0,
                explanation = "Each direction rotates 135° anti-clockwise. West rotated 135° anti-clockwise becomes South-East.",
                explanationHindi = "135° वामावर्त घूर्णन से पश्चिम दक्षिण-पूर्व बन जाता है।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Directions")
            )
        )

        list.add(
            Question(
                id = "Q_REL_005",
                questionText = "Statements: All cats are animals. All animals are mammals. Conclusion: Are all cats mammals?",
                questionTextHindi = "कथन: सभी बिल्लियाँ जानवर हैं। सभी जानवर स्तनधारी हैं। निष्कर्ष: क्या सभी बिल्लियाँ स्तनधारी हैं?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Syllogism",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Yes, absolutely follows", "No, does not follow", "Cannot be determined", "Only some cats are mammals"),
                optionsHindi = listOf("हाँ, निष्कर्ष पूर्णतः सत्य है", "नहीं", "तय नहीं किया जा सकता", "केवल कुछ बिल्लियाँ"),
                correctAnswerIndex = 0,
                explanation = "By standard transitive syllogism: A ⊂ B and B ⊂ C implies A ⊂ C.",
                explanationHindi = "कथन के अनुसार सभी बिल्लियाँ स्तनधारी के अंतर्गत आती हैं।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Syllogism")
            )
        )

        list.add(
            Question(
                id = "Q_REL_006",
                questionText = "Looking at the morning sun, Rohan sees his shadow fall directly behind him. In which direction is Rohan facing?",
                questionTextHindi = "सुबह के समय सूर्य को देखते हुए रोहन पाता है कि उसकी छाया उसके ठीक पीछे पड़ रही है। रोहन का मुख किस दिशा में है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Directions",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("East", "West", "North", "South"),
                optionsHindi = listOf("पूर्व (East - सूर्य पूर्व में होता है)", "पश्चिम", "उत्तर", "दक्षिण"),
                correctAnswerIndex = 0,
                explanation = "In the morning, the sun is in the East. Facing East causes the shadow to fall directly behind (to the West).",
                explanationHindi = "सुबह सूर्य पूर्व दिशा में होता है; पूर्व की ओर मुख करने पर छाया पीछे (पश्चिम) पड़ती है।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Directions")
            )
        )

        list.add(
            Question(
                id = "Q_REL_007",
                questionText = "A is the brother of B. B is the sister of C. C is the father of D. How is A related to D?",
                questionTextHindi = "A, B का भाई है। B, C की बहन है। C, D का पिता है। A का D से क्या संबंध है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Blood Relations",
                difficulty = "MEDIUM",
                language = "BOTH",
                options = listOf("Paternal Uncle (चाचा / ताऊ)", "Brother", "Father", "Grandfather"),
                optionsHindi = listOf("चाचा (Paternal Uncle)", "भाई", "पिता", "दादा"),
                correctAnswerIndex = 0,
                explanation = "A and C are brothers. Since C is the father of D, A is the paternal uncle (चाचा) of D.",
                explanationHindi = "A और C सहोदर भाई हैं। C, D का पिता है, अतः A, D का चाचा हुआ।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Blood Relations")
            )
        )

        list.add(
            Question(
                id = "Q_REL_008",
                questionText = "What angle is formed between the hour hand and minute hand of a clock at 3:00 o'clock?",
                questionTextHindi = "घड़ी में 3:00 बजे घंटे और मिनट की सुइयों के बीच कितने अंश का कोण बनता है?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Clock Reasoning",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("90°", "60°", "120°", "180°"),
                optionsHindi = listOf("90° (समकोण)", "60°", "120°", "180°"),
                correctAnswerIndex = 0,
                explanation = "At 3:00, minute hand is at 12 and hour hand is at 3: 3 × 30° = 90°.",
                explanationHindi = "3:00 बजे दोनों सुइयों के मध्य 3 घंटे का अंतराल होता है (3 × 30° = 90°)।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Clock")
            )
        )

        list.add(
            Question(
                id = "Q_REL_009",
                questionText = "If today is Monday, what day of the week will it be after 64 days?",
                questionTextHindi = "यदि आज सोमवार है, तो 64 दिन बाद कौन सा दिन होगा?",
                category = "REASONING",
                subcategory = "LOGICAL_RELATIONS",
                examOrBoard = null,
                targetClass = null,
                subject = "Reasoning",
                chapterOrTopic = "Calendar",
                difficulty = "EASY",
                language = "BOTH",
                options = listOf("Tuesday", "Wednesday", "Monday", "Thursday"),
                optionsHindi = listOf("मंगलवार (Tuesday - 64 ÷ 7 = शेष 1 दिन)", "बुधवार", "सोमवार", "गुरुवार"),
                correctAnswerIndex = 0,
                explanation = "64 ÷ 7 leaves remainder 1. Monday + 1 day = Tuesday.",
                explanationHindi = "64 को 7 से भाग देने पर शेषफल 1 आता है। सोमवार + 1 = मंगलवार।",
                negativeMarks = 0.0f,
                tags = listOf("Reasoning", "Calendar")
            )
        )

        return list
    }
}
