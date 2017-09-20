/* Copyright (c) pro!vision GmbH. All rights reserved. */
package org.adaptto.fsresource.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageFilter;
import com.day.cq.wcm.api.PageManager;

/**
 * Navigation model
 */
@Model(adaptables = SlingHttpServletRequest.class)
public final class Navigation {

  private final Page currentPage;
  private final Page rootPage;

  /**
   * @param request Request
   */
  public Navigation(SlingHttpServletRequest request) {
    PageManager pageManager = request.getResourceResolver().adaptTo(PageManager.class);
    currentPage = pageManager.getContainingPage(request.getResource());
    rootPage = currentPage.getAbsoluteParent(2);
  }

  /**
   * @return Navigation pages
   */
  public List<NavigationItem> getItems() {
    List<NavigationItem> items = new ArrayList<>();

    if (rootPage != null) {
      // root page
      items.add(toNavigationItem(rootPage));

      // children of root page
      Iterator<Page> children = rootPage.listChildren(new PageFilter(false, false));
      children.forEachRemaining(child -> items.add(toNavigationItem(child)));
    }

    return items;
  }

  private NavigationItem toNavigationItem(Page page) {
    boolean active = page.getPath().equals(currentPage.getPath());
    String href = page.getPath() + ".html";
    return new NavigationItem(page.getTitle(), href, active);
  }

}
