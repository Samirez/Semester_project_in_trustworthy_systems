/*
 * generated by Xtext 2.29.0
 */
package org.xtext.gsht.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GSelfOperatingHeuristicTextAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/gsht/parser/antlr/internal/InternalGSelfOperatingHeuristicText.tokens");
	}
}
