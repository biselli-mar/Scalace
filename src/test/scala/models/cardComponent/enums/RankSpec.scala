package models.cardComponent.enums

import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers._

class RankSpec extends AnyWordSpec:
    "A Rank" should {
        "have an integer value" in {
            // Values are based on the actual card values, counting up from 2 to Ace
            Rank.Two.value should be(2)
            Rank.Three.value should be(3)
            Rank.Four.value should be(4)
            Rank.Five.value should be(5)
            Rank.Six.value should be(6)
            Rank.Seven.value should be(7)
            Rank.Eight.value should be(8)
            Rank.Nine.value should be(9)
            Rank.Ten.value should be(10)
            Rank.Jack.value should be(11)
            Rank.Queen.value should be(12)
            Rank.King.value should be(13)
            Rank.Ace.value should be(14)
            // Jokers are meant to be on the same level as Aces
            // or as wildcards that can be used as any card
            // They are not represented in this enum, as they deviate
            // from the standard card deck by not having a suit
        }
        "have a method to check if it is a face card" in {
            Rank.Two.isFace should be(false)
            Rank.Three.isFace should be(false)
            Rank.Four.isFace should be(false)
            Rank.Five.isFace should be(false)
            Rank.Six.isFace should be(false)
            Rank.Seven.isFace should be(false)
            Rank.Eight.isFace should be(false)
            Rank.Nine.isFace should be(false)
            Rank.Ten.isFace should be(false)
            Rank.Jack.isFace should be(true)
            Rank.Queen.isFace should be(true)
            Rank.King.isFace should be(true)
            Rank.Ace.isFace should be(true)
        }
        "have a method to check if it is a number card" in {
            Rank.Two.isNumber should be(true)
            Rank.Three.isNumber should be(true)
            Rank.Four.isNumber should be(true)
            Rank.Five.isNumber should be(true)
            Rank.Six.isNumber should be(true)
            Rank.Seven.isNumber should be(true)
            Rank.Eight.isNumber should be(true)
            Rank.Nine.isNumber should be(true)
            Rank.Ten.isNumber should be(true)
            Rank.Jack.isNumber should be(false)
            Rank.Queen.isNumber should be(false)
            Rank.King.isNumber should be(false)
            Rank.Ace.isNumber should be(false)
        }
        "be comparable on equality" in {
            Rank.Two.equals(Rank.Two) should be(Rank.Two == Rank.Two)
            Rank.Two == Rank.Two should be(true)
            Rank.Two == Rank.Three should be(false)
            
            Rank.Three == Rank.Two should be(false)
            Rank.Three == Rank.Three should be(true)

            Rank.Ace == Rank.Ace should be(true)
            Rank.Ace == Rank.King should be(false)
        }
        "be comparable on greater than" in {
            Rank.Two > Rank.Two should be(false)
            Rank.Two > Rank.Three should be(false)

            Rank.Three > Rank.Two should be(true)
            Rank.Three > Rank.Three should be(false)

            Rank.Ace > Rank.Two should be(true)
            Rank.Ace > Rank.Three should be(true)
            Rank.Ace > Rank.Ace should be(false)
        }
        "be comparable on less than" in {
            Rank.Two < Rank.Two should be(false)
            Rank.Two < Rank.Three should be(true)

            Rank.Three < Rank.Two should be(false)
            Rank.Three < Rank.Three should be(false)

            Rank.Ace < Rank.Two should be(false)
            Rank.Ace < Rank.Three should be(false)
            Rank.Ace < Rank.Ace should be(false)
        }
        "be comparable on greater than or equal" in {
            Rank.Two >= Rank.Two should be(true)
            Rank.Two >= Rank.Three should be(false)

            Rank.Three >= Rank.Two should be(true)
            Rank.Three >= Rank.Three should be(true)

            Rank.Ace >= Rank.Two should be(true)
            Rank.Ace >= Rank.Three should be(true)
            Rank.Ace >= Rank.Ace should be(true)
        }
        "be comparable on less than or equal" in {
            Rank.Two <= Rank.Two should be(true)
            Rank.Two <= Rank.Three should be(true)

            Rank.Three <= Rank.Two should be(false)
            Rank.Three <= Rank.Three should be(true)

            Rank.Ace <= Rank.Two should be(false)
            Rank.Ace <= Rank.Three should be(false)
            Rank.Ace <= Rank.Ace should be(true)
        }
        "have a single letter representation" in {
            // These letters are to be used in the console output
            Rank.Two.toLetter should be("2")
            Rank.Three.toLetter should be("3")
            Rank.Four.toLetter should be("4")
            Rank.Five.toLetter should be("5")
            Rank.Six.toLetter should be("6")
            Rank.Seven.toLetter should be("7")
            Rank.Eight.toLetter should be("8")
            Rank.Nine.toLetter should be("9")
            Rank.Ten.toLetter should be("10")
            Rank.Jack.toLetter should be("J")
            Rank.Queen.toLetter should be("Q")
            Rank.King.toLetter should be("K")
            Rank.Ace.toLetter should be("A")
        }
        "have a string representation" in {
            Rank.Two.toString should be("Two")
            Rank.Three.toString should be("Three")
            Rank.Four.toString should be("Four")
            Rank.Five.toString should be("Five")
            Rank.Six.toString should be("Six")
            Rank.Seven.toString should be("Seven")
            Rank.Eight.toString should be("Eight")
            Rank.Nine.toString should be("Nine")
            Rank.Ten.toString should be("Ten")
            Rank.Jack.toString should be("Jack")
            Rank.Queen.toString should be("Queen")
            Rank.King.toString should be("King")
            Rank.Ace.toString should be("Ace")
        }
    }