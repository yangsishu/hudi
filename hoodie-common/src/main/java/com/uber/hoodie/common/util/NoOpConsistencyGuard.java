/*
 *  Copyright (c) 2019 Uber Technologies, Inc. (hoodie-dev-group@uber.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.uber.hoodie.common.util;

import java.util.List;
import org.apache.hadoop.fs.Path;

/**
 * Default Consistency guard that does nothing. Used for HDFS deployments
 */
public class NoOpConsistencyGuard implements ConsistencyGuard {

  @Override
  public void waitTillFileAppears(Path filePath) {
  }

  @Override
  public void waitTillFileDisappears(Path filePath) {
  }

  @Override
  public void waitTillAllFilesAppear(String dirPath, List<String> files) {

  }

  @Override
  public void waitTillAllFilesDisappear(String dirPath, List<String> files) {

  }
}