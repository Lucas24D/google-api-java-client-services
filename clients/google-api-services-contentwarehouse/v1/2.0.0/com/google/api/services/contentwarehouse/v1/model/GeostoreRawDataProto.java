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
 * A RawDataProto is a key-value pair that represents arbitrary source data from a particular
 * provider. Raw data can be attached to features using their source_info field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreRawDataProto extends com.google.api.client.json.GenericJson {

  /**
   * The key associated with this data item. For source data in shape file format, this will
   * typically be a column name. Keys need to be unique with respect to a particular data source
   * (see DataSourceProto), but they do not need to be globally unique. You can look up the
   * documentation for a key (e.g. a longer label and description) by following the source_id link
   * of the parent SourceInfoProto, which takes you to a TYPE_DATA_SOURCE feature, and then looking
   * up the corresponding RawMetadataProto object for this key in that feature's optional
   * data_source field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * All data items are represented as strings, the logic being that it is easy to convert other
   * data types to strings, and there is no need to access this data efficiently.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueString;

  /**
   * The key associated with this data item. For source data in shape file format, this will
   * typically be a column name. Keys need to be unique with respect to a particular data source
   * (see DataSourceProto), but they do not need to be globally unique. You can look up the
   * documentation for a key (e.g. a longer label and description) by following the source_id link
   * of the parent SourceInfoProto, which takes you to a TYPE_DATA_SOURCE feature, and then looking
   * up the corresponding RawMetadataProto object for this key in that feature's optional
   * data_source field.
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * The key associated with this data item. For source data in shape file format, this will
   * typically be a column name. Keys need to be unique with respect to a particular data source
   * (see DataSourceProto), but they do not need to be globally unique. You can look up the
   * documentation for a key (e.g. a longer label and description) by following the source_id link
   * of the parent SourceInfoProto, which takes you to a TYPE_DATA_SOURCE feature, and then looking
   * up the corresponding RawMetadataProto object for this key in that feature's optional
   * data_source field.
   * @param key key or {@code null} for none
   */
  public GeostoreRawDataProto setKey(java.lang.String key) {
    this.key = key;
    return this;
  }

  /**
   * All data items are represented as strings, the logic being that it is easy to convert other
   * data types to strings, and there is no need to access this data efficiently.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueString() {
    return valueString;
  }

  /**
   * All data items are represented as strings, the logic being that it is easy to convert other
   * data types to strings, and there is no need to access this data efficiently.
   * @param valueString valueString or {@code null} for none
   */
  public GeostoreRawDataProto setValueString(java.lang.String valueString) {
    this.valueString = valueString;
    return this;
  }

  @Override
  public GeostoreRawDataProto set(String fieldName, Object value) {
    return (GeostoreRawDataProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreRawDataProto clone() {
    return (GeostoreRawDataProto) super.clone();
  }

}
