package singleton

import java.time.LocalDateTime

/**
 * Singletonクラス
 * 1個しかインスタンスが生成されないことを保証する
 */
object Singleton {
    val singleton = LocalDateTime.now()
}