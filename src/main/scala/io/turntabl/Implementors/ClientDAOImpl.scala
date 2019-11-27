package io.turntabl.Implementors

import io.swagger.annotations.{Api, ApiOperation}
import io.turntabl.DAO.ClientDAO
import io.turntabl.Transfers.ClientTO
import org.springframework.web.bind.annotation.{DeleteMapping, GetMapping, PostMapping, PutMapping, RestController}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import redis.clients.jedis.Jedis

@Api
@RestController
 class ClientDAOImpl(@Autowired val jdbcTemplate: JdbcTemplate,val jedis: Jedis = null) extends ClientDAO{


  @ApiOperation("Add Client")
  @PostMapping(path = Array("/v1/api/client"))
  override def addClient(requestData: Map[String, String]): Unit =
    println("Added")


  @ApiOperation("Delete Client")
  @DeleteMapping(path = Array("/v1/api/client/{id}"))
  override def deleteClient(clientID: Int): Unit =

  @ApiOperation("Get All Clients")
  @GetMapping(path = Array("/v1/api/clients"))
  override def getAllClients: List[ClientTO] = ???
  println("Added")

  @ApiOperation("Search Client By Name")
  @GetMapping(path = Array("/v1/api/client/search/{name}"))
  override def searchClientByName(clientName: String): List[ClientTO] = ???

  @ApiOperation("Update Client Details")
  @PutMapping(path = Array("/v1/api/client"))
  override def updateClient(requestData: Map[String, String]): Unit = ???
}
