package models.cardComponent.defaultImpl

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

import models.cardComponent.enums.{Suit, Rank}

class DefaultCardSpec extends AnyWordSpec:
    
    "A DefaultCard" should {
        val card = DefaultCardImpl(Suit.Hearts, Rank.Ace)
        val card2 = DefaultCardImpl(Suit.Spades, Rank.Two)
        "have a suit" in {
            card.suit should be(Suit.Hearts)
            card2.suit should be(Suit.Spades)
        }
        "have a rank" in {
            card.rank should be(Rank.Ace)
            card2.rank should be(Rank.Two)
        }
        "allow to check, whether they can be placed on one another" in {
            card.canBePlacedOn(card2) should be(true)
            card2.canBePlacedOn(card) should be(false)
        }
        "allow to check whether they have special effects" in {
            card.isSpecialCard should be(false)
            card2.isSpecialCard should be(true)
            DefaultCardImpl(Suit.Clubs, Rank.Ten).isSpecialCard should be(true)
        }
    }
