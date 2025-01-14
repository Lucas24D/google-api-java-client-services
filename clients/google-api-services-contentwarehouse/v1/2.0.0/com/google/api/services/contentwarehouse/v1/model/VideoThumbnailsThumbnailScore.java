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
 * LINT.IfChange Score calculated from a thumbnail. NextID: 15
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoThumbnailsThumbnailScore extends com.google.api.client.json.GenericJson {

  /**
   * Checksum of the thumbnail bytes used to identify which image the score belongs to. Only filled
   * when thumbnail version is 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger checksum;

  /**
   * Color sampling score encoded as uint32. Encode/Decode using youtube::color::RgbToUint /
   * UIntToRgb. Field is only relevant for TYPE_COLOR_SAMPLING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long colorSampling;

  /**
   * Thumbnail dense features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> denseFeatures;

  /**
   * FeatureExtra extension for dense features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DrishtiFeatureExtra denseGeneralExtraFeatures;

  /**
   * If true, score is manually assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAssigned;

  /**
   * If true, score will be instantly indexed by YouTube search indexer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isInstant;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String overwriteReason;

  /**
   * Thumbnail quantized dense features, available in TYPE_STARBURST_COMPRESSED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quantizedFeatures;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double score;

  /**
   * Thumbnail sparse features, available in TYPE_STARBURST
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DrishtiSparseFeatureData sparseFeatures;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thumbnailSet;

  /**
   * Version number of the thumbnail. Should be consistent with the version number in the
   * ytimg_content column family.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger thumbnailVersion;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Checksum of the thumbnail bytes used to identify which image the score belongs to. Only filled
   * when thumbnail version is 0.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getChecksum() {
    return checksum;
  }

  /**
   * Checksum of the thumbnail bytes used to identify which image the score belongs to. Only filled
   * when thumbnail version is 0.
   * @param checksum checksum or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setChecksum(java.math.BigInteger checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * Color sampling score encoded as uint32. Encode/Decode using youtube::color::RgbToUint /
   * UIntToRgb. Field is only relevant for TYPE_COLOR_SAMPLING.
   * @return value or {@code null} for none
   */
  public java.lang.Long getColorSampling() {
    return colorSampling;
  }

  /**
   * Color sampling score encoded as uint32. Encode/Decode using youtube::color::RgbToUint /
   * UIntToRgb. Field is only relevant for TYPE_COLOR_SAMPLING.
   * @param colorSampling colorSampling or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setColorSampling(java.lang.Long colorSampling) {
    this.colorSampling = colorSampling;
    return this;
  }

  /**
   * Thumbnail dense features.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getDenseFeatures() {
    return denseFeatures;
  }

  /**
   * Thumbnail dense features.
   * @param denseFeatures denseFeatures or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setDenseFeatures(java.util.List<java.lang.Float> denseFeatures) {
    this.denseFeatures = denseFeatures;
    return this;
  }

  /**
   * FeatureExtra extension for dense features.
   * @return value or {@code null} for none
   */
  public DrishtiFeatureExtra getDenseGeneralExtraFeatures() {
    return denseGeneralExtraFeatures;
  }

  /**
   * FeatureExtra extension for dense features.
   * @param denseGeneralExtraFeatures denseGeneralExtraFeatures or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setDenseGeneralExtraFeatures(DrishtiFeatureExtra denseGeneralExtraFeatures) {
    this.denseGeneralExtraFeatures = denseGeneralExtraFeatures;
    return this;
  }

  /**
   * If true, score is manually assigned.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAssigned() {
    return isAssigned;
  }

  /**
   * If true, score is manually assigned.
   * @param isAssigned isAssigned or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setIsAssigned(java.lang.Boolean isAssigned) {
    this.isAssigned = isAssigned;
    return this;
  }

  /**
   * If true, score will be instantly indexed by YouTube search indexer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsInstant() {
    return isInstant;
  }

  /**
   * If true, score will be instantly indexed by YouTube search indexer.
   * @param isInstant isInstant or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setIsInstant(java.lang.Boolean isInstant) {
    this.isInstant = isInstant;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getModelVersion() {
    return modelVersion;
  }

  /**
   * @param modelVersion modelVersion or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setModelVersion(java.lang.String modelVersion) {
    this.modelVersion = modelVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOverwriteReason() {
    return overwriteReason;
  }

  /**
   * @param overwriteReason overwriteReason or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setOverwriteReason(java.lang.String overwriteReason) {
    this.overwriteReason = overwriteReason;
    return this;
  }

  /**
   * Thumbnail quantized dense features, available in TYPE_STARBURST_COMPRESSED
   * @see #decodeQuantizedFeatures()
   * @return value or {@code null} for none
   */
  public java.lang.String getQuantizedFeatures() {
    return quantizedFeatures;
  }

  /**
   * Thumbnail quantized dense features, available in TYPE_STARBURST_COMPRESSED
   * @see #getQuantizedFeatures()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeQuantizedFeatures() {
    return com.google.api.client.util.Base64.decodeBase64(quantizedFeatures);
  }

  /**
   * Thumbnail quantized dense features, available in TYPE_STARBURST_COMPRESSED
   * @see #encodeQuantizedFeatures()
   * @param quantizedFeatures quantizedFeatures or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setQuantizedFeatures(java.lang.String quantizedFeatures) {
    this.quantizedFeatures = quantizedFeatures;
    return this;
  }

  /**
   * Thumbnail quantized dense features, available in TYPE_STARBURST_COMPRESSED
   * @see #setQuantizedFeatures()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public VideoThumbnailsThumbnailScore encodeQuantizedFeatures(byte[] quantizedFeatures) {
    this.quantizedFeatures = com.google.api.client.util.Base64.encodeBase64URLSafeString(quantizedFeatures);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getScore() {
    return score;
  }

  /**
   * @param score score or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setScore(java.lang.Double score) {
    this.score = score;
    return this;
  }

  /**
   * Thumbnail sparse features, available in TYPE_STARBURST
   * @return value or {@code null} for none
   */
  public DrishtiSparseFeatureData getSparseFeatures() {
    return sparseFeatures;
  }

  /**
   * Thumbnail sparse features, available in TYPE_STARBURST
   * @param sparseFeatures sparseFeatures or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setSparseFeatures(DrishtiSparseFeatureData sparseFeatures) {
    this.sparseFeatures = sparseFeatures;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getThumbnailSet() {
    return thumbnailSet;
  }

  /**
   * @param thumbnailSet thumbnailSet or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setThumbnailSet(java.lang.String thumbnailSet) {
    this.thumbnailSet = thumbnailSet;
    return this;
  }

  /**
   * Version number of the thumbnail. Should be consistent with the version number in the
   * ytimg_content column family.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getThumbnailVersion() {
    return thumbnailVersion;
  }

  /**
   * Version number of the thumbnail. Should be consistent with the version number in the
   * ytimg_content column family.
   * @param thumbnailVersion thumbnailVersion or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setThumbnailVersion(java.math.BigInteger thumbnailVersion) {
    this.thumbnailVersion = thumbnailVersion;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public VideoThumbnailsThumbnailScore setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public VideoThumbnailsThumbnailScore set(String fieldName, Object value) {
    return (VideoThumbnailsThumbnailScore) super.set(fieldName, value);
  }

  @Override
  public VideoThumbnailsThumbnailScore clone() {
    return (VideoThumbnailsThumbnailScore) super.clone();
  }

}
