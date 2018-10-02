package functional

/**
 * Let is also use to assign the nullable variable into non-nullable parameter
 */

// non-nullable argument function
fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    // if email is not null, let will execute the lambda block
    var email: String? = "maikel@example.com"
    email?.let {
        sendEmailTo(it)
    }

    // if email is null, let will do nothing
    email = null
    email?.let {
        sendEmailTo(email)
    }
}