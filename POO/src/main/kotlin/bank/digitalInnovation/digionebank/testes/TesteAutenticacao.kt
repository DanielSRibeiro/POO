package bank.digitalInnovation.digionebank.testes

import bank.digitalInnovation.digionebank.Logavel
import javax.xml.transform.sax.SAXSource

class TesteAutenticacao {
    companion object{
        fun autenticar(logavel: Logavel) = println(logavel.login())
    }

}