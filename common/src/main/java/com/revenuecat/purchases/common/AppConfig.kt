package com.revenuecat.purchases.common

import android.content.Context
import com.revenuecat.purchases.Store
import java.net.URL
import com.revenuecat.purchases.strings.ConfigureStrings

class AppConfig(
    context: Context,
    observerMode: Boolean,
    val platformInfo: PlatformInfo,
    proxyURL: URL?,
    val store: Store
) {

    val languageTag: String = context.getLocale()?.toBCP47() ?: ""
    val versionName: String = context.versionName ?: ""
    var finishTransactions: Boolean = !observerMode
    val baseURL: URL = proxyURL?.also {
        log(LogIntent.INFO, ConfigureStrings.CONFIGURING_PURCHASES_PROXY_URL_SET)
    } ?: URL("https://api.revenuecat.com/")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AppConfig

        if (platformInfo != other.platformInfo) return false
        if (languageTag != other.languageTag) return false
        if (versionName != other.versionName) return false
        if (finishTransactions != other.finishTransactions) return false
        if (baseURL != other.baseURL) return false

        return true
    }

    override fun hashCode(): Int {
        var result = platformInfo.hashCode()
        result = 31 * result + languageTag.hashCode()
        result = 31 * result + versionName.hashCode()
        result = 31 * result + finishTransactions.hashCode()
        result = 31 * result + baseURL.hashCode()
        return result
    }

    override fun toString(): String {
        return "AppConfig(" +
            "platformInfo=$platformInfo, " +
            "languageTag='$languageTag', " +
            "versionName='$versionName', " +
            "finishTransactions=$finishTransactions, " +
            "baseURL=$baseURL)"
    }
}
