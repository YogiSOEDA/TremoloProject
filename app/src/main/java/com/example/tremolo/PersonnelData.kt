package com.example.tremolo

class PersonnelData {
    private val bandPersonnel = arrayOf(
        arrayOf("Takahiro Moriuchi", "Toru Yamashita", "Ryota Kohama", "Tomoya Kanki"),
        arrayOf("Chrissy Costanza", "Dan Gow", "Will Ferri"),
        arrayOf("Hiro", "Nob", "Teru", "Kid'z"),
        arrayOf("Bobby Kool", "Jerinx", "Eka Rock"),
        arrayOf("Erix Soekamti", "Dory Soekamti", "Tony Soekamti"),
        arrayOf("Nazril Irham", "Loekman Hakim", "David Kurnia Albert"),
        arrayOf(
            "Adam Levine",
            "James Valentine",
            "Jesse Carmichael",
            "Mickey Madden",
            "Sam Farrar",
            "Matt Flynn",
            "PJ Morton"
        ),
        arrayOf("Ryan Tedder", "Zach Filkins", "Eddie Fisher", "Brent Kutzle", "Drew Brown"),
        arrayOf("Duta", "Eross", "Adam"),
        arrayOf("Pierre Bouvier", "Sébastien Lefebvre", "Chuck Comeau", "Jeff Stinco")
    )

    private val personnelPhoto = arrayOf(
        intArrayOf(R.drawable.taka_oor, R.drawable.toru_oor, R.drawable.ryota_oor, R.drawable.tomoya_oor),
        intArrayOf(R.drawable.chrissy_atc, R.drawable.dan_gow_atc, R.drawable.will_ferri_atc),
        intArrayOf(R.drawable.hiro_mfs, R.drawable.nob_mfs, R.drawable.teru_mfs, R.drawable.kid_mfs),
        intArrayOf(R.drawable.bobby_sid, R.drawable.jrx_sid, R.drawable.eka_sid),
        intArrayOf(R.drawable.erix_es, R.drawable.dory_es, R.drawable.tony_es),
        intArrayOf(R.drawable.ariel_noah, R.drawable.lukman_noah, R.drawable.david_noah),
        intArrayOf(R.drawable.adam_maroon, R.drawable.james_maroon, R.drawable.jesse_maroon, R.drawable.mickey_maroon, R.drawable.sam_maroon, R.drawable.matt_maroon, R.drawable.morton_maroon),
        intArrayOf(R.drawable.ryan_or, R.drawable.zach_or, R.drawable.eddie_or, R.drawable.brent_or, R.drawable.drew_or),
        intArrayOf(R.drawable.duta_so7, R.drawable.eross_so7, R.drawable.adam_so7),
        intArrayOf(R.drawable.pierre_sp, R.drawable.sebastian_sp, R.drawable.chuck_sp, R.drawable.jeff_sp)
    )

    fun listPersonnel(indexPersonnel: Int): ArrayList<Personnel> {
        val list = arrayListOf<Personnel>()
        var j = 0
        while (j < (bandPersonnel[indexPersonnel]?.size as Int)) {
            val personnel = Personnel()
            personnel.name = bandPersonnel[indexPersonnel][j]
            personnel.photo = personnelPhoto[indexPersonnel][j]
            list.add(personnel)
            j++
        }
        return list
    }
}