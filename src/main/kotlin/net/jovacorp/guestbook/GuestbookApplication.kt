package net.jovacorp.guestbook

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GuestbookApplication

fun main(args: Array<String>) {
	runApplication<GuestbookApplication>(*args)
}
