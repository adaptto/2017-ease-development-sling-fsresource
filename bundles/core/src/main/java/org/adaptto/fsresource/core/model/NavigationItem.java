/* Copyright (c) pro!vision GmbH. All rights reserved. */
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

  public String getTitle() {
    return this.title;
  }

  public String getHref() {
    return this.href;
  }

  public boolean isActive() {
    return this.active;
  }

}
