package okano.dev.samples.ghactionsheroku.ghactionsheroku.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

typealias BasicResponse = Map<String, String>

@RestController("/")
class HomeController {

    @GetMapping
    fun index(): BasicResponse =
        mapOf(
            "hello" to "world",
            "timestamp" to System.currentTimeMillis().toString()
        )

    @GetMapping("/{name}")
    fun me(@PathVariable name: String): BasicResponse =
        mapOf(
            "hello" to "world",
            "with" to name,
            "on" to System.currentTimeMillis().toString()
        )
}
