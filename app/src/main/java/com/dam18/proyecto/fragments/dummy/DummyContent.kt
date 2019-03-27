package com.dam18.proyecto.fragments.dummy

import java.util.ArrayList
import java.util.HashMap

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 * TODO: Replace all uses of this class before publishing your app.
 */
object DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    val ITEMS: MutableList<DummyItem> = ArrayList()

    /**
     * A map of sample (dummy) items, by ID.
     */
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()


    init {

    }

    fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }


    /**
     * A dummy item representing a piece of content.
     * Aqui recogemos el contenido de los post
     */
    data class DummyItem(val id: String, val titulo: String, val details: String) {
        override fun toString(): String = titulo
    }
}
