package id.adiyusuf.jetheroes.data

import id.adiyusuf.jetheroes.model.Hero
import id.adiyusuf.jetheroes.model.HeroesData

class HeroRepository {
    fun getHeroes(): List<Hero> {
        return HeroesData.heroes
    }

    fun searchHeroes(query: String): List<Hero>{
        return  HeroesData.heroes.filter {
            it.name.contains(query, ignoreCase = true)
        }
    }
}