/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package io.kestros.cms.user.exceptions;

/**
 * Exception thrown when an expected {@link io.kestros.cms.user.KestrosUser} could not be
 * retrieved.
 */
public class UserRetrievalException extends Exception {

  protected UserRetrievalException() {
  }

  /**
   * Exception thrown when an expected {@link io.kestros.cms.user.KestrosUser} could not be
   * retrieved.
   *
   * @param userId User that could not be retrieved.
   * @param message Cause message.
   */
  public UserRetrievalException(final String userId, final String message) {
    super("Unable to retrieve user " + userId + ". " + message);
  }
}
