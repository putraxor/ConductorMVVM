package com.github.putraxor.conductormvvm.model

import com.github.putraxor.conductormvvm.R

/**
 * Created by putraxor on 21/06/17.
 */
object DataProvider {
    private val groups = mutableListOf<Group>()

    fun findAll() = groups
    fun findByIndex(index: Int) = groups[index]

    init {
        val telegram = Group(
                name = "KTID Telegram",
                type = "Telegram Group",
                info = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus consectetur vitae orci ut tristique. Aenean semper tellus velit, quis tincidunt velit tempor vitae. Proin velit velit, imperdiet quis elementum at, posuere id dolor. Nam venenatis lobortis urna, vitae posuere eros porttitor eget. Pellentesque et arcu consectetur, vulputate erat eu, interdum quam. Praesent justo tortor, lacinia eget iaculis id, auctor non tortor. Pellentesque dui dolor, ultricies at turpis nec, gravida accumsan urna.",
                link = "https://t.me/KotlinID",
                poster = R.drawable.poster_jellyfish,
                logo = R.drawable.ic_telegram)
        val facebook = Group(
                name = "Kotlin Indonesia",
                type = "Facebook Group",
                info = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus consectetur vitae orci ut tristique. Aenean semper tellus velit, quis tincidunt velit tempor vitae. Proin velit velit, imperdiet quis elementum at, posuere id dolor. Nam venenatis lobortis urna, vitae posuere eros porttitor eget. Pellentesque et arcu consectetur, vulputate erat eu, interdum quam. Praesent justo tortor, lacinia eget iaculis id, auctor non tortor. Pellentesque dui dolor, ultricies at turpis nec, gravida accumsan urna.",
                link = "https://www.facebook.com/groups/kotlinID",
                poster = R.drawable.poster_mountain,
                logo = R.drawable.ic_facebook)
        val website = Group(
                name = "Kotlin ID Website",
                type = "Official Website",
                info = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus consectetur vitae orci ut tristique. Aenean semper tellus velit, quis tincidunt velit tempor vitae. Proin velit velit, imperdiet quis elementum at, posuere id dolor. Nam venenatis lobortis urna, vitae posuere eros porttitor eget. Pellentesque et arcu consectetur, vulputate erat eu, interdum quam. Praesent justo tortor, lacinia eget iaculis id, auctor non tortor. Pellentesque dui dolor, ultricies at turpis nec, gravida accumsan urna.",
                link = "http://kotlin.id",
                poster = R.drawable.poster_starwars,
                logo = R.drawable.ic_web)
        groups.addAll(arrayOf(telegram, facebook, website))
    }
}