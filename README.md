###This Project is created for Grouping Students by Age difference, for Sports Registration.

OOPS in Use:
1. Class
2. Object
3. Inheritance
4. Encapsulation

DataStructures in Use:
1. ArrayList
2. MultiValuedMap
Hint: MultivaluedMap is a type of HashMap which can store elements with Duplicate Keys.

Java8 Features in Use:
1. Streams
2. Lambda

EventRegistrationInfo class will collect  Details of Students who came for Registration

AgeGroupDivider Class takes Registered Students Details as ArrayList and Process them based on  Age Variation.

As Hashmaps only Allow single Unique Key, I have used **MultiValuedMap** from 'org.apache.commons 'commons-collections4' in AgeGroupDivider Class

Steps to Run:

1. Clone the Repo
2. ./gradlew build
3. Run the Student @Test method in GamesByAgeTest class in src/test/java