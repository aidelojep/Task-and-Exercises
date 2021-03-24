1.) Assign Seat to users with an array of index 10;
   - index(1) to (5) is assigned "firstclass"
   - index(6) to (10) is assigned "economy class"

2.) Using a selection statement, assign seat to user in "firstclass",
    if "first class" is filled up, assign seat to user in "economy class". (vice-versa).

3.)If both "firstclass" and "economy class" are filled , display message: "next flight leaves in 3 hours".





* create boolean array(10) to store seats, having default values of false
	- seats 1 - 5 (first-class)
	- seats 6 - 10 (economy)

* when user chooses first class, assign free seat from seats 1 - 5 to true

* when user chooses economy, assign free seat from seats 6 - 10 to true