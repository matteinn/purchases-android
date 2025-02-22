package com.revenuecat.purchases

import android.os.Parcelable
import com.android.billingclient.api.SkuDetails
import com.revenuecat.purchases.models.ProductDetails
import kotlinx.android.parcel.Parcelize

/**
 * Contains information about the product available for the user to purchase. For more info see https://docs.revenuecat.com/docs/entitlements
 * @property identifier Unique identifier for this package. Can be one a predefined package type or a custom one.
 * @property packageType Package type for the product. Will be one of [PackageType].
 * @property product [SkuDetails] assigned to this package.
 */
@Parcelize
data class Package(
    val identifier: String,
    val packageType: PackageType,
    val product: ProductDetails,
    val offering: String
) : Parcelable

/**
 *  Enumeration of all possible Package types.
 */
enum class PackageType(val identifier: String?) {
    /**
     * A package that was defined with a custom identifier.
     */
    UNKNOWN(null),
    /**
     * A package that was defined with a custom identifier.
     */
    CUSTOM(null),
    /**
     * A package configured with the predefined lifetime identifier.
     */
    LIFETIME("\$rc_lifetime"),
    /**
     * A package configured with the predefined annual identifier.
     */
    ANNUAL("\$rc_annual"),
    /**
     * A package configured with the predefined six month identifier.
     */
    SIX_MONTH("\$rc_six_month"),
    /**
     * A package configured with the predefined three month identifier.
     */
    THREE_MONTH("\$rc_three_month"),
    /**
     * A package configured with the predefined two month identifier.
     */
    TWO_MONTH("\$rc_two_month"),
    /**
     * A package configured with the predefined monthly identifier.
     */
    MONTHLY("\$rc_monthly"),
    /**
     * A package configured with the predefined weekly identifier.
     */
    WEEKLY("\$rc_weekly"),
}
