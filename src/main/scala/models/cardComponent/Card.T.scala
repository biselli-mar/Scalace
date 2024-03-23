package models
package cardComponent

import enums.{Suit,Rank}


trait Card(val suit: Option[Suit], val rank: Option[Rank]):
    def isRed: Boolean = suit.get.isRed
    def isBlack: Boolean = suit.get.isBlack
    def isFace: Boolean = rank.get.isFace
    def isNumber: Boolean = rank.get.isNumber
    def value: Int = rank.get.value
    def isJoker: Boolean = suit.isEmpty

    def canBePlacedOn(other: Card): Boolean
    def isSpecialCard: Boolean
