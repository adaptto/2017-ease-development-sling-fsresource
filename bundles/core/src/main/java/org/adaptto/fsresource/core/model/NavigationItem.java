/*
 * #%L
 * Copyright (C) 2017 pro!vision GmbH
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package org.adaptto.fsresource.core.model;

/**
 * Navigation item.
 */
public final class NavigationItem {

  private final String title;
  private final String href;
  private final boolean active;

  /**
   * @param title Title
   * @param href URL
   * @param active Active
   */
  public NavigationItem(String title, String href, boolean active) {
    this.title = title;
    this.href = href;
    this.active = active;
  }

  /**
   * @return Title
   */
  public String getTitle() {
    return this.title;
  }

  /**
   * @return URL
   */
  public String getHref() {
    return this.href;
  }

  /**
   * @return Active
   */
  public boolean isActive() {
    return this.active;
  }

}
