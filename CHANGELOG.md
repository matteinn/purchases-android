## 4.1.0

 - Updated purchase-tester sample app and modified structure of the examples folder.
     https://github.com/RevenueCat/purchases-android/pull/296
     https://github.com/RevenueCat/purchases-android/pull/297
 - Added back the call setObfuscatedAccountID when purchasing for non-upgrades/downgrades.
     https://github.com/RevenueCat/purchases-android/pull/294
 - Updated error mapping and created a new ConfigurationError for cases when the package name is wrongly configured in the dashboard.
     https://github.com/RevenueCat/purchases-android/pull/298

## 4.0.5

- Catches NullPointerException on DeviceCache.findKeysThatStartWith
    https://github.com/RevenueCat/purchases-android/pull/284
- Catch exceptions when getting stringSet from sharedPreferences
    https://github.com/RevenueCat/purchases-android/pull/280
    https://github.com/RevenueCat/purchases-android/pull/282
- Identity v3: update appUserID location in /identify
    https://github.com/RevenueCat/purchases-android/pull/287
- Added MagicWeather app example in the Examples folder
    https://github.com/RevenueCat/purchases-android/pull/264

## 4.0.4

- Updated willRenew property in the PurchaserInfo to be false also for Consumabled and Promotionals.
    https://github.com/RevenueCat/purchases-android/pull/259
- Added a numeric code to PurchasesErrorCode so that the code numbers are consistent between platforms.
    https://github.com/RevenueCat/purchases-android/pull/261

## 4.0.3

- Fixes JSONObjectParceler, SkuDetailsParceler and adds unit tests for other Parcelable classes.
    https://github.com/RevenueCat/purchases-android/pull/249
    https://github.com/RevenueCat/purchases-android/pull/253
    https://github.com/RevenueCat/purchases-android/pull/254
- Changes cache refresh period on background to 25 hours.
    https://github.com/RevenueCat/purchases-android/pull/255

## 4.0.2

- Update lifecycle version to 2.3.0-rc01 and made sure addObserver is called from the main thread. Should fix #240.
    https://github.com/RevenueCat/purchases-android/pull/241
- Updates BillingClient to version 3.0.2
    https://github.com/RevenueCat/purchases-android/pull/235
- Fixes some exceptions being swallowed by ExecutorService
    https://github.com/RevenueCat/purchases-android/pull/234
- Revamped logging strings, makes log messages from Purchases easier to spot and understand.
    https://github.com/RevenueCat/purchases-android/pull/238
    https://github.com/RevenueCat/purchases-android/pull/237
    https://github.com/RevenueCat/purchases-android/pull/236
    https://github.com/RevenueCat/purchases-android/pull/244
- Made `body` in the HttpResult not null
    https://github.com/RevenueCat/purchases-android/pull/242


## 4.0.1

- Adds mapping for ITEM_ALREADY_OWNED
    https://github.com/RevenueCat/purchases-android/pull/220
- Fixes incompatibilities with Mockito 1.x.x
    https://github.com/RevenueCat/purchases-android/pull/228
   
## 4.0.0

- Removes Billing permission from AndroidManifest since it's added by the BillingClient.
    https://github.com/RevenueCat/purchases-android/pull/211
- Fixes Deferred downgrades. The Purchase object in the completion block of `purchaseProduct` and `purchasePackage` is now nullable when changing products.
    https://github.com/RevenueCat/purchases-android/pull/200
- Deprecated makePurchase and getEntitlements have been removed. Use purchaseProduct/purchasePackage and getOfferings instead.
   
## 3.5.3

- More aggressive caches and jittering for apps in background 
    https://github.com/RevenueCat/purchases-android/pull/201
   
## 3.5.2

- Catch IOException when getAdvertisingIdInfo 
    https://github.com/RevenueCat/purchases-android/pull/197
- Updates BillingClient to 3.0.1
    https://github.com/RevenueCat/purchases-android/pull/199
- Changes the way we deserialize the JSON "management_url" to prevent weird behavior 
    https://github.com/RevenueCat/purchases-android/pull/203
- Moved strings to their own module 
    https://github.com/RevenueCat/purchases-android/pull/202
- Fixes dokka
    https://github.com/RevenueCat/purchases-android/pull/205
   
## 3.5.1

- Fixes an issue where after calling invalidatePurchaserInfoCache and then purchaserInfoWithCompletion, the invalidated 
  cached version of purchaserInfo would be returned first, and only the delegate would get the updated version.
    https://github.com/RevenueCat/purchases-android/pull/189
- Catch TimeoutException when calling getAdvertisingIdInfo
    https://github.com/RevenueCat/purchases-android/pull/194
   
## 3.5.0
- Attribution V2:
    - Deprecated `addAttribution` in favor of `setAdjustId`, `setAppsflyerId`, `setFbAnonymousId`, `setMparticleId`.
    - Added support for OneSignal via `setOnesignalId`
    - Added `setMediaSource`, `setCampaign`, `setAdGroup`, `setAd`, `setKeyword`, `setCreative`, and `collectDeviceIdentifiers`
         https://github.com/RevenueCat/purchases-android/pull/184
- Fixed a RejectedExecutionException due to un-synchronized accesses to the ExecutorService 
    https://github.com/RevenueCat/purchases-android/pull/179
- Fixed downgrades/upgrades https://github.com/RevenueCat/purchases-flutter/issues/93
    https://github.com/RevenueCat/purchases-android/pull/179

## 3.4.1

- Addresses an issue where subscriber attributes might not sync correctly if subscriber info for the user hadn't been synced before the subscriber attributes sync was performed.
     https://github.com/RevenueCat/purchases-android/pull/184

## 3.4.0

- New properties added to the PurchaserInfo to better manage non-subscriptions.
https://github.com/RevenueCat/purchases-android/pull/172

## 3.3.0

- Added mParticle as one of the attribution options  
https://github.com/RevenueCat/purchases-android/pull/163
- Added original_purchase_date to JSON response
https://github.com/RevenueCat/purchases-android/pull/164
- Updated BillingClient to 3.0.0
https://github.com/RevenueCat/purchases-android/pull/166
- Moved the SKUDetails inside the ProductInfo that's passed to the Backend class when posting tokens
https://github.com/RevenueCat/purchases-android/pull/167

## 3.2.0

- Added `proxyKey`, useful for kids category apps, so that they can set up a proxy to send requests through. **Do not use this** unless you've talked to RevenueCat support about it. 
https://github.com/RevenueCat/purchases-android/pull/152
https://github.com/RevenueCat/purchases-android/pull/157
- Added `managementURL` to purchaserInfo. This provides an easy way for apps to create Manage Subscription buttons that will correctly redirect users to the corresponding subscription management page on all platforms. 
https://github.com/RevenueCat/purchases-android/pull/151
- Extra fields sent to the post receipt endpoint: `normal_duration`, `intro_duration` and `trial_duration`. These will feed into the LTV model for more accurate LTV values. 
https://github.com/RevenueCat/purchases-android/pull/148
https://github.com/RevenueCat/purchases-android/pull/156
- Fixed a bug where if the `context` passed to the SDK on setup is not an `Application` context, there is be a memory leak and potential issues getting the Advertising Info. 
https://github.com/RevenueCat/purchases-android/pull/147
- Migrated more classes to use Parcelize 
https://github.com/RevenueCat/purchases-android/pull/150

## 3.1.1

- Fix a subscriber attributes bug where the attributes are deleted when an alias is created. https://github.com/RevenueCat/purchases-android/pull/135
- New headers for observer mode and platform version https://github.com/RevenueCat/purchases-android/pull/136
- Fixed purchase buttons in Sample App https://github.com/RevenueCat/purchases-android/pull/141
- Fixed enablePendingPurchases not being called when calling isFeatureSupported https://github.com/RevenueCat/purchases-android/pull/138
- Adds a Java sample https://github.com/RevenueCat/purchases-android/pull/129
- Updates invalidatePurchaserInfoCache https://github.com/RevenueCat/purchases-android/pull/131
- Fixed Subscriber Attributes JSON in Android < 19 https://github.com/RevenueCat/purchases-android/pull/144

## 3.1.0

- Another fix for NoSuchElementException when retrieving Advertising ID #124
- Added Subscriber Attributes, which allow developers to store additional, structured information 
for a user in RevenueCat. More info: https://docs.revenuecat.com/docs/user-attributes

## 3.0.7

- Fixes NoSuchElementException #115

## 3.0.6

- Added new method to invalidate the purchaser info cache, useful when promotional purchases are granted from outside the app. #109

## 3.0.5

- Fixes compatibility with AppsFlyer SDK https://github.com/RevenueCat/purchases-android/pull/97
- Adds Fastlane to improve releases https://github.com/RevenueCat/purchases-android/pull/99
- Posts price and currency code for managed products https://github.com/RevenueCat/purchases-android/pull/96
- Adds platform flavor static variable https://github.com/RevenueCat/purchases-android/pull/91
- Fixes https://github.com/RevenueCat/purchases-android/issues/98   

## 3.0.4

- Defers fetching updated PurchaserInfo and Offerings to whenever the app is foregrounded.
- Adds Lifecycle components to better detect the lifecycle of the app.

## 3.0.3

- Fixes `syncPurchases` and `restorePurchases`.
- Adds `observer_mode` to the backend post receipt call.

## 3.0.2

- Exposes `all`, property of `Offerings` to access all the Offerings.

## 3.0.1

- Fixes some documentation

## 3.0.0

- Support for new Offerings system.
- Deprecates `makePurchase` methods. Replaces with `purchasePackage`
- Deprecates `entitlements` method. Replaces with `offerings`
- See our migration guide for more info: https://docs.revenuecat.com/v3.0/docs/offerings-migration
- Updates to BillingClient 2.0.3 (#88). If `finishTransactions` is set to `false` (or `observerMode` is true when configuring the SDK), this SDK won't acknowledge any purchase.
- Adds proration mode support on upgrades/downgrades (#86)
- New identity changes (#87):
    - The `.createAlias()` method is no longer required, use `.identify()` instead
    - `.identify()` will create an alias if being called from an anonymous ID generated by RevenueCat
    - Added an `isAnonymous` property to `Purchases.sharedInstance`
    - Improved offline use

## 2.4.1

- Adds missing close call on inputStream.

## 2.4.0

- Fixes crash in `updatePendingPurchaseQueue` ([#81] (https://github.com/RevenueCat/purchases-android/pull/81))
- Deprecates activeEntitlements in RCPurchaserInfo and adds entitlements object to RCPurchaserInfo. For more info check out https://docs.revenuecat.com/docs/purchaserinfo 

## 2.3.1

- Fix NullPointerException in BillingWrapper ([#79](https://github.com/RevenueCat/purchases-android/pull/79))
- Handle missing INTERNET permissions when making network requests ([#78](https://github.com/RevenueCat/purchases-android/pull/78))

## 2.3.0

- **BREAKING CHANGE** Removed deprecated makePurchase methods
- Improved logic on purchase tokens management
- **NEW FEATURE** Added Facebook as supported attribution network https://docs.revenuecat.com/docs/facebook-ads.

## 2.2.5

- Removes duplicated makePurchase call in deprecated makePurchase method.

## 2.2.4

- Fixes Proguard issue

## 2.2.3

- Fixes multi threading issues

## 2.2.2

- Fixes KotlinNullPointerException in Backend:248
- Fixes NullPointerException in Purchases:673

## 2.2.1

- Bugfix release: avoids caches being cleared when there is an error fetching purchaser info. Fixes https://github.com/RevenueCat/purchases-android/issues/68

## 2.2.0

- **BREAKING CHANGE** Call `syncTransactions` to send purchases information to RevenueCat after any restore or purchase if you are using the SDK in `observerMode`. See our guide on Migrating Subscriptions for more information on `syncTransactions`: https://docs.revenuecat.com/docs/migrating-existing-subscriptions
- `addAttribution` is now a static method that can be called before the SDK is configured.
- `addAttribution` will automatically add the `rc_gps_adid` parameter.
- A network user identifier can be send to the `addAttribution` function, replacing the previous `rc_appsflyer_id` parameter.
- Adds an optional configuration boolean `observerMode`. This will set the value of `finishTransactions` at configuration time.
- Updated BillingClient to 1.2.2.
- `makePurchase` now requires a SKUDetails product instead of a sku and type.
- Header updates to include client version and locale which will be used for debugging and reporting in the future.

## 2.1.2

- Fixes exception when inputstream is null.
- Fixes an exception when Purchases is instantiated from a background thread.
- Fixes concurrency issue on servicerequests.

## 2.1.1

- Adds setFinishTransactions. Set this to false if you are finishing transactions outside of the Purchases SDK

## 2.1.0

- Adds userCancelled as a parameter to the completion block of the makePurchase function
- Better error codes
- The entitlements call now fails if the service returns FEATURE_NOT_SUPPORTED or BILLING_UNAVAILABLE. Also that DEVELOPER_ERROR that was always displaying in the logs, now shows as "Billing Service Setup is already trying to connect."
- Fixes some exceptions not being reported. We might start seeing more crashes that were silent before.

## 2.0.1

- Fixes ConcurrentModificationException when making a purchase fails.

## 2.0.0

- Refactor to all block based methods
- Optional listener method to receive changes in Purchaser Info
- Ability to turn on detailed logging by setting `debugLogsEnabled`
- Use of AndroidX dependencies
- Upgraded Kotlin, compile and target versions

## 1.4.2

- Sends cached purchaser info after listener is set to fix offline

## 1.4.1

- Prevents calling endConnection if the service is not ready

## 1.4.0

- Adds singleton management inside the SDK
- Adds reset, create alias and identify calls
- Fixes callbacks being called in a background thread
- Renames allowUsingAnonymousId to allowsSharingPlayStoreAccount
- Other bugfixes

## 1.3.8

- Fixes onRestoreTransactions not being called if there are no tokens.

## 1.3.7

- Adds requestDate to the purchaser info to avoid edge cases

## 1.3.6

- Fix bug where closed RCPurchases were still listening for application lifecyle methods

## 1.3.5

- Fix for error edge case

## 1.3.4

- Add close method to Purchases, this should be called before creating a new purchases object

## 1.3.3

- Add close method to Purchases, this should be called before creating a new purchases object

## 1.3.2

- Ensure consumables are consumed
- Add ability to override

## 1.3.1

- Fix visibility for addAttribution methods

## 1.3.0

- Attribution! You can now pass attribution data from AppsFlyer, Adjust and Branch. You can then view the ROI of your campaigns, including revenue coming from referrals.

## 1.2.1

- Fix for entitlements, missing products now return as null, not blocking the whole entitlement

## 1.2.0

- Add error handler for entitlements fetch

## 1.1.0

- Add restore transactions listener methods

## 1.0.0

- Entitlements support
- Caching of purchaser info
- RevenueCat is coming out of beta! Sign up at https://www.revenuecat.com/

## 0.1.0

- Initial release
