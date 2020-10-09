# TDT4250

Eivind Rydningen and Thomas Iversen Ramm

## Assignment 1

## Structure
``` 
.
├── Assignment_1
│   ├── META-INF
│   │   └── MANIFEST.MF
│   ├── Programme.png
│   ├── bin
│   │   └── Assignment_1
│   │       └── studyplan
│   │           ├── Course.class
│   │           ├── CourseGroup.class
│   │           ├── CourseLevel.class
│   │           ├── CourseStart.class
│   │           ├── CourseType.class
│   │           ├── Degree.class
│   │           ├── Department.class
│   │           ├── Programme.class
│   │           ├── Semester.class
│   │           ├── Specialization.class
│   │           ├── StudyplanFactory.class
│   │           ├── StudyplanPackage$Literals.class
│   │           ├── StudyplanPackage.class
│   │           ├── example
│   │           │   ├── Department.xmi
│   │           │   └── Example.class
│   │           ├── impl
│   │           │   └── All implemantation classes ...
│   │           ├── util
│   │           │   └── All utilities ...
│   ├── build.properties
│   ├── departmentoverview.png
│   ├── images
│   │   └── ... All images
│   ├── model
│   │   ├── Department.xmi
│   │   ├── studyplan.ecore
│   │   └── studyplan.genmodel
│   ├── plugin.properties
│   ├── plugin.xml
│   └── src
│       └── Assignment_1
│           └── studyplan
│                   └── Auto generated code ...
├── Assignment_1.tests
│   └── All test code ...
├── README.md
└── org.eclipse.acceleo.module.sample
    ├── META-INF
    │   └── MANIFEST.MF
    ├── Studyplan.html
    ├── bin
    │   └── org.eclipse.acceleo.module.sample
    │       └── Activator.class
    ├── build.properties
    ├── src
    │   └── org.eclipse.acceleo.module.sample.main
    │       ├── Generate.java
    │       └── generate.mtl
    └── tasks
        └── All task files ...
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

### Dependencies
![alt text](https://github.com/rammt/TDT4250/tree/master/images/model_dependencies.png "Model Dependencies")

## Assignment 2

### Changes from Assignment 1
We made a few changes to our model, mainly that a Programme may contain a semmester without referencing a Specialziation and that a Semester now contains a derived feature Season (from Semester number). We also implmented the datatype Credits and constrained it to be a float between 0.0 and 30.0.

For assignment 2 we opted to use an acceleo M2T transformation.

### How to run
To run the generate.mtl file on the model. Apply the following run configuration to the file.

![alt text](https://github.com/rammt/TDT4250/tree/master/images/run_config_acceleo.png "Generate.mtl run configuration")

### Dependencies
![alt text](acceleo_dependencies.png "Model Dependencies")

