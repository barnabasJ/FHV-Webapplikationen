package net.jovacorp.guestbook

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class GuestBookController(val guestBookEntryRepository: GuestBookEntryRepository) {

    @GetMapping
    fun welcome(@RequestParam(name = "name", required = false, defaultValue = "World") name: String, model: Model): String {
        model.addAttribute("name", name)
        val entry = GuestBookEntry("Barnabas", "I was here")
        guestBookEntryRepository.save(entry)
        val entries = guestBookEntryRepository.findAll()
        model.addAttribute("entries", entries)
        return "guestbook"
    }
}