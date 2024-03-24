package models
package cardComponent

import enums.{Suit,Rank}


trait Card(val suit: Suit, val rank: Rank):
    def isRed: Boolean = suit.isRed
    def isBlack: Boolean = suit.isBlack
    def isFace: Boolean = rank.isFace
    def isNumber: Boolean = rank.isNumber
    def value: Int = rank.value
    def isJoker: Boolean = suit.isJoker

    def canBePlacedOn(other: Card): Boolean
    def isSpecialCard: Boolean
