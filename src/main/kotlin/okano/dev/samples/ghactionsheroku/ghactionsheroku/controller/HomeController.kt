package okano.dev.samples.ghactionsheroku.ghactionsheroku.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class HomeController {

    @GetMapping
    fun index(): Map<String, String> =
        mapOf(
            "hello" to "world",
            "timestamp" to System.currentTimeMillis().toString()
        )
}
