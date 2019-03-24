package net.jovacorp.guestbook

import org.springframework.data.repository.CrudRepository

interface GuestBookEntryRepository : CrudRepository<GuestBookEntry, Long> {
}