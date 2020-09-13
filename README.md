# TDT4250

Eivind Rydningen and Thomas Iversen Ramm

## Structure
``` 
.
├── META-INF
│   └── MANIFEST.MF
├── README.md
├── bin
│   └── assignment_1
│       ├── Assignment_1Factory.class
│       ├── Assignment_1Package$Literals.class
│       ├── Assignment_1Package.class
│       ├── Course.class
│       ├── CourseGroup.class
│       ├── CourseLevel.class
│       ├── CourseStart.class
│       ├── CourseType.class
│       ├── Degree.class
│       ├── Programme.class
│       ├── Semester.class
│       ├── Specialization.class
│       ├── StudyStart.class
│       ├── impl
│       │   ... All implemantation classes
│       └── util
│           ... All utilities
├── model
│   ├── assignment_1.aird
│   ├── assignment_1.ecore
│   └── assignment_1.genmodel
└── src-gen
    └── assignment_1
        │   ... Auto generated code
```

## Content


Limitations of model
* All study programmes must start in autumn

### Classes

#### StudyPlan
Contains all available courses and programmes.

#### StudyStart
The year the Programme starts.

#### Programme
Contains the name of the programme, I.E Master of Science in Informatics, and the duration of the programme in semesters. Programme derives its duration from its degree type. It also specifies which type of the degree it is, either Integrated Master, 2 Year Master or Bachelor. A programme may contain several specializations/majors.

#### Specialization
A specialization/major holds a specializationCode or keyword in addition to a name. A specialization may also contain several sub specialziations. It also consists of several semesters.

#### Semester
Semesters are indentified by an integer relative to how far along in the programme you are. The float semesterCredits indicate how many credits a given semester has currently, the value is constrained to be at least 30.0 credits per semester. A semester contains one or more course groups.

#### CourseGroup
A course group is a group of courses with similar rules I.E O, VA, VB, M1A, M2A. The class attribute CourseType is an enumeration representing the mentioned rules. These groups may contain zero or several courses depending on the semester and programme etc.

#### Course
Holds the course code, its name, how many credits its worth. It also holds the enumerations of course level (level 1, level 2, level 3 and higher level) and an enumeration of course start (autumn, spring or either of the two). A course is constrained to a maximum of 30.0 credits.
