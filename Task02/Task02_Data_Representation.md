# TASK 2 – CHOOSE THE DATA REPRESENTATION

## 1. Aim

To select suitable Java data types and array structures to represent the data of the Campus Smart-Parking System.

## 2. Data Types Used

The following Java data types are selected for storing parking information.

| Field | Java Data Type | Reason |
|---|---|---|
| Slot Number | int | Stores the numbered parking slot. |
| Vehicle Number | String | Stores registration numbers containing letters and digits. |
| Entry Time | LocalDateTime | Stores the exact date and time when a vehicle enters. |
| Parking Duration | int | Stores the parking duration in minutes. |
| Parking Fee | double | Stores the calculated fee, including decimal values. |
| Vehicle Type | String | Stores values such as Bike, Car and Electric Vehicle. |
| Floor Number | int | Stores the floor where the vehicle is parked. |

## 3. Input Method

The Scanner class is used to read input from the user.

Example:

```java
Scanner sc = new Scanner(System.in);

System.out.print("Enter Vehicle Number: ");
String vehicleNo = sc.nextLine();

System.out.print("Enter Slot Number: ");
int slotNo = sc.nextInt();

System.out.print("Enter Parking Duration in Minutes: ");
int duration = sc.nextInt();
```

Scanner makes it easy to accept vehicle details, slot numbers and parking duration during program execution.

## 4. Array Representation

A jagged two-dimensional array is selected to represent the parking slots.

```java
String[][] slots = new String[3][];

slots[0] = new String[10];
slots[1] = new String[15];
slots[2] = new String[12];
```

Here:
- Each row represents a parking floor.
- Each column represents a parking slot.
- A null value indicates that the slot is free.
- A vehicle registration number indicates that the slot is occupied.

A jagged array is useful because different floors can have different numbers of parking slots.

## 5. Integer Division and Casting Risk

Integer division can produce an incorrect parking fee if the duration is not converted properly.

For example:

```java
int duration = 90;
int hours = duration / 60;

System.out.println(hours);
```

Output:

```text
1
```

The actual duration is 90 minutes, which should be charged as 2 hours when every started hour is charged.

To avoid this problem, the following formula is used:

```java
int hours = (duration + 59) / 60;
```

Output:

```text
2
```

For fee calculation, a double data type is used to support decimal values.

Example:

```java
double fee = hours * 25.50;
```

This avoids losing decimal values during fee calculation.

## 6. Alternative Data Representation

The assignment suggests two alternatives to the jagged array.

### A. One-Dimensional Array

A single array can store all parking slots.

The index can be calculated using:

`index = floor × slotsPerFloor + slot`

This approach is suitable when every floor has the same number of slots.

However, when floors have different numbers of slots, the formula needs additional handling, such as maintaining the starting index of each floor.

### B. ArrayList

An ArrayList can store parking slot information dynamically.

It allows elements to be added or removed when required. However, accessing a particular floor and slot requires additional index management.

## 7. Time and Space Complexity

| Representation | Slot Access | Space Complexity |
|---|---|---|
| Jagged 2D Array | O(1) | O(S) |
| One-Dimensional Array | O(1) using a calculated index | O(S) |
| ArrayList | O(1) by index | O(S) |

Here, S represents the total number of parking slots.

For locating a vehicle using its registration number, a sequential search takes O(S) time in these representations unless an additional lookup structure is maintained.

## 8. Conclusion

The jagged two-dimensional array is selected for the Campus Smart-Parking System because different floors may contain different numbers of parking slots. It provides direct access to a floor and slot using indexes. Suitable data types such as int, String, LocalDateTime and double help store parking details accurately. The selected representation is simple and can be extended when the parking facility grows.