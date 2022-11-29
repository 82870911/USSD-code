package ussdcode.Models

class MinutModel {
    var minutes = ""
    var code = ""
    var desc = ""

    constructor(minutes: String, code: String, desc: String) {
        this.minutes = minutes
        this.code = code
        this.desc = desc
    }
}