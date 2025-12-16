// Task 7.7.2: contact database, using a map
fun main() {
    //Mutable map for contacts
    val contacts = mutableMapOf<String, String>()

    println("CONTACTS DATABASE")
    println("Enter a name to add or search for a contact")
    println("Enter 'q' to exit the progam")
    println("")

    //Loop to add or search for contacts
    while(true) {
        // Prompt for contact name
        print("Enter contact name: ")
        val name = readlnOrNull()?.trim()


    //check if q has been entered 
    if(name.isNullOrEmpty() || name.equals("q", ignoreCase = true)) {
        println("Contact Book has been terminated")
        break
    }
//missing contacts??
        val phoneNumber = contacts.getOrElse(name) {
            // This lambda runs when contact is not found
            print("Contact '$name' not found. Enter phone number: ")
            val newNumber = readlnOrNull()?.trim()
            
            if (!newNumber.isNullOrEmpty()) {
                // Add new contact using [] operator 
                contacts[name] = newNumber
                println("Contact '$name' added.")
                newNumber
            } else {
                println("Invalid phone number. Contact not added.")
                null
            }
    }
        if (phoneNumber != null) {
            println("Phone number for '$name': $phoneNumber")
        }
        
        println() 
    }
}