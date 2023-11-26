package danila.mts.sre.weatherapi.scenarios

import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import danila.mts.sre.weatherapi.cases._
import danila.mts.sre.weatherapi.feeders.MainFeeder


object CommonScenario {
  def apply(): ScenarioBuilder = new CommonScenario().scn
}

class CommonScenario {

  val scn: ScenarioBuilder = scenario("Common Scenario")
    .feed(MainFeeder.citeId)
    .randomSwitch(
      20.0 -> exec(GetCities.getCities),
      40.0 -> exec((GetWeatherForecast.getWeatherForecast)),
      40.0 -> exec(GetForecast.getForecast)
    )
    .exec(GetCities.getCitiesById)


}