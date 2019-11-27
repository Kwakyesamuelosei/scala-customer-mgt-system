package io.turntabl.DAO

import io.turntabl.Transfers.ClientTO

abstract class ClientDAO {
  def addClient(requestData: Map[String, String]): Unit

  def deleteClient(clientID: Int): Unit

  def getAllClients: List[ClientTO]

  def searchClientByName(clientName: String): List[ClientTO]

  def updateClient(requestData: Map[String, String]): Unit
}
