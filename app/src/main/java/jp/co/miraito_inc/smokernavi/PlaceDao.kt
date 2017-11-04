package jp.co.miraito_inc.smokernavi

import java.io.Serializable

/**
 * Created by yusaku_inamura on 2017/11/03.
 */
class PlaceDao(id: Int, name: String, description: String, latitude: Double, longitude: Double) : Serializable {
    var id: Int = id
    var name: String = name
    var description: String = description
    var latitude: Double = latitude
    var longitude: Double = longitude
}