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

package com.google.api.services.monitoring.v1.model;

/**
 * A table that displays time series data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimeSeriesTable extends com.google.api.client.json.GenericJson {

  /**
   * Required. The data displayed in this table.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableDataSet> dataSets;

  static {
    // hack to force ProGuard to consider TableDataSet used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TableDataSet.class);
  }

  /**
   * Required. The data displayed in this table.
   * @return value or {@code null} for none
   */
  public java.util.List<TableDataSet> getDataSets() {
    return dataSets;
  }

  /**
   * Required. The data displayed in this table.
   * @param dataSets dataSets or {@code null} for none
   */
  public TimeSeriesTable setDataSets(java.util.List<TableDataSet> dataSets) {
    this.dataSets = dataSets;
    return this;
  }

  @Override
  public TimeSeriesTable set(String fieldName, Object value) {
    return (TimeSeriesTable) super.set(fieldName, value);
  }

  @Override
  public TimeSeriesTable clone() {
    return (TimeSeriesTable) super.clone();
  }

}