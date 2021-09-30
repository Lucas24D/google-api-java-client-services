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
 * Groups a time series query definition with table options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableDataSet extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String minAlignmentPeriod;

  /**
   * Optional. Table display options for configuring how the table is rendered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TableDisplayOptions tableDisplayOptions;

  /**
   * Optional. A template string for naming TimeSeries in the resulting data set. This should be a
   * string with interpolations of the form ${label_name}, which will resolve to the label's value
   * i.e. "${resource.labels.project_id}."
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tableTemplate;

  /**
   * Required. Fields for querying time series data from the Stackdriver metrics API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TimeSeriesQuery timeSeriesQuery;

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * @return value or {@code null} for none
   */
  public String getMinAlignmentPeriod() {
    return minAlignmentPeriod;
  }

  /**
   * Optional. The lower bound on data point frequency for this data set, implemented by specifying
   * the minimum alignment period to use in a time series query For example, if the data is
   * published once every 10 minutes, the min_alignment_period should be at least 10 minutes. It
   * would not make sense to fetch and align data at one minute intervals.
   * @param minAlignmentPeriod minAlignmentPeriod or {@code null} for none
   */
  public TableDataSet setMinAlignmentPeriod(String minAlignmentPeriod) {
    this.minAlignmentPeriod = minAlignmentPeriod;
    return this;
  }

  /**
   * Optional. Table display options for configuring how the table is rendered.
   * @return value or {@code null} for none
   */
  public TableDisplayOptions getTableDisplayOptions() {
    return tableDisplayOptions;
  }

  /**
   * Optional. Table display options for configuring how the table is rendered.
   * @param tableDisplayOptions tableDisplayOptions or {@code null} for none
   */
  public TableDataSet setTableDisplayOptions(TableDisplayOptions tableDisplayOptions) {
    this.tableDisplayOptions = tableDisplayOptions;
    return this;
  }

  /**
   * Optional. A template string for naming TimeSeries in the resulting data set. This should be a
   * string with interpolations of the form ${label_name}, which will resolve to the label's value
   * i.e. "${resource.labels.project_id}."
   * @return value or {@code null} for none
   */
  public java.lang.String getTableTemplate() {
    return tableTemplate;
  }

  /**
   * Optional. A template string for naming TimeSeries in the resulting data set. This should be a
   * string with interpolations of the form ${label_name}, which will resolve to the label's value
   * i.e. "${resource.labels.project_id}."
   * @param tableTemplate tableTemplate or {@code null} for none
   */
  public TableDataSet setTableTemplate(java.lang.String tableTemplate) {
    this.tableTemplate = tableTemplate;
    return this;
  }

  /**
   * Required. Fields for querying time series data from the Stackdriver metrics API.
   * @return value or {@code null} for none
   */
  public TimeSeriesQuery getTimeSeriesQuery() {
    return timeSeriesQuery;
  }

  /**
   * Required. Fields for querying time series data from the Stackdriver metrics API.
   * @param timeSeriesQuery timeSeriesQuery or {@code null} for none
   */
  public TableDataSet setTimeSeriesQuery(TimeSeriesQuery timeSeriesQuery) {
    this.timeSeriesQuery = timeSeriesQuery;
    return this;
  }

  @Override
  public TableDataSet set(String fieldName, Object value) {
    return (TableDataSet) super.set(fieldName, value);
  }

  @Override
  public TableDataSet clone() {
    return (TableDataSet) super.clone();
  }

}