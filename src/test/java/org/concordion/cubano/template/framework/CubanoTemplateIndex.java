package org.concordion.cubano.template.framework;

import org.concordion.api.ConcordionResources;
import org.concordion.cubano.framework.ConcordionBase;

/**
 * A base class for extension by fixtures which relate to "index" specifications containing no assertions.
 *
 * @see CubanoTemplateFixture for fixtures that don't invoke a browser
 * @see CubanoTemplateBrowserFixture for fixtures that invoke a browser
 */
@ConcordionResources("/customConcordion.css")
public abstract class CubanoTemplateIndex extends ConcordionBase {
}
