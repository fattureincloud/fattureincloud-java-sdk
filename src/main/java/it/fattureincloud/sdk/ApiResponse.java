/*
 * Fatture in Cloud API v2 - API Reference
 * Connect your software with Fatture in Cloud, the invoicing platform chosen by more than 400.000 businesses in Italy.   The Fatture in Cloud API is based on REST, and makes possible to interact with the user related data prior authorization via OAuth2 protocol.
 *
 * The version of the OpenAPI document: 2.0.16
 * Contact: info@fattureincloud.it
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package it.fattureincloud.sdk;

import java.util.List;
import java.util.Map;

/** API response returned by API call. */
public class ApiResponse<T> {
  private final int statusCode;
  private final Map<String, List<String>> headers;
  private final T data;

  /**
   * Constructor for ApiResponse.
   *
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers) {
    this(statusCode, headers, null);
  }

  /**
   * Constructor for ApiResponse.
   *
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   * @param data The object deserialized from response bod
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.data = data;
  }

  /**
   * Get the <code>status code</code>.
   *
   * @return the status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Get the <code>headers</code>.
   *
   * @return a {@link java.util.Map} of headers
   */
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  /**
   * Get the <code>data</code>.
   *
   * @return the data
   */
  public T getData() {
    return data;
  }
}
