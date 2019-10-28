package Objects;

//Platform is Architecture + OS

//Serialization is storing the state of the object

//When an Object is created it is created in the memory
//And therefore when the computer is closed then it will be erased
//Therefore we must convert the object into bits and bytes for storing into Hard disk as a form of file
// The process of converting objects into bits and bytes for storage is called as Serialization
// This can be used to transfer objects via network or machine to machine

//Deserialization - The process of converting the bits and bytes back to the object


//Marker Interface - Serializable , Colonizable, has no data member and methods
// It is used to mark java classes so that objects of these classes may get certain capability


/* ObjectOutputStream - To write/send - to another machine
*  ObjectInputStream - To read the object
* They cannot work on themselves and therefore they require low level class
* Which here it is FileInputStream and FileOutputStream
*
* Default Constructor is important for Serializable Interface
*
*/

/*
* Transient Data Members are not Serializable
* So the data members are having default values
* So float data members will have 0 values
* Strings will have null
* Static is one copy and therefore it is not Serializable, They are not part of the object
* therefore it will have the static value
*
*/

//In multi-catch siblings can be handled together but parent-child cannot be handled together
//In one catch block we can have multiple exceptions using  |  symbol
//So they must be at same level in order

public class Serilization
{
}
