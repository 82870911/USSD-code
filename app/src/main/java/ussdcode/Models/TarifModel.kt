package ussdcode.Models

import java.io.Serializable

class TarifModel:Serializable {
    var name = ""
    var code = ""
    var desc = ""

    constructor(name: String, code: String, desc: String) {
        this.name = name
        this.code = code
        this.desc = desc
    }
}