final dynamicLinkParams = DynamicLinkParameters(
  link: Uri.parse("https://www.example.com/"),
  uriPrefix: "https://example.page.link",
  androidParameters: const AndroidParameters(
    packageName: "com.example.app.android",
    minimumVersion: 30,
  ),
  iosParameters: const IOSParameters(
    bundleId: "com.example.app.ios",
    appStoreId: "123456789",
    minimumVersion: "1.0.1",
  ),
  googleAnalyticsParameters: const GoogleAnalyticsParameters(
    source: "twitter",
    medium: "social",
    campaign: "example-promo",
  ),
  socialMetaTagParameters: SocialMetaTagParameters(
    title: "Example of a Dynamic Link",
    imageUrl: Uri.parse("https://example.com/image.png"),
  ),
);
final dynamicLink =
    await FirebaseDynamicLinks.instance.buildShortLink(dynamicLinkParams);
