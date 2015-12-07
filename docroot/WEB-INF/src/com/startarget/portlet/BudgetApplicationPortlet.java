package com.startarget.portlet;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class BudgetApplicationPortlet
 */
public class BudgetApplicationPortlet extends MVCPortlet {

  private static Logger logger = LoggerFactory.getLogger(BudgetApplicationPortlet.class);

  @Override
  public void render(RenderRequest request, RenderResponse response) throws PortletException, IOException {
    super.render(request, response);
  }

}
