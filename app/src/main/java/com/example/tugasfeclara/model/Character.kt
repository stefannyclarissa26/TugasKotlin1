package com.example.tugasfeclara.model

import com.example.tugasfeclara.R

enum class CombatType {
    Imaginary,
    Fire,
    Physical,
    Ice,
    Wind,
    Quantum,
    Lightning
}

data class Character (
    val id: Int,
    val characterName: String,
    val path: String,
    val combatType: CombatType,
    val faction: String,
    val rarity: Int,
    val isPopular: Boolean,
    val imageUrl: Int
) {
    companion object {
        fun searchCharacter(query: String): List<Character> {
            return getAllCharacter().filter {
                it.characterName.contains(query, ignoreCase = true)
            }
        }

        fun getCharacterById(id: Int): List<Character> {
            return getAllCharacter().filter {
                it.id == id
            }
        }

        fun getMetaCharacter(): List<Character> {
            return getAllCharacter().filter {
                it.isPopular
            }
        }

        fun filterCombatType(combatType: CombatType): List<Character> {
            return getAllCharacter().filter {
                it.combatType == combatType
            }
        }

        fun getNonMetaCharacter(): List<Character> {
            return getAllCharacter().filter {
                !it.isPopular
            }
        }

        fun getAllCharacter(): List<Character> {
            return listOf(
                Character(
                    1,
                    "Trailblazer - The Harmony",
                    "Harmony",
                    CombatType.Imaginary,
                    "Astrall Express",
                    5,
                    true,
                    R.drawable.img1
                ),
                Character(
                    2,
                    "Trailblazer - The Preservation",
                    "Preservation",
                    CombatType.Fire,
                    "Astral Express",
                    5,
                    false,
                    R.drawable.img2
                ),
                Character(
                    3,
                    "Trailblazer - The Destruction",
                    "Destruction",
                    CombatType.Physical,
                    "Astral Express",
                    5,
                    false,
                    R.drawable.img3
                ),
                Character(
                    4,
                    "March 7th",
                    "Preservation",
                    CombatType.Ice,
                    "Astral Express",
                    4,
                    false,
                    R.drawable.img4
                ),
                Character(
                    5,
                    "March 7th - The Hunt",
                    "Hunt",
                    CombatType.Imaginary,
                    "Astral Express",
                    4,
                    true,
                    R.drawable.img5
                ),
                Character(
                    6,
                    "Dan Heng",
                    "Hunt",
                    CombatType.Wind,
                    "Astral Express",
                    4,
                    false,
                    R.drawable.img6
                ),
                Character(
                    7,
                    "Dan Heng - Imbibitor Lunae",
                    "Destruction",
                    CombatType.Imaginary,
                    "Astral Express",
                    5,
                    true,
                    R.drawable.img7
                ),
                Character(
                    8,
                    "Himeko",
                    "Erudition",
                    CombatType.Fire,
                    "Astral Express",
                    5,
                    true,
                    R.drawable.img8
                ),
                Character(
                    9,
                    "Welt",
                    "Nihility",
                    CombatType.Imaginary,
                    "Astral Express",
                    5,
                    false,
                    R.drawable.img9
                ),
                Character(
                    10,
                    "Herta",
                    "Erudition",
                    CombatType.Ice,
                    "Herta Space Station",
                    4,
                    false,
                    R.drawable.img10
                ),
                Character(
                    11,
                    "Seele",
                    "Hunt",
                    CombatType.Quantum,
                    "Wildfire",
                    5,
                    true,
                    R.drawable.img11
                ),
                Character(
                    12,
                    "Bronya",
                    "Harmony",
                    CombatType.Wind,
                    "Silvermane Guard",
                    5,
                    true,
                    R.drawable.img12
                ),
                Character(
                    13,
                    "Gepard",
                    "Preservation",
                    CombatType.Ice,
                    "Silvermane Guard",
                    5,
                    true,
                    R.drawable.img13
                ),
                Character(
                    14,
                    "Serval",
                    "Erudition",
                    CombatType.Lightning,
                    "Belobog",
                    4,
                    false,
                    R.drawable.img14
                ),
                Character(
                    15,
                    "Sampo",
                    "Nihility",
                    CombatType.Wind,
                    "Masked Fool",
                    4,
                    false,
                    R.drawable.img15
                ),
                Character(
                    16,
                    "Sparkle",
                    "Harmony",
                    CombatType.Quantum,
                    "Masked Fool",
                    5,
                    true,
                    R.drawable.img16
                ),
                Character(
                    17,
                    "Ruan Mei",
                    "Harmony",
                    CombatType.Ice,
                    "Genius Society",
                    5,
                    true,
                    R.drawable.img17
                ),
                Character(
                    18,
                    "Dr. Ratio",
                    "Hunt",
                    CombatType.Imaginary,
                    "Intelligentsia Guild",
                    5,
                    true,
                    R.drawable.img18
                ),
                Character(
                    19,
                    "Yukong",
                    "Harmony",
                    CombatType.Imaginary,
                    "Xiangzhou Luofu",
                    4,
                    false,
                    R.drawable.img19
                ),
                Character(
                    20,
                    "Guinaifen",
                    "Nihility",
                    CombatType.Fire,
                    "Xiangzhou Luofu",
                    4,
                    true,
                    R.drawable.img20
                ),
                Character(
                    21,
                    "Luocha",
                    "Abundance",
                    CombatType.Imaginary,
                    "Xiangzhou Luofu",
                    5,
                    true,
                    R.drawable.img21
                ),
                Character(
                    22,
                    "Blade",
                    "Destruction",
                    CombatType.Wind,
                    "Stelaron Hunter",
                    5,
                    true,
                    R.drawable.img22
                ),
                Character(
                    23,
                    "Kafka",
                    "Nihility",
                    CombatType.Lightning,
                    "Stelaron Hunter",
                    5,
                    true,
                    R.drawable.img23
                ),
                Character(
                    24,
                    "Firefly",
                    "Destruction",
                    CombatType.Fire,
                    "Stelaron Hunter",
                    5,
                    true,
                    R.drawable.img24
                ),
                Character(
                    25,
                    "Aventurine",
                    "Preservation",
                    CombatType.Imaginary,
                    "Interastral Peace Corporation",
                    5,
                    true,
                    R.drawable.img25
                ),
                Character(
                    26,
                    "Jade",
                    "Erudition",
                    CombatType.Quantum,
                    "Interastral Peace Corporation",
                    5,
                    false,
                    R.drawable.img26
                ),
                Character(
                    27,
                    "Jiaoqiu",
                    "Nihility",
                    CombatType.Fire,
                    "Xiangzhou Luofu",
                    5,
                    true,
                    R.drawable.img27
                ),
                Character(
                    28,
                    "Moze",
                    "Hunt",
                    CombatType.Lightning,
                    "Xiangzhou Luofu",
                    4,
                    true,
                    R.drawable.img28
                ),
                Character(
                    29,
                    "Boothil",
                    "Hunt",
                    CombatType.Physical,
                    "Galaxy Ranger",
                    5,
                    true,
                    R.drawable.img29
                ),
                Character(
                    30,
                    "Argenti",
                    "Erudition",
                    CombatType.Physical,
                    "Knights of Beauty",
                    5,
                    false,
                    R.drawable.img30
                )
            )
        }
    }
}