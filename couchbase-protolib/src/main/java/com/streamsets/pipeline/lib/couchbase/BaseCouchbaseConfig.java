/*
 * Copyright 2018 StreamSets Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.lib.couchbase;

import com.streamsets.pipeline.api.ConfigDefBean;

public class BaseCouchbaseConfig {
  /**
   * Connection tab
   */
  @ConfigDefBean(groups = "COUCHBASE")
  public CouchbaseConfig couchbase = new CouchbaseConfig();


  /**
   * Credentials tab
   */
  @ConfigDefBean(groups = "CREDENTIALS")
  public CredentialsConfig credentials= new CredentialsConfig();


  /**
   * Shared constants
   */
  public final String CAS_HEADER_ATTRIBUTE = "couchbase.cas";
}
