package okano.dev.samples.ghactionsheroku.ghactionsheroku

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GhactionsherokuApplication

fun main(args: Array<String>) {
    runApplication<GhactionsherokuApplication>(*args)
}
