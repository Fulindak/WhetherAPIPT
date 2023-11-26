# WhetherAPIPT
# Gatling Template Project

Template project for gatling performance tests


## Project structure

```
src.test.resources - project resources
src.test.scala.danila.mts.sre.weatherapi.cases - simple cases
src.test.scala.danila.mts.sre.weatherapi.scenarios - common load scenarios assembled from simple cases
src.test.scala.danila.mts.sre.weatherapi - common test configs
```

## Test configuration

Pass this params to JVM using -DparamName="paramValue" AND -Dconfig.override_with_env_vars=true

```
Gatling logs:
CONSOLE_LOGGING=ON - turn on console logging
FILE_LOGGING=ON - turn on logging in file "target/gatling/gatling.log"
GRAYLOG_LOGGING=ON - turn on logging in graylog
    graylog params:
        GRAYLOG_HOST - graylog host
        GRAYLOG_PORT - on which port graylog input is
        GRAYLOG_STREAM - name of graylog stream

Gatling metrics in influxdb:
GRAPHITE_HOST - influxdb with configured graphite plugin host
GRAPHITE_PORT - see /etc/influxdb/influxdb.conf: bind-address
INFLUX_PREFIX - see /etc/influxdb/influxdb.conf: database
```

Also you can pass all params from gatling-picatinny or use custom params
read: https://github.com/TinkoffCreditSystems/gatling-picatinny/blob/master/README.md

## Debug

1. Debug test with 1 user, requires proxy on localhost:8888, eg using Fiddler or Wireshark

```
"Gatling / testOnly danila.mts.sre.weatherapi.Debug"
```

2. Run test from IDEA with breakpoints

```
danila.mts.sre.GatlingRunner
```

## Launch test

```
"Gatling / testOnly danila.mts.sre.weatherapi.MaxPerformance" - maximum performance test
"Gatling / testOnly danila.mts.sre.weatherapi.Stability" - stability test
```

## Help

telegram: @qa_load

gatling docs: https://gatling.io/docs/current/general
