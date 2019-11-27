package io.turntabl.scalagettingstarted

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@EnableSwagger2
@SpringBootApplication
class MyApp

object MyApp extends App {
  SpringApplication.run(classOf[MyApp])
}

