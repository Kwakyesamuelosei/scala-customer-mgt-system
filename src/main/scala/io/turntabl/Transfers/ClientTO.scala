package io.turntabl.Transfers

class ClientTO(val client_id: Int, val client_name: String, val client_address: String, val client_telephone: String, val client_email: String)

object ClientTO {
  def apply(client_id: Int, client_name: String, client_address: String, client_telephone: String, client_email: String): ClientTO = new ClientTO(client_id, client_name, client_address, client_telephone, client_email)
}

