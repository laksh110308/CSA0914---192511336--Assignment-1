# CAMPUS SMART-PARKING SYSTEM
## Java Assignment 1 – CO1

### Student Details

- **Name:** Lakshitha Sree K
- **Register Number:** 192511336
- **Subject:** Programming in Java
- **Java Version:** JDK 21
- **Assignment:** Assignment 1 – Campus Smart-Parking System

### Project Description

This project focuses on designing, implementing and validating an Object-Oriented Java model for a Campus Smart-Parking System.

The system manages multiple parking floors and slots. It represents different vehicle categories, parking tickets, slot allocation, parking fee calculation and other parking operations.

The assignment demonstrates Java fundamentals and Object-Oriented Programming concepts.

### Technologies Used

- Java
- JDK 21
- Visual Studio Code
- Git and GitHub

### Assignment Tasks

| Task | Description | Implementation |
|---|---|---|
| Task 01 | Understand the Problem and Identify the Objects | Problem analysis and candidate classes |
| Task 02 | Choose the Data Representation | Java data types and array representation |
| Task 03 | Design the Control Logic | Slot allocation and release |
| Task 04 | Classes, Objects and Constructors | Constructor overloading and chaining |
| Task 05 | Static Members and Object Lifecycle | Static variables and ticket lifecycle |
| Task 06 | Inheritance Hierarchy | Vehicle inheritance |
| Task 07 | Method Overriding | Vehicle fee calculation |
| Task 08 | Polymorphism | Compile-time and runtime polymorphism |
| Task 09 | Abstract Classes and Interfaces | Abstraction and multiple interfaces |
| Task 10 | Packages and Encapsulation | Access modifiers and data validation |
| Task 11 | Implement, Test and Defend the Design | System testing and validation |
| Task 12 | Re-evaluate and Adapt the Design | New vehicle categories and parking rules |

### Project Folder Structure

```text
Java_Assignment_1/
│
├── Task01/
│   └── Task01_Problem_Analysis.md
│
├── Task02/
│   └── Task02_Data_Representation.md
│
├── Task03/
│   ├── ParkingFacility.java
│   └── Task03_Control_Logic_Output.png
│
├── Task04/
│   ├── ParkingTicket.java
│   └── Task04_Constructor_Overloading_Output.png
│
├── Task05/
│   ├── ParkingTicketLifecycle.java
│   └── Task05_Static_Members_Lifecycle_Output.png
│
├── Task06/
│   ├── VehicleInheritance.java
│   └── Task06_Inheritance_Constructor_Output.png
│
├── Task07/
│   ├── VehicleFeeOverriding.java
│   └── Task07_Method_Overriding_Output.png
│
├── Task08/
│   ├── FeeDemo.java
│   └── Task08_Polymorphism_Output.png
│
├── Task09/
│   ├── AbstractInterfaceDemo.java
│   └── Task09_Abstract_Class_Interface_Output.png
│
├── Task10/
│   ├── model/
│   │   └── ParkingSlot.java
│   └── app/
│       ├── EncapsulationDemo.java
│       └── Task10_Encapsulation_Output.png
│
├── Task11/
│   ├── ParkingSystemTest.java
│   └── Task11_System_Testing_Output.png
│
├── Task12/
│   ├── DesignAdaptation.java
│   └── Task12_Design_Adaptation_Output.png
│
└── README.md
```

### How to Compile and Run

Make sure JDK 21 is installed.

Check the Java version:

```powershell
java -version
javac -version
```

Open the terminal in the main project folder.

**General command format:**

```powershell
javac -d . .\TaskXX\FileName.java
java TaskXX.ClassName
```

For example, to execute Task 3:

```powershell
javac -d . .\Task03\ParkingFacility.java
java Task03.ParkingFacility
```

For Task 4:

```powershell
javac -d . .\Task04\ParkingTicket.java
java Task04.ParkingTicket
```

For Task 5:

```powershell
javac -d . .\Task05\ParkingTicketLifecycle.java
java Task05.ParkingTicketLifecycle
```

For Task 6:

```powershell
javac -d . .\Task06\VehicleInheritance.java
java Task06.VehicleInheritance
```

For Task 7:

```powershell
javac -d . .\Task07\VehicleFeeOverriding.java
java Task07.VehicleFeeOverriding
```

For Task 8:

```powershell
javac -d . .\Task08\FeeDemo.java
java Task08.FeeDemo
```

For Task 9:

```powershell
javac -d . .\Task09\AbstractInterfaceDemo.java
java Task09.AbstractInterfaceDemo
```

For Task 10:

```powershell
javac -d . .\Task10\model\ParkingSlot.java .\Task10\app\EncapsulationDemo.java
java Task10.app.EncapsulationDemo
```

For Task 11:

```powershell
javac -d . .\Task11\ParkingSystemTest.java
java Task11.ParkingSystemTest
```

For Task 12:

```powershell
javac -d . .\Task12\DesignAdaptation.java
java Task12.DesignAdaptation
```

Tasks 1 and 2 contain written design and analysis evidence.

### Conclusion

This assignment demonstrates the application of Java programming fundamentals and Object-Oriented Programming concepts through a Campus Smart-Parking System. The tasks cover problem analysis, data representation, control logic, constructors, inheritance, polymorphism, abstraction, interfaces, encapsulation, testing and design adaptation.

The project also demonstrates how a parking system can be extended to support new vehicle categories and changing parking requirements.

### GitHub Repository

[Campus Smart-Parking System – Java Assignment 1](https://github.com/laksh110308/CSA0914---192511336--Assignment-1)
