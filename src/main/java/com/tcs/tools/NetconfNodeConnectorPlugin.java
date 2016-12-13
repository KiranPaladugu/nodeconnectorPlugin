/* ********************************************************************************
 * All rights reserved.
 ******************************************************************************* */
package com.tcs.tools;

import com.tcs.application.AbstractPlugin;
import com.tcs.application.Application;
import com.tcs.application.pluign.PluginManager;

public class NetconfNodeConnectorPlugin extends AbstractPlugin {

	public void shutDownConnectorPlugin() {

	}

	public void startConnectorPlugin() {
		Application.getSubscriptionManager().notifySubscriber(PluginManager.PLUGIN_STARTED, this);
	}

}
