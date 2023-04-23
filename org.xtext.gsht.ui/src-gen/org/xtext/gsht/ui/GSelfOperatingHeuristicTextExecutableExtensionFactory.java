/*
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.gsht.ui.internal.GshtActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class GSelfOperatingHeuristicTextExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(GshtActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		GshtActivator activator = GshtActivator.getInstance();
		return activator != null ? activator.getInjector(GshtActivator.ORG_XTEXT_GSHT_GSELFOPERATINGHEURISTICTEXT) : null;
	}

}