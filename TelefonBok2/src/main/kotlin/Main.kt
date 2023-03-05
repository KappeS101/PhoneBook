class Contact(var firstName: String, var lastName: String, var phoneNumber: Int, var mailAddress: String)

class ContactList()
{
    var Contacts = mutableListOf<Contact>()

    fun AddContact(firstName: String, lastName: String, phoneNumber: Int, mailAddress: String)
    {
        Contacts.add(Contact(firstName, lastName, phoneNumber, mailAddress))
    }

    fun printAllContacts()
    {
        var i: Int = 0
        for (x in Contacts)
        {
            println("$i + ${x.firstName} ${x.lastName} ${x.phoneNumber} ${x.mailAddress}")
            i += 1
        }
    }
    fun printAlphabetically()
    {



        Contacts.sortBy { it.firstName }

        Contacts.forEach { println(it) }

        var i: Int = 0
        for (x in Contacts)
        {
            println("$i + ${x.firstName} ${x.lastName} ${x.phoneNumber} ${x.mailAddress}")
            i += 1
        }
    }


    fun removeContactAtIndex()
    {
        println("Which contact do you want to remove")

        printAllContacts()

        var index= readln().toInt()

        Contacts.removeAt(index)
    }

    fun editContactAtIndex()
    {
        printAllContacts()

        println("Which contact do you want to edit")
        printAllContacts()
        var index= readln().toInt()

        println("Enter the new name:")
        var firstName: String = readln()

        println("Enter the new last name:")
        var lastName: String = readln()

        println("Enter the new phone number:")
        var phoneNumber: Int = readln().toInt()

        println("Enter the new mail address:")
        var mail: String = readln()

        Contacts.set(index, Contact(firstName, lastName, phoneNumber, mail))
    }
}


fun main(args: Array<String>)
{
    val myContacts = ContactList()

    myContacts.AddContact("Elias", "Jörliden", 123456789, "elias.jorliden@hej.på.dig")
    myContacts.AddContact("Viktor", "Åkerstedt", 234567891, "viktor.akerstedt@hej.på.dig")
    myContacts.AddContact("Kasper", "Schröder", 345678912, "kasper.schroder@hej.på.dig")

    //myContacts.removeContactAtIndex()

    //myContacts.printAllContacts()


    var loop: Boolean = true

    while (loop == true)
    {
        println("What do you want to do?")
        println("${"1: Add Contact,"} ${"2: Remove contact at index,"} ${"3: Print all contacts"} ${"4: Edit a contact"} ${"5: Print list in alphabetical order"} ${"6: Exit"}")
        var x: Int = readln().toInt()

        when(x)
        {
            1 ->
            {
                println("Enter the following information:")
                println("${"First name,"} ${"Last name,"} ${"Phone number,"} ${"Mail address,"}")
                var firstName: String = readln()
                var lastName: String = readln()
                var phoneNumber: Int = readln().toInt()
                var mailAddress: String = readln()

                myContacts.AddContact(firstName, lastName, phoneNumber, mailAddress)
            }

            2 ->
            {
                myContacts.removeContactAtIndex()
            }

            3 ->
            {
                myContacts.printAllContacts()
            }

            4 ->
            {
                myContacts.editContactAtIndex()
            }

            5 ->
            {
                myContacts.printAlphabetically()
            }

            6 ->
            {
                loop = false
            }
    }

    }

}


