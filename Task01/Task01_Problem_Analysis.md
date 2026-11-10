TASK 1 – UNDERSTAND THE PROBLEM AND IDENTIFY THE OBJECTS
1. Problem Analysis
The Campus Smart-Parking System is designed to manage vehicle parking within a university campus. The system supports students, staff and visitors who use two-wheelers, cars and electric vehicles.
When a vehicle enters the campus, the system checks for an available parking slot and allocates a suitable slot. A unique parking ticket is generated with the vehicle registration number and entry time. When the vehicle leaves, the parking slot is released and the parking fee is calculated based on the vehicle type and parking duration.
Students and staff with valid monthly passes are eligible for free parking, whereas visitors must pay the applicable parking charges.
2. Identification of Objects and Classes
Class	Purpose
Vehicle	Stores common vehicle details such as registration number.
TwoWheeler	Represents bikes and scooters.
Car	Represents cars.
ElectricCar	Represents electric cars and charging details.
ParkingSlot	Stores slot number and availability status.
ParkingFloor	Manages parking slots on each floor.
ParkingTicket	Stores ticket number, entry time and vehicle details.
ParkingFacility	Manages floors, slot allocation and release.
User	Stores common user information.
Student	Represents students using the parking facility.
Staff	Represents staff members using the facility.
Visitor	Represents visitors who pay parking charges.
3. Business Rules
1.	A parking slot can accommodate only one vehicle at a time.
2.	Every vehicle must have a unique registration number.
3.	Each parking ticket must have a unique ticket number.
4.	A vehicle must be allocated only to a suitable available slot.
5.	The system must release the parking slot when the vehicle leaves.
6.	Parking fees depend on vehicle type and parking duration.
7.	Students and staff with valid monthly passes receive free parking.
8.	Visitors must pay the applicable parking fee.
9.	Electric vehicles using charging facilities must pay additional charging charges.
10.	The system must not allocate a slot when the parking facility is full.
4. Assumptions
1.	Every vehicle has a unique registration number.
2.	The parking facility contains multiple floors.
3.	Each floor has a fixed number of parking slots.
4.	Every vehicle receives a parking ticket during entry.
5.	Parking duration is calculated using entry and exit times.
6.	Charging fees are calculated separately for electric vehicles.
7.	Invalid vehicle details and duplicate registrations are not accepted.
5. Alternative Concept and Complexity Analysis
In the object-oriented approach, each vehicle is represented as an individual object containing its registration number, vehicle type and entry time.
Alternatively, vehicles can be stored using parallel arrays such as regNo[], type[] and entryTime[]. The same index in each array represents the details of one vehicle.
Comparison
Factor	Object-Oriented Approach	Parallel Arrays
Vehicle representation	Individual objects	Separate arrays
Searching a vehicle	O(n)	O(n)
Adding a new attribute	Easy to add to the class	Requires another array
Data organisation	Better organisation	Less organised
Maintenance	Easier	More difficult
Time and Space Complexity
•	Searching by registration number takes O(n) time in both approaches because the vehicles may need to be checked one by one.
•	Both approaches require O(n) storage for n vehicles, excluding the fixed per-object or per-array overhead.
•	The object-oriented approach makes it easier to add new vehicle attributes without managing several parallel arrays.
Conclusion
The object-oriented approach is more suitable for the Campus Smart-Parking System because it provides better data organisation, reusability and maintainability. It also makes it easier to introduce new vehicle categories and additional features in the future.
