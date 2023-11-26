package danila.mts.sre.weatherapi.feeders

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import io.gatling.core.feeder.BatchableFeederBuilder

object MainFeeder {

  val citeId: BatchableFeederBuilder[String] = csv("citiesId.csv").random


}
