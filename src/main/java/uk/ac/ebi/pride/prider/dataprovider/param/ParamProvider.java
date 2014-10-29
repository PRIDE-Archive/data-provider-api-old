package uk.ac.ebi.pride.prider.dataprovider.param;

import uk.ac.ebi.pride.prider.dataprovider.entity.EntityProvider;

/**
 * {@code ParamProvider} defines an interface for accessing the details of a param
 *
 * @author Rui Wang
 * @version $Id$
 */
public interface ParamProvider extends EntityProvider{

    public String getName();
    public String getValue();
}
