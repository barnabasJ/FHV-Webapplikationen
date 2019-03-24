package net.jovacorp.guestbook

import lombok.Getter
import lombok.Setter
import java.util.Date
import javax.persistence.*

@Getter
@Setter
@Entity
class GuestBookEntry(
    val author: String = "",
    val note: String = "",
    @Temporal(TemporalType.DATE)
    val createdDate: Date = Date(),
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0
)

