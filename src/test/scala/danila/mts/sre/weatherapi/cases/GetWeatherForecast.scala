package danila.mts.sre.weatherapi.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object GetWeatherForecast {

  val getWeatherForecast: HttpRequestBuilder = http("Get /weatherForecast")
    .get("/weatherforecast")
    .check(status is 200)
}
