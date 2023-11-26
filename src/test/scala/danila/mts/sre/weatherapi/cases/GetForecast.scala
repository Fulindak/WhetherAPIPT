package danila.mts.sre.weatherapi.cases

import io.gatling.http.Predef._
import io.gatling.core.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder

object GetForecast {
 val getForecast: HttpRequestBuilder = http("Get /forecast")
   .get("/forecast")
   .check(status is 200)
}
