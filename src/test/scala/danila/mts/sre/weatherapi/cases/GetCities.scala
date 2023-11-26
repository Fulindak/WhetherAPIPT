package danila.mts.sre.weatherapi.cases


import io.gatling.http.Predef._
import io.gatling.core.Predef._
import io.gatling.http.request.builder.HttpRequestBuilder




object GetCities {

  val getCities: HttpRequestBuilder = http("Get /cities")
    .get("/cities")
    .check(status is 200)

  val getCitiesById: HttpRequestBuilder = http("Get /cities/{id}")
    .get("/cities/${id}")
    .check(status is 200)
}
