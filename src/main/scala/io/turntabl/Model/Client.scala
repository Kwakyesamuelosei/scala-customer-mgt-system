package io.turntabl.Model

class Client(val client_name: String, val client_address: String, val client_telephone: String, val client_email: String)

object Client{
  def apply(client_name: String, client_address: String, client_telephone: String, client_email: String): Client = new Client(client_name, client_address, client_telephone, client_email)
}