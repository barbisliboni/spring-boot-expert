package sales

import org.jetbrains.annotations.NotNull
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class SalesApplication{

    @GetMapping("/hello") //if no methods here (which is correct), delete the brackets
    fun helloWorld(): String{
        return "Hello World :)"
    }
}

    fun main(args: Array<String>) {
        SpringApplication.run(SalesApplication::class.java, *args)
                                                //two parameters, the first is the class which will initialize
                                                //the application, and the second one are the arguments
    }



