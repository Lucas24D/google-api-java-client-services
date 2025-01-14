/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Source infos are the canonical way to establish data provenance. They can currently be set on
 * features, edits, and issues. Every feature has a repeated list of SourceInfoProto messages to
 * describe the source data that was used in building this feature. The data includes a feature id
 * that points to additional data about the data source (version, copyright notice, etc), and
 * optional "raw data" that is taken directly from the provider's format and has not been converted
 * to a canonical form.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreSourceInfoProto extends com.google.api.client.json.GenericJson {

  /**
   * This is the URL of a page representing all the data from this source in this feature. It may
   * have be the ultimate source of the data (in case of scraping) or merely the same data styled
   * according the provider's taste. There is a similar field in DataSourceProto which is NOT cached
   * in this field, since it has a different meaning.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreUrlProto> attributionUrl;

  /**
   * The time that this particular piece of data was collected. If different attributes were
   * collected on different dates, this is the date of the most recent edit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto collectionDate;

  /**
   * A source info may have a magic cookie whose content and semantics are defined by the specific
   * import process or third-party feed. For feeds that are processed by Distillery, the cookie,
   * when set, should contain the unique identifier for the feature as provided by the feed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cookie;

  /**
   * The dataset from which this SourceInfoProto was created. The content of this string will be
   * determined by the data provider (e.g. for MultiNet data, "fra" would indicate the dataset for
   * France). This field is unnecessary for providers that deliver a single dataset per release
   * (e.g. Basarsoft).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataset;

  /**
   * The Gaia ID of the user who provided us with this data. This field should never be set on
   * source infos present on features, but may be set on source infos present on edits. DEPRECATED:
   * Most clients should use the "user" field instead where Gaia IDs are encrypted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gaiaId;

  /**
   * Information about an internal user or system that is operating on behalf of `user` by way of
   * impersonation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreUserProto impersonationUser;

  /**
   * The name of the layer from which this SourceInfoProto was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layer;

  /**
   * The OGR feature identifier from which this SourceInfoProto was created. This is an internal OGR
   * record identifier and has nothing to do with any of the feature's fields or the FeatureIdProto
   * for the FeatureProto containing this SourceInfoProto. This field is present only for debugging
   * purposes and possible use in the match pattern of a FeatureChangeProto designed to fix bad
   * source data very early in the importing process.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long ogrFid;

  /**
   * The data provider from which this source info was generated. The value must be equal to the one
   * on the TYPE_DATA_SOURCE feature referenced by this source info via the source_id reference (see
   * above).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer provider;

  /**
   * A source info may optionally have a set of key-value pairs that provide "raw data" specific to
   * that source. The types of raw data available will vary from one provider to another and should
   * not be used in production code. Instead, new fields and/or protocol buffers should be defined
   * to represent this information in a canonical form, and the relevant importers should be
   * modified to populate these new fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreRawDataProto> rawData;

  static {
    // hack to force ProGuard to consider GeostoreRawDataProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GeostoreRawDataProto.class);
  }

  /**
   * The data release from which this SourceInfoProto was created. The format for this string is
   * provider-dependent (e.g. a MultiNet release would look like "2008.01").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String release;

  /**
   * A source info may have a corresponding TYPE_DATA_SOURCE feature that describes it (provider,
   * copyright information, date of release, etc). In the context of edits and issues, this field
   * should not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeatureIdProto sourceId;

  /**
   * A place for clients to attach arbitrary data to a source info. Never set in MapFacts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet temporaryData;

  /**
   * RESERVED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreUserProto user;

  /**
   * This is the URL of a page representing all the data from this source in this feature. It may
   * have be the ultimate source of the data (in case of scraping) or merely the same data styled
   * according the provider's taste. There is a similar field in DataSourceProto which is NOT cached
   * in this field, since it has a different meaning.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreUrlProto> getAttributionUrl() {
    return attributionUrl;
  }

  /**
   * This is the URL of a page representing all the data from this source in this feature. It may
   * have be the ultimate source of the data (in case of scraping) or merely the same data styled
   * according the provider's taste. There is a similar field in DataSourceProto which is NOT cached
   * in this field, since it has a different meaning.
   * @param attributionUrl attributionUrl or {@code null} for none
   */
  public GeostoreSourceInfoProto setAttributionUrl(java.util.List<GeostoreUrlProto> attributionUrl) {
    this.attributionUrl = attributionUrl;
    return this;
  }

  /**
   * The time that this particular piece of data was collected. If different attributes were
   * collected on different dates, this is the date of the most recent edit.
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getCollectionDate() {
    return collectionDate;
  }

  /**
   * The time that this particular piece of data was collected. If different attributes were
   * collected on different dates, this is the date of the most recent edit.
   * @param collectionDate collectionDate or {@code null} for none
   */
  public GeostoreSourceInfoProto setCollectionDate(GeostoreDateTimeProto collectionDate) {
    this.collectionDate = collectionDate;
    return this;
  }

  /**
   * A source info may have a magic cookie whose content and semantics are defined by the specific
   * import process or third-party feed. For feeds that are processed by Distillery, the cookie,
   * when set, should contain the unique identifier for the feature as provided by the feed.
   * @return value or {@code null} for none
   */
  public java.lang.String getCookie() {
    return cookie;
  }

  /**
   * A source info may have a magic cookie whose content and semantics are defined by the specific
   * import process or third-party feed. For feeds that are processed by Distillery, the cookie,
   * when set, should contain the unique identifier for the feature as provided by the feed.
   * @param cookie cookie or {@code null} for none
   */
  public GeostoreSourceInfoProto setCookie(java.lang.String cookie) {
    this.cookie = cookie;
    return this;
  }

  /**
   * The dataset from which this SourceInfoProto was created. The content of this string will be
   * determined by the data provider (e.g. for MultiNet data, "fra" would indicate the dataset for
   * France). This field is unnecessary for providers that deliver a single dataset per release
   * (e.g. Basarsoft).
   * @return value or {@code null} for none
   */
  public java.lang.String getDataset() {
    return dataset;
  }

  /**
   * The dataset from which this SourceInfoProto was created. The content of this string will be
   * determined by the data provider (e.g. for MultiNet data, "fra" would indicate the dataset for
   * France). This field is unnecessary for providers that deliver a single dataset per release
   * (e.g. Basarsoft).
   * @param dataset dataset or {@code null} for none
   */
  public GeostoreSourceInfoProto setDataset(java.lang.String dataset) {
    this.dataset = dataset;
    return this;
  }

  /**
   * The Gaia ID of the user who provided us with this data. This field should never be set on
   * source infos present on features, but may be set on source infos present on edits. DEPRECATED:
   * Most clients should use the "user" field instead where Gaia IDs are encrypted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getGaiaId() {
    return gaiaId;
  }

  /**
   * The Gaia ID of the user who provided us with this data. This field should never be set on
   * source infos present on features, but may be set on source infos present on edits. DEPRECATED:
   * Most clients should use the "user" field instead where Gaia IDs are encrypted.
   * @param gaiaId gaiaId or {@code null} for none
   */
  public GeostoreSourceInfoProto setGaiaId(java.lang.Long gaiaId) {
    this.gaiaId = gaiaId;
    return this;
  }

  /**
   * Information about an internal user or system that is operating on behalf of `user` by way of
   * impersonation.
   * @return value or {@code null} for none
   */
  public GeostoreUserProto getImpersonationUser() {
    return impersonationUser;
  }

  /**
   * Information about an internal user or system that is operating on behalf of `user` by way of
   * impersonation.
   * @param impersonationUser impersonationUser or {@code null} for none
   */
  public GeostoreSourceInfoProto setImpersonationUser(GeostoreUserProto impersonationUser) {
    this.impersonationUser = impersonationUser;
    return this;
  }

  /**
   * The name of the layer from which this SourceInfoProto was created.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayer() {
    return layer;
  }

  /**
   * The name of the layer from which this SourceInfoProto was created.
   * @param layer layer or {@code null} for none
   */
  public GeostoreSourceInfoProto setLayer(java.lang.String layer) {
    this.layer = layer;
    return this;
  }

  /**
   * The OGR feature identifier from which this SourceInfoProto was created. This is an internal OGR
   * record identifier and has nothing to do with any of the feature's fields or the FeatureIdProto
   * for the FeatureProto containing this SourceInfoProto. This field is present only for debugging
   * purposes and possible use in the match pattern of a FeatureChangeProto designed to fix bad
   * source data very early in the importing process.
   * @return value or {@code null} for none
   */
  public java.lang.Long getOgrFid() {
    return ogrFid;
  }

  /**
   * The OGR feature identifier from which this SourceInfoProto was created. This is an internal OGR
   * record identifier and has nothing to do with any of the feature's fields or the FeatureIdProto
   * for the FeatureProto containing this SourceInfoProto. This field is present only for debugging
   * purposes and possible use in the match pattern of a FeatureChangeProto designed to fix bad
   * source data very early in the importing process.
   * @param ogrFid ogrFid or {@code null} for none
   */
  public GeostoreSourceInfoProto setOgrFid(java.lang.Long ogrFid) {
    this.ogrFid = ogrFid;
    return this;
  }

  /**
   * The data provider from which this source info was generated. The value must be equal to the one
   * on the TYPE_DATA_SOURCE feature referenced by this source info via the source_id reference (see
   * above).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProvider() {
    return provider;
  }

  /**
   * The data provider from which this source info was generated. The value must be equal to the one
   * on the TYPE_DATA_SOURCE feature referenced by this source info via the source_id reference (see
   * above).
   * @param provider provider or {@code null} for none
   */
  public GeostoreSourceInfoProto setProvider(java.lang.Integer provider) {
    this.provider = provider;
    return this;
  }

  /**
   * A source info may optionally have a set of key-value pairs that provide "raw data" specific to
   * that source. The types of raw data available will vary from one provider to another and should
   * not be used in production code. Instead, new fields and/or protocol buffers should be defined
   * to represent this information in a canonical form, and the relevant importers should be
   * modified to populate these new fields.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreRawDataProto> getRawData() {
    return rawData;
  }

  /**
   * A source info may optionally have a set of key-value pairs that provide "raw data" specific to
   * that source. The types of raw data available will vary from one provider to another and should
   * not be used in production code. Instead, new fields and/or protocol buffers should be defined
   * to represent this information in a canonical form, and the relevant importers should be
   * modified to populate these new fields.
   * @param rawData rawData or {@code null} for none
   */
  public GeostoreSourceInfoProto setRawData(java.util.List<GeostoreRawDataProto> rawData) {
    this.rawData = rawData;
    return this;
  }

  /**
   * The data release from which this SourceInfoProto was created. The format for this string is
   * provider-dependent (e.g. a MultiNet release would look like "2008.01").
   * @return value or {@code null} for none
   */
  public java.lang.String getRelease() {
    return release;
  }

  /**
   * The data release from which this SourceInfoProto was created. The format for this string is
   * provider-dependent (e.g. a MultiNet release would look like "2008.01").
   * @param release release or {@code null} for none
   */
  public GeostoreSourceInfoProto setRelease(java.lang.String release) {
    this.release = release;
    return this;
  }

  /**
   * A source info may have a corresponding TYPE_DATA_SOURCE feature that describes it (provider,
   * copyright information, date of release, etc). In the context of edits and issues, this field
   * should not be set.
   * @return value or {@code null} for none
   */
  public GeostoreFeatureIdProto getSourceId() {
    return sourceId;
  }

  /**
   * A source info may have a corresponding TYPE_DATA_SOURCE feature that describes it (provider,
   * copyright information, date of release, etc). In the context of edits and issues, this field
   * should not be set.
   * @param sourceId sourceId or {@code null} for none
   */
  public GeostoreSourceInfoProto setSourceId(GeostoreFeatureIdProto sourceId) {
    this.sourceId = sourceId;
    return this;
  }

  /**
   * A place for clients to attach arbitrary data to a source info. Never set in MapFacts.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getTemporaryData() {
    return temporaryData;
  }

  /**
   * A place for clients to attach arbitrary data to a source info. Never set in MapFacts.
   * @param temporaryData temporaryData or {@code null} for none
   */
  public GeostoreSourceInfoProto setTemporaryData(Proto2BridgeMessageSet temporaryData) {
    this.temporaryData = temporaryData;
    return this;
  }

  /**
   * RESERVED
   * @return value or {@code null} for none
   */
  public GeostoreUserProto getUser() {
    return user;
  }

  /**
   * RESERVED
   * @param user user or {@code null} for none
   */
  public GeostoreSourceInfoProto setUser(GeostoreUserProto user) {
    this.user = user;
    return this;
  }

  @Override
  public GeostoreSourceInfoProto set(String fieldName, Object value) {
    return (GeostoreSourceInfoProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreSourceInfoProto clone() {
    return (GeostoreSourceInfoProto) super.clone();
  }

}
