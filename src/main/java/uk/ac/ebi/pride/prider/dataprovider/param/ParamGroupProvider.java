package uk.ac.ebi.pride.prider.dataprovider.param;

import java.util.Collection;

/**
 * {@code ParamGroupProvider} defines an interface for accessing the details of a collection of params
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ParamGroupProvider {
    public Collection<? extends ParamProvider> getParams();
}
